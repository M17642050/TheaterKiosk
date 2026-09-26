import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        // output "Enter your age: "
        System.out.print("Enter your age : ");
        // int theirAge
        // input theirAge
        int theirAge = in.nextInt();
        in.nextLine();
        // if theirAge >= 21 then
        if(theirAge >= 21) {
            // output "You get a paper wrist band."
            System.out.println("You get a paper wrist band.");
        }
    }
}