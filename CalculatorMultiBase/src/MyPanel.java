import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyPanel extends JPanel implements ChangeListener{

	public JButton  one,two,three,four,five,
	                six,seven,eight,nine,zero,
	                alpha,beta,gama,delta,epsilon,
	                ef,plus,minus,multiply,divide,
	                clear,equal,history;
	
	public JSlider slider;
	public JTextField text;
	public JPanel basePanel,sNlPanel,numPanel,textLabelPanel;
	public JFrame historyFrame;
	public JLabel historyLabel;
	public JTextArea textArea;
	public int previousPos;
	public boolean changed;	
	
	public MyPanel(){
	
     		
		Font f = new Font("Arial",Font.BOLD,23);
		 text = new JTextField(16);
		 
		       
		       
		 
		 text.setFont(f);
		 text.setBackground(Color.white);
		// text.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		 text.setEditable(false); 
		 textLabelPanel = new JPanel();
		 history = new JButton("History");
		
		 textLabelPanel.add(history);
		 textLabelPanel.add(text);
		 
		 
		one = new JButton("1"); two = new JButton("2"); three = new JButton("3"); 
	    four = new JButton("4");five = new JButton("5");six = new JButton("6");
	    seven = new JButton("7"); eight = new JButton("8");nine = new JButton("9");
		zero = new JButton("0");alpha = new JButton("A");beta = new JButton("B");
	    gama = new JButton("C"); delta = new JButton("D"); epsilon = new JButton("E");
        ef = new JButton("F");plus = new JButton("+"); minus = new JButton("-"); 
		multiply = new JButton("x");divide = new JButton("/"); clear = new JButton("clr");
        equal = new JButton("="); 
        
        slider = new JSlider(JSlider.VERTICAL,2,16,16);
        slider.setMajorTickSpacing(1);
        slider.setLabelTable(slider.createStandardLabels(1));
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(this);
        
        //previousPos = slider.getValue();
        
        sNlPanel = new JPanel(new BorderLayout());
        sNlPanel.add(new JLabel("  BASE"),BorderLayout.NORTH);
        sNlPanel.add(slider,BorderLayout.WEST);
         
        numPanel = new JPanel(new GridLayout(6,4));
         
       numPanel.add(seven);   numPanel.add(eight);        numPanel.add(nine); 
       numPanel.add(divide);  numPanel.add(four);         numPanel.add(five); 
       numPanel.add(six);     numPanel.add(multiply);     numPanel.add(one);
       numPanel.add(two);     numPanel.add(three);        numPanel.add(plus);
       numPanel.add(clear);   numPanel.add(zero);         numPanel.add(equal);
       numPanel.add(minus);   numPanel.add(alpha);        numPanel.add(beta);
       numPanel.add(gama);    numPanel.add(new JLabel()); numPanel.add(delta);
       numPanel.add(epsilon); numPanel.add(ef);           numPanel.add(new JLabel());
         
        historyLabel = new JLabel();
	    historyLabel.setFont(f);
		historyLabel.setText("Last 10 Computations");
		historyLabel.setHorizontalAlignment(JTextField.CENTER);
		
		historyFrame = new JFrame("History");
		historyFrame.setLayout(new BorderLayout());
		historyFrame.add(historyLabel,BorderLayout.NORTH);
   	    historyFrame.setSize(300, 450);
   	    textArea = new JTextArea();
   	    textArea.setFont(f);
   	    textArea.setEditable(false);
   	    historyFrame.add(textArea, BorderLayout.CENTER);
   	    
         
         this.setLayout(new BorderLayout());
         this.add(sNlPanel,BorderLayout.WEST);
         this.add(textLabelPanel,BorderLayout.NORTH);
         this.add(numPanel,BorderLayout.CENTER);
      
	}


	
	@Override
	public void stateChanged(ChangeEvent e) {
		 changed = true;
		if(slider.getValue() == 2){ 
		    numPanel.removeAll();
			numPanel.add(plus); numPanel.add(clear);numPanel.add(zero);
			numPanel.add(equal);numPanel.add(minus);numPanel.add(one); 
			numPanel.add(multiply); numPanel.add(divide);
			numPanel.repaint();	
		}
		if(slider.getValue() == 3){
			numPanel.removeAll();
			numPanel.add(plus); numPanel.add(clear);numPanel.add(zero);
			numPanel.add(equal);numPanel.add(minus);numPanel.add(one); 
			numPanel.add(multiply); numPanel.add(divide);numPanel.add(two);
			numPanel.repaint();
		}
		if(slider.getValue() == 4){
			numPanel.removeAll();
			numPanel.add(plus); numPanel.add(clear);numPanel.add(zero);
			numPanel.add(equal);numPanel.add(minus);numPanel.add(one); 
			numPanel.add(multiply); numPanel.add(divide);numPanel.add(two);
			numPanel.add(three);
			numPanel.repaint();
		}
		if(slider.getValue() == 5){
			numPanel.removeAll();
			numPanel.add(plus); numPanel.add(clear);numPanel.add(zero);
			numPanel.add(equal);numPanel.add(minus);numPanel.add(one); 
			numPanel.add(multiply); numPanel.add(divide);numPanel.add(two);
			numPanel.add(three);numPanel.add(four);
			numPanel.repaint();
		}
		if(slider.getValue() == 6){
			numPanel.removeAll();
			numPanel.add(plus); numPanel.add(clear);numPanel.add(zero);
			numPanel.add(equal);numPanel.add(minus);numPanel.add(one); 
			numPanel.add(multiply); numPanel.add(divide);numPanel.add(two);
			numPanel.add(three);numPanel.add(four);numPanel.add(five);
			numPanel.repaint();
		}
		if(slider.getValue() == 7){
			numPanel.removeAll();
			numPanel.add(plus); numPanel.add(clear);numPanel.add(zero);
			numPanel.add(equal);numPanel.add(minus);numPanel.add(one); 
			numPanel.add(multiply); numPanel.add(divide);numPanel.add(two);
			numPanel.add(three);numPanel.add(four);numPanel.add(five);
			numPanel.add(six);
			numPanel.repaint();
		}
		if(slider.getValue() == 8){
			numPanel.removeAll();
			numPanel.add(plus); numPanel.add(clear);numPanel.add(zero);
			numPanel.add(equal);numPanel.add(minus);numPanel.add(one); 
			numPanel.add(multiply); numPanel.add(divide);numPanel.add(two);
			numPanel.add(three);numPanel.add(four);numPanel.add(five);
			numPanel.add(six);numPanel.add(seven);
			numPanel.repaint();
		}
		if(slider.getValue() == 9){
			numPanel.removeAll();
			numPanel.add(plus); numPanel.add(clear);numPanel.add(zero);
			numPanel.add(equal);numPanel.add(minus);numPanel.add(one); 
			numPanel.add(multiply); numPanel.add(divide);numPanel.add(two);
			numPanel.add(three);numPanel.add(four);numPanel.add(five);
			numPanel.add(six);numPanel.add(seven);numPanel.add(eight);
			numPanel.repaint();
		}
		if(slider.getValue() == 10){
			numPanel.removeAll();
			numPanel.add(plus); numPanel.add(clear);numPanel.add(zero);
			numPanel.add(equal);numPanel.add(minus);numPanel.add(one); 
			numPanel.add(multiply); numPanel.add(divide);numPanel.add(two);
			numPanel.add(three);numPanel.add(four);numPanel.add(five);
			numPanel.add(six);numPanel.add(seven);numPanel.add(eight);
			numPanel.add(nine);
			numPanel.repaint();
		}
		if(slider.getValue() == 11){
			numPanel.removeAll();
			numPanel.add(plus); numPanel.add(clear);numPanel.add(zero);
			numPanel.add(equal);numPanel.add(minus);numPanel.add(one); 
			numPanel.add(multiply); numPanel.add(divide);numPanel.add(two);
			numPanel.add(three);numPanel.add(four);numPanel.add(five);
			numPanel.add(six);numPanel.add(seven);numPanel.add(eight);
			numPanel.add(nine);numPanel.add(alpha);
			numPanel.repaint();
		}
		if(slider.getValue() == 12){
			numPanel.removeAll();
			numPanel.add(plus); numPanel.add(clear);numPanel.add(zero);
			numPanel.add(equal);numPanel.add(minus);numPanel.add(one); 
			numPanel.add(multiply); numPanel.add(divide);numPanel.add(two);
			numPanel.add(three);numPanel.add(four);numPanel.add(five);
			numPanel.add(six);numPanel.add(seven);numPanel.add(eight);
			numPanel.add(nine);numPanel.add(alpha);numPanel.add(beta);
			numPanel.repaint();
		}
		if(slider.getValue() == 13){
			numPanel.removeAll();
			numPanel.add(plus); numPanel.add(clear);numPanel.add(zero);
			numPanel.add(equal);numPanel.add(minus);numPanel.add(one); 
			numPanel.add(multiply); numPanel.add(divide);numPanel.add(two);
			numPanel.add(three);numPanel.add(four);numPanel.add(five);
			numPanel.add(six);numPanel.add(seven);numPanel.add(eight);
			numPanel.add(nine);numPanel.add(alpha);numPanel.add(beta);
			numPanel.add(gama);
			numPanel.repaint();
		}
		if(slider.getValue() == 14){
			numPanel.removeAll();
			numPanel.add(plus); numPanel.add(clear);numPanel.add(zero);
			numPanel.add(equal);numPanel.add(minus);numPanel.add(one); 
			numPanel.add(multiply); numPanel.add(divide);numPanel.add(two);
			numPanel.add(three);numPanel.add(four);numPanel.add(five);
			numPanel.add(six);numPanel.add(seven);numPanel.add(eight);
			numPanel.add(nine);numPanel.add(alpha);numPanel.add(beta);
			numPanel.add(gama);numPanel.add(delta);
			numPanel.repaint();
		}
		if(slider.getValue() == 15){
			numPanel.removeAll();
			numPanel.add(plus); numPanel.add(clear);numPanel.add(zero);
			numPanel.add(equal);numPanel.add(minus);numPanel.add(one); 
			numPanel.add(multiply); numPanel.add(divide);numPanel.add(two);
			numPanel.add(three);numPanel.add(four);numPanel.add(five);
			numPanel.add(six);numPanel.add(seven);numPanel.add(eight);
			numPanel.add(nine);numPanel.add(alpha);numPanel.add(beta);
			numPanel.add(gama);numPanel.add(delta);numPanel.add(epsilon);
			numPanel.repaint();
		}
		if(slider.getValue() == 16){
			numPanel.removeAll();
			numPanel.add(plus); numPanel.add(clear);numPanel.add(zero);
			numPanel.add(equal);numPanel.add(minus);numPanel.add(one); 
			numPanel.add(multiply); numPanel.add(divide);numPanel.add(two);
			numPanel.add(three);numPanel.add(four);numPanel.add(five);
			numPanel.add(six);numPanel.add(seven);numPanel.add(eight);
			numPanel.add(nine);numPanel.add(alpha);numPanel.add(beta);
			numPanel.add(gama);numPanel.add(delta);numPanel.add(epsilon);
			numPanel.add(ef);
			numPanel.repaint();
		}
	}


}
