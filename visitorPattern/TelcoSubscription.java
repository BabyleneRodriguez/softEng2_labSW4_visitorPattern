package softEng2_LabSW4_visitorPattern;

public interface TelcoSubscription
{
    public String accept (UsagePromo promo, double price, int dataAllowance);
    public String accept (UnliCallsTextOffer unliPackage, boolean unliCallText);

    String getTelcoName();
    int getPromoPrice();

    boolean getUnliCallText();

    double getDataAllowance();
}
