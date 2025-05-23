package ru.netology.stats;

public class StatsService {

        public long TotalSales(long[] sales) {
            long total = 0;
            for (int i = 0; i < sales.length; i++) {
                total += sales[i];
            }
            return total;
        }

        public double AverageSales(long[] sales) {
            return (double) TotalSales(sales) / sales.length;
        }

        public int MaxSales(long[] sales) {
            int maxMonth = 0;
            long maxValue = sales[0];

            for (int i = 1; i < sales.length; i++) {
                if (sales[i] >= maxValue) {
                    maxValue = sales[i];
                    maxMonth = i;
                }
            }
            return maxMonth + 1;
        }

        public int MinSales(long[] sales) {
            int minMonth = 0;
            long minValue = sales[0];

            for (int i = 1; i < sales.length; i++) {
                if (sales[i] <= minValue) {
                    minValue = sales[i];
                    minMonth = i;
                }
            }
            return minMonth + 1;
        }

        public int countMonthsBelowAverage(long[] sales) {
            int count = 0;
            double average = AverageSales(sales);

            for (int i=0; i < sales.length; i++ ) {
                if (sales[i] < average) {
                    count++;
                }
            }
            return count;
        }

        public int countMonthsAboveAverage(long[] sales) {
            int count = 0;
            double average = AverageSales(sales);

            for (int i=0; i < sales.length; i++ ) {
                if (sales[i] > average) {
                    count++;
                }
            }
            return count;
        }
    }