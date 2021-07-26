package pl.javastart.bootcamp;

import java.util.Arrays;

public class BubbleSort {

    void sortTheArray(int[] tab) {

        int index = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int k = i + 1; k < tab.length; k++) {
                if (tab[i] > tab[k]) {
                    int a = tab[i];
                    int b = tab[k];
                    tab[k] = a;
                    tab[i] = b;
                    index++;
                }
            }
        }
        System.out.println(Arrays.toString(tab));
        System.out.println("Liczba porównań: " + index);
    }
}