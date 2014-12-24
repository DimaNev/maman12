package nevelev.dima;

/**
 * Created with IntelliJ IDEA.
 * User: DimaN
 * Date: 22/11/14
 * Time: 11:06
 * To change this template use File | Settings | File Templates.
 */
public abstract class Animal {

    protected String _type;
    protected Skin _skin;
    protected int _age;
    protected String _voice;
    protected int _stomachCapacity;
    protected int _maxStomachSize;
    protected double _metabolismRate;
    protected int _sleepTime;
    protected String _foodType;


    /**
     * Crates a basic animal with parameters every animal have.
     *
     * @param type the type of the animal
     * @param voice the voice the animal do
     * @param skin what skin the animal have
     * @param maxStomachSize how mach the animal can eat
     * @param metabolismRate how much of the food goes to grow energy and how mach to droppings
     * @param sleepTime how long the animal should sleep
     * @param foodType what the animal eats
     */
    public Animal(String type, String voice, Skin skin, int maxStomachSize, double metabolismRate, int sleepTime, String foodType) {
        this._type = type;
        this._voice = voice;
        this._age = 0;
        this._skin = skin;
        this._maxStomachSize = maxStomachSize;
        this._metabolismRate = metabolismRate;
        this._sleepTime = sleepTime;
        this._foodType = foodType;
    }

    /**
     * returns the animal age
     * @return int age in weeks
     */
    public int getAge() {
        return _age;
    }

    /**
     * adds the number of weeks to their age
     * @param age int number of weeks
     */
    public void grow(int age){
        this._age =this._age +age;
        System.out.println("The "+ _type +" grow for "+age+" weeks.");
    }

    /**
     * every animal can move
     */
    public void move(){
        System.out.print("The " + this._type + " is ");
    }

    /**
     * every animal have the ability to get food
     */
    public void getFood(){
        move();
        System.out.println("It found "+this._foodType +".");
    }

    /**
     * The method represents eating
     * @param food
     */
    public void eat(int food){
        this._stomachCapacity = (int)(this._stomachCapacity +food* _metabolismRate);
        System.out.println("The "+this._type +" ate "+food+" grams of "+ _foodType +".");
        if (this._stomachCapacity >=this._maxStomachSize) {
            while (this._stomachCapacity >=this._maxStomachSize)
            this.relieve(_maxStomachSize);
        }
    }

    /**
     * The method represents animal relieving prosses
     * @param droppings int
     */
    public void relieve (int droppings){
        this._stomachCapacity =this._stomachCapacity -droppings;
        System.out.println("The "+ _type +" relieved itself.");
    }

    /**
     * Represents the animal sleeping process
     */
    public void sleep(){
        String ending=this._sleepTime ==1 ? " hour." : " hours.";
        System.out.println("The "+this._type +" slept for "+this._sleepTime +ending);
    }

    /**
     * Enum which represents the animal skin structure
     */
    public enum Skin{
        HAIR, FEATHERS, SCALE_AND_SCUTE
    }

    /**
     * Represents the animal voice
     * @return String voice
     */
    public String getVoice(){
        return "The "+ _type +" made "+ _voice +".";
    }

    /**
     * returns information about the animal
     * @return String
     */
    public String toString() {
        return "This Animal is \'"+ _type +"\'"+
                ", it covered by " + _skin +
                ", its _age is " + _age +".";
    }
}
