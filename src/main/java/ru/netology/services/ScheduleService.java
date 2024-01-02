package ru.netology.services;

public class ScheduleService {
    public long calculate(long income, long expense, long threshold) {
        long currentMoneyAmount = 0;
        int monthVacation = 0;
        for (long month = 1; month <= 12; month++) {
            if (currentMoneyAmount < threshold) {
                System.out.printf("Месяц %d. Денег %d. Придётся работать. Заработал +%d, потратил -%d%n", month, currentMoneyAmount, income, expense);
                currentMoneyAmount = currentMoneyAmount + income - expense;
            } else {
                long currentMoney = currentMoneyAmount;
                currentMoneyAmount = currentMoneyAmount - expense;
                long vacationMoney = currentMoneyAmount - (currentMoneyAmount / 3);
                currentMoneyAmount = currentMoneyAmount - vacationMoney;
                monthVacation++;

                System.out.printf("Месяц %d. Денег %d. Буду отдыхать. Потратил -%d, затем ещё -%d%n", month, currentMoney, expense, vacationMoney);
            }

        }


        System.out.printf("В этом году удалось отдохнуть %d месяца\n\n", monthVacation);
        return monthVacation;
    }
}
