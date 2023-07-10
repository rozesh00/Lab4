import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] numbers = {2, 4, 7, 8, 9, 0, 11, 16};
        int ans = largestNum(numbers);
        System.out.println("The greatest Number in the given array is: " + ans);




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
//
//        System.out.println("Enter first number");
//        int firstNum = readInput.nextInt();
//
//        System.out.println("Enter second number");
//        int secNum= readInput.nextInt();
//
//        int multi= firstNum*secNum;
//
//        System.out.println("multiplication: " + multi);


        //Write a  program that takes a number as input and prints its multiplication table up to 10.
//        System.out.println("enter a number for table");
//        int newNum = readInput.nextInt();
//
//        for (int i =1; i<=10; i++){
//            int multip = newNum *i;
//            System.out.println(newNum + "x" + i + "=" + multip);//if int i =1, then (i+1) while multiplying
//            //System.out.println(newNum + " x " + (i+1) + " = " + (num1 * (i+1)));
//
//        }
//

        //Write a Java program to print the area and perimeter of a circle.
        int radius = 7;


        double area = Math.PI * radius*radius;
        System.out.println("Area of circle is: "+ area );

        BasicJava newInst = new BasicJava();
        newInst.decimalToBinary(19);

        System.out.println("\n" +"decimal of 11001 is "+ newInst.binaryToDecimal(11001));


        String originalStr= "There is a house in new orleans.";
        System.out.println("reversed string is: " + "\n");
        String reversedString = newInst.reverseString(originalStr);
        System.out.println(reversedString);

//        there is an exception when the method is declared as static. Static methods belong to
//        the class itself rather than an instance of the class, and they can be called directly using the class name
//        without the need for an object.
        System.out.println("Reverse string using StringBuilder:");
        String reverseStr= BasicJava.reverSting(originalStr);
        System.out.println(reverseStr);

        int charactersCount = BasicJava.countCharacters(originalStr);
        System.out.println("the number of letters: " + charactersCount);



    }

    public  static  int largestNum(int[] arr){

        if (arr == null || arr.length ==0){
            throw new IllegalArgumentException("array must not be empty");
        }

        //Double inf = Double.POSITIVE_INFINITY;
        int largest =arr[0];

        for(int i =1; i< arr.length; i++){
            if (arr[i] > largest){
                largest=arr[i];
            }
        }
        return largest;
    }
}