package com.company;

import java.util.Scanner;

public class BT1 {

    void soSanhChuoi() {
        String A, B;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi A: ");
        A = sc.nextLine();
        System.out.print("Nhập vào chuỗi B: ");
        B = sc.nextLine();

        if(A.equals(B))
        {
            System.out.println("Hai chuỗi giống nhau");
        }
        else if (A.contains(B)) {
            System.out.println("Chuỗi A chứa chuỗi B");
        }
        else if (B.contains(A)) {
            System.out.println("Chuỗi B chứa chuỗi A");
        }
        else {
            System.out.println("Hai chuỗi khác nhau");
        }
    }
}