package nevelev.dima;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: DimaN
 * Date: 24/11/14
 * Time: 00:29
 * To change this template use File | Settings | File Templates.
 */
public class ConwayCellMatrix {

    static final int MATRIX_RIB_SIZE=10;
    private ConwayCell _matrix[][];

    /**
     * Crates instance of ConwayCellMatrix which represents matrix of Conway cells
     */
    public ConwayCellMatrix() {
        this._matrix = new ConwayCell[MATRIX_RIB_SIZE][MATRIX_RIB_SIZE];
        generateCells();
    }

    /**
     * Changes the state of random cells random number of times
     */
    public void generateRandomLife(){
        int numberOfIterations = createRandomNumber(MATRIX_RIB_SIZE * (MATRIX_RIB_SIZE/2),
                MATRIX_RIB_SIZE * MATRIX_RIB_SIZE);
        for (int i=0; i<=numberOfIterations; i++){
            int x = createRandomNumber(0, MATRIX_RIB_SIZE-1);
            int y = createRandomNumber(0, MATRIX_RIB_SIZE-1);
            this._matrix[x][y].changeState();
        }
    }

    /**
     * Returns the number of cells in each line and column of the matrix
     * @return int
     */
    public int getMatrixRibSize() {
        return MATRIX_RIB_SIZE;
    }

    /**
     * Return true if cell is alive
     * @param x the x coordinate of the matrix
     * @param y the x coordinate of the matrix
     * @return true if cell is alive
     */
    public boolean isLivingCell(int x, int y){
        return isValid(x) && isValid(y) && (_matrix[x][y].getCellState() == ConwayCell.State.ALIVE);
    }

    /**
     * Creates next generation by all cells neighbors and changes their state considering the new neighbors number
     */
    public void createNextGeneration(){
        calculateCurrentLiveNeighbors();
        calculateCurrentGenerationLifeState();
    }

    /**
     * Changes all cell state considering the neighbors number
     */
    private void calculateCurrentGenerationLifeState(){
        for (int i=0; i<MATRIX_RIB_SIZE; i++){
            for(int j=0; j<MATRIX_RIB_SIZE; j++){
                this._matrix[i][j].calculateNewState();
            }
        }        
    }
    
    /**
     * This method 'walks' on the _matrix cells and updates the neighbors about every living sell.
     */
    private void calculateCurrentLiveNeighbors(){
        for (int i=0; i<MATRIX_RIB_SIZE; i++){
            for(int j=0; j<MATRIX_RIB_SIZE; j++){
                this.updateCurrentLiveNeighborsNumber(i, j);
            }
        }
    }

    /**
     * This method updates all the neighbors of the cell [i][j] in case of live cell
     */
    private void updateCurrentLiveNeighborsNumber(int i, int j){
        if (this._matrix[i][j].getCellState() == ConwayCell.State.ALIVE){
            for(int k=-1; k<=1; k++){
                for (int l=-1; l<=1; l++){
                    if(!(k==0 && l==0)){           //for preventing the cell adding itself as a live neighbor
                        this.addLiveNeighbor(i+k,j+l);
                    }
                }
            }
        }
    }

    /**
     * Adds one neighbor to the _matrix at place x,y
     * @param x the column number
     * @param y the row number
     */
    private void addLiveNeighbor(int x, int y) {
        if(isValid(x) && isValid(y)){
            this._matrix[x][y].addLivingNeighbor();
        }
    }

    /**
     * validating the existence of the value in the _matrix
     * @param i
     * @return true if the value part of the _matrix
     */
    private boolean isValid(int i) {
        return (i>=0 && i<MATRIX_RIB_SIZE);
    }

    /**
     * Creates random int number between min and max params
     * @param min the minimal number value
     * @param max the maximal number value
     * @return random int number between min and max params
     */
    private int createRandomNumber(int min, int max){
        Random random = new Random();
        int randomNum = random.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    /**
     * initialize the _matrix by dead cells
     */
    private void generateCells(){
        for (int i=0; i<MATRIX_RIB_SIZE; i++){
            for(int j=0; j<MATRIX_RIB_SIZE; j++){
                _matrix[i][j] = new ConwayCell();
            }
        }
    }
}
