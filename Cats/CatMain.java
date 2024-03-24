// 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
// Поместите в него некоторое количество объектов.
// 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
// Убедитесь, что все они сохранились во множество.
// 3. Создайте метод public boolean equals(Object o)
// Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод
// должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
// 4. Создайте метод public int hashCode()
// который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать
// Objects.hash(...))
// 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.


package Cats;

import java.util.Arrays;
import java.util.HashSet;

public class CatMain {
    public static void main(String[] args) {
        CatsClass cat1 = new CatsClass("Bars", 4, "Grey");
        CatsClass cat2 = new CatsClass("Yaga", 3, "Black");
        CatsClass cat3 = new CatsClass("Tiger", 7, "Red");
        CatsClass cat4 = new CatsClass("Tiger", 7, "Red");
        CatsClass cat5 = new CatsClass("Tiger", 7, "Red");

        HashSet<CatsClass> cats = new HashSet<>(Arrays.asList(cat1,cat2,cat3,cat4,cat5));
        for (CatsClass catsClass : cats) {
            System.out.println(catsClass);
        }

    }
}
