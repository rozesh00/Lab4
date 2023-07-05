import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //sum of two numbers
        int first = 55;
        int secon = 2;
        int sum= first +secon;
        //System.out.println("Sum of two numbers is:" + first + secon); THIS PRINTS 552!! CONCATENATION
        System.out.println("Sum is: "+sum);

        //Dividing two numbers
        double mydoub = 12.78d;
        int first1 = (int) mydoub;
        int secon1 = 5;
        int divi= first1 /secon1;
        int rema = first1 %secon1;
        System.out.println("Division is: "+ divi); //Integer division 12/5 = 2
        System.out.println("remainder is: "+ rema);

        //Write a Java program that takes two numbers as input and displays the product of two numbers.

        Scanner readInput = new Scanner(System.in); //creating a scanner object

        System.out.println("Enter first number");
        int firstNum = readInput.nextInt();

        System.out.println("Enter second number");
        int secNum= readInput.nextInt();

        int multi= firstNum*secNum;

        System.out.println("multiplication: " + multi);



    }
}