import java.util.Scanner;

public class BMI{
    public static void main(String[]args){
        double BMI, beratbadan, tinggibadan;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Berat Badan(kg)");
        beratbadan = input.nextDouble();
        System.out.println("Masukkan tinggi badan (m)");
        tinggibadan= input.nextDouble();

        BMI = beratbadan/(tinggibadan);

        System.out.println("BMI dengan berat "+beratbadan +" dan tinggi "+" tinggiBadan "+" adalah "+BMI);
    

    }
}