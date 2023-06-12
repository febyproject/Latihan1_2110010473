
package Hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        // membuat objek
        Matematika feby = new Matematika(7,3);
        
        System.out.println("Hasil Penjumlahan : "+feby.setPenjumlahan());
        System.out.println("Hasil Pengurangan : "+feby.setPengurangan());
        System.out.println("Hasil Perkalian : "+feby.setPerkalian());
        System.out.println("Hasil Pembagian : "+feby.setPembagian());
    }
    
}
