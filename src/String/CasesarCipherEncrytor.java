package String;

public class CasesarCipherEncrytor {
    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        StringBuilder res = new StringBuilder();
        for(int i=0; i < str.length(); i++){

            while(key>=26){
                key -=26;
            }

            int order = (int)str.charAt(i) + key;

            while(order > 122){
                order = order-122+96;
            }
            res.append((char)order);

        }

        return res.toString();
    }



    public static String caesarCypherEncryptor2(String str, int key) {
        // Write your code here.
        StringBuilder res = new StringBuilder();
        for(int i=0; i < str.length(); i++){

            while(key>=26){
                key -=26;
            }

            int order = (int)str.charAt(i) + key;

            while(order > 122){
                order = order-122+96;
            }
            res.append((char)order);

        }

        return res.toString();
    }
}
