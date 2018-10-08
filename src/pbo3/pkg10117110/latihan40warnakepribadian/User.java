/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117110.latihan40warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class User {
    public String namaUser;
    Scanner scan = new Scanner(System.in);

    public void memasukkanNama() {
        System.out.print("NAMA KAMU : ");
        namaUser = scan.next();
    }
    
}
