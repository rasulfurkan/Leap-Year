import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year;


        System.out.println("Yılı giriniz = ");
        year = inp.nextInt();


        if (!(year%400 == 0)) {

            if (!(year%100 == 0)) {

                if (!(year%4 == 0)) {
                    System.out.println("Artık yıldır....");


                }
                else
                System.out.println("Artık yıl değildir....");

            }
            else
            System.out.println("Artık yıl değildir....");
            
        }
        else
        System.out.println("Artık yıldır.....");
    }
}