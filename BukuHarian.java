/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp5;

/**
 *
 * @author Lenovo
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BukuHarian {
    private String namaPemilik;
    private String namaFile;

    public BukuHarian(String namaPemilik) {
        this.namaPemilik = namaPemilik;
        this.namaFile = "diary_" + namaPemilik + ".txt";
    }

    public void tulisCatatan(String tanggal, String isi) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(namaFile, true))) {
            bw.write("[" + tanggal + "] - " + isi);
            bw.newLine();
            System.out.println("-> Catatan tanggal " + tanggal + " berhasil disimpan.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis: " + e.getMessage());
        }
    }

    public void bacaCatatan() {
        System.out.println("\n=== Isi Diary: " + namaPemilik + " ===");
        try (BufferedReader br = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            while ((baris = br.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Belum ada catatan harian.");
        }
        System.out.println("===============================\n");
    }
}
