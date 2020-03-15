/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS1;

/**
 *
 * @author kagion
 */
public class Mahasiswa {
    String nama;
    String kelas;
    int nim;
    public static void main(String[] args) {
        Mahasiswa objek = new Mahasiswa();
        objek.nim = 18090063;
        objek.nama = "Sugiono";
        objek.kelas = "4A";
        System.out.println("Hallo Nama Saya "+objek.nama+" NIM Saya adalah "+objek.nim+" Saya sekarang Kelas "+objek.kelas);
    }
}
