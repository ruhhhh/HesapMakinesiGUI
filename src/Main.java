public class Main {
    public static void main(String[] args) {

        //DiziSiralama diziSiralama = new DiziSiralama();
        //diziSiralama.siralama();

        //DiziSinus diziSinus = new DiziSinus();
        //diziSinus.diziSinus();

        try
        {
            System.out.println("---------------");
            try
            {
                Denek deneme = new Denek();
                //deneme.cikart(1, 0);
                //deneme.cikart(1,-230);
                deneme.cikart(251, 252);
            }
            catch (BenimHatam e)
            {
                System.out.println("Hata oluştu-1: "+ e.getMessage());
                System.out.println(e.getLocalizedMessage());
                System.out.println(e.getId());
                throw new RuntimeException(e);
            }
            catch (SeninHatan e)
            {
                System.out.println("Hata oluştu-2: "+e);
                throw new RuntimeException(e);
            }
            System.out.println("-----------");
        }
        finally
        {
            System.out.println("Finally Bloğu çalıştırıldı");
        }
    }
}