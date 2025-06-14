import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kalkulator BMI");
        System.out.println("Podaj swoją wagę (kg):");
        int weight =scanner.nextInt();
        System.out.println("Podaj swoją wzrost (m):");
        double height =scanner.nextDouble();
        double bmi =  (weight / height)/height;
        System.out.println("Twoje bmi to "+bmi);
        if (bmi<18.4){
            System.out.println("jest to niedowaga");
        }else if (bmi>18.4 && bmi <25){
            System.out.println("jest to prawidłowa masa ciała");
        } else if (bmi>25) {
            System.out.println("jest to nadwaga");
        }

    }
}
