package nevelev.dima;

/**
 * Created with IntelliJ IDEA.
 * User: DimaN
 * Date: 22/11/14
 * Time: 21:19
 * To change this template use File | Settings | File Templates.
 */
public class Parrot extends Bird {

    /**
     * Calls Bird's constructor with the relevant to parrot params
     */
    public Parrot() {
        super("Parrot", "karrr", 2, 0.3, 10, "seeds");
    }

    /**
     * parrots can talk when they old enough
     * @return string voice
     */
    public String  talk(){
        return "\"Hi, I'm a talking parrot!\".";
    }

    /**
     * overrides animal's getVoice method
     * @return
     */
    public String getVoice(){
        if (_age >1){
            this._voice =talk();
        }
        return super.getVoice();
    }


}
