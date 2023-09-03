package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 8, 12, 11, 13};
        delsort(arr);
    }
    public static void delsort(int[] arr) {
        int temp;

        int antallPar = 0;
        for (int k : arr) {
            if (k % 2 == 0) {
                antallPar++;
            }
        }
        int antallOdde = arr.length - antallPar;
        System.out.println(Arrays.toString(arr));
        System.out.println("Antall oddetall : " + antallOdde + "\nAntall partall : " + antallPar);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                temp = arr[i];
                for (int j = arr.length - 1; j > antallOdde; j--) {
                    if (arr[j] % 2 != 0) {
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                    //System.out.println(i + " og " + j);
                    //System.out.println(Arrays.toString(arr));
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, 0, antallOdde);
        Arrays.sort(arr, antallOdde, arr.length);

        System.out.println(Arrays.toString(arr));

    }
}
