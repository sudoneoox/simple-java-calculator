import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long firstNum = scan.nextLong();
        String operator = scan.next();
        long secondNum = scan.nextLong();
        if (operator.contains("/") && secondNum == 0) {
            System.out.println("Division by 0!");
        } else {
            switch (operator) {
                case "/":
                    System.out.println(firstNum / secondNum);
                    break;
                case "+":
                    System.out.println(firstNum + secondNum);
                    break;
                case "*":
                    System.out.println(firstNum * secondNum);
                    break;
                case "-":
                    System.out.println(firstNum - secondNum);
                    break;
                default:
                    System.out.println("Unknown operator");
                    break; 
            }
        }
    }
}
