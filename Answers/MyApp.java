public class MyApp {

    public static void main(String[] args) {
        Keeper keeper1 = new Keeper("Keeper 1", 1);
        Seeker seeker1 = new Seeker("Seeker 1", 1);
        Chaser[] chasers1 = {new Chaser("Chaser 1", 1), new Chaser("Chaser 2", 2), new Chaser("Chaser 3", 3)};
        Beater[] beaters1 = {new Beater("Beater 1", 1), new Beater("Beater 2", 2)};
        Team team1 = new Team(keeper1, seeker1, chasers1, beaters1);

        Keeper keeper2 = new Keeper("Keeper 2", 1);
        Seeker seeker2 = new Seeker("Seeker 2", 1);
        Chaser[] chasers2 = {new Chaser("Chaser 4", 1), new Chaser("Chaser 5", 2), new Chaser("Chaser 6", 3)};
}
