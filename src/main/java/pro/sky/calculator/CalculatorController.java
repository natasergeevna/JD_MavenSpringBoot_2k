package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorServiceImp;

    public CalculatorController(CalculatorService calculatorServiceImp) {
        this.calculatorServiceImp = calculatorServiceImp;
    }

    @RequestMapping(path = "/calculator")
    public String welcomeCalculator() {
        return calculatorServiceImp.welcomeCalculator();
    }

    @RequestMapping(path = "/calculator/plus")
    public String plusCalculator(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculatorServiceImp.plusCalculator(num1, num2);
    }

    @RequestMapping(path = "/calculator/minus")
    public String minusCalculator(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculatorServiceImp.minusCalculator(num1, num2);
    }

    @RequestMapping(path = "/calculator/multiply")
    public String multiplyCalculator(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculatorServiceImp.multiplyCalculator(num1, num2);
    }

    @RequestMapping(path = "/calculator/divide")
    public String divideCalculator(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculatorServiceImp.divideCalculator(num1, num2);
    }
}
