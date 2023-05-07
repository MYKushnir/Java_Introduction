// В файле содержится строка с данными:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

// Напишите метод, который разберёт её на составные части и, используя
// StringBuilder создаст массив строк такого вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Sem2Task3 {
    public static void main(String[] args) {
        // Читаем данные из файла и записываем их в переменную inData
        StringBuilder inData = new StringBuilder();
        try (BufferedReader buff = new BufferedReader(new FileReader("Sem2Task3.txt"))) {
            String data;
            while ((data = buff.readLine()) != null) {
                inData.append(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // создаем словарь
        Map<String, String> dictionary = new HashMap<>();

        // убираем лишние символы из строки и разбиваем её на подстроки
        String[] clearStrings = inData.toString().replace("{", "").
                replace("[", "").
                replace("]", "").
                replace("\"", "").
                replaceAll("\\s", "").
                split("},");
        
        // наполняем словарь
        for (String data : clearStrings) {
            // разбиваем каждую подстроку по запятым
            String[] person = data.split(",");
            // наполняем словарь
            for (String keyValues : person) {
                String[] keyValue = keyValues.replace("}", "").split(":");
                String key = keyValue[0];
                String value = keyValue[1];
                dictionary.put(key, value);
            }
            System.out.printf("Студент %s получил %s по предмету %s.\n", dictionary.get("фамилия"),
                    dictionary.get("оценка"), dictionary.get("предмет"));
        }
    }
}