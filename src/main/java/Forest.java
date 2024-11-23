import java.util.List;

public class Forest {
    private List<MountainHare> hares;
    private String season;

    public Forest(String season, List<MountainHare> hares) {
        this.season = season;
        this.hares = hares;
        setSeason(season);
    }

    public static void setSeason(String season) {
        if (season.equals("лето")) {
            MountainHare.color = "серо-рыжий";
        } else {
            MountainHare.color = "белый";
        }
    }

    public void printHares() {
        for (MountainHare mountainHare : hares) {
            System.out.println(mountainHare);
        }
    }
}
