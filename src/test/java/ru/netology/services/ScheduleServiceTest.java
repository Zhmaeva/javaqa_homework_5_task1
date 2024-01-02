package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ScheduleServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/threshold.csv")

    public void calculationOfVacationMonthsWithMoneyThreshold(long income, long expense, long threshold, int expected) {
        ScheduleService service = new ScheduleService();

        long actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }

    /*
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
    */
}
