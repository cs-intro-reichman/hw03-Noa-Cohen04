/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String ans ="" + s.charAt(0);
        int i = 1;
        char ch1 =  s.charAt(0);

        while (i < s.length()) {
            ch1 =  s.charAt(i);
            if(ans.indexOf(ch1)==-1 || ch1== 32)
                ans = ans+ch1;

            i++;
        }
         return ans;
     }

 }