package com.example.livecoding;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> numbers;

    public Calculator() {
        this.numbers = new ArrayList<>();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public List<Integer> addNumeberToTheList(int number) {
        numbers.add(number);
        return numbers;

    }

    public void clearList() {
        numbers.clear();
    }

}
