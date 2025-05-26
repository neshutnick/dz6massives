package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalculateTotalSales() {
        long expected = 180;
        long actual = service.totalSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSales() {
        double expected = 180 / 12;
        double actual = service.averageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxSalesMonth() {
        int expected = 8; // Последний месяц с максимальными продажами (20)
        int actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinSalesMonth() {
        int expected = 9; // Месяц с минимальными продажами (7)
        int actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthsBelowAverage() {
        int expected = 5; // Месяцев ниже среднего (15.166...)
        int actual = service.countMonthsBelowAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthsAboveAverage() {
        int expected = 5; // Месяцев выше среднего
        int actual = service.countMonthsAboveAverage(sales);
        assertEquals(expected, actual);
    }
}