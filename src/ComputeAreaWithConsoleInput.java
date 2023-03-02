import java.util.Scanner;
public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * 3.14159;

        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
    public static void main_1(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three number: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double average = (number1 + number2 + number3) / 3;

        System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
    }
}
