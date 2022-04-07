package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        // Restaurant

        // Gemüse putzen --> Gemüse kochen --> Teller anrichten --> Teller servieren

        ausgabe(anrichten(kochen(putzen())));
    
    }

    public static String putzen() {
        return "geputzen Brokkoli";
    }

    public static String kochen(String input) {
        return "gekochten, " + input;
    }

    public static String anrichten(String input) {
        return input + " auf einem Teller";
    }

    public static void ausgabe(String outputStr) {
        System.out.println(outputStr);
    }




}

