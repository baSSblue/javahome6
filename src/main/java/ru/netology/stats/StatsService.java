package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        long totalSale = sum(sales);
        long averageSale = totalSale / 12;
        return averageSale;
    }

    public int monthMax(long[] sales) {
        int monthMaxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSale]) {
                monthMaxSale = i;
            }
        }
        return monthMaxSale + 1;
    }

    public int monthMin(long[] sales) {
        int minMonthSale = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonthSale]) {
                minMonthSale = i;
            }
        }

        return minMonthSale + 1;
    }
    public int monthBellowAverage(long[] sales) {
        int count = 0;
        long avarageSale = average(sales);
        for (long sale : sales) {
            if (sale < avarageSale) {
                count++;
            }
        }
        return count;
    }

    public int monthUpperAverage(long[] sales) {
        int count = 0;
        long avarageSale = average(sales);
        for (long sale : sales) {
            if (sale > avarageSale) {
                count++;
            }
        }
        return count;
    }
}
