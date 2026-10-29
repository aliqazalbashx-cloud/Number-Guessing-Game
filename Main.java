import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        //MINI PROJECT

        int userNumber =0;

        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);

        do{
            System.out.println("Guess My Number (1-100) ");
             userNumber = sc.nextInt();
            if(userNumber == myNumber){
                System.out.println("Congratulations :");
                break;

            }
            else if(userNumber > myNumber){
                System.out.println("The Number is too large");
            }
            else{
                System.out.println("The Number is too small");
            }

        } while(userNumber >= 0);

        System.out.println("My number was:");
        System.out.println(myNumber);

    }
}