public class Unit6 {
    public static void main(String[] args) {

        int banan = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;


        int breakfastInGramm = (banan * 5) + (milk * 2) + (iceCream * 2) + (egg * 4);
        double breakfastKG = (double) breakfastInGramm/1000;

        System.out.printf("Вес в граммах - %d\nВес в килограммах - %.2f\n", breakfastInGramm, breakfastKG);

    }
}


/*
Расчет веса спортзавтрака
Рассчитайте общий вес завтрака спортсмена в граммах и килограммах по рецепту:

Бананы: 5 штук × 80 грамм
Молоко: 200 мл (100 мл = 105 грамм)
Мороженое: 2 брикета × 100 грамм
Яйца: 4 штуки × 70 грамм

Выведите оба значения в консоль.*/
