package nevelev.dima;

/**
 * Created with IntelliJ IDEA.
 * User: DimaN
 * Date: 23/11/14
 * Time: 23:00
 * To change this template use File | Settings | File Templates.
 */
public class ConwayCell {

    private State _cellState;
    private int _numberOfLivingNeighbors;

    /**
     * Creates a Conway cell
     */
    public ConwayCell() {
        this._cellState = State.DEAD;
        this._numberOfLivingNeighbors = 0;
    }

    /**
     * Possible cell states
     */
    public enum State {
        ALIVE,DEAD
    }

    /**
     * Returns the cell state
     * @return State enum type
     */
    public State getCellState() {
        return this._cellState;
    }

    /**
     * Adds one neighbor to the _numberOfLivingNeighbors variable
     */
    public void addLivingNeighbor(){
        this._numberOfLivingNeighbors++;
    }

    /**
     * Changes the cell state considering the current _numberOfLivingNeighbors variable and then
     * resetting the _numberOfLivingNeighbors
     */
    public void calculateNewState(){
        if(this.isBirth()){
            this._cellState =State.ALIVE;
        }else if(isNeedToDie()){
            this._cellState =State.DEAD;
        }
        this.resetLivingNeighbors();
    }

    /**
     *Changes the cell state to dead if it was alive and vice versa
     */
    public void changeState(){
        if (this._cellState ==State.DEAD){
            this._cellState =State.ALIVE;
        }else if(this._cellState ==State.ALIVE){
            this._cellState =State.DEAD;
        }
    }

    /**
     * Calculates if this cell need to die considering his _numberOfLivingNeighbors
     * @return true if this sell need to die
     */
    private boolean isNeedToDie() {
        return this._cellState ==State.ALIVE && (this._numberOfLivingNeighbors <=1 || this._numberOfLivingNeighbors >=4);
    }

    /**
     * Calculates if this cell need to become alive considering his _numberOfLivingNeighbors
     * @return true if this sell need to become alive
     */
    private boolean isBirth() {
        return this._cellState ==State.DEAD && this._numberOfLivingNeighbors ==3;
    }

    /**
     * Sets _numberOfLivingNeighbors to zero
     */
    private void resetLivingNeighbors(){
        this._numberOfLivingNeighbors =0;
    }
}
