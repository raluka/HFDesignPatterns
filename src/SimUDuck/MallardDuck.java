package SimUDuck;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 7/24/13
 * Time: 2:46 PM
 * a subclass of Duck, mother of all
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
    public void display(){
        System.out.println("I'm a real Mallard duck.");
    }

}
