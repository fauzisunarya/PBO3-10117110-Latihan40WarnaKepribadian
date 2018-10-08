
/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Ramalan Sifat dan karakter berdasarkan warna yang user sukai Dengan 
 * Menggunakan Konsep OOP
 */
package pbo3.pkg10117110.latihan40warnakepribadian;

import java.util.Scanner;


public class PBO310117110Latihan40WarnaKepribadian {

    public static void main(String[] args) {
        Warna objWarna = new Warna();
        User objUser = new User();
        Scanner scan = new Scanner(System.in);

        objWarna.menampilkanTemplate();
        objWarna.pilihWarnaFavorit();
        objUser.memasukkanNama();

        System.out.println("\n====HASIL TEST KEPRIBADIAN "+ objUser.namaUser.toUpperCase()+"====");
        objWarna.tesKepribadian(objWarna.namaWarna,objUser.namaUser);

    }
    
}
