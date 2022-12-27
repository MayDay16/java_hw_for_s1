// Задача: Реализовать простой калькулятор

import java.util.Scanner;

public class s1_task3 {
    public static void main(String[] args) {
        double num1;
        double num2;
        char operator;
        double answer;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число:");
        num1 = input.nextDouble();
        System.out.println("Введите оператор (*, /, +, -):");
        operator = input.next().charAt(0);
        System.out.println("Введите второе число:");
        num2 = input.nextDouble();

        input.close();

        switch (operator) {
            case '+': 
                {answer = num1 + num2;
                break;}
            case '-':  {answer = num1 - num2;
                break;}
            case '/':  {answer = num1 / num2;
                break;}
            case '*':  {answer = num1 * num2;
                break;}
            default:
                {System.out.printf("Введен неверный оператор");
                return;}
        }
        System.out.println("Результат:");
        System.out.println(answer);
        
    }
}