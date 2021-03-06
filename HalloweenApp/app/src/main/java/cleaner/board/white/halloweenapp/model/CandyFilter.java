package cleaner.board.white.halloweenapp.model;

/**
 * Created by Akshay on 10/24/2015.
 */
public class CandyFilter {

    public static boolean couldBeCandy(String name){
        String normal = name.toLowerCase().replaceAll("\\s", "");
        for(String keyword:KEYWORDS){
            if(normal.contains(keyword)){
                return true;
            }
        }
        return false;
    }

    public static String keyword(String name) {
        String normal = name.toLowerCase().replaceAll("\\s", "");
        for (String keyword : KEYWORDS) {
            if (normal.contains(keyword)) {
                return keyword;
            }
        }
        return null;
    }

    static final String[] KEYWORDS = {
            "zabba",
            "airheads",
            "andes",
            "fireball",
            "bazooka",
            "hunk",
            "gum",
            "blowpop",
            "bubbletape",
            "bottlecap",
            "cadbury",
            "charleston",
            "chuckles",
            "gummy",
            "cowtale",
            "dots",
            "gobstopper",
            "fundip",
            "gusher",
            "hershey",
            "jawbreaker",
            "jellybean",
            "jollyrancher",
            "jujubes",
            "juniormints",
            "laffytaffy",
            "lifesavers",
            "mnm",
            "m&m",
            "mikeandike",
            "milkduds",
            "necco",
            "nerds",
            "nowandlater",
            "oompas",
            "gummies",
            "peeps",
            "pez",
            "pixiestix",
            "pocky",
            "poprocks",
            "raisinets",
            "razzles",
            "reese",
            "ringpop",
            "rolo",
            "runts",
            "sixlets",
            "skittles",
            "smarties",
            "sourpatch",
            "spree",
            "starburst",
            "swedishfish",
            "sweetarts",
            "tootsie",
            "twizzler",
            "warheads",
            "werther",
            "york",
            "peppermint",
            "whoppers",
            "100grand",
            "musketeers",
            "5thavenue",
            "almondjoy",
            "babyruth",
            "butterfinger",
            "dove",
            "heath",
            "kitkat",
            "krackel",
            "lindt",
            "mars",
            "milkyway",
            "mounds",
            "goodbar",
            "crunch",
            "nestle",
            "nutrageous",
            "payday",
            "fastbreak",
            "skor",
            "snickers",
            "take5",
            "toblerone",
            "twix",
            "wonka",
            "chocolate",
            "fudge",
            "candy",
    };
}
