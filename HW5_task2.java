/*
Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов

Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности Имени.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HW5_task2 {
    public static void main(String[] args) {
        HashMap<String, Integer> popular = new HashMap<>();

        ArrayList<String[]> list = new ArrayList<>(18);
        list.add(0, new String[]{"Иван", "Иванов"});
        list.add(1, new String[]{"Светлана", "Петрова"});
        list.add(2, new String[]{"Кристина", "Белова"});
        list.add(3, new String[]{"Анна", "Мусина"});
        list.add(4, new String[]{"Анна", "Крутова"});
        list.add(5, new String[]{"Иван", "Юрин"});
        list.add(6, new String[]{"Петр", "Лыков"});
        list.add(7, new String[]{"Павел", "Чернов"});
        list.add(8, new String[]{"Петр", "Чернышов"});
        list.add(9, new String[]{"Мария", "Федорова"});
        list.add(10, new String[]{"Марина", "Светлова"});
        list.add(11, new String[]{"Мария", "Савина"});
        list.add(12, new String[]{"Мария", "Рыкова"});
        list.add(13, new String[]{"Марина", "Лугова"});
        list.add(14, new String[]{"Анна", "Владимирова"});
        list.add(15, new String[]{"Иван", "Мечников"});
        list.add(16, new String[]{"Петр", "Петин"});
        list.add(17, new String[]{"Иван", "Ежов"});

        for (int i = 0; i < list.size()-1; i++) {
            int count = 1;
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i)[0].equals(list.get(j)[0])) count++;
            }
            popular.putIfAbsent(list.get(i)[0], count);
        }

       // System.out.println(popular.entrySet());

        popular.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}