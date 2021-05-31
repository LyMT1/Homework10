package com.company;

import java.util.Scanner;

public class BT2 {

    void kiemTraChuoi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập vào một chuỗi: ");
        String s = sc.nextLine();
        String s2 = "";

        for (int i = 0; i < s.length(); i++) {
            Boolean found = false;
            for (int j = 0; j < s2.length(); j++) {
                if (s.charAt(i) == s2.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                s2 = s2.concat(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println("Chuỗi sau khi bỏ các kí tự trùng nhau là: " + s2);
    }
}