package com.basic;

import java.util.Scanner;

public class Calculator3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter the operands separated by spaces: ");
        double[] operands = getOperands(scanner);

        double result = performOperation(operator, operands);
        System.out.println("Result: " + result);

        scanner.close();
    }

    private static double[] getOperands(Scanner scanner) {
        String input = scanner.nextLine().trim();
        //String input = scanner.next().trim();

        if (input.isEmpty()) {
            System.out.println("Error: No operands entered!");
            System.exit(1);
        }

        String[] operandsString = input.split("\\s+");
        double[] operands = new double[operandsString.length];

        for (int i = 0; i < operandsString.length; i++) {
            try {
                operands[i] = Double.parseDouble(operandsString[i]);
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid operand format!");
                System.exit(1);
            }
        }

        return operands;
    }

    private static double performOperation(char operator, double... operands) {
        double result = operands[0];

        for (int i = 1; i < operands.length; i++) {
            switch (operator) {
                case '+':
                    result += operands[i];
                    break;
                case '-':
                    result -= operands[i];
                    break;
                case '*':
                    result *= operands[i];
                    break;
                case '/':
                    if (operands[i] != 0) {
                        result /= operands[i];
                    } else {
                        System.out.println("Error: Division by zero!");
                        System.exit(1);
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator!");
                    System.exit(1);
            }
        }

        return result;
    }
}



