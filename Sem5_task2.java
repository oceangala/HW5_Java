/*Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом

1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
(Например, add - egg изоморфны)
2. буква может не меняться, а остаться такой же. (Например, note - code)

Пример 1:

Input: s = "foo", t = "bar"
f: b
o: a
Output: false

Пример 2:

Input: s = "paper", t = "title"
p: t
a: i
e: l
r: e*/

import java.util.HashMap;
import java.util.Scanner;

public class Sem5_task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input first string: ");
        String string01 = scan.next();
        System.out.println("Input second string: ");
        String string02 = scan.next();
        scan.close();
        boolean isIsomorph = true;
        HashMap <Character, Character> dict = new HashMap<>();
        if(string01.length() != string02.length()){
            isIsomorph = false;
        }
        else{
            for (int i = 0; i < string01.length(); i++) {
                if (dict.containsKey(string01.charAt(i))){
                    if (! dict.get(string01.charAt(i)).equals(string02.charAt(i))){
                        isIsomorph = false;
                        break;
                    }
                }
                else {
                    if (dict.containsValue(string02.charAt(i))) {
                        isIsomorph = false;
                        break;}
                }
            }
        }
        System.out.println(isIsomorph);
    }
}