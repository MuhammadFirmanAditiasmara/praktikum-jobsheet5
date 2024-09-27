
import java.util.Scanner;
public class PemilihanBilangan18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka,hasil;
      
          

        System.out.print("Masukkan sebuah angka: ");
        angka = sc.nextInt();
        hasil = angka   % 2;
         
        
        String hasilnya = hasil == 0 ? "genap" : "ganjil";

        System.out.println("Angka " + angka + " adalah bilangan " + hasilnya);
        



    }
}
