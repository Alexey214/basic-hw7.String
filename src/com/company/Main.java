package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Задание №1:
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanowich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);

        //Задание №2:
        String upperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperCase);

        //Задание №3:
        fullName = "Иванов Семён Семёнович";
        String change = fullName.replace('ё', 'е');
        System.out.println(change);

        System.out.println("Задание №5:");
        fullName = "Ivanov Ivan Ivanovich";
        splitName(fullName);

        System.out.println("Задание №6:");
        String fullLowerName = "ivanov ivan ivanovich";
        nameToUp(fullLowerName);

        System.out.println("Задание №7:");
        String str1 = "135";
        String str2 = "246";
        stringCollect(str1, str2);

        System.out.println("Задание №8:");
        String notClearString = "aabccddefgghiijjkk";
        clearString(notClearString);

    }

    //Задание №5:
    public static void splitName(String fullName) {
        String[] nameArr = fullName.split(" ");
        if (fullName.isEmpty()) {
            System.out.println("Введите Ф.И.О.");
        } else if (nameArr.length != 3) {
            System.out.println("Вы являетесь гражданином другой страны? Введите с соотвествии со стандартами РФ Ф.И.О.");
        } else {
            int firstSpace = fullName.indexOf(" ");
            int lastSpace = fullName.lastIndexOf(" ");
            String firstName = fullName.substring(0, firstSpace).replace(" ", "");
            String middleName = fullName.substring(firstSpace, lastSpace).replace(" ", "");
            String lastName = fullName.substring(lastSpace, fullName.length()).replace(" ", "");
            System.out.printf("Имя сотрудника — %s\nФамилия сотрудника — %s\nОтчество сотрудника — %s\n", middleName, firstName, lastName);
        }
    }

    //Задание №6:
    public static void nameToUp(String fullLowerName) {
        String[] nameArr = fullLowerName.split(" ");
        if (fullLowerName.isEmpty()) {
            System.out.println("Введите Ф.И.О.");
        } else if (nameArr.length != 3) {
            System.out.println("Вы являетесь гражданином другой страны? Введите с соотвествии со стандартами РФ Ф.И.О.");
        } else {
            int firstSpace = fullLowerName.indexOf(" ");
            int lastSpace = fullLowerName.lastIndexOf(" ");
            String firstName = fullLowerName.substring(0, firstSpace).replace(" ", "");
            String middleName = fullLowerName.substring(firstSpace, lastSpace).replace(" ", "");
            String lastName = fullLowerName.substring(lastSpace, fullLowerName.length()).replace(" ", "");
            char c1 = firstName.charAt(0);
            Character letterFirstName = Character.toUpperCase(c1);
            char c2 = middleName.charAt(0);
            Character letterMiddleName = Character.toUpperCase(c2);
            char c3 = lastName.charAt(0);
            Character letterLastName = Character.toUpperCase(c3);
            System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + letterFirstName + firstName.substring(1, firstName.length()) + " " + letterMiddleName + middleName.substring(1, middleName.length()) + " " + letterLastName + lastName.substring(1, lastName.length()));
        }
    }

    //Задание №7:
    public static void stringCollect(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.max(str1.length(), str2.length()); i++) {
            if (i == 0) {
                sb.append(chars1[i]);
                sb.append(chars2[i]);
            } else if (i % 2 != 0) {
                sb.append(chars1[i]);
                sb.append(chars2[i]);
            } else if (i % 2 == 0 && i != 0) {
                sb.append(chars1[i]);
                sb.append(chars2[i]);
            }
        }
        System.out.println(sb);
    }

    //Задание №8:
    public static void clearString(String notClearString) {
        char[] chars = notClearString.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                System.out.print(chars[i]);
            }
        }
    }
}
