package SimUDuck;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 7/24/13
 * Time: 2:53 PM
 * Quacking behaviour implementation for ducks that NOT quack
 */
public class Squeak implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
