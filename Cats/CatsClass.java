package Cats;
// . Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
// использовать не все придуманные поля и методы. Создайте несколько
// экземпляров этого класса, выведите их в консоль.
// 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
// его кличка, цвет и возраст (или другие параметры на ваше усмотрение).

import java.util.Objects;

public class CatsClass {
    private String name;
    private int age;
    private String color;

    public CatsClass(String name,int age,String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
       
        return "Кличка- " + name + ", Возраст- " + age + ", Цвет- " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) {
            return true;
        }
        if(obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CatsClass cat = (CatsClass) obj;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);


    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(name,age,color);
    }

}
