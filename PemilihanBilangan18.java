
import java.util.Scanner;
public class PemilihanBilangan18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka,hasil;
      
        Scanner input = new Scanner(System.in);     

        System.out.print("Masukkan sebuah angka: ");
        angka = input.nextInt();
        hasil = angka   % 2;
         
        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " termasuk bilangan genap");
            
        } else {
            System.out.println("Angka " + angka + " bilangan ganjil");

        }



    }
}
