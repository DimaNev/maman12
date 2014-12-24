package nevelev.dima;

/**
 * Created with IntelliJ IDEA.
 * User: DimaN
 * Date: 22/11/14
 * Time: 21:34
 * To change this template use File | Settings | File Templates.
 */
public class Owl extends Bird {

    /**
     * Calls Bird's constructor with the relevant to owl params
     */
    public Owl() {
        super("Owl", "uhoo", 2, 0.3, 15, "mouse");
    }

    /**
     * owl's special method
     */
    public void nightVision(){
        System.out.println("The owl see good at the dark!");
    }
}
