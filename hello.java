import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
//         String nama = "keyza";
//         int usia = 15;
//         double beratbadan=41.00;
//         float beratbadan1=41.0f;
//         char jeniskelamin='p';
//         boolean status = false;
        
//         System.out.println("selamat datang,"+nama);
//         System.out.println("usia:"+usia);
//         System.out.println("jenis kelamin:"+jeniskelamin);

Scanner input = new Scanner(System.in);
System.out.println();
System.out.println("masukkan nama");
String nama = input.nextLine();
System.out.println("masukkan usia");
int usia = input.nextInt();
System.out.println("masukkan berat bedan");
double beratbadan = input.nextDouble();

System.out.println("selamat datang "+nama);
System.out.println("usia "+usia);


}
    }

   