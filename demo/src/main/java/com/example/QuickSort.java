package com.example;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        /* Anomaly 1: Redundant variable assignment: The variable n1 is
           assigned first, and immediately reassigned in the next line,
           making it ineffective */
        int n1 = 0;
        n1 = 3;
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        /*
          Anomaly 2: The variable k is not being used anywhere.
        */
        int k = 0;
        int i = (low - 1); // Index of smaller element
        for (int j = low; j < high; j++) {
            /*
              Anomaly 3: The variable 'var' is a restricted identifier
              and should not be used.
             */
            int var;

            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = { 5, 4, 3 ,2, 1 };
        quickSort(arr, 0, arr.length - 1);


    }
}