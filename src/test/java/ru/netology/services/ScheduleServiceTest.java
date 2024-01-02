package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScheduleServiceTest {
/*
        ScheduleService testScheduleCalculate = new ScheduleService();

        long threshold150000 = testScheduleCalculate.calculate(100_000, 60_000, 150_000);
        long threshold20000 = testScheduleCalculate.calculate(10_000, 3_000, 20_000);
        */
    @Test
    void calculationOfVacationMonthsWithMoneyThresholdOf20000() {
        ScheduleService service = new ScheduleService();

        //подготовленные данные:
        long income = 10_000;
        long expense = 3_000;
        long threshold = 20_000;
        int expected = 3;

        //вызываем метод:
        long actual = service.calculate(income, expense, threshold);

        //сравниваем ожидаемый и фактический результат:
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculationOfVacationMonthsWithMoneyThresholdOf150000() {
        ScheduleService service = new ScheduleService();

        //подготовленные данные:
        long income = 100_000;
        long expense = 60_000;
        long threshold = 150_000;
        int expected = 2;

        //вызываем метод:
        long actual = service.calculate(income, expense, threshold);

        //сравниваем ожидаемый и фактический результат:
        Assertions.assertEquals(expected, actual);
    }

}
