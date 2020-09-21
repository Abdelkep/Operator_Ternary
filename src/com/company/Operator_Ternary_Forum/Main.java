package com.company.Operator_Ternary_Forum;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        String lulus = "Lulus";
        String gagal = "Gagal";
        String status = "";

        status = (nilai > 75) ? lulus : gagal;
        System.out.print(status);

      }
   }


