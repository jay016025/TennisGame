package idv.jay.tannisGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTannisGame {

    TannisGame game = new TannisGame();

    @Test
    public void testLoveAll() {
        assertEquals("love all", game.score());
    }

    @Test
    public void testFifteenAll() {
        game.fstPlayerScore();
        game.sndPlayerScore();
        assertEquals("fifteen all", game.score());
    }

    @Test
    public void testFifteenLove() {
        game.fstPlayerScore();
        assertEquals("fifteen love", game.score());
    }

    @Test
    public void testFifteenThirteen() {
        sunFstPlayerScore(1);
        sunSndPlayerScore(2);
        assertEquals("fifteen thirteen", game.score());
    }

    @Test
    public void testDeuce() {
        sunFstPlayerScore(3);
        sunSndPlayerScore(3);
        assertEquals("deuce", game.score());
    }

    @Test
    public void testFstPlayerWin() {
        sunFstPlayerScore(4);
        sunSndPlayerScore(2);
        assertEquals("First player win", game.score());
    }

    @Test
    public void testSndPlayerWin() {
        sunFstPlayerScore(1);
        sunSndPlayerScore(4);
        assertEquals("Second player win", game.score());
    }

    @Test
    public void testFstPlayerAdvantage() {
        sunFstPlayerScore(4);
        sunSndPlayerScore(3);
        assertEquals("First player advantage", game.score());
    }

    @Test
    public void testSndPlayerAdvantage() {
        sunFstPlayerScore(5);
        sunSndPlayerScore(6);
        assertEquals("Second player advantage", game.score());
    }

    @Test
    public void advantageAfterFstPlayerWin() {
        sunFstPlayerScore(6);
        sunSndPlayerScore(4);
        assertEquals("First player win", game.score());
    }

    @Test
    public void advantageAfterSndPlayerWin() {
        sunFstPlayerScore(5);
        sunSndPlayerScore(7);
        assertEquals("Second player win", game.score());
    }

    private void sunFstPlayerScore(int score) {
        for (int i = 0; i < score; i++) {
            game.fstPlayerScore();
        }
    }

    private void sunSndPlayerScore(int score) {
        for (int i = 0; i < score; i++) {
            game.sndPlayerScore();
        }
    }
}
