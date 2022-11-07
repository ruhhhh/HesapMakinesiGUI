public class Denek {

    public void cikart(int a, int b) throws BenimHatam, SeninHatan
    {
        if(a == 0)
        {
            throw new SeninHatan("a parametresi 0 geldi");
        }
        if(b == 0)
        {
            throw new SeninHatan("b parametresi 0 geldi");
        }
        if(a<0 || b<0)
        {
            throw new SeninHatan();
        }
        int sonuc = a - b;
        if(sonuc<0)
        {
            throw new BenimHatam("Sonuc - çıktı",2);
        }
        else if(sonuc == 0)
        {
            throw new BenimHatam("Sonuc 0",1);
        }
    }
}
