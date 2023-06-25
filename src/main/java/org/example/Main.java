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

        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(laptop1); laptopList.add(laptop2); laptopList.add(laptop3); laptopList.add(laptop4);
        laptopList.add(laptop5); laptopList.add(laptop6); laptopList.add(laptop7); laptopList.add(laptop8);
        laptopList.add(laptop9);

        for (int i = 0; i < laptopList.size(); i++) {
            System.out.println("Brand: " + laptopList.get(i).getBrand()
                    + "; Model: " + laptopList.get(i).getModel()
                    + "; Color: " + laptopList.get(i).getColor()
                    + "; Diagonal: " + laptopList.get(i).getScreenSize()
                    + " inches; OS: " + laptopList.get(i).getOS()
                    + "; RAM: " + laptopList.get(i).getRAM()
                    + "; HDD: " + laptopList.get(i).getHDD());
        }

        filter(laptopList);


    }

    private static void filter(List<Laptop> laptopList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nFilter:"
                + "\n1.Brand"
                + "\n2.Model"
                + "\n3.Color"
                + "\n4.Diagonal"
                + "\n5.OS"
                + "\n6.RAM"
                + "\n7.HDD"
                + "\n8.Exit");
        int n = scan.nextInt();
        switch (n){
            case 1:
                brandFilter(laptopList);
                break;
            case 2:
                modelFilter(laptopList);
                break;
            case 3:
                colorFilter(laptopList);
                break;
            case 4:
                diagonalFilter(laptopList);
                break;
            case 5:
                osFilter(laptopList);
                break;
            case 6:
                ramFilter(laptopList);
                break;
            case 7:
                hddFilter(laptopList);
                break;
            case 8:
                break;
            default:
                filter(laptopList);
                break;
        }
    }
    private static void showFilteredMap(Map<Integer, String> any) {
        for (String value : any.values()) {
            System.out.println(value);
        }
    }

    private static void hddFilter(List<Laptop> laptopList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите размер жесткого диска: ");
        int n = scan.nextInt();
        Map<Integer, String> filterMap = new HashMap<>();
        for (int i = 0; i < laptopList.size(); i++) {
            if (laptopList.get(i).getHDD() == n){
                filterMap.put(i, laptopList.get(i).toString());
            }
        }
        showFilteredMap(filterMap);
    }

    private static void ramFilter(List<Laptop> laptopList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите размер ОЗУ: ");
        int n = scan.nextInt();
        Map<Integer, String> filterMap = new HashMap<>();
        for (int i = 0; i < laptopList.size(); i++) {
            if (laptopList.get(i).getRAM() == n){
                filterMap.put(i, laptopList.get(i).toString());
            }
        }
        showFilteredMap(filterMap);
    }

    private static void osFilter(List<Laptop> laptopList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите операционную систему: ");
        String n = scan.nextLine().toLowerCase();
        Map<Integer, String> filterMap = new HashMap<>();
        for (int i = 0; i < laptopList.size(); i++) {
            if (laptopList.get(i).getOS().toLowerCase().contains(n)){
                filterMap.put(i, laptopList.get(i).toString());
            }
        }
        showFilteredMap(filterMap);
    }

    private static void diagonalFilter(List<Laptop> laptopList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите диагональ экрана: ");
        double n = scan.nextDouble();
        Map<Integer, String> filterMap = new HashMap<>();
        for (int i = 0; i < laptopList.size(); i++) {
            if (laptopList.get(i).getScreenSize() == n){
                filterMap.put(i, laptopList.get(i).toString());
            }
        }
        showFilteredMap(filterMap);
    }

    private static void colorFilter(List<Laptop> laptopList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите цвет: ");
        String n = scan.nextLine().toLowerCase();
        Map<Integer, String> filterMap = new HashMap<>();
        for (int i = 0; i < laptopList.size(); i++) {
            if (laptopList.get(i).getColor().toLowerCase().contains(n)){
                filterMap.put(i, laptopList.get(i).toString());
            }
        }
        showFilteredMap(filterMap);
    }

    private static void modelFilter(List<Laptop> laptopList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите модель: ");
        String n = scan.nextLine().toLowerCase();
        Map<Integer, String> filterMap = new HashMap<>();
        for (int i = 0; i < laptopList.size(); i++) {
            if (laptopList.get(i).getModel().toLowerCase().contains(n)){
                filterMap.put(i, laptopList.get(i).toString());
            }
        }
        showFilteredMap(filterMap);
    }

    private static void brandFilter(List<Laptop> laptopList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите бренд: ");
        String n = scan.nextLine();
        n = n.toLowerCase();
        Map<Integer, String> filterMap = new HashMap<>();
        for (int i = 0; i < laptopList.size(); i++) {
            if (laptopList.get(i).getBrand().toLowerCase().contains(n)){
                filterMap.put(i, laptopList.get(i).toString());
            }
        }
        showFilteredMap(filterMap);
    }
}
