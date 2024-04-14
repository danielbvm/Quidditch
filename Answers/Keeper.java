import java.util.Random;

public class Keeper extends Player{

    Keeper(String name, int number){

        super(name,number);
    }
    public boolean isSuccessful(){

        return (new Random().nextInt(100) < 70);
    }
}
