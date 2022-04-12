package UB_Food;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));

        System.out.println("NAMA    :Candra Setiawan");
        System.out.println("NIM     :215150700111024");
        System.out.println();
        DataMerchant.tampilData();
        System.out.println();


        String namaMerchant = input.nextLine();

        String namaProduk = input.nextLine();

        double hargaProduk = input.nextDouble();
        input.nextLine();

        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant(namaMerchant, namaProduk, hargaProduk));
        System.out.println();


        System.out.println("NAMA   :Candra Setiawan");
        System.out.println("NIM    :215150700111024");

        DataMerchant.tampilData();
        System.out.println();


        DataMerchant.updateMerchant(DataMerchant.cariMerchant("Nasgor Mblebes"), "Nasgor Mblebes", "Nasi Goreng Hongkong", 13000);


        System.out.println("Data Merchant yang telah di update");
        DataMerchant.tampilMerchant(DataMerchant.cariMerchant("Nasgor Mblebes"));

    }
}
