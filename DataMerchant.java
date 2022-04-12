package UB_Food;

public class DataMerchant {
    static Merchant[] merchant = new Merchant[0];

    public static Merchant[] tambahMerchant(Merchant m) {
        Merchant[] merch = new Merchant[DataMerchant.merchant.length + 1];

        int i = 0;
        for (; i < DataMerchant.merchant.length; i++) {
            merch[i] = merchant[i];
        }

        merch[DataMerchant.merchant.length] = m;
        return merch;
    }

    public static void tampilData() {
        for (Merchant a : DataMerchant.merchant) {
            System.out.println("===Tampilan Data Merchant UBFood===");
            System.out.println("Nama Merchant   : " + a.getNamaMerchant());
            System.out.println("Nama Produk     : " + a.getNamaProduk());
            System.out.println("Harga           : " + (int) a.getHargaMakanan());
        }
    }

    public static Merchant cariMerchant(String nama) {
        int index = 0;
        for (int i = 0; i < DataMerchant.merchant.length; i++) {
            if (DataMerchant.merchant[i].getNamaMerchant() == nama) {
                index = i;
                break;
            }
        }
        return merchant[index];
    }

    public static void tampilMerchant(Merchant m) {
        System.out.println("===Tampilan Data Merchant UBFood===");
        System.out.println("Nama Merchant   : " + m.getNamaMerchant());
        System.out.println("Nama Produk     : " + m.getNamaProduk());
        System.out.println("Harga           : " + (int) m.getHargaMakanan());
    }

    public static void updateMerchant(Merchant m, String nm, String np, double h) {
        m.setNamaMerchant(nm);
        m.setNamaProduk(np);
        m.setHargaMakanan(h);
    }
}



