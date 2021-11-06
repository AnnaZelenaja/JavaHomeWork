package com.pb.zelenaja.hm6;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class VetClinic {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        Animal animal1 = new Cat("Барс", 2, "корм", "дом");
        Animal animal2 = new Cat("Мурзик", 2, "корм", "дом");
        Animal animal3 = new Dog("Арчи", 8, "мясо", "вольер");
        Animal animal4 = new Dog("Буч", 2, "корм", "будка");
        Animal animal5 = new Horse("Веста", 4, "овес","конюшня");
        Animal animal6 = new Horse("Барон", 10, "сено","конюшня");
        Animal animal7 = new Horse("Барон", 10, "сено","конюшня");

        animal1.eat();
        animal4.sleep();

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println(animal4);
        System.out.println(animal5);
        System.out.println(animal6);

        System.out.println();

        System.out.println("equals 1 2: " + animal1.equals(animal2));
        System.out.println("equals 6 7: " + animal6.equals(animal7));
        System.out.println();

        System.out.println("hashCode 1: " + animal1.hashCode());
        System.out.println("hashCode 2: " + animal2.hashCode());
        System.out.println("hashCode 3: " + animal3.hashCode());
        System.out.println("hashCode 4: " + animal4.hashCode());
        System.out.println("hashCode 5: " + animal5.hashCode());
        System.out.println("hashCode 6: " + animal6.hashCode());
        System.out.println();

        Veterinarian vets = new Veterinarian();
        Class clazz = vets.getClass();
        Class vetsClazz = Class.forName("com.pb.zelenaja.hm6.Veterinarian");
        Constructor constr = vetsClazz.getConstructor();
        Object obj = constr.newInstance();
        Animal[] animals = new Animal[] {animal1, animal2, animal3, animal4, animal5, animal6};
        String[] output = new String[animals.length];
        if (obj instanceof Veterinarian) {
            for (int i = 0; i < animals.length; i++) {
                ((Veterinarian) obj).treatAnimal(animals[i]);
            }

        }

    }

}
