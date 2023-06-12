
package Hitung;

public class Matematika {
    //membuat variabel
    private double bil1, bil2;
    
    //membuat construktor
    public Matematika(double bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    //methode Penjumlahan
    double setPenjumlahan(){
       return bil1 + bil2;
    }
    //method pengurangan
    double setPengurangan(){
       return bil1 - bil2;
    }
    
    //method perkalian
    double setPerkalian(){
       return bil1 * bil2;
    }
    
    //method pembagian
    double setPembagian(){
       return bil1 / bil2;
    }
}
