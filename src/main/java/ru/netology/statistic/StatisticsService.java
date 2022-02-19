package ru.netology.statistic;

public class StatisticsService {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public long findMax(long[] incomes) {
        long currentMax = incomes[0];
        for (long income : incomes)
            if (currentMax <= income)
                currentMax = income;
        return currentMax;
    }

    public long findMin(long[] incomes) {
        long currentMin = incomes[0];
        for (long income : incomes)
            if (currentMin > income)
                currentMin = income;
        return currentMin;
    }

    public long findMaxIndex(long[] incomes) {
        long currentMaxIndex = 0;
        long currentMax = 0;
        for (long income : incomes) {
            if (income >= incomes[(int) currentMaxIndex]) {
                currentMaxIndex = currentMax;
            }
            currentMax = currentMax + 1;
        }
        return currentMaxIndex;
    }

    public long findMinIndex(long[] incomes) {
        long currentMinIndex = 0;
        long currentMax = 0;
        for (long income : incomes) {
            if (income <= incomes[(int) currentMinIndex]) {
                currentMinIndex = currentMax;
            }
            currentMax = currentMax + 1;
        }
        return currentMinIndex;
    }

    public long incomeSum(long[] incomes) {
        long sum = 0;
        for (long income : incomes) {
            sum += income;
        }
        return sum;
    }

    public long averageIncome(long[] incomes) {
        return incomeSum(incomes) / incomes.length;
    }

    public long minIncome(long[] incomes) {
        long minMonth = 0;
        long month = 0;
        for (long income : incomes) {
            if (income <= incomes[(int) minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long maxIncome(long[] incomes) {
        long maxMonth = 0;
        long month = 0;
        for (long income : incomes) {
            if (income >= incomes[(int) maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long belowAverageIncome(long[] incomes) {
        long numberMonthWithIncomeBelowAverage = 0;
        for (long income : incomes) {
            if (income < averageIncome(incomes)) {
                numberMonthWithIncomeBelowAverage++;
            }
        }
        return numberMonthWithIncomeBelowAverage;
    }

    public long aboveAverageIncome(long[] incomes) {
        long numberMonthWithIncomeAboveAverage = 0;
        for (long income : incomes) {
            if (income > averageIncome(incomes)) {
                numberMonthWithIncomeAboveAverage++;
            }
        }
        return numberMonthWithIncomeAboveAverage;
    }
}
