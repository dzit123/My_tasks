import java.util.Scanner;

public class Practice {
    public static void isVowel(char ch) {

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("this is a vowel");
                break;
            default:
                System.out.println("not a vowel");
        }
    }

    // FUNCTION TO FIND Type of character
    
  static String findTypeofCharacter(char ch) {
        if (ch >= 65 && ch <= 90)
            return "thats a Upper case Letter";

        else if(ch >= 97 && ch<= 122)
            return  "thats a lower case letter";
        else if(ch>= 48 && ch<= 57)
            return "Thats a number";
        else
            return "thats a special character";
    }
    // FUNCTION TO FIND odd or even
  
    String find_Even_or_Odd(int num){
        if(num%2==0)
            return  "thats  a even number";
        else
            return  "thats a odd Number";
    }
   
    // FUNCTION to check palindrom number
    public static String palindromeCheck(int Given_Number){
       int temp_num = Given_Number;
        int reversed=0;
        while(Given_Number!=0){
            int temp = Given_Number%10;  // we are getting unit digit of the number
            reversed =( reversed *10 )+ temp;  // adding number to print as reverse order
            Given_Number=Given_Number/10;  // getting remaining numbers rather than unit digit
        }

        if(temp_num == reversed){
            return  "This is palindrome number";
        }
        else{
           return  "not a palindrome";

        }

    }

/*------------Reverse string--------------------*/

     public static String reverseString(String s){

        String rev="";
        int length= s.length();
        for (int i=length-1;i >=0;i--){
            rev= rev+s.charAt(i);
        }

        return rev;

    }


    public static void main(String[] args) {
     
        }
    
}
