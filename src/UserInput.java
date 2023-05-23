import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int column =0;
        int row = 0;
        int c=0;
        int r=0;
        System.out.println("Do you want to print stars? (yes or no): ");
        String response = in.nextLine(); //requirement 6: user input
        if(response.equals("no")){
            System.out.print("Bye!");
        }else{
            System.out.print("Would you like to print circles after stars (yes or no)?: ");
            String answer = in.next();
            System.out.print("How many columns of stars?: ");
            column = in.nextInt();
            System.out.print("How many rows of stars?: ");
            row = in.nextInt();
            boolean existance =false;
            if(row >1) {
                System.out.print("Would you like a line between each row of stars? (yes or no): ");
                String lines = in.next();
                if (lines.equals("yes")) {
                    existance = true;
                }
            }
            if(answer.equals("no")) {
                DrawingStar project = new DrawingStar(row, column);
                project.drawing(existance);
            }else{
                System.out.print("How many columns of circles?: ");
                c = in.nextInt();
                System.out.print("How many rows of circles?: ");
                r = in.nextInt();
                DrawingCircle project = new DrawingCircle(row,column,r,c);
                project.drawing(existance);
            }

        }

    }
}
