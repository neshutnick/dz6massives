import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        System.out.println("Сумма всех продаж: " + service.totalSales(sales));
        System.out.println("Средняя сумма продаж: " + service.averageSales(sales));
        System.out.println("Месяц с пиком продаж: " + service.maxSales(sales));
        System.out.println("Месяц с минимумом продаж: " + service.minSales(sales));
        System.out.println("Месяцев ниже среднего: " + service.countMonthsBelowAverage(sales));
        System.out.println("Месяцев выше среднего: " + service.countMonthsAboveAverage(sales));
    }
}
