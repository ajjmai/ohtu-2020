package ohtuesimerkki;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StatisticsTest {

    Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri", "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };

    Statistics stats;

    @Before
    public void setUp() {
        stats = new Statistics(readerStub);
    }

    @Test
    public void testPlayerSearch() {
        Player player = readerStub.getPlayers().get(0);
        Player searchedPlayer = stats.search(player.getName());

        assertEquals(player.getName(), searchedPlayer.getName());
    }

    @Test
    public void testPlayerSearchReturnNull() {
        Player player = stats.search("Selänne");

        assertEquals(player, null);
    }

    @Test
    public void testTeams() {
        List<Player> players = stats.team("EDM");

        assertEquals(players.size(), 3);
    }

    @Test
    public void testTopScores() {
        List<Player> players = stats.topScorers(1);

        assertEquals(players.get(0).getName(), "Gretzky");
    }
}