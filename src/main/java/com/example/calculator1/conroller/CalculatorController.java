package com.example.calculator1.conroller;

import com.example.calculator1.service.CalculatorServiceInt;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/calculator/")
public class CalculatorController {
    private final CalculatorServiceInt  calculatorServiceInt;

    @GetMapping("/plus")
    public String plus(@RequestParam(name="num1",required = false) Integer a,
                       @RequestParam(name="num2",required = false) Integer b ) {
        if (a==null||b==null) return "Отсутствует одно из значений";
        int plus=calculatorServiceInt.plus(a, b);
        return a+"+"+b+"="+plus;
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(name="num1",required = false) Integer a,
                       @RequestParam(name="num2",required = false) Integer b ) {
        if (a==null||b==null) return "Отсутствует одно из значений";
        int minus = calculatorServiceInt.minus(a, b);
        return a+"-"+b+"="+minus;
    }
    @GetMapping("/multiply")
    public String multiple(@RequestParam(name="num1",required = false) Integer a,
                       @RequestParam(name="num2",required = false) Integer b ) {
        if (a==null||b==null) return "Отсутствует одно из значений";
        int multiple = calculatorServiceInt.multiple(a, b);
        return a+"*"+b+"="+multiple;
    }
    @GetMapping("/divide")
    public String divide(@RequestParam(name="num1", required = false) Integer a,
                       @RequestParam(name="num2", required = false) Integer b ) {
        if (a==null||b==null) return "Отсутствует одно из значений";
        double divide = calculatorServiceInt.divide(a, b);
        return a+"/"+b+"="+divide;
    }

}
