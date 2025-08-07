package task5;

public class Flower {
    String flowername;
    boolean freshness;
    int price;
    public void getInfo(){
        System.out.println("Name: " + flowername + "\nFreshness: " + freshness + "\nPrice: " + price);
    }
    public static double maxPrice(Flower[] f){
        double max=0;
        for(Flower m : f){
            max = Math.max(m.price, Math.max(m.price, m.price));
        }
        return max;
    }
}
