package com.pb.zelenaja.hm6;

public class Veterinarian {

    public void treatAnimal(Animal animal) {
        System.out.println("Животное ест " + animal.getFood()
                + " содержится в " + animal.getLocation()+ " направлено на осмотр к ветиринару");

    }

    }

