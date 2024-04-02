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

    /*--------------------------*/
    FUNCTION TO FIND THATS A AN ALPAHBET OR NOT
    /*--------------------------*/
    
    public static  void find_is_alphabet(char ch){
        if((ch>=65 && ch<= 90)){
            System.out.println("thats an alphabet and a uppercase letter");
        }
        else if((ch>=97 && ch<=122)){
            System.out.println("thats an alphabet and a lowercase letter");
        }
        else {
            System.out.println("not an alphabet");
        }
     }
        

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int useropt = 1;
        while (useropt != 0) {

            System.out.println("Enter Character to find vowel or constant");
            char given_char = sc.next().charAt(0);
            isVowel(given_char);
            System.out.println("enter 1 to continue and 0 to exit");
            useropt = sc.nextInt();
            if(useropt!=0){
             continue;
            }
            else {
                break;
            }
        }
    }
}
