package com.company;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("cisla.txt"));
            int visa = 0;
            int masterCard = 0;
            int total = 0;
            String line;
            while ((line = br.readLine()) != null) {
                total++;
                if ((line.length() == 13 || line.length() == 16 || line.length() == 19) && line.charAt(0) == '4') {
                    visa++;
                } else if (line.length() == 16 && (((Integer.parseInt(line.substring(0, 4)) >= 2221) && (Integer.parseInt(line.substring(0, 4)) <= 2720)) || ((Integer.parseInt(line.substring(0, 2)) >= 51) && (Integer.parseInt(line.substring(0, 2)) <= 55)))) {
                    masterCard++;
                }
            }
            System.out.println("Amount of Visa cards: " + visa);
            System.out.println("Amount of MasterCard cards: " + masterCard);
            System.out.println("Total of all cards (ie. American Express): " + total);

        } catch (Exception e) {
            System.out.println("not found");
        }
    }
}
