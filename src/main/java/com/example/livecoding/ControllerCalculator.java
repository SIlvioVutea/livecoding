package com.example.livecoding;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calculator")
public class ControllerCalculator {
    //    Una richiesta PUT con formato "?number={n}" aggiunge il numero "n" alla lista
//    Una richiesta GET che ritorna la lista di numeri inseriti fin'ora
//    Una richiesta DELETE che svuota la lista
//    Una richiesta GET all'endpoint "/sum" ritorna la somma dei numeri in lista
//    Una richiesta GET all'endpoint "/sub" ritorna la sottrazione di tutti i numeri in lista
//    Una richiesta GET all'endpoint "/prod" ritorna il prodotto di tutti i numeri in lista
//    Una richiesta GET all'endpoint "/div" ritorna il quoziente di tutti i numeri in lista come double
    private Calculator calculator;

    public ControllerCalculator() {
        this.calculator = new Calculator();
    }

    @PutMapping
    public List<Integer> addANumber(@RequestParam int number) {
        return calculator.addNumeberToTheList(number);
    }

    @GetMapping

    public List<Integer> getNumbers() {
        return calculator.getNumbers();
    }

    @DeleteMapping
    public void clearList() {
        calculator.clearList();
    }
}
