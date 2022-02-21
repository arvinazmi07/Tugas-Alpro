/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProblemSet03;

/**
 *
 * @author arvin azmi sava
 */
import javax.swing.JOptionPane;
public class ProblemSet03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        String nama, input, alamat, hobi;
        int umur, tahunLahir, intensitasOlahraga,makan,lingkarPinggang, lingkarPinggul;
        double berat,tinggi,BBI,WHR ;
        
        
       JOptionPane.showMessageDialog(null, "Selamat datang di kalkulator Berat Badan Ideal !");
         // 1
       nama = JOptionPane.showInputDialog("Siapa nama kamu?");
         //2
       alamat = JOptionPane.showInputDialog("Kamu berasal dari mana?");
        //3
       hobi = JOptionPane.showInputDialog("Apa hobimu?");
        // 4 
       input = JOptionPane.showInputDialog("Tahun kelahiranmu?");
       tahunLahir = Integer.parseInt(input);
        //5
       input = JOptionPane.showInputDialog("Berapa kali kamu melakukan olahraga dalam seminggu?");
       intensitasOlahraga = Integer.parseInt(input);
        //6
       input = JOptionPane.showInputDialog("Berapa kali kamu makan dalam sehari?");
       makan = Integer.parseInt(input);
        // 7
       input = JOptionPane.showInputDialog("berapa berat badanmu ? (on kilogram)");
       berat = Double.parseDouble(input); 
        //8
       input = JOptionPane.showInputDialog("Berapa tinggi badanmu? (dalam meter)");
       tinggi = Double.parseDouble(input);
        //9
       input = JOptionPane.showInputDialog("Berapa lingkar pingganmu? (dalam cm)");
       lingkarPinggang = Integer.parseInt(input);
        //10
       input = JOptionPane.showInputDialog("Berapa lingkar pinggulnmu? (dalam cm)");
       lingkarPinggul = Integer.parseInt(input);
       
       umur = 2022-tahunLahir;
       BBI = berat/(tinggi*tinggi);
       WHR = lingkarPinggang/lingkarPinggul;
       
      
       
        
       System.out.println("Halo, nama saya adalah " +nama +". Saya berasal dari " +alamat +". Hobi saya adalah " +hobi 
               +". Saya sekarang berusia " +umur+ " tahun" +". Saya berolahraga " +intensitasOlahraga +" kali dalam seminggu" 
                       +". Saya makan " +makan +" kali dalam sehari" +". Berat badan saya adalah " +berat + " Kilogram" +". Tinggi badan saya adalah " 
               +tinggi + " m" +" Lingkar pinggang saya adalah "  +lingkarPinggang +" cm" +". Lingkar pinggul saya adalah "  +lingkarPinggul +" cm"
               +". Waist Hip Ratio saya adalah " +WHR);
       
        System.out.println("Berat Badan ideal kamu adalah " +BBI );
       if (BBI  < 18.1) {
            System.out.println("kamu  terlalu kurus, tolong perbanyak makan !");
                }
       else if ( BBI < 23.1) {
            System.out.println("Berat badanmu normal, tolong jaga tubuhmu !");
                }
        else if( BBI < 28.1){
            System.out.println("Kamu sedikit kegemukan, lakukan olahraga ringan !");
                 }
        else if (BBI> 28.1){
            System.out.println("Kamu obesitas, pergilah ke gym !!!");
        }
      
    }
    
}
