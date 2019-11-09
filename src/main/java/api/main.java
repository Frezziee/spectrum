package api;
import com.merakianalytics.orianna.Orianna;
import com.merakianalytics.orianna.types.common.Queue;
import com.merakianalytics.orianna.types.common.Region;
import com.merakianalytics.orianna.types.common.Season;
import com.merakianalytics.orianna.types.core.summoner.Summoner;

public class main {
  public static void main(String[] args) {
    Orianna.setRiotAPIKey("RGAPI-7be39ce0-7c29-40f5-9d55-3c8fce8e7434");
    Orianna.setDefaultRegion(Region.NORTH_AMERICA);
    Summoner me = apiCall.getSummoner("Aqüa");
    System.out.println(apiCall.getRank(me));
  }
}