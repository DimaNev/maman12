package nevelev.dima;

/**
 * Created with IntelliJ IDEA.
 * User: DimaN
 * Date: 22/11/14
 * Time: 14:17
 * To change this template use File | Settings | File Templates.
 */
public abstract class Mammal extends Animal{

    protected int _breastfeedingAge;

    /**
     * Calls animal creation and adding the specific to the mammal parameters
     * @param breastfeedingAge int of weeks till when the mammal is breastfeeded
     */
    public Mammal(String type, String voice, int maxStomachSize, double metabolismRate, int sleepTime,
                  String foodType, int breastfeedingAge) {
        super(type, voice, Skin.HAIR , maxStomachSize, metabolismRate, sleepTime, foodType);
        this._breastfeedingAge =breastfeedingAge;
    }

    /**
     * overrides Animal's eat method
     * if this is still the mammal breastfeeding age it will be feed by its mother
     * else the regular animal food method will be called
     * @param food
     */
    public void eat(int food){
        if (getAge()<= _breastfeedingAge){
            this._stomachCapacity = (int)(this._stomachCapacity +food* _metabolismRate);
            System.out.println("The "+this._type +" ate "+food+" grams of mothers milk.");
            if (this._stomachCapacity >=this._maxStomachSize) this.relieve(_maxStomachSize);
        }
        else{
            super.eat(food);
        }
    }

    /**
     * overrides Animal's getFood method
     * if this is still the mammal breastfeeding age it will find his mother
     * else the regular animal getFood method will be called
     */
    public void getFood(){
        if (getAge()<= _breastfeedingAge){
            move();
            System.out.println("It found mom.");
        }
        else{
            super.getFood();
        }
    }
}
