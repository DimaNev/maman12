package nevelev.dima;

/**
 * Created with IntelliJ IDEA.
 * User: DimaN
 * Date: 22/11/14
 * Time: 15:18
 * To change this template use File | Settings | File Templates.
 */
public abstract class Reptile extends Animal{

    /**
     *  Calls animal creation and adding the specific to the reptile parameters
     */
    public Reptile(String type, String voice, int maxStomachSize, double metabolismRate, int sleepTime, String foodType) {
        super(type, voice, Skin.SCALE_AND_SCUTE, maxStomachSize, metabolismRate, sleepTime, foodType);
    }

    /**
     * calls and overrides Animal's move method
     * all the reptile are crawls
     */
    public void move(){
        super.move();
        System.out.println("crawls.");
    }
}


