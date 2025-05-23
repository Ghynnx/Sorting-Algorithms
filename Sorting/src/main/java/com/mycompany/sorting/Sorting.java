/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sorting;

import java.util.*;

/**
 *
 * @author Student's Account
 */
public class Sorting {

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

        String[] bubbleSorted = name.clone();
        BubbleSort(bubbleSorted);
        System.out.println("Bubble Sort Result:");
        displayNamesFormatted(bubbleSorted);

        // Insertion Sort and display
        String[] insertionSorted = name.clone();
        InsertionSort(insertionSorted);
        System.out.println("Insertion Sort Result:");
        displayNamesFormatted(insertionSorted);

        // Selection Sort and display
        String[] selectionSorted = name.clone();
        SelectionSort(selectionSorted);
        System.out.println("Selection Sort Result:");
        displayNamesFormatted(selectionSorted);
    }

    public static void BubbleSort(String[] names) {
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
    }

    public static void InsertionSort(String[] names) {
        for (int i = 1; i < names.length; i++) {
            String key = names[i];
            int j = i - 1;
            while (j >= 0 && names[j].compareTo(key) > 0) {
                names[j + 1] = names[j];
                j--;
            }
            names[j + 1] = key;
        }
    }

    public static void SelectionSort(String[] names) {
        for (int i = 0; i < names.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareTo(names[minIndex]) > 0) {
                    minIndex = j;
                }
            }
            String temp = names[i];
            names[i] = names[minIndex];
            names[minIndex] = temp;
        }
    }
    
     public static void displayNamesFormatted(String[] names) {
        System.out.println("String[] name = {");
        for (int i = 0; i < names.length; i++) {
            if (i < names.length - 1) {
                System.out.println("    \"" + names[i] + "\",");
            } else {
                System.out.println("    \"" + names[i] + "\"");
            }
        }
        System.out.println("};");
    }
}

