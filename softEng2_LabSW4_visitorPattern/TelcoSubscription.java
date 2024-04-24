package softEng2_LabSW4_visitorPattern;

public interface TelcoSubscription
{
    public String accept(UsagePromo usage, Double price);

    public String accept(UnliCallsTextOffer offer, Boolean unliCallText);
    public String getTelcoName();
    public Double getPromoPrice();
    public Integer getDataAllowance();
    public Boolean getUnliCallText();
}
