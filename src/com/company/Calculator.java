package com.company;

import org.w3c.dom.ls.LSOutput;

public class Calculator {
    /** создание нового класса Калькулятор
     * (вид блочного коментария)
     *
     * **/

    public static void main(String[] args) {

        plusMethood();
        minusMethood();
        divideMethood();
        multiplyMethood();


        System.out.println("Calculator");
    }

    public static void plusMethood() { //медод "сложения" для калькулятора (строчный комментарий)
        System.out.println("Plus");
    }

    public static void minusMethood() {
        System.out.println("Minus");
    }

    public static void divideMethood() {
        System.out.println("Divide");
    }
    public static void multiplyMethood() {
        System.out.println("Multiply");
    }

}



