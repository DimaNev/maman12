package nevelev.dima;

/**
 * Created with IntelliJ IDEA.
 * User: DimaN
 * Date: 22/11/14
 * Time: 20:40
 * To change this template use File | Settings | File Templates.
 */
public class Snake extends Reptile {

    /**
     * Calls reptile constructor with the relevant to snake params
     */
    public Snake() {
        super("Snake", "psss", 10, 0.3, 2191 , "mouse");
    }

    /**
     * special method to the snake hunting
     */
    public void hunt(){
        move();
        bite();
    }

    /**
     * special method to the snake bite
     */
    public void bite(){
        System.out.println("The snake bite.");
    }

    /**
     * overrides getFood
     * the snake gets his food by biting it first and just then it eats
     */
    public void getFood(){
        hunt();
        System.out.println("It found "+this._foodType +".");
    }
}
