/* Создать структуру для хранения Номеров паспортов и Фамилий сотрудников
 организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов

Вывести данные по сотрудникам с фамилией Иванов.
*/

import java.util.HashMap;

public class Sem5_task1 {
    public static void main(String[] args) {
        HashMap<Integer, String> pasports = new HashMap<>();

        pasports.put(123456, "Иванов");
        pasports.put(321456, "Васильев");
        pasports.put(234561, "Петрова");
        pasports.put(234432, "Иванов");
        pasports.put(654321, "Петрова");
        pasports.put(345678, "Иванов");

        for(var kv : pasports.entrySet()) {
            if(kv.getValue().equals("Иванов")){
                System.out.println(kv.getKey()+ " "+ kv.getValue());
            }
        }
    }
}