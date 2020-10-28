package com.company;

public class Main {

    public static void main(String[] args) {
        Integer x = new Integer(6) * 7;
        if (x != 42) {
            System.out.println("not 42");
        } else if (x.equals(42)) {
            System.out.println("entrada 1");
        } else {
            System.out.println("entrada 2");
        }
    }
}

// A saída foi 1, pois 6 * 7 = 42 então o primeiro if é ignorado pois 42 == 42, por isso caímos no else if com a sintaxe x.equals(42) (42 == 42)