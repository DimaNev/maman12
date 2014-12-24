package nevelev.dima;

/**
 * Created with IntelliJ IDEA.
 * User: DimaN
 * Date: 22/11/14
 * Time: 14:49
 * To change this template use File | Settings | File Templates.
 */
public abstract class Bird extends Animal{

    /**
     *  Calls animal creation and adding the specific to the bird parameters
     */
    public Bird(String type, String voice, int maxStomachSize, double metabolismRate, int sleepTime, String foodType) {
        super(type, voice, Skin.FEATHERS, maxStomachSize, metabolismRate, sleepTime, foodType);
    }

    /**
     * calls and overrides Animal's move method
     * all birds are flying
     */
    public void move(){
        super.move();
        System.out.println("flying.");
    }
}
