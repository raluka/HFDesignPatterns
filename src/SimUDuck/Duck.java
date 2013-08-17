package SimUDuck;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 7/24/13
 * Time: 2:39 PM
 * mother of all
 */
public abstract class Duck {
    // declare two reference variables for the behaviours interface types/ All duck subclasses inherit this.
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    public Duck(){

    }

    public abstract void display();

    // Delegate the behaviour class
    public void performFly(){
        flyBehaviour.fly();
    }
    public void performQuack(){
        quackBehaviour.quack();
    }
    // here mode methods about ducks
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour = fb;
    }
    public void setQuackBehaviour(QuackBehaviour qb){
        quackBehaviour = qb;
    }
}
