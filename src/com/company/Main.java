package com.company;

public class Main {

    public static void main(String[] args) {


        //HOMEWORK 7

    boolean aa = false;
    boolean bb = false;

    if((aa == true && bb == true) || (bb == false && aa == false)){
        System.out.println("Homework 7: true");
    }
    else
        System.out.println("Homework 7: false");



        //HOMEWORK 6
    int number1 = 10;

    if(number1 > 1){
        for(int p = 2; p<number1; p = p + 1 ){
            if(number1%p == 0){
                System.out.println("Homework 5: Not a prime number");
                break;
            }
            else
                System.out.println("Homework 5: A prime number");
                break;
        }
        if(number1 == 2){
            System.out.println("Homework 5: A prime number");
        }
    }
    else
        System.out.println("Homework 5: Not a prime number");



        //HOMEWORK 4
    boolean found = false;
    int number = 1;

    while(found == false){
        if(number % 387 == 0 && number % 6381 == 0){
            System.out.println("Homework 4: " +  number);
            found = true;
        }
        else
            number = number + 1;
    }

        //HOMEWORK 3
    int A = 50002;
    int B = 3002;
    int result;

    if(A > B) {
        result = A - B;
        if (result % 10 == 0) {
            System.out.println("Homework 3: true");
        }
        else
            System.out.println("Homework 3: false");
    }
    if (A < B) {
        result = B - A;
        if (result % 10 == 0) {
            System.out.println("Homework 3: true");
            }
        else
            System.out.println("Homework 3: false");
        }
    if (A == B) {
        System.out.println("Homework 3: true");
        }



        //HOMEWORK 2
        boolean shining = true;
        int time = 10;

        if (shining && (time > 9 && time < 17)) {
            System.out.println("Homework 2: Please use sunscreen");
        } else
            System.out.println("Homework 2: No need for sunscreen");


        //HOMEWORK 1
        boolean isweekday = true;
        boolean onvacation = false;

        if (!isweekday || onvacation) {
            System.out.println("Homework 1: sleep late");
        } else
            System.out.println("Homework 1: get up early");
    }
}
