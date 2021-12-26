package com.pb.zelenaja.hw12;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import jdk.internal.org.objectweb.asm.TypeReference;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.List;
import java.io.Serializable;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

    static class NameComparator implements Comparator<Contacts> {
        public int compare(Contacts a, Contacts b) {
            return a.getName().compareTo(b.getName());
        }
    }

    static class BComparator implements Comparator<Contacts> {

        public int compare(Contacts a, Contacts b) {
            return a.getDateOfBirth().compareTo(b.getDateOfBirth());
        }
    }

    public static Contacts CreateContact() {
        System.out.println("Введите ФИО\n");
        String name = scanner.next();
        System.out.println("Введите год рождения\n");//
        int year = scanner.nextInt();
        System.out.println("Введите месяц рождения\n");
        int month = scanner.nextInt();
        System.out.println("Введите число рождения\n");
        int day = scanner.nextInt();
        ArrayList<String> telList = new ArrayList<>();
        String vvod;
        do {
            System.out.println("Введите телефон\n");
            String tel = scanner.next();
            telList.add(tel);
            System.out.println("Хотите ввести ещё номер телефона? Y/N\n");
            vvod = scanner.next();
        } while ((vvod.equals("Y")) || vvod.equals("y"));
        System.out.println("Введите адресс\n");
        String address = scanner.next();
        Contacts contacts = new Contacts(name, LocalDate.of(year, month, day), telList, address);
        return contacts;
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Contacts> contact = new ArrayList<>();
        String fileName = "D://Java/Contacts.json";
        Path fileTelephoneBook = Paths.get(fileName);
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        module.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
        mapper.registerModule(module);

        System.out.println("Добавление элемента");
        String vibor;
        do {
            Contacts contacts = CreateContact();
            contact.add(contacts);
            System.out.println("Хотите ввести ещё абонента? Y/N\n");
            vibor = scanner.next();
            System.out.println(contact);
        } while ((vibor.equals("Y")) || vibor.equals("y"));

        System.out.println("Удаление элемента\n");
        System.out.println("Введите ФИО абонента");
        String contactForDel = scanner.next();
        for (int i = 0; i < contact.size(); i++) {
            if (contactForDel.equals(contact.get(i).getName())) {
                contact.remove(i);
            }
        }
        System.out.println(contact);

        System.out.println("Поиск абонента");
        System.out.println("Введите ФИО абонента для поиска\n");
        String contactFind = scanner.next();
        contact.stream().filter(x->x.getName().equals(contactFind)).forEach(System.out::println);


        System.out.println("Вывод всех записей с сортировкой\n");
        System.out.println("Выберите поле для сортировки\n" +
                "1 Сортировать по ФИО\n" +
                "2 Сортировать по дате рождения\n");
        String vvod = scanner.next();
        if (vvod.equals("1")) {
            contact.stream()
                    .sorted(Comparator.comparing(Contacts::getName))
                    .forEach(System.out::println);
        } else if (vvod.equals("2")) {
            contact.stream()
                    .sorted(Comparator.comparing(Contacts::getDateOfBirth))
                    .forEach(System.out::println);
        }


        System.out.println("Редактирование элемента\n");
        System.out.println("Введите номер строки для редактирования\n");
        int numberStr = scanner.nextInt();
        System.out.println("Введите новые данные\n");
        numberStr --;
        Contacts contacts1 = CreateContact();
        contact.set(numberStr, contacts1);
        System.out.println(contact);

        System.out.println("Запись данных в файл\n");
        String personsJson = mapper.writeValueAsString(contact);
        System.out.println(personsJson);
        try (BufferedWriter writer = Files.newBufferedWriter(fileTelephoneBook)) {
            writer.write(personsJson);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Выгрузка из файла данных");
        try (BufferedReader reader = Files.newBufferedReader(fileTelephoneBook)) {
            String strFile="",line;
            while((line = reader.readLine()) != null) {
                strFile=strFile+line;
            }
            System.out.println("Содержимое телефонной книги из файла.");
            List<Contacts> cont = mapper.readValue(strFile, new TypeReference<List<Contacts>>() {});
            System.out.println(cont);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
