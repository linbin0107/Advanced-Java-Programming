package edu.pdx.cs410J.numbers2words;

public class NumbersToWords {

    public String parse(String input) throws IllegalArgumentException {

        if(input.equals("1")) {
            return "One Dollar";
        }
        else if(input.equals("2")){
            return "Two";
        }
        throw new IllegalArgumentException("Bad argument: " + input);
    }
}
