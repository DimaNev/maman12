package nevelev.dima;

/**
 * Created with IntelliJ IDEA.
 * User: DimaN
 * Date: 22/11/14
 * Time: 15:38
 * To change this template use File | Settings | File Templates.
 */
public class Horse extends Mammal{

    /**
     * Calls Mammal constructor with the relevant to horse params
     */
    public Horse() {
        super("Horse", "Neerggghhhhhfffff", 15, 0.7, 12, "grass", 30);
    }

    /**
     * special to horse method neigh
     */
    public void neigh(){
        System.out.println("The horse is neighing "+this.getVoice());
    }

    /**
     * overrides animal move method
     * the horse is moving differently from other animals
     */
    public void move(){
        super.move();
        System.out.println("galloping.");
    }
}
