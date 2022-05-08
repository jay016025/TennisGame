package idv.jay.tannisGame;

import java.util.HashMap;
import java.util.Map;

public class TannisGame {

    public static final String LOVE = "love";
    public static final String ALL = "all";
    public static final String BLANK = " ";
    public static final String FIFTEEN = "fifteen";
    public static final String THIRTEEN = "thirteen";
    public static final String FORTY = "forty";
    public static final String DEUCE = "deuce";
    public static final String ADVANTAGE = "advantage";
    public static final String FIRST_PLAYER = "First player ";
    public static final String WIN = "win";
    public static final String SECOND_PLAYER = "Second player ";
    private final Map scoreMapping;

    private int fstPlayerScore;
    private int sndPlayerScore;

    public TannisGame() {
        scoreMapping = new HashMap<Integer, String>();
        scoreMapping.put(0, LOVE);
        scoreMapping.put(1, FIFTEEN);
        scoreMapping.put(2, THIRTEEN);
        scoreMapping.put(3, FORTY);
    }

    public String score() {

        String res = "";
        Integer substract = fstPlayerScore - sndPlayerScore;

        if(fstPlayerScore >= 3 && sndPlayerScore >=3) {
            switch (substract) {
                case 0:
                    return DEUCE;
                case 1:
                    return FIRST_PLAYER + ADVANTAGE;
                case -1:
                    return SECOND_PLAYER + ADVANTAGE;
                default:
                    if(fstPlayerScore > sndPlayerScore) return FIRST_PLAYER + WIN;
                    else return SECOND_PLAYER + WIN;
            }
        }

        if(fstPlayerScore == 4) return FIRST_PLAYER + WIN;
        if(sndPlayerScore == 4) return SECOND_PLAYER + WIN;

        switch (substract) {
            case 0:
                res = scoreMapping.get(fstPlayerScore) + BLANK + ALL;
                break;
            default:
                res = scoreMapping.get(fstPlayerScore) + BLANK + scoreMapping.get(sndPlayerScore);
        }

        return res;
    }

    public void fstPlayerScore() {
        this.fstPlayerScore++;
    }

    public void sndPlayerScore() {
        this.sndPlayerScore++;
    }
}
