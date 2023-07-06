public class BasicJava {
    public void decimalToBinary(int n) {
        int remainder;

        //array to store binary number
        int[] newArr = new int[1000];

        //counter for binary array
        int i =0;

        while (n!=0){
            //stroing remainder in binary array
            newArr[i] = n%2;
            n= n/2;
            i++;

        }
        System.out.println("Binary number is: ");
        for (int m =i-1; m>=0;m--){
            System.out.print(newArr[m] );

        }
    }


    public  int binaryToDecimal(int binaryNumber){

        int decimalNumber = 0;
        int power = 0;

        while(binaryNumber > 0){

            //taking the rightmost digit from binaryNumber
            int temp = binaryNumber%10;

            //now multiplying the digit and adding it to decimalNumber variable
            decimalNumber += temp*Math.pow(2, power);

            //removing the rightmost digit from binaryNumber variable
            binaryNumber = binaryNumber/10;

            //incrementing the power variable by 1 to be used as power for 2
            power++;
        }
        return decimalNumber;
    }

    public  String reverseString (String str){

        char[] newArr = new char[str.length()];

        for (int i =0; i <str.length(); i++){

            newArr[i] = str.charAt(i);
        }
        String prin= "";

        for (int j=newArr.length-1; j >=0; j--){ //because array length is suppose 8, then 0-indexing will make it 7
            //so starting from arr.length-1
            prin += newArr[j];
        }

        return prin;

    }

    public  static  String reverSting(String str){

        StringBuilder reversed = new StringBuilder();

        for(int i = str.length()-1; i >=0; i--){
            reversed.append(str.charAt(i));
            //append(char a): inbuilt method to append the string representation of the char argument to the given sequence.
        }
        return reversed.toString();
    }

    /*
     *         String s = "GeeksForGeeks";
     *         char[] gfg = s.toCharArray();
     *
     * The Java String toCharArray() method is used to convert the current string to a character array.
     * This method returns a newly formed character array with a length equal to the given string and with the
     * characters in the given string initialized as its contents.
     */

    //Write a Java program to count letters, spaces, numbers and other characters in an input string.

    // an array of chars
    //char[] charArray ={ 'a', 'b', 'c', 'd', 'e' };

    public static int countCharacters(String str) {
        int digitCount = 0;
        int letterCount = 0;
        int spaceCount = 0;
        int othersCount = 0;

//        char[] arr = str.toCharArray();
//        int tem =0;
//        while(tem != arr.length){
//
//
//        System.out.println(arr[tem] + "");
//        tem++;
//
//        if (Character.isLetter(arr[tem])){
//            letterCount++;
//        }else if (Character.isDigit(arr[tem])){
    //    digitCoun++;
//    }
        for (int i= 0;i< str.length(); i++){

            char c = str.charAt(i);
            //Character class, isDigit method
            if (Character.isDigit(c)){
                digitCount++;
            } else if (Character.isLetter(c)) {
                letterCount++;

            } else if (Character.isWhitespace(c)) {
                spaceCount++;

            }else {
                othersCount++;
            }

            //isLowerCase(), isUpperCase(),toUpperCae(), toLowerCase(),toString()

        }
        System.out.println(othersCount);
        System.out.println(spaceCount);
        System.out.println(letterCount);
        System.out.println(digitCount);
        return letterCount;

    }

    public static void characterCount(String str){

        char[]  arr= str.toCharArray();


    }



}
