/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static javax.management.Query.PLUS;
public class ArithmeticBase 
{

    public double calculate(int x, int y, ArithmeticOperation operation) {
        double result = 0.0;
        switch (operation) {
            case PLUS:
                result = x + y;
                break;
            case MINUS:
                result = x - y;
                break;
            case TIMES:
                result = x * y;
                break;
            case DIVIDE:
                if (y != 0) {
                    result = (double) x / y;
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
        }
        return result;
    }
}



    

   
