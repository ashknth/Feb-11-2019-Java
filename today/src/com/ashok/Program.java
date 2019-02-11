package com.ashok;

import java.util.Scanner;

/**
 * Created by DELL on 2/11/2019.
 */
public class Program {


    public static void main(String[] args) {
        int arr[][] = new int[5][5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array elements::");
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j< 2; j++)
            {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The array is ::");
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.print(arr[i][j] + " ");
          //      System.out.println("The element" + a);
            }
            System.out.println();
        }


    }

}
