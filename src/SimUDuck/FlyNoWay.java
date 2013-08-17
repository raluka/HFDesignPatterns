package SimUDuck;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 7/24/13
 * Time: 3:00 PM
 * Flying behaviour implementation for ducks that DO fly
 */
public class FlyNoWay implements FlyBehaviour{
    public void fly() {
        System.out.println("I can't fly!!");
    }
}
