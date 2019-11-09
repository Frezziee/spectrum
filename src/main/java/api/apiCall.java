package api;
import com.merakianalytics.orianna.Orianna;
import com.merakianalytics.orianna.types.common.Queue;
import com.merakianalytics.orianna.types.common.Region;
import com.merakianalytics.orianna.types.core.league.League;
import com.merakianalytics.orianna.types.core.staticdata.Champion;
import com.merakianalytics.orianna.types.core.staticdata.Champions;
import com.merakianalytics.orianna.types.core.summoner.Summoner;

public class apiCall {
  public static Summoner getSummoner(String name) {
    Summoner summoner = Orianna.summonerNamed(name).get();
    return summoner;
  }

  public static String getRank(Summoner summoner) {
    return summoner.getLeaguePosition(Queue.RANKED_SOLO).getTier() + " " + summoner.getLeaguePosition(Queue.RANKED_SOLO).getDivision();
  }

}