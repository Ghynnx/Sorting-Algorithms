/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sorting1;

/**
 *
 * @author Student's Account
 */
public class Sorting2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] name = {
            "Tristan", "Caleb", "Lucas", "Elijah", "Grace", "Kevin", "Brianna", "Isabella",
            "Gabriel", "Jasmine", "Penelope", "Liam", "Patrick", "Sarah", "Yasmine", "Matthew",
            "Rachel", "Katherine", "Madison", "Noah", "Owen", "Charlotte", "Samuel", "William",
            "Alice", "Emma", "Victor", "Benjamin", "Uriel", "Sophia", "Mia", "Diana",
            "Abigail", "Joshua", "Thomas", "Nathan", "Jacob", "Olivia", "Steven", "Vanessa",
            "Quentin", "Zachary", "Daniel", "Zoe", "Isabella", "Aaron", "Leah", "Alexander",
            "Hannah", "Xander"
        };
        String[] mergeSorted = name.clone();
        mergeSort(mergeSorted, 0, mergeSorted.length - 1);
        System.out.println("Merge Sort Result:");
        displayNames(mergeSorted);

        // Example: Quick Sort
        String[] quickSorted = name.clone();
        quickSort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("Quick Sort Result:");
        displayNames(quickSorted);

    }

    // Merge Sort
    public static void mergeSort(String[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(String[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        String[] L = new String[n1];
        String[] R = new String[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    // Quick Sort
    public static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Display names (same as your style)
    public static void displayNames(String[] names) {
        System.out.println("String[] name = {");
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                System.out.print("    ");
            }
            System.out.print("\"" + names[i] + "\"");
            if (i < names.length - 1) {
                System.out.print(", ");
            }
            if (i % 5 == 4 || i == names.length - 1) {
                System.out.println();
            }
        }
        System.out.println("};");
    }
}
