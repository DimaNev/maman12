package nevelev.dima;

/**
 * Created with IntelliJ IDEA.
 * User: DimaN
 * Date: 22/11/14
 * Time: 20:52
 * To change this template use File | Settings | File Templates.
 */
public class Chameleon extends Reptile{

    /**
     * Calls reptile constructor with the relevant to chameleon params
     */
    public Chameleon() {
        super("Chameleon", "hhhh", 1, 0.7, 1 , "flies");
    }

    /**
     * special method to the chameleon
     */
    public void changeColor(){
        System.out.println("The chameleon changed color.");
    }
}
