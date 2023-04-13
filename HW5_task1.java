/* Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
что 1 человек может иметь несколько телефонов.
Добавить функции 1) Добавление номера
2) Вывод всего
Пример:
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 1242353
К: Введите 1) Добавление номера
2) Вывод всего
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 547568
К: Введите 1) Добавление номера
2) Вывод всего
Я: 2
Иванов: 1242353, 547568 */

import java.util.*;

public class HW5_task1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        HashMap<String, LinkedHashSet> phoneBook = new HashMap<>();

        while (true){
            System.out.println(
                    "Добавить данные - 1;\n"+
                    "Показать данные - 2;\n" +
                    "Выход - 3");
            Integer choice = sn.nextInt();
            if (choice == 3) break;
            if (choice == 1) addOne(phoneBook);
            if (choice == 2) showAll(phoneBook);
        }
    }


    static HashMap<String, LinkedHashSet> addOne(HashMap<String, LinkedHashSet> pb){
        Scanner sn = new Scanner(System.in);
        System.out.println("Введите фамилию");
        String name = sn.nextLine();
        System.out.println("Введите номер");
        String tel = sn.nextLine();
        if (pb.containsKey(name))
            pb.get(name).add(tel);
        else {
            LinkedHashSet<String> tels = new LinkedHashSet<>();
            pb.put(name, tels);
            pb.get(name).add(tel);
        }
        return pb;
    }


    static void showAll(HashMap<String, LinkedHashSet> pb){
        for(var kv : pb.entrySet()){
            System.out.println(kv.getKey()+" "+kv.getValue().toString());
        }
    }
}