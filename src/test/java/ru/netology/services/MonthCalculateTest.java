package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MonthCalculateTest {

    @Test
    void testMonthCalculateLimitFirst() {
        MonthCalculate service = new MonthCalculate();

        int expenses = 3000; // расходы
        int income = 10000; // приход
        int threshold = 20000; // остаток денег при котором не работаем
        int expected = 3; // ожидаемый отдых

        int actual = service.getCount(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testMonthCalculateLimitSecond() {
        MonthCalculate service = new MonthCalculate();

        int expenses = 60000; // расходы
        int income = 100000; // приход
        int threshold = 150000; // остаток денег при котором не работаем
        int expected = 2; // ожидаемый отдых

        int actual = service.getCount(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

}
