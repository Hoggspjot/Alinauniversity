public class Unit7 {
    public static void main(String[] args) {
        int lostPerDay1 = 200;
        int lostPerDay2 = 500;
        int average = (lostPerDay1 + lostPerDay2) / 2;
        int days1 = 7000/lostPerDay1;
        int days2 = 7000/lostPerDay2;
        int averageDays = (days1+days2)/2;
        System.out.printf("Для похудения на 7 кг требуется %d дней, при похудении %d грамм в день\n", days1, lostPerDay1);
        System.out.printf("Для похудения на 7 кг требуется %d дней, при похудении %d грамм в день\n", days2, lostPerDay2);
        System.out.printf("Для похудения на 7 кг требуется %d дней, при похудении в среднем на %d грамм в день\n", 7000/average, average);
        System.out.printf("В среднем требуется %d дней",averageDays);
    }
}

/*

Задача 7: Расчет времени похудения
Спортсмену нужно сбросить 7 кг. Рассчитайте:

Сколько дней потребуется при потере 250 грамм в день
Сколько дней потребуется при потере 500 грамм в день
Среднее количество дней для похудения
Выведите все три результата в консоль.
*/
