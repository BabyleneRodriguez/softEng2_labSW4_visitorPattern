package softEng2_LabSW4_visitorPattern;
import java.util.*;

public class UnliCallsTextPackage implements UnliCallsTextOffer
{
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText)
    {
        if (unliCallText && telcoName.equals("Ditto"))
        {
            return telcoName + " includes unlimited calls and texts to all networks within the country.";
        }
        else if(unliCallText && telcoName.equals("Globe"))
        {
            return telcoName + " comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.";
        }
        else
            return telcoName + " does not offer free calls or texts, and you will be charged per use. ";
    }
}
