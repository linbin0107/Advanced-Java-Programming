package edu.pdx.cs410J.numbers2words;

import java.util.HashMap;

public class NumbersToWords {
    private HashMap<Integer, String> map = new HashMap<Integer, String>();

    public String numberToWords(int number) {
        buildMap();

        if (number == 0) {
            return map.get(0);
        }

        String res = "";

        if (number >= 1000000000) {
            int quotient = number / 1000000000;
            res += converter(quotient) + " Billion";
            number %= 1000000000;
        }

        if (number >= 1000000) {
            int quotient = number / 1000000;
            res += converter(quotient) + " Million";
            number %= 1000000;
        }

        if (number >= 1000) {
            int quotient = number / 1000;
            res += converter(quotient) + " Thousand";
            number %= 1000;
        }

        if (number > 0) {
            res += converter(number);
        }

        return null;
    }

    private String converter(int quotient) {
        String str = "";

        if (quotient >= 100) {
            int hundred = quotient / 100;
            str += map.get(hundred) + " Hundred";
            quotient %= 100;
        }

        if (quotient > 0) {
            if (quotient > 0 && quotient <= 20) {
                str += " " + map.get(quotient);
            } else {
                int tens = quotient / 10;
                str += " " + map.get(tens * 10);

                int digit = quotient % 10;
                if(digit>0){
                    str += " " + map.get(digit);
                }
            }
        }

        return str;
    }

    private void buildMap() {
        map.put(0, "Zero");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Night");
        map.put(10, "Ten");
        map.put(11, "Eleven");
        map.put(12, "Twelve");
        map.put(13, "Thirteen");
        map.put(14, "Fourteen");
        map.put(15, "Fifteen");
        map.put(16, "Sixteen");
        map.put(17, "Seventeen");
        map.put(18, "Eighteen");
        map.put(19,"Nineteen");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");
        map.put(50, "Fifty");
        map.put(60, "Sixty");
        map.put(70, "Seventy");
        map.put(80, "Eighty");
        map.put(90, "Nighty");
    }
}
