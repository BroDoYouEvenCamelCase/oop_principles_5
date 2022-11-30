package Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework10 {

    public static void main(String[] args) {
        System.out.println("Task 1 ----------");
        String str = "Selenium is   the most   common UI   automation tool.   ";
        System.out.println(str);
        System.out.println(countWords(str));

        System.out.println("Task 2 -----------");
        String str2 = "QA stands for Quality Assurance";
        System.out.println(str2);
        System.out.println(countA(str2));

        System.out.println("Task 3 -------------");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-23, -4, 0, 2, 5, 90, 123));
        System.out.println(numbers);
        System.out.println(countPos(numbers));

        System.out.println("Task 4-----------------------");
        ArrayList<Integer> numbers4 = new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60, 20));
        System.out.println(removeDuplicateNumbers(numbers4));

        System.out.println("Task 5------------------------");
        ArrayList<String> str5 = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++", "C#"));
        System.out.println(removeDuplicateElements(str5));

        System.out.println("Task 6-------------------------");
        String str6 = "  I  am  learning   Java      ";
        System.out.println(removeExtraSpaces(str6));

        System.out.println("Task 7-----------------------");
        int[] arr1 = {10, 3, 6, 3, 2};
        int[] arr2 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
        System.out.println(Arrays.toString(add(arr1, arr2)));

        System.out.println("Task 8--------------------------");
        int[] numbers8 = {10, -13, 12, 8, 15, -20};
        System.out.println(findClosestTo10(numbers8));
    }

    public static int countWords (String str){
        str = str.replaceAll("\\s+", " ").trim();
        String[] wordArray = str.split(" ");
        return wordArray.length;
    }

    public static int countA(String str){
        int countA = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A')
                countA++;
        }
        return countA;
    }

    public static int countPos (ArrayList<Integer> numbers){
        int countPos = 0;
        for (int number: numbers){
            if(number > 0)
                countPos++;
        }
        return countPos;
    }

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers){
        ArrayList<Integer> noDups = new ArrayList<>();
        for (Integer number : numbers) {
            if (!noDups.contains(number)) noDups.add(number);
        }
        return noDups;
    }

    public static ArrayList<String> removeDuplicateElements(ArrayList<String> strs){
        ArrayList<String> noDuplicates = new ArrayList<>();
        for (String str : strs) {
            if(!noDuplicates.contains(str)) noDuplicates.add(str);
        }
        return noDuplicates;
    }

    public static String removeExtraSpaces(String str){
        return str.replaceAll("\\s+", " ").trim();
    }

    public static int[] add(int[] numbers1, int[] numbers2){
        int[] sum;
        if (numbers1.length > numbers2.length){
            for (int i = 0; i < numbers2.length; i++){
                numbers1[i] = numbers1[i] + numbers2[i];
            }
            sum = numbers1;
        }
        else {
            for (int i = 0; i < numbers1.length; i++){
                numbers2[i] = numbers1[i] + numbers2[i];
            }
            sum = numbers2;
        }
        return sum;
    }

    public static int findClosestTo10(int[] numbers){
        int difference = Integer.MAX_VALUE;
        int closest = 0;
        for (int number : numbers) {
            if (Math.abs(10 - number) <= difference && number != 10){
                if (difference == Math.abs(10 - number)){
                    closest = Math.min(closest, number);}
                else
                {difference = Math.abs(10 - number);
                    closest = number;}
            }
        }
        return closest;
    }}