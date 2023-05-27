package Laptop;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
// Создание объектов класса Laptop
        Laptop hp_pailion_g6 = new Laptop("HP_pailion_g6", 16, "4K", 
        true, 500, "16", "Windows", "black"); 
        Brand brandHp = new Brand("HP", "USA", "American");
        hp_pailion_g6.addBrand(brandHp); 
        Laptop hp_galaxy_x64 = new Laptop("HP_galaxy_x64", 14, "FullHD", 
        true, 500, "8", "Windows", "white");
        hp_galaxy_x64.addBrand(brandHp);
        Laptop samsung_a52 = new Laptop("Samsung_a52", 18, "FullHD", 
        true, 300, "8", "Windows", "black");
        Brand brandSamsung = new Brand("Samsung", "Korea", "Korea");
        samsung_a52.addBrand(brandSamsung);
        Laptop samsung_m31s = new Laptop("Samsung_m31s", 16, "4K", 
        false, 1000, "16", "Linux", "black");
        samsung_m31s.addBrand(brandSamsung);
        Laptop lenovo_gtx76 = new Laptop("Lenovo_gtx76", 16, "FullHD", 
        true, 700, "8", "Windows", "white");
        Brand brandLenovo = new Brand("Lenovo", "China", "China");
        lenovo_gtx76.addBrand(brandLenovo);
        Laptop macbook_14pro = new Laptop("Macbook_14pro", 17, "4K", 
        false, 1000, "8", "macOS", "white");
        Brand brandMacbook = new Brand("Apple", "USA", "American");
        macbook_14pro.addBrand(brandMacbook);
        Laptop asus_x515 = new Laptop("Asus_x515", 17, "FullHD", 
        true, 300, "4", "Windows", "black");
        Brand brandAsus = new Brand("Asus", "Taiwan", "China");
        asus_x515.addBrand(brandAsus);
        Laptop acer_air5 = new Laptop("Acer_air5", 19, "FullHD", 
        true, 600, "8", "Windows", "black");
        Brand brandAcer = new Brand("Acer", "Taiwan", "China");
        acer_air5.addBrand(brandAcer);
        Laptop acer_air6 = new Laptop("Acer_air6" ,18, "4K", 
        false, 500, "16", "Windows", "black");
        acer_air6.addBrand(brandAcer);
        Laptop acer_a313 = new Laptop("Acer_a313", 16, "FullHD", 
        true, 500, "8", "Windows", "black");
        acer_a313.addBrand(brandAcer);
// Создание множества
        Set <Laptop> laptop = new HashSet<>();
        laptop.add(hp_pailion_g6);      
        laptop.add(hp_galaxy_x64);
        laptop.add(samsung_a52);
        laptop.add(samsung_m31s);
        laptop.add(lenovo_gtx76);
        laptop.add(macbook_14pro);
        laptop.add(asus_x515);
        laptop.add(acer_air5);
        laptop.add(acer_air6);
        laptop.add(acer_a313);
// создание нового объекта вызова методов
        Laptop FilterLaptop = new Laptop();

 // вызод метода фильтрации по заданным пользователем критериям
        System.out.println(FilterLaptop.newFilter(laptop));
    }
}
