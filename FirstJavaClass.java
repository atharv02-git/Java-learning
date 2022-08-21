import java.util.Scanner;

public class FirstJavaClass {
    public static void main(String[] args) {
        // int firstNumber = 10;
        // int secondNumber = 5;

        // int addition = firstNumber + secondNumber;
        // double doubledDiv = (double)firstNumber / (double)secondNumber;
        // int moduloDiv = firstNumber % secondNumber;

        // System.out.println("Addition is: "+addition);
        // System.out.println("Doubled division is: "+doubledDiv);
        // System.out.println("Modulo division is: "+moduloDiv); //gives Remainder

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String str = sc.nextLine();
        // System.out.println("Your Name is: ");
        // System.out.println(str);
        // sc.close();

        // Switch Case

        // char grade = 'A';

        // switch (grade) {
        // case 'A':
        // System.out.println("Very good grade");
        // break;
        // case 'B':
        // System.out.println("B grade");
        // default:
        // System.out.println("Wrong Argument");
        // break;
        // }

        /* int a = 1;
        while (true) {
            System.out.println(a);
            a++;
            if (a > 11) {
                break;
            }
        } */
        // int a = 1;
        // while(a < 100){
        //     System.out.println(a);
        //     a++;
        // }

        // Arrays
        // int marks[] = {10, 30, 34, 48, 12, 100, 56};
        // for(int i = 0; i < marks.length; i++) {
        //     System.out.println("Array of marks is: " + marks[i]);
        // }

        // Accepting user input in the form of Array
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        // Reads the size of the array
        n = sc.nextInt();

        //creates an array in the memory of length 10
        int userArray[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++) {
            //reading array elements from the user  
            userArray[i] = sc.nextInt();
        }

        System.out.println("Array elements are: ");
        // Accessing the elements of the array using for loop
        for(int i = 0; i < n; i++) {
            System.out.println(userArray[i]);
        }

        sc.close();
    }

}
