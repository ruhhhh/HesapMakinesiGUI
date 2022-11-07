public class SeninHatan extends Exception{
    private int id;
    public SeninHatan()
    {

    }
    public SeninHatan(String aciklama)
    {
        super(aciklama);
    }
    public SeninHatan(String aciklama, int id)
    {
        super(aciklama);
        this.id = id;

    }
    public String getLocalizedMessage()
    {
        switch (id)
        {
            case 0: return "önemsiz hata";
            case 1: return "hata";
            case 2: return "önemli hata";
            default: return "tanımsız hata";
        }
    }
    public int getId()
    {
        return id;
    }
}
