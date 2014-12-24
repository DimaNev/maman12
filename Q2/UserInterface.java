package nevelev.dima;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: DimaN
 * Date: 25/11/14
 * Time: 23:29
 * To change this template use File | Settings | File Templates.
 */
public class UserInterface extends JFrame implements ActionListener{

    private int _frameWidth = 507;
    private int _frameHeight = 583;
    private int _buttonWidth = 200;
    private int _buttonHeight = 50;
    private JButton _button;
    private MatrixPanel _matrixPanel;


    /**
     * Calls JFrame contractor and sets its variables
     */
    public UserInterface() {
        super("Life Game - by Dima Nevelev");
        this.setSize(_frameWidth, _frameHeight);
        this.setResizable(false);
        this._matrixPanel =new MatrixPanel();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.addButton("Give Life");
        this.add(_matrixPanel);
        this.setVisible(true);

    }

    /**
     * Creates a button and adds it to the JFrame
     * @param buttonName String to set as button name and show on the button
     */
    private void addButton(String buttonName){
        _button = new JButton(buttonName);
        _button.setActionCommand(buttonName);
        _button.addActionListener(this);
        _button.setLocation(((_frameWidth - _buttonWidth) / 2), _frameHeight - _buttonHeight - 30);
        _button.setSize(_buttonWidth, _buttonHeight);
        this.add(_button);
    }

    /**
     * Button action listener,
     * if the button has the command "Give Life" it will call generateRandomLife() on the _matrixPanel
     * and change its command and text to "Create Next Generation",
     * else it will call createNextGeneration() on the _matrixPanel
     * @param event the event to listen to
     */
    public void actionPerformed(ActionEvent event) {
        if(_button.getActionCommand().equals("Give Life")){
            _button.setText("Create Next Generation");
            _button.setName("Create Next Generation");
            _button.setActionCommand("Create Next Generation");
            _matrixPanel.generateRandomLife();
        }else {
            _matrixPanel.createNextGeneration();
        }
    }
}