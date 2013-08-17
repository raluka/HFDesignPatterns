package SimUDuck;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 7/24/13
 * Time: 3:07 PM
 * another subclass of Duck
 */
public class ModelDuck extends Duck{
    public ModelDuck(){
        // our new duck begins life grounded (without a way to fly)
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
