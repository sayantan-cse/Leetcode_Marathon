import com.sun.jdi.event.EventSet;

// Java program to check whether a string is a Palindrome
// Naive approach

class PalindromeString{

  public static boolean isPS(String str){

    //initialising  reverse string with empty string
    String reverse = "";

    for (int i =str.length()-1 ; i >=0 ;i--){
      reverse= reverse + str.charAt(i);
      }
    if (str.equals(reverse)){
      return true;
    }
    return false;
  }
}

class Main{
  public static void main(String[] args){
    String teststr = "sayantancse";
    boolean isPalindrome=PalindromeString.isPS(teststr);
    System.out.println(isPalindrome);
  }
}

// recursive approach
// two pointers

class PalindromeStringRecursive{
  public static boolean isPalindromeRecursive(int start, int end,String str){ 
    if(start >= end){
      return true;
    }
    if (str.charAt(start)!=str.charAt(end)){
      return false;
    }
    return isPalindromeRecursive(start+1,end-1,str);
}
  
}
class Main{
  public static void main(String[] args){
    String teststr = "ada";
    boolean  ispal = PalindromeStringRecursive.isPalindromeRecursive(0, teststr.length()-1,teststr);
    System.out.println(ispal);
  }
}
