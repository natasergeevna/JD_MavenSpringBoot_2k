package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImp implements CalculatorService {
    public String welcomeCalculator() {
        return "Добро пожаловать в калькулятор!";
    }

    public String plusCalculator(String num1, String num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            NumberFormatException e;
            return "Забыли ввести данные!";
        }
        int res = Integer.parseInt(num1) + Integer.parseInt(num2);
        return num1 + " + " + num2 + " = " + res;
    }

    public String minusCalculator(String num1, String num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            NumberFormatException e;
            return "Забыли ввести данные!";
        }
        int res = Integer.parseInt(num1) - Integer.parseInt(num2);
        return num1 + " - " + num2 + " = " + res;
    }

    public String multiplyCalculator(String num1, String num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            NumberFormatException e;
            return "Забыли ввести данные!";
        }
        int res = Integer.parseInt(num1) * Integer.parseInt(num2);
        return num1 + " * " + num2 + " = " + res;
    }

    public String divideCalculator(String num1, String num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            NumberFormatException e;
            return "Забыли ввести данные!";
        }
        if (num2.equals("0")) {
            ArithmeticException e;
            return "На ноль делить нельзя!";
        };
        int res = Integer.parseInt(num1) / Integer.parseInt(num2);
        return num1 + " / " + num2 + " = " + res;
    }
}
