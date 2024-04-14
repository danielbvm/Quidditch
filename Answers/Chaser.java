import java.util.Random;

public class Chaser extends Player {

    Chaser(String name, int number){
        super(name,number);
    }

    public boolean isSuccessful() {

        return (new Random().nextInt(100) < 30);
    }


}
