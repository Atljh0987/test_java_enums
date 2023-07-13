package org.example;

public class Main {
    public static void main(String[] args) {


        TestEnum strEnum = TestEnum.fromString("firstOption");

        System.out.println(strEnum.getName());
    }
}