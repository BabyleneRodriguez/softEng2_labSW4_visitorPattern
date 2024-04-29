package softEng2_LabSW4_visitorPattern;

public class TelcoAllowance implements UsagePromo
{
    public String showAllowance(String telcoName, double money, int dataAllowance )
    {
        return telcoName + " offers a data allowance of " + dataAllowance + " GB of data for ₱" + money + " per month.";
    }
}

