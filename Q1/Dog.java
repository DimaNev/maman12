package nevelev.dima;

/**
 * Created with IntelliJ IDEA.
 * User: DimaN
 * Date: 22/11/14
 * Time: 15:28
 * To change this template use File | Settings | File Templates.
 */
public class Dog extends Mammal {

    /**
     * Calls Mammal constructor with the relevant to dog params
     */
    public Dog() {
        super("Dog", "woof-woof", 5, 0.5, 12, "Dogli", 8);
    }

    /**
     * special to dog method bark
     */
    public void bark(){
        System.out.println("The dog is barking "+this.getVoice());
    }

    /**
     * special to dog method protect
     */
    public void protect(){
        bark();
    }

    /**
     * calls and overrides move method from Animal
     * dogs special movement
     */
    public void move(){
        super.move();
        System.out.println("running.");
    }
}
