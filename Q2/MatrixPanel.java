package nevelev.dima;


import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: DimaN
 * Date: 26/11/14
 * Time: 23:56
 * To change this template use File | Settings | File Templates.
 */
public class MatrixPanel extends JPanel {


    private ConwayCellMatrix _conwayCellMatrix;
    private int _cellSize=50;
    private Color _lineColor=Color.BLACK;
    private Color _liveCellColor=Color.green;
    private Color _deadCellColor=Color.WHITE;

    /**
     * Draws a panel which represents the matrix
     */
    public MatrixPanel() {
        super();
        this._conwayCellMatrix=new ConwayCellMatrix();
    }

    /**
     * Calls the UI delegate's paint method and draws all lines and cells of the matrix.
     *
     */
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        for(int i=0;i<_conwayCellMatrix.getMatrixRibSize();i++){
            for (int j=0; j<_conwayCellMatrix.getMatrixRibSize();j++)
                paintCell(i, j, g);
        }
        paintLines(g);
    }

    /**
     * Creates random life in the matrix by calling generateRandomLife() on _conwayCellMatrix and repaints the matrix
     */
    public void generateRandomLife(){
        this._conwayCellMatrix.generateRandomLife();
        this.revalidate();
        this.repaint();
    }

    /**
     * Creates next life generation in the matrix by calling createNextGeneration() on _conwayCellMatrix
     * and repaints the matrix
     */
    public void createNextGeneration(){
        this._conwayCellMatrix.createNextGeneration();
        this.revalidate();
        this.repaint();
    }

    /**
     * Draws a single cell on the panel considering his state and his location in the matrix
     *
     */
    private void paintCell(int x, int y, Graphics g){
        if(_conwayCellMatrix.isLivingCell(x, y)){
            g.setColor(_liveCellColor);
            g.fillRect( x * _cellSize, y * _cellSize, _cellSize, _cellSize);
        }else{
            g.setColor(_deadCellColor);
            g.fillRect(x * _cellSize, y * _cellSize, _cellSize, _cellSize);
        }
    }

    /**
     * Draws the matrix lines
     *
     */
    private  void paintLines(Graphics g){
        int matrixLength=_conwayCellMatrix.getMatrixRibSize();

        for(int i=0; i<=_conwayCellMatrix.getMatrixRibSize(); i++){
            g.setColor(_lineColor);
            g.drawLine(0, i*_cellSize, matrixLength*_cellSize, i*_cellSize);
            g.drawLine(i*_cellSize, 0, i*_cellSize, matrixLength*_cellSize);
            g.drawLine(0, i*_cellSize-1, matrixLength*_cellSize, i*_cellSize-1);
            g.drawLine(i*_cellSize-1, 0, i*_cellSize-1, matrixLength*_cellSize);
        }
    }
}
