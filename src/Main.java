import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Seasons obj = new Seasons();
        System.out.println("Enter the number: ");
        obj.a = new Scanner(System.in).nextInt();
        System.out.print("Вариант 1: ");
        obj.getSeasonOption1();
        System.out.println("\nВариант 2: ");
        obj.getSeasonOption2();
    }
}