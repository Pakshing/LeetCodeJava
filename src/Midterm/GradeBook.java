package Midterm;

import java.util.Random;

public class GradeBook {
    int[][] grades;

    public GradeBook(int numberOfStudents, int numberOfHWs) {
        grades = new int[numberOfStudents][numberOfHWs];
        Random rand = new Random();
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < numberOfHWs; j++) {
                grades[i][j] = 50 + rand.nextInt(51);
            }
        }
    }

    /*
    if(row < grades.length){

                    if(col < grades[0].length){

                        return grades[row][col++];
                    }
                    else{
                        col=0;
                        row++;
                        return grades[row][col++];
                    }

                }else{
                    return -1;
                }
    * */

    public GradesIterator gradeIterator() {
        //TODO: should return anonymous object of type GradesIterator
        //If not sure, check the invoice example slides + source code
        return new GradesIterator() {
            private int row = 0;
            private int col =0;
            @Override
            public int next() {
                if(col == grades[0].length){
                    row++;
                    col=0;
                }
                return grades[row][col++];
            }

            @Override
            public boolean hasNext() {

               if(row < grades.length){
                   if(col == grades[0].length && row == grades.length-1){
                       return false;
                   }
                   return true;
               }else{
                   return false;
               }
            }
        };

    }

    public static void main(String[] args) {
        GradeBook gbook = new GradeBook(3, 2);
        GradesIterator iterator = gbook.gradeIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}