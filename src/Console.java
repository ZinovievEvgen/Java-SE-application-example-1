import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
//считываем порядок наследования исключений
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> dataInput = new ArrayList<>();
        int sumMax = -1;
        int sum = 0;
        // вводим элементы в лист
        for (int s = 0; s < n; s++) {
            dataInput.add(scan.nextInt());
        }
        // вводим контрольное значение
        int CheckSum = scan.nextInt();
        scan.close();
        // расчет максимальной суммы 2-х различных элементов
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum = dataInput.get(i) + dataInput.get(j);
                if (sumMax < sum && sum %2 !=0) {
                    sumMax = sum;
                }
            }
        }
        if (sumMax == CheckSum) {
            System.out.println("Вычисленное контрольное значение: " + sumMax);
            System.out.println("Контроль пройден!");
        }
        else if (sumMax == -1){
            System.out.println("Контроль не пройден!");
        }

        //System.out.println("контрольное число: " + CheckSum);
        //System.out.println("sum: " + sum);
        //System.out.println("sumMax: " + sumMax);
    }
}