package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int a [][]=new int [3][4];
        int b [][]=new int [3][4];

        Scanner sc=new Scanner(System.in);

        for (int i=0;i<3;i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j]=sc.next().charAt(j);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0)
        }
        System.out.println(a);
    }
}
