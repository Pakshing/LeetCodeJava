package Midterm;

public class InstagramAccount implements Comparable<InstagramAccount> {

    String userName;
private int numberOfPosts;
private int numberOfFollowing;


public InstagramAccount(String userName, int numberOfPosts, int numberOfFollowing) {
        this.userName = userName;
        this.numberOfPosts = numberOfPosts;
        this.numberOfFollowing = numberOfFollowing;
        }


    @Override
public String toString() {
        // To nicely print each object
        // May be helpful for debugging
        return this.userName + " posts " + this.numberOfPosts + " following " + this.numberOfFollowing;
        }

        // TODO: implement required methods below
        @Override
        public int compareTo(InstagramAccount instagramAccount) {
            if(this.numberOfPosts> instagramAccount.numberOfPosts){
                return -1;
            }else if (this.numberOfPosts == instagramAccount.numberOfPosts){
                if(this.numberOfFollowing > instagramAccount.numberOfFollowing){
                    return -1;
                }else if (this.numberOfFollowing == instagramAccount.numberOfFollowing && this.userName.equals(instagramAccount.userName)){
                    //only compare username when they are equal
                    return 0;
                }else{
                    return 1;
                }
            }else{
                return 1;
            }
        }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof InstagramAccount ){
            InstagramAccount account = (InstagramAccount) obj;
            return this.compareTo(account) == 0;
        }else{
            return false;
        }
    }

}