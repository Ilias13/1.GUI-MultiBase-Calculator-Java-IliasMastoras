import java.awt.BorderLayout;
import javax.swing.*;



public class MainCalculatorMultiBase {
    public static void main(String [] args){
    	CalcAction calc = new CalcAction();
    	
		JFrame frame = new JFrame("MultiBase Calculator");
    	frame.setLayout(new BorderLayout());
    	frame.setSize(400, 450);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
    	frame.add(calc.getPanel(),BorderLayout.CENTER);
    	
    	frame.setResizable(false);
    	frame.setVisible(true);
    	
    }
}
