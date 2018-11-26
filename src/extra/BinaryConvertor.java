package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConvertor implements ActionListener{
	public static void main(String[] args) {
		new BinaryConvertor().createUI();
		
		
	}
static JFrame frame = new JFrame();
static JPanel panel = new JPanel();
static JTextField textField = new JTextField(20);
static JLabel label = new JLabel();
static JButton button = new JButton();

void createUI() {
	frame.add(panel);
	frame.setVisible(true);
	frame.setSize(500, 200);
	
	panel.add(button);
	panel.add(textField);
	button.addActionListener(this);
	button.setText("Convert");
	
	
	
}
String convert(String input) {
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	textField.setText(convert(textField.getText()));
}
}
