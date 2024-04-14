import java.util.Random;

public class Beater extends Player{

    Beater(String name,int number) {
        super(name,number);
    }
    public boolean isSuccessful() {

        return (new Random().nextInt(100) < 70);
    }
}
