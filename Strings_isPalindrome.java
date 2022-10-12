import java.util.Scanner;

public class Strings_isPalindrome {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            String st;
            st=s.next();
            int i=0;
            int j=st.length()-1;
            boolean p=true;
            while(i<=j)
            {
                if(st.charAt(i)==st.charAt(j))
                {
                    p=true;
                }
                else {
                    p=false;
                    break;
                }
                i++;
                j--;
            }
            if(p==false)
            {
                System.out.println("false");
            }
            else {
                System.out.println("true");
            }
        }
    }
