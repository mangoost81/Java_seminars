// Напишите метод, который определит тип (расширение) файлов из
// текущей папки и выведет в консоль результат вида
// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла:
// 4 Расширение файла: jpg

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Path {

    public static void main(String[] args) {
        String[] content = getContentFolder(".");
        System.out.println(Arrays.toString(content));
        System.out.println(content.length);
        pathsOfDir(content);

    }

     public static String[] getContentFolder(String dir) {
        File folder = new File(dir);
        return folder.list();
    }

    public static void pathsOfDir(String[] content) {
        for (int i = 0; i < content.length; i++) {
            int index = content[i].indexOf('.');
            System.out.println(i+1 + " Расширение файла: " + content[i].substring(index+1));
            System.out.println();
        }
    }
}