/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03;

/**
 *
 * @author HP Pavilion
 */
public class HW03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int output = checkIfOrdered(array);
        System.out.println(output);
    }

    public static int checkIfOrdered(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= array[i + 1]) {
                return result = 1;
            } else if (array[i] >= array[i + 1]) {
                return result = -1;
            } else {
                return result = 0;
            }
        }
        return result;
    }

}
