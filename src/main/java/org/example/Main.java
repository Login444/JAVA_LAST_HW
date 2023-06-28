package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Acer", "Nitro", "White", 15.0,
                "Windows", 8, 512);
        Laptop laptop2 = new Laptop("HP", "Alpha", "Black", 18.0,
                "Windows", 6, 256);
        Laptop laptop3 = new Laptop("Xiaomi", "Beta", "Silver", 13.5,
                "Windows", 12, 600);
        Laptop laptop4 = new Laptop("Apple", "MacAir", "Silver", 14.0,
                "MacOS", 6, 512);
        Laptop laptop5 = new Laptop("HP", "Gamma", "Gold", 17.5,
                "Windows", 32, 1024);
        Laptop laptop6 = new Laptop("Acer", "Epsilon", "White", 13.0,
                "Linux", 4, 150);
        Laptop laptop7 = new Laptop("Apple", "MacPro", "Red", 18.5,
                "MacOS", 12, 778);
        Laptop laptop8 = new Laptop("Huawei", "Ro", "Yellow", 14.5,
                "Windows", 4, 256);
        Laptop laptop9 = new Laptop("Sony", "Pony", "Green", 22.0,
                "Windows", 8, 128);

        HashSet<Laptop> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3,
                laptop4, laptop5, laptop6, laptop7, laptop8, laptop9));
        HashSet<Laptop> result = new HashSet<>();
        HashMap<String, Object> filter = new HashMap<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите критерий фильтрации:" +
                "\n1.Бренд" +
                "\n2.Модель" +
                "\n3.Цвет" +
                "\n4.Диагональ экрана" +
                "\n5.Операционная система" +
                "\n6.ОЗУ" +
                "\n7.Жесткий диск" +
                "\n8.Выход");
        int n = scan.nextInt();

        while (n != 8){
            if (n == 1){
                System.out.println("Введите название бренда: ");
                String tmp = scan.next().toLowerCase();
                filter.put("Brand", tmp);
            }

            if (n==2){
                System.out.println("Введите название модели: ");
                String tmp = scan.next().toLowerCase();
                filter.put("Model", tmp);
            }

            if (n==3){
                System.out.println("Введите цвет: ");
                String tmp = scan.next().toLowerCase();
                filter.put("Color", tmp);
            }

            if (n==4){
                System.out.println("Введите минимальную диагональ: ");
                double tmp = scan.nextDouble();
                filter.put("screenSize", tmp);
            }

            if (n==5){
                System.out.println("Введите тип операционной системы: ");
                String tmp = scan.next().toLowerCase();
                filter.put("OS", tmp);
            }

            if (n==6){
                System.out.println("Введите минимальный размер ОЗУ: ");
                int tmp = scan.nextInt();
                filter.put("RAM", tmp);
            }

            if (n==7){
                System.out.println("Введите минимальный размер жесткого диска: ");
                int tmp = scan.nextInt();
                filter.put("HDD", tmp);
            }

            System.out.println("Укажите критерий фильтрации:" +
                    "\n1.Бренд" +
                    "\n2.Модель" +
                    "\n3.Цвет" +
                    "\n4.Диагональ экрана" +
                    "\n5.Операционная система" +
                    "\n6.ОЗУ" +
                    "\n7.Жесткий диск" +
                    "\n8.Выход");
            n = scan.nextInt();
        }

        for (Map.Entry<String,Object> entry : filter.entrySet()) {
                if (entry.getKey().equals("Brand")) {
                    Iterator<Laptop> search = laptops.iterator();
                    while (search.hasNext()) {
                        Laptop laptop = search.next();
                        if (laptop.getBrand().toLowerCase().equals(entry.getValue())) {
                            result.add(laptop);
                        }
                    }
                }

                if (entry.getKey().equals("Model")) {
                    Iterator<Laptop> search = laptops.iterator();
                    while (search.hasNext()) {
                        Laptop laptop = search.next();
                        if (laptop.getModel().toLowerCase().equals(entry.getValue())) {
                            result.add(laptop);
                        }
                    }
                }

                if (entry.getKey().equals("Color")) {
                    Iterator<Laptop> search = laptops.iterator();
                    while (search.hasNext()) {
                        Laptop laptop = search.next();
                        if (laptop.getColor().toLowerCase().equals(entry.getValue())) {
                            result.add(laptop);
                        }
                    }
                }

                if (entry.getKey().equals("screenSize")) {
                    Iterator<Laptop> search = laptops.iterator();
                    while (search.hasNext()) {
                        Laptop laptop = search.next();
                        if (laptop.getScreenSize() > (Double) entry.getValue()) {
                            result.add(laptop);
                        }
                    }
                }

                if (entry.getKey().equals("OS")) {
                    Iterator<Laptop> search = laptops.iterator();
                    while (search.hasNext()) {
                        Laptop laptop = search.next();
                        if (laptop.getOS().toLowerCase().equals(entry.getValue())) {
                            result.add(laptop);
                        }
                    }
                }

                if (entry.getKey().equals("RAM")) {
                    Iterator<Laptop> search = laptops.iterator();
                    while (search.hasNext()) {
                        Laptop laptop = search.next();
                        if (laptop.getRAM() > (Integer) entry.getValue()) {
                            result.add(laptop);
                        }
                    }
                }

                if (entry.getKey().equals("HDD")) {
                    Iterator<Laptop> search = laptops.iterator();
                    while (search.hasNext()) {
                        Laptop laptop = search.next();
                        if (laptop.getHDD() > (Integer) entry.getValue()) {
                            result.add(laptop);
                        }
                    }
                }

            Iterator search = result.iterator();
            while (search.hasNext()) {
                Laptop laptop = (Laptop) search.next();
                System.out.println("\n" + laptop.toString());
            }
        }


    }
}
