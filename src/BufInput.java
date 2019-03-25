import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BufInput {
    public static void main(String[] args) throws IOException {
        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader = new BufferedReader(new FileReader("D:\\task\\NA_Task2.1\\input\\input1.txt"));
        ArrayList<Integer> dataInput = new ArrayList<>();
        int sumMax = -1;
        int sum = 0;
        int n = Integer.parseInt(reader.readLine());
        // вводим элементы в лист
        for (int s = 0; s < n; s++) {
            dataInput.add(Integer.parseInt(reader.readLine()));
        }
        // вводим контрольное значение
        int CheckSum = Integer.parseInt(reader.readLine());
        reader.close();
        // расчет максимальной суммы 2-х различных элементов
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum = dataInput.get(i) + dataInput.get(j);
                if (sumMax < sum && sum % 2 != 0) {
                    sumMax = sum;
                }
            }
        }
        // проверка соответствия условиям задачи
        if (sumMax == CheckSum) {
            System.out.println("Вычисленное контрольное значение: " + sumMax);
            System.out.println("Контроль пройден!");
        } else if (sumMax == -1) {
            System.out.println("Контроль не пройден!");
        }

        /*System.out.println("контрольное число: " + CheckSum);
        System.out.println("sum: " + sum);
        System.out.println("sumMax: " + sumMax);*/
    }
}