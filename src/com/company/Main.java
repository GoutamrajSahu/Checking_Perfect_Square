package com.company;

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number to check ti's a perfect square or not: ");
        int num = Sc.nextInt();
        int Sqrt = (int)Math.sqrt(num);
        if(Sqrt*Sqrt == num){
            System.out.println("It is a Perfect Square");
        }else{
            System.out.println("It is not a Perfect Square");
        }
    }
}