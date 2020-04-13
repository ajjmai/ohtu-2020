package statistics;

import statistics.matcher.*;

public class Main {
    public static void main(String[] args) {
        // seuraavassa osoitteessa 27.11.2019 päivitetyt tilastot
        String url = "https://nhl27112019.herokuapp.com/players.txt";
        // ajan tasalla olevat tilastot osoitteessa
        // "https://nhlstatisticsforohtu.herokuapp.com/players.txt"

        Statistics stats = new Statistics(new PlayerReaderImpl(url));

        QueryBuilder query = new QueryBuilder();

        System.out.println("\nm1");

        Matcher m1 = query.playsIn("PHI").hasAtLeast(10, "assists").hasFewerThan(8, "goals").build();

        for (Player player : stats.matches(m1)) {
            System.out.println(player);
        }
        System.out.println("\nm2");

        Matcher m2 = query.playsIn("EDM").hasAtLeast(20, "points").build();

        for (Player player : stats.matches(m2)) {
            System.out.println(player);
        }
        System.out.println("\nm");

        Matcher m = query.oneOf(m1, m2).build();

        for (Player player : stats.matches(m)) {
            System.out.println(player);
        }

        System.out.println("\nm3");

        Matcher m3 = query.oneOf(query.playsIn("PHI").hasAtLeast(10, "assists").hasFewerThan(8, "goals").build(),

                query.playsIn("EDM").hasAtLeast(20, "points").build()).build();

        for (Player player : stats.matches(m3)) {
            System.out.println(player);
        }

        System.out.println("\nm4");

        Matcher m4 = new Or(new And(new PlaysIn("PHI"), new HasAtLeast(10, "assists"), new HasFewerThan(8, "goals")),
                new And(new PlaysIn("EDM"), new HasAtLeast(20, "points")));

        for (Player player : stats.matches(m4)) {
            System.out.println(player);
        }

    }
}
