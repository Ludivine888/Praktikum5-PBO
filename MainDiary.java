/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp5;

/**
 *
 * @author Lenovo
 */
public class MainDiary {
    public static void main(String[] args) {
        BukuHarian diaryIbrey = new BukuHarian("Ibrey");
        
       diaryIbrey.tulisCatatan("12-09-2026", "Hari ini selesai ngerjain tugas PBO Modul 5.");
       diaryIbrey.tulisCatatan("13-09-2026", "Lanjut belajar buat persiapan UTS besok");

        diaryIbrey.bacaCatatan();
    }
}
