// 📌 Напишите метод, который вернет содержимое текущей папки в виде
// массива строк.
// 📌 Напишите метод, который запишет массив, возвращенный предыдущим
// методом в файл.
// 📌 Обработайте ошибки с помощью try-catch конструкции. В случае
// возникновения исключения, оно должно записаться в лог-файл.

import java.io.File;
import java.io.FileWriter;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Filework {
    private static Logger logger = Logger.getLogger(Filework.class.getName());

    public static void main(String[] args) {
        setLogger();
        String[] content = getContentFolder(".ds");
        writeToFile(content, "Collect.txt");
    }

    public static String[] getContentFolder(String dir) {
        File folder = new File(dir);
        return folder.list();
    }

    public static void writeToFile(String[] contents, String filename) {

        try (FileWriter fw = new FileWriter(filename)) {
            for (String string : contents) {
                fw.write(string);
                fw.write(System.lineSeparator());
            }

        } catch (Exception e) {
            // TODO: handle exception
            // System.out.println("Error write file! ");
            logger.warning("Error write file! ");
        }

    }

    public static void setLogger() {
        try {
            FileHandler fileHandler = new FileHandler("Log.txt",true);
            logger.addHandler(fileHandler);
            SimpleFormatter format = new SimpleFormatter();
            fileHandler.setFormatter(format);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();

        }
    }

}
