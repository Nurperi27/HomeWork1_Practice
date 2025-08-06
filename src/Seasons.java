public class Seasons {
    int a;
    public void getSeasonOption1(){ //вариант 1
        if(a == 1 || a == 2 || a == 3 || a == 4){
            switch (a){
                case 1: System.out.println("Весна");
                break;
                case 2:
                    System.out.println("Лето");
                    break;
                case 3:
                    System.out.println("Осень");
                    break;
                case 4:
                    System.out.println("Зима");
                    break;
            }
        }
        else {
            System.out.println("Error!");
        }
    }
    public void getSeasonOption2(){ //вариант 2
        for(int i=0; i<5; i++){
            switch (i){
                case 1: System.out.println("Весна");
                    break;
                case 2:
                    System.out.println("Лето");
                    break;
                case 3:
                    System.out.println("Осень");
                    break;
                case 4:
                    System.out.println("Зима");
                    break;
            }
        }
    }

}
