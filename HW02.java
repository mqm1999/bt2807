/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02;

/**
 *
 * @author HP Pavilion
 */
public class HW02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean bool = checkIfSumDivisibleBy3And5(12, 15);
        System.out.println(bool);
    }

    public static boolean checkIfSumDivisibleBy3And5(int input1, int input2) {
        int sum = input1 + input2;
        if (sum % 3 == 0 && sum % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
