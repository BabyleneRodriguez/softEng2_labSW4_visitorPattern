package softEng2_LabSW4_visitorPattern;

public class Telco implements TelcoSubscription
{
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText)
    {
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }

    public String accept(UsagePromo promo, double price, int dataAllowance)
    {
        return promo.showAllowance(telcoName, price, dataAllowance);
    }

    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText)
    {
        return unliPackage.showUnliCallsTextOffer(telcoName,unliCallText);
    }
    public String getTelcoName()
    {
        return telcoName;
    }

    public int getPromoPrice()
    {
        return (int) promoPrice;
    }

    public double getDataAllowance()
    {
        return dataAllowance;
    }
    public boolean getUnliCallText()
    {
        return unliCallText;
    }
}
