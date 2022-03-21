package com.company;

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
    }
}
