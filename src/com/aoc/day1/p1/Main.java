package com.aoc.day1.p1;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File input = new File(System.getProperty("user.dir") + "/src/com/aoc/day1/p1/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(input));

        String line;
        int totalFuelRequirement = 0;
        while ((line = br.readLine()) != null) {
            totalFuelRequirement += calculation(Integer.parseInt(line));
        }
        System.out.println(totalFuelRequirement);
    }

    private static double calculation(int input) {
        return (Math.floor(input / 3)) - 2;
    }
}
