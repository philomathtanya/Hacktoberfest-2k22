import java.util.Scanner;

public class Strings_Odd_Even_Character {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        System.out.println(replac(str));
    }
    public static String replac(String str){
        String ans="";
        char ch,Nch;
        int Ascii;
        char chars[] =new char[str.length()];
        for (int i = 0; i <str.length() ; i++) {
            if(i%2==0)
            {
                Ascii=str.charAt(i);
                Nch= (char) (Ascii+1);
                chars[i]=Nch;
                continue;
            }
            else
            {
                Ascii=str.charAt(i);
                Nch= (char) (Ascii-1);
                chars[i]=Nch;
                continue;
            }
        }
String st=new String(chars);
        return st;
    }
}
