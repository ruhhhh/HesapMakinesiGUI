import java.util.Scanner;
public class DiziSiralama {

    public void siralama()
    {
        int [] dizi = new int[10];
        System.out.print("Lütfen 10 adet dizi elemanı giriniz: ");
        Scanner okuma = new Scanner(System.in);
        for(int i=0; i<10; i++)
        {
            int diziDeger=okuma.nextInt();
            dizi[i] = diziDeger;
            for(int j=0; j<i; j++)
            {
                if(diziDeger == dizi[i-1])
                {
                    System.out.println("Daha önce girdiğiniz bir sayıyı tekrar girdiniz. Progrmaı tekrar başlatınız.");
                    diziDeger = okuma.nextInt();
                    dizi[i] = diziDeger;
                }
            }
        }
        for(int l=0; l<9; l++)
        {
            for(int m=l+1; m<10; m++)
            {
                if(dizi[m]<dizi[l])
                {
                    int temp = dizi[l];
                    dizi[l] = dizi[m];
                    dizi[m] = temp;
                }
            }
        }
        for(int k : dizi) {
            System.out.print(k + " , ");
        }
    }
}
