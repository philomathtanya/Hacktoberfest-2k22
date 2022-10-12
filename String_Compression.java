import java.util.Scanner;

public class String_Compression {
        public static void main(String args[]) {
            Scanner s=new Scanner(System.in);
            String st=s.next();
            int count=1;
            for(int i=0;i<st.length()-1;i++)
            {

                if(st.charAt(i)==st.charAt(i+1))
                {

                    count++;
                }
                else
                {
                    System.out.print(st.charAt(i));
                    System.out.print(count);
                    count=1;
                }
            }
            System.out.print((st.charAt(st.length()-1)));
            System.out.print(count);
        }
    }
