import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Sources used: Starting Out With Java From Control Structures Through Data
 * Structures 3RD Edition, Dereck Banas Youtube Channel Swing videos
 * This class Creates the buttons, Graphical interfaces, and checks for the winners which
 * is either "X" or "Y".
 * CS 3331
 * 
 * @since 1-30-2017
 */
public class TicTacToe extends JFrame implements ActionListener 
{
  private final int width=300;
  private final int height=300;
  private JButton [] button;
  private JPanel p; 
  private String player="X";
  private static int count=0;
  private Player user; 
  /**
   * The constructor sets up the GUI. 
   */
  public TicTacToe()
  {
	this.setSize(width,height);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("tic tac toe ");
	
	button = new JButton[9];
	p = new JPanel();
	p.setLayout(new GridLayout(3,3));
	user = new Player();
	button();

	this.setVisible(true);
  }
  /**
   *button() initalizes the buttons and adds listeners,buttons, and panel
   */
  public void button()
  {
	for(int i =0; i <button.length; i++)
	{
		button[i] = new JButton("");
		p.add(button[i]);
		button[i].addActionListener(this);
	}
	add(p);
  }
  /**
   * When a button gets clicked an "x" or "o" gets placed
   * in a button, and the button get disabled. This methode activates
   * the check win method if the check win method is true then the game 
   * is over and resets all the buttons.
   * @param e when a button gets clicked
   *
   */
  public void actionPerformed(ActionEvent e)
  {
	player= user.change(player);
	if(e.getSource() == button[0])
	{
		button[0].setText(player);
		button[0].setEnabled(false);
		count++;
	}
	else if(e.getSource() == button[1])
	{
		button[1].setText(player);
		button[1].setEnabled(false);
		count++;
	}
	else if(e.getSource() == button[2])
	{
		button[2].setText(player);
		button[2].setEnabled(false);
		count++;
	}
	else if(e.getSource() ==button[3])
	{
	  button[3].setText(player);
	  button[3].setEnabled(false);
	  count++;
	}
	else if(e.getSource() == button[4])
	{
	  button[4].setText(player);
	  button[4].setEnabled(false);
	  count++;
	}
	else if(e.getSource() == button[5])
	{
	  button[5].setText(player);
	  button[5].setEnabled(false);
	  count++;
	}
	else if(e.getSource() == button[6])
	{
		button[6].setText(player);
		button[6].setEnabled(false);
		count++;
	}
	else if(e.getSource() == button[7])
	{
		button[7].setText(player);
		button[7].setEnabled(false);
		count++;
	}
	else if(e.getSource() == button[8])
	{
	  button[8].setText(player);
	  button[8].setEnabled(false);
	  count++;
	}


	
	if(check() == 1)
	{
	  JOptionPane.showMessageDialog(null," "+ player + " is the winner");
	  restart();
	}

	if(count == 9)
	{
	  restart();
	  count=0;
	}

  }
  /**
   * This method checks for the ways to win: Horizonally, vertically, and
   * diagonally.
   * @return win, This returns an integer 1 for true and -1 for false.
   */
  public int check()
  {
	// Horizonal/////////////////////////////////////////////////////
	int win=-1;
	if(button[0].getText().equals(button[1].getText()) && button[1].getText().equals(button[2].getText()) && !button[0].getText().equals(""))
	{
	  win=1;
	  count=0;
	  return win;
	}
	else if(button[3].getText().equals(button[4].getText()) && button[4].getText().equals(button[5].getText()) && !button[3].getText().equals(""))
	{
		win=1;
		count=0;
		return win;
	}
	else if(button[6].getText().equals(button[7].getText()) && button[7].getText().equals(button[8].getText()) && !button[6].getText().equals(""))
	{
	  win=1;
	  count=0;
	  return win;
	}
	//Vertical//////////////////////////////////////////////////////
	else if(button[0].getText().equals(button[3].getText()) && button[3].getText().equals(button[6].getText()) && !button[0].getText().equals(""))
	{
	  win=1;
	  count=0;
	  return win;
	}
	else if(button[1].getText().equals(button[4].getText()) && button[4].getText().equals(button[7].getText()) && !button[1].getText().equals(""))
	{
	  win=1;
	  count=0;
	  return win;
	}
	else if(button[2].getText().equals(button[5].getText()) && button[5].getText().equals(button[8].getText()) && !button[2].getText().equals(""))
	{
	  win=1;
	  count=0;
	  return win;
	}
	//diagonal////////////////////////////////////////////////////
	else if(button[0].getText().equals(button[4].getText()) && button[4].getText().equals(button[8].getText()) && !button[0].getText().equals(""))
	{
	  win=1;
	  count=0;
	  return win;
	}
	else if(button[2].getText().equals(button[4].getText()) && button[4].getText().equals(button[6].getText()) && !button[2].getText().equals(""))
	{
	  win=1;
	  count=0;
	  return win;
	}

  else
	return win;
  }
  /**
   * This method enables the buttons and sets all the buttons to null.
   * This is called when count is equal to 9 or if the check method equals
   * to true.  
   *
   */
  public void restart()
  {
	for(int i =0; i < button.length; i++)
	{
		button[i].setEnabled(true);
		button[i].setText("");
	}
  }
	
  public static void main(String[] args)
  {
	new TicTacToe();
  }

}

