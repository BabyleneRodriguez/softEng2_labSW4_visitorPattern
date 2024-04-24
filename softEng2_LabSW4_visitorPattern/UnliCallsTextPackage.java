package softEng2_LabSW4_visitorPattern;
import java.util.*;

public class UnliCallsTextPackage implements UnliCallsTextOffer
{
    private static final Map<String, String> unliCallOfferMap = new LinkedHashMap<>()
    {

        {
            unliCallOfferMap.put("Smart", "Do not offer any free calls or texts, and you will be charged per use.\n");
            unliCallOfferMap.put("Globe", "Comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.\n");
            unliCallOfferMap. put("Ditto", "Includes unlimited calls and texts to all networks within the country.\n");
        }
    };

    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText)
    {
        return unliCallOfferMap.getOrDefault(telcoName, "Telco Name not Found");
    }

    public String showUnliCallsTextOffer(TelcoSubscription telco)
    {
        return this.showUnliCallsTextOffer(telco.getTelcoName(), telco.getUnliCallText());
    }
}
