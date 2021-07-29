package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        System.out.println("Вопрос №1");
        System.out.println("Какие страны входят в Прибалтику?");
        System.out.println("1. Латвия, 2. Литва, 3. Эстония, 4. Рига");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свой ответ");
        String s = sc.nextLine();
        if (s.equals("1,2,3")) {
            System.out.println("Правильный ответ");
        }else System.out.println("Не правильный ответ");
        System.out.println("Вопрос №2");
        System.out.println("Какое млекопитающее умеет летать?");
        System.out.println("1. Летучая мышь, 2. Белоголовый орлан, 3. Колуго, 4. Белка-летяга");
        String s1 = sc.nextLine();
        if (s1.equals("1,4"))
            System.out.println("Правильный ответ");
         else System.out.println("Не правильный ответ");
        System.out.println("Вопрос №3");
        System.out.println("Какого цвета нет в радуге?");
        String s2 = sc.nextLine();
        if (s2.equals("коричневого")) {
            System.out.println("Правильный ответ");
        } else System.out.println("Не правильный ответ");
        System.out.println("Вопрос №4");
        System.out.println("Какой город подарил свое название государственному гимну Французской республики?");
        String s3 = sc.nextLine();
        if (s3.equals("марсель")) {
            System.out.println("Правильный ответ");
        } else System.out.println("Не правильный ответ");
        System.out.println("Вопрос №5");
        System.out.println("Какое крупное парнокопытное животное обитает в Гренландии?");
        System.out.println("1. Бизон, 2. Корова, 3. Овцебык, 4. Лось");
        String s4 = sc.nextLine();
        if (s4.equals("3")) {
            System.out.println("Правильный ответ");
        } else System.out.println("Не правильный ответ");
        System.out.println("Вопрос №6");
        System.out.println("В облике, какого животного древние египтяне изображали Анубиса – покровителя мертвых?");
        System.out.println("1. Шакал, 2. Крокодил, 3. Леопард, 4. Лось");
        String s5 = sc.nextLine();
        if (s5.equals("1")) {
            System.out.println("Правильный ответ");
        } else System.out.println("Не правильный ответ");
    }

}