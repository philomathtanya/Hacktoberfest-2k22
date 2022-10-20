public class StringCompression {
    public static void main(String[] args) {
        // i used for traversing in the chars Array
        // j used for storing ans in the same chars Array
        char chars[]={'a','a','b','b','c','c','c'};
        int i=0,j=0;
        // currChar is the current character
        char currChar=chars[i];
        i++;
        //its count is 1
        int count=1;
        //traversing in the whole Array
        while(i<chars.length)
        {
            // if it matches then we increase the count
            if(chars[i]==chars[i-1])
            {
                count++;
            }
            else
            {
                //if fails then we store that currChar
                //in at jth index in the same Array
                chars[j]=currChar;
                j++;
                // since we need not to add count 1 in ans
                if(count!=1)
                {
                    // if its not 1 then
                    // we are converting count to string
                    // e.g. 12 to "12"
                    String s = Integer.toString(count);
                    // now adding each char to ans
                    for(int k=0;k<s.length();k++)
                    {
                        chars[j]=s.charAt(k);
                        j++;
                    }
                }
                //now we make curr char to ith index char
                currChar=chars[i];
                // and there count 1
                count=1;
            }
            // move to next char
            i++;
        }
        // storing last char to ans
        // same step as we did in else case
        chars[j]=currChar;
        j++;
        if(count!=1)
        {
            String s = Integer.toString(count);
            for(int k=0;k<s.length();k++)
            {
                chars[j]=s.charAt(k);
                j++;
            }
        }
        // now we return our ans Array length
        System.out.println(j);
    }
}
