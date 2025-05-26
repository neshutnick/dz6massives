package ru.netology.stats;

public class StatsService {
        //сумма всех продаж
        public long totalSales(long[] sales) {
            long total = 0;
            for (int i = 0; i < sales.length; i++) {
                total += sales[i];
            }
            return total;
        }
        //средняя сумма продаж
        public double averageSales(long[] sales) {
            return (double) totalSales(sales) / sales.length;
        }
        //номер месяца, в котором был пик продаж
        public int maxSales(long[] sales) {
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
        //номер месяца, в котором был минимум продаж
        public int minSales(long[] sales) {
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
        //количество месяцев, в которых продажи были ниже среднего
        public int countMonthsBelowAverage(long[] sales) {
            int count = 0;
            double average = averageSales(sales);

            for (int i=0; i < sales.length; i++ ) {
                if (sales[i] < average) {
                    count++;
                }
            }
            return count;
        }
        //количество месяцев, в которых продажи были выше среднего
        public int countMonthsAboveAverage(long[] sales) {
            int count = 0;
            double average = averageSales(sales);

            for (int i=0; i < sales.length; i++ ) {
                if (sales[i] > average) {
                    count++;
                }
            }
            return count;
        }
    }