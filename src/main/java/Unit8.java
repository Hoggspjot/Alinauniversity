import java.util.HashMap;
import java.util.Map;

public class Unit8 {
    public static void main(String[] args) {

        HashMap<String, Double> salary = new HashMap<>();
        salary.put("Маша",67760.00);
        salary.put("Дэн",83690.00);
        salary.put("Крис",76230.00);

        for (Map.Entry<String, Double> entry : salary.entrySet()) {
            System.out.printf("%s теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей\n",
                    entry.getKey(),
                    (entry.getValue() * 1.10f),
                    (((entry.getValue()*1.10f)*12) - (entry.getValue()*12))
                    );

        }



    }
}

/*
Задача 8: Расчет повышения зарплаты
Для трех сотрудников:

Маша: 67 760 рублей
Денис: 83 690 рублей
Кристина: 76 230 рублей

Рассчитайте:
Новую зарплату после повышения на 10%
Разницу в годовом доходе до и после повышения

Вывод для каждого сотрудника в формате:
        "[Имя] теперь получает [сумма] рублей. Годовой доход вырос на [разница] рублей"*/
