package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите нужное количество чисел: ");
        int amount = scann.nextInt();
        for (int i=1; i <= amount; i++) {
            int rand = 0;
            Random ran = new Random();
            rand = ran.nextInt(100);
            System.out.println(rand);
        }
    }
}