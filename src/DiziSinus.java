import java.util.Scanner;
public class DiziSinus {
    public void diziSinus()
    {
        int [] dizi = new int[3];
        double [] diziSinus = new double[3];
        System.out.println("3 adet açı giriniz:");
        Scanner okuma = new Scanner(System.in);
        int ikiDikAci = 90;
        int ucDuzAci = 180;
        int dortTamAci = 360;
        final int sabitDeger = 3;
        int sayac = 1;
        while(sayac<=3)
        {
            System.out.print(sayac +". değer: ");
            int aciDegeri = okuma.nextInt();
            if(aciDegeri<=360)
            {
                if(aciDegeri == ikiDikAci)
                {
                    String dikAciMetin = "Tebrikler! Girdiğiniz açı 2 dik açıdır.";
                    System.out.println(dikAciMetin);
                    String cevirDikAciMetin = cevir(dikAciMetin);
                    System.out.println(cevirDikAciMetin);

                }
                else if (aciDegeri == ucDuzAci)
                {
                    String duzAciMetin = "Tebrikler! Girdiğiniz açı 3 düz açıdır.";
                    System.out.println(duzAciMetin);
                    String cevirDuzAciMetin = cevir(duzAciMetin);
                    System.out.println(cevirDuzAciMetin);
                }
                else if (aciDegeri == dortTamAci)
                {
                    String tamAciMetin = "Tebrikler! Girdiğiniz açı 4 tam açıdır.";
                    System.out.println(tamAciMetin);
                    String cevirTamAciMetin = cevir(tamAciMetin);
                    System.out.println(cevirTamAciMetin);
                }
                else
                {
                    double aciDegeriSinus = Math.sin(aciDegeri);
                    dizi[sayac-1]=aciDegeri;
                    diziSinus[sayac-1]=aciDegeriSinus;
                }
            }
            else
            {
                int aciDegeriTemp = aciDegeri%360;
                double aciDegeriTempSinus = Math.sin(aciDegeriTemp);
                dizi[sayac-1] = aciDegeriTemp;
                diziSinus[sayac-1]= aciDegeriTempSinus;
            }
            sayac++;
        }
        double toplam =0;
        for(double j: diziSinus)
        {
            toplam = toplam +j;
        }
        double toplamOrtalama = toplam/sayac;
        System.out.print("Girilen açıların sinüs ortalamaları: " + toplamOrtalama);
    }
    public static String cevir(String metin)
    {
        if (metin.isEmpty())
        {
            return metin;
        }
        return cevir(metin.substring(1)) + metin.charAt(0);
    }
}
