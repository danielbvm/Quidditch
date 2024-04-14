import java.util.Random;

public class Seeker extends Player {

    Seeker(String name,int number){

        super(name,number);
    }
    public boolean isSuccessful() {

        return (new Random().nextInt(100) < 5);
    }
}
