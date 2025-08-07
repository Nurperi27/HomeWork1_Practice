package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flower obj1 = new Flower();
        System.out.println("Enter the first flowername: ");
        obj1.flowername = new Scanner(System.in).nextLine();
        obj1.freshness = true;
        obj1.price = new Scanner(System.in).nextInt();
        obj1.getInfo();
        Flower obj2 = new Flower();
        System.out.println("Enter the second flowername: ");
        obj2.flowername = new Scanner(System.in).nextLine();
        obj2.freshness = true;
        obj2.price = new Scanner(System.in).nextInt();
        obj2.getInfo();
        Flower[] f = {obj1, obj2};
        System.out.println("Guldun en ky,bat baasy: " + Flower.maxPrice(f));
    }

}
