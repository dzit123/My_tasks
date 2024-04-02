import java.util.Scanner;

public class Practice {
    public static void isVowel(char ch) {
//         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u'){
//             System.out.println("This letter is the vowel");
//         }
//         else
//             System.out.println("This letter is not a vowel");

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
