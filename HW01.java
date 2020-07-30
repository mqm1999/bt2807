/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw01;

import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class HW01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1, col1, row2, col2;
        System.out.println("Nhap so hang ma tran 1: ");
        row1 = sc.nextInt();
        System.out.println("Nhap so cot ma tran 1: ");
        col1 = sc.nextInt();
        System.out.println("Nhap so hang ma tran 2: ");
        row2 = sc.nextInt();
        System.out.println("Nhap so cot ma tran 2: ");
        col2 = sc.nextInt();
        int[][] array1 = new int[row1][col1];
        int[][] array2 = new int[row2][col2];
        if(row1 != row2 || col1 != col2){
            System.out.println("KHONG CONG DUOC!!!!");
        } else{
        int[][] arrsum = new int[row1][col1];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    System.out.println("Nhap vao phan tu " +(i+1)+(j+1) + "cua ma tran 1: ");
                    array1[i][j] = sc.nextInt();
                }
            }
        
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.println("Nhap vao phan tu " +(i+1)+(j+1) + "cua ma tran 2: ");
                    array2[i][j] = sc.nextInt();
                }
            }
        for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    arrsum[i][j] = array1[i][j] + array2[i][j];
                }
            }
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    System.out.print(arrsum[i][j] + " ");
                }
                System.out.println("");
            }
        }
            
    }
    
}
