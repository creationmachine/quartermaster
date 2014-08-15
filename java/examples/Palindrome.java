import java.util.*;
 
class Palindrome
{
   public static void main(String args[])
   {
      String original, reverse="";
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string to check if it is a palindrome");
      original = in.nextLine();
 
      int length = original.length();
 
      for ( int i = length - 1 ; i >= 0 ; i-- )
         reverse = reverse + original.charAt(i);
 
      if (original.equals(reverse))
         System.out.println("Entered string is a palindrome.");
      else
         System.out.println("Entered string is not a palindrome.");
 
   }
}	


/* One Liner */

public static boolean oneLinerPalin(String str){
    return str.equals(new StringBuilder(str).reverse().toString());
}



/* No StringBuffer */

public static boolean isPalindrome(String str){

    if(str.isEmpty()) return true;

    int last = str.length() - 1;        

    for(int i = 0; i <= last / 2;i++)
        if(str.charAt(i) != str.charAt(last - i))
            return false;

    return true;
}



/* Recursive */

public static boolean recursivePalin(String str){
    return check(str, 0, str.length() - 1);
}

private static boolean check (String str,int start,int stop){
    return stop - start < 2 ||
           str.charAt(start) == str.charAt(stop) &&
           check(str, start + 1, stop - 1);
}


