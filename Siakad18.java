
import java.util.Scanner;
public class Siakad18 {
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
     //Deklarasi
     
    String nama, nim ;
    char kelas;
    byte absen;
    int nilaiKuis, nilaiTugas, nilaiUjian; 
    double nilaiAkhir;

    System.out.print("Masukkan nama: ");
    nama = sc.nextLine();
    System.out.print("Masukkan NIM: ");
    nim = sc.nextLine();
    System.out.print("Masukkan kelas: ");
    kelas = sc.nextLine().charAt(0);
    System.out.print("Masukkan nomor absen: ");
    absen = sc.nextByte();

    System.out.print("Masukkan nilai kuis: ");
    nilaiKuis = sc.nextInt();
    System.out.print("Masukkan nilai tugas: ");
    nilaiTugas = sc.nextInt();
    System.out.print("Masukkan nilai ujian: ");
    nilaiUjian = sc.nextInt();
    
    //menghitung nilai akhir
    nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
    String huruf="huruf", Kategori="Kategori";
    if (nilaiAkhir>80 && nilaiAkhir<=100) {
        huruf = "A";
        Kategori = "Sangat Baik";
    }
     else if (nilaiAkhir>73 && nilaiAkhir<=80) {
        huruf = "B+";
        Kategori = "Lebih dari Baik";
    } 
    else if (nilaiAkhir>65 && nilaiAkhir<=73) {
        huruf = "B";
        Kategori = "Baik";
    }
     else if (nilaiAkhir>60 && nilaiAkhir<=65) {
        huruf = "C+";
        Kategori = "Lebih dari Cukup";
    } 
    else if (nilaiAkhir>50 && nilaiAkhir<=60) {
        huruf = "C";
        Kategori = "Cukup";
    }
     else if (nilaiAkhir>39 && nilaiAkhir<=50) {
        huruf = "D";
        Kategori = "Kurang";  
     }
     else if (nilaiAkhir<=39) {
        huruf = "E";
        Kategori = "Gagal";
     } else 
     System.out.println("Nilai yang anda masukkan salah");    
        
        
    System.out.println("Mahasiswa dengan nama" +  nama   + " (NIM " + nim + ")" + " kelas " + kelas + " nomor absen " + absen);
    System.out.println("Nilai akhir: " + nilaiAkhir );
    System.out.println("Nilai akhir huruf: " + huruf);
    System.out.println("Kategori: " + Kategori);


        sc.close();
    }
}



