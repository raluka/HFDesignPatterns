package SimUDuck;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 7/24/13
 * Time: 2:51 PM
 * Quacking behaviour implementation for ducks that NOT quack
 */
public class MuteQuack implements QuackBehaviour{
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
