/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author home
 */
public class PerpustakaanUmum implements Perpustakaan{
    private String[] daftarBuku = {"Buku A", "Buku B", "Buku C"};
    
    @Override
    public  void pinjamBuku(String judulBuku) {
        System.out.println("Meminjam Buku: " + judulBuku);
    }
    
    @Override
    public void kembalikanBuku(String judulBuku) {
        System.out.println("Mengembalikan Buku: " + judulBuku);
    }

    @Override
    public void lihatDaftarBuku() {
        System.out.println("Daftar Buku di Perpustakaan: ");
        for(String buku : daftarBuku) {
            System.out.println("- " + buku);
        }
    }
}
