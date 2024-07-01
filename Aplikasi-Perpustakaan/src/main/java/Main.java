/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author home
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Perpustakaan Umum :");
        Perpustakaan perpustakaan = new PerpustakaanUmum();
        perpustakaan.pinjamBuku("Buku A");
        perpustakaan.kembalikanBuku("Buku B");
        perpustakaan.lihatDaftarBuku();
        
        System.out.println("");
        
        System.out.println("Perpustakaan Digital :");
        Perpustakaan perpustakaan1 = new PerpustakaanDigital();
        perpustakaan1.pinjamBuku("Buku B");
        perpustakaan.kembalikanBuku("Buku A");
        perpustakaan1.lihatDaftarBuku();
    }
}
