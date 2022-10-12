import java.util.Scanner;

public class Kartik_Bhaiya_And_Strings {
        public static void main(String args[]) {
            Scanner s=new Scanner(System.in);
//            int n=s.nextInt();
//            String st=s.next();
//            System.out.println(max(st,n));
            String str="aaabababbababaaaaaab";
            int k=3;
            int fa=max(str,'a',k);
            int fb=max(str,'b',k);
            System.out.println(Math.max(fa,fb));
        }
        public static int max(String str,char ch,int k){
            int si=0;
            int ei=0;
            int ans=0;
            int flip=0;
            while(ei<str.length()){
                if(str.charAt(ei)==ch){
                    flip++;
                }
                while(flip>k){
                    if(str.charAt(si)==ch){
                        flip--;
                    }
                    si++;
                }
                ans=Math.max(ans,ei-si+1);
                ei++;
            }
            return ans;
        }
    }
