package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        MonthCalculate service = new MonthCalculate();

        int expenses = 3000; // расходы
        int income = 10000; // приход
        int threshold = 20000; // остаток денег при котором не работаем
        int count1 = 0;

        count1 = service.getCount(income, expenses, threshold);

        System.out.println("Количество месяцев отдыха: " + count1);
    }
}