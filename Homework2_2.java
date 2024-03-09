// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации 
// запишите в лог-файл.

// Напишите свой код в методе sort класса BubbleSort. 
// Метод sort принимает на вход один параметр:

// int[] arr - числовой массив

// После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt' 
// в формате год-месяц-день час:минуты {массив на данной итерации}. 
// Для логирования использовать логгер logger класса BubbleSort.
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Homework2_2 {
    private static Logger logger = Logger.getLogger(Homework2_2.class.getName());
    public static void main(String[] args) {
        setLogger();
        int[] arr = {3, 5, 7, 9, 1, 8};
        System.out.println("Massive = " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted massive = " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] mas) {
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
 
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }logger.info(Arrays.toString(mas));
            
        }
    }
    public static void setLogger() {
        try {
            FileHandler fileHandler = new FileHandler("log.txt", true);
            logger.addHandler(fileHandler);
            SimpleFormatter format = new SimpleFormatter();
            fileHandler.setFormatter(format);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}


