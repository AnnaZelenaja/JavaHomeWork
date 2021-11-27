package com.pb.zelenaja.hw10;

public class NumBox<T extends Number> {
    private int size, index = 0;
    private final T[] number;

    public NumBox(int size) {
        number = (T[]) new Number[size];
    }

    public void add(T num) throws Exception {
        if (index == (number.length)) {
            throw new Exception("Массив полон!");
        } else {
            this.number[index] = num;
            index++;
        }
    }

    public T get(int index) throws Exception {
        if (this.index < index) {
            throw new Exception("Неверный элемент массива!");
        }
        return number[index];
    }

    public int length() {
        return index;
    }

    public double average() {
        double average = 0;
        for (int i = 0; i < index; i++) {
            average += (number[i].doubleValue());
        }
        average = average / number.length;
        return average;
    }

    public double sum() {
        double sum = 0;
        for (int i = 0; i < index; i++) {
            sum += (number[i].doubleValue());
        }
        return sum;
    }

    public T max() {
        T max = number[0];
        for (int i = 1; i < index; i++) {
            if (number[i] instanceof Integer) {
                if (number[i].intValue() > (Integer) max) {
                    max = number[i];
                }
            }

            else if (number[i] instanceof Float) {
                if (number[i].floatValue() > (Float) max) {
                    max = number[i];
                }
            }
        }
        return max;
    }
}




