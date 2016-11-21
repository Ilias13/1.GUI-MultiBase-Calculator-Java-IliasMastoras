import java.awt.event.*;
import java.util.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;


/**
 * A class with a multi-base calculator function.
 * Implements ActionListener and provides arithmetical computations
 * from base 2 to base 16.
 * 
 * @author Ilias Mastoras
 *
 */

public class CalcAction implements ActionListener{
 private MyPanel panel;
 private String number ="0", operand = null, totalText="", historyText = "";
 private ArrayList<String> myNumbers = new ArrayList <String>(); // holds numbers and operands pressed
 private ArrayList<String> compHistory = new  ArrayList <String>(); // holds the computation "history"
 int pass = 0; 
 boolean operandPressed = true, numPressed = false, cont = false;
   /**
    * CalcAction constructor.
    * Constructs a new multi-base calculator.
    * Adds functionality to JButtons that MyPanel provided.
    */
	public CalcAction(){
		panel = new MyPanel();
		panel.one.addActionListener(this); panel.two.addActionListener(this);panel.three.addActionListener(this);
		panel.four.addActionListener(this);panel.five.addActionListener(this);panel.six.addActionListener(this);
		panel.seven.addActionListener(this);panel.eight.addActionListener(this);panel.nine.addActionListener(this);
		panel.zero.addActionListener(this);panel.alpha.addActionListener(this);panel.beta.addActionListener(this);
		panel.gama.addActionListener(this);panel.delta.addActionListener(this);panel.epsilon.addActionListener(this);
		panel.ef.addActionListener(this);panel.plus.addActionListener(this);panel.minus.addActionListener(this);
		panel.multiply.addActionListener(this);panel.divide.addActionListener(this);panel.equal.addActionListener(this);
		panel.clear.addActionListener(this);panel.history.addActionListener(this);
	   		
	}
   /**
    * Accessor for this panel.
    * @return panel
    */
   public MyPanel getPanel(){
	   return panel;
   }
	
 	
   /**
    * actionPerformed override method.
    * The construction and representation of the math expression. 
    */
	@Override
  public void actionPerformed(ActionEvent e) {
	 	JButton source = (JButton) e.getSource(); 
	 	/* After an evaluation, check if the user wants to continue
	 	 * the computations with the previous result. If an operand is pressed,
	 	 * continue with the previous result as the first number.
	 	 */
	 	if( pass == 1){
	 	   if(source.equals(panel.plus) || source.equals(panel.minus) || source.equals(panel.multiply) || source.equals(panel.divide)){
	 	      pass = 0;
	 	       if(source.equals(panel.plus)){
	 		     operand="+";
	 		     totalText += "+";
			   }
			   if(source.equals(panel.minus)){
		 		     operand="-";
		 		     totalText += "-";
			   }
			   if(source.equals(panel.multiply)){
		 		     operand="*";
		 		     totalText += "*";
			   }  
			   if(source.equals(panel.divide)){
		 		     operand="/";
		 		     totalText += "/";
			  }  
		 	 panel.text.setText(totalText);
		     myNumbers.add(operand); 
	 	   }else {
	 	    totalText = "";
	 	    pass = 0;
	 	    myNumbers.remove(myNumbers.get(0));
	 	 }
	   }//end of if( pass == 1)
	 	 
	 	   if( (panel.changed) || ( source.equals(panel.clear) ) ){ 
	 		 // everytime the slider is moved, or the clear button is pressed
	 		 // set everything to its initial value.  
	 		 totalText = "";  
		 	 panel.text.setText(totalText);
		 	 number = "0";
		 	 operand = "";
		 	 myNumbers.clear();
		 	 panel.changed = false;
		 	 operandPressed = true;
		 	 numPressed = false;
		 	}
         
	 	   /*The number variable holds the numbers.
	 	    * Every time a number is pressed, check if
	 	    * the number variable is 0. If yes, my number
	 	    * is the value pressed, otherwise, concatinate
	 	    * the pressed value to the existing number.
	 	    * totalText is a String represantation of the numbers pressed.
	 	    */
	 	   if(source.equals(panel.one)){
	 		   totalText += "1";
		 		  if(number == "0"){
		 		   number = "1";
		 	      }else {
		 		   number += "1";
		 	      }	 
		 	   panel.text.setText(totalText); 
		 	   operandPressed = false; // the operand hasn't been pressed yet 
		       numPressed = true;//  a number is pressed
		   } 
	 	   if(source.equals(panel.two)){
	 		   totalText += "2";
		 		  if(number == "0"){
		 		   number = "2";
		 	      }else {
		 		   number += "2";
		 	      }
		 	   panel.text.setText(totalText);
		 	   operandPressed = false;
		       numPressed = true;
	 	   }    
		   if(source.equals(panel.three)){
	 		   totalText += "3"; 
		 		  if(number == "0"){
		 		   number = "3";
		 	      }else {
		 		   number += "3";
		 	      }
		       panel.text.setText(totalText);
		       operandPressed = false;
	           numPressed = true;
	 	   }    
		   if(source.equals(panel.four)){
	 		   totalText += "4";
	 		      if(number == "0"){
		 		   number = "4";
		 	      }else {
		 		   number += "4";
		 	      }
		 	   panel.text.setText(totalText);
		 	   operandPressed = false;
	           numPressed = true;
	 	   }
	 	   if(source.equals(panel.five)){
	 		   totalText += "5";
		 		  if(number == "0"){
		 		   number = "5";
		 	      }else {
		 		   number += "5";
		 	    }
		       panel.text.setText(totalText);
		       operandPressed = false;
	           numPressed = true;
	 	   }   
	       if(source.equals(panel.six)){
	 	       totalText += "6";
		 		  if(number == "0"){
		 		   number = "6";
		 	      }else {
		 		   number += "6";
		 	      }
		       panel.text.setText(totalText);
		       operandPressed = false;
	           numPressed = true;
	 	   }   
	 	   if(source.equals(panel.seven)){
	 		   totalText += "7";
		 	      if(number == "0"){
		 		   number = "7";
		 	      }else {
		 		   number += "7";
		 	      }
		       panel.text.setText(totalText);
		       operandPressed = false;
	           numPressed = true;
	 	   }   
	       if(source.equals(panel.eight)){
	 		   totalText += "8";
	 		      if(number == "0"){
		 		    number = "8";
		 	      }else {
		 		    number += "8";
		 	      }
		       panel.text.setText(totalText);
		       operandPressed = false;
	           numPressed = true;
	       }   
	       if(source.equals(panel.nine)){
	 		   totalText += "9";
		 	      if(number == "0"){
		 		    number = "9";
		 	      }else {
		 		    number += "9";
		 	      }
		       panel.text.setText(totalText);
		       operandPressed = false;
	           numPressed = true;
	       }   
	       if(source.equals(panel.zero)){
		 	   if(number != "0"){
		         number += "0";
		         totalText += "0";
		         panel.text.setText(totalText);
		         operandPressed = false;
		         numPressed = true;
		 	   } 
	       }
	 	   if(source.equals(panel.alpha)){
	 		   totalText += "A";
	 		      if(number == "0"){
	 		       number = "A";
	 	          }else {
	 		       number += "A";
	 	          }
	 		   panel.text.setText(totalText);
	 		   operandPressed = false;
	           numPressed = true;
	       }   
           if(source.equals(panel.beta)){
	 		   totalText += "B";
	 		     if(number == "0"){
	 		       number = "B";
	 	         }else {
	 		       number += "B";
	 	         }
	 		  panel.text.setText(totalText);
	 		  operandPressed = false;
	          numPressed = true;
	      }   
          if(source.equals(panel.gama)){
	 		  totalText += "C";
	 		    if(number == "0"){
	 		      number = "C";
	 	        }else {
	 		      number += "C";
	 	        }
	 		  panel.text.setText(totalText);
	 		  operandPressed = false;
	          numPressed = true;
	      }   	  
          if(source.equals(panel.delta)){
	 	     totalText += "D";
	 		    if(number == "0"){
	 		     number = "D";
	 	        }else {
	 		     number += "D";
	 	        }
	 	    panel.text.setText(totalText);
	 	    operandPressed = false;
	        numPressed = true;
	     }   	  
         if(source.equals(panel.epsilon)){
	 	    totalText += "E";
	 		   if(number == "0"){
	 		     number = "E";
	 	       }else {
	 		     number += "E";
	 	       }
	 	   panel.text.setText(totalText);
	 	   operandPressed = false;
	       numPressed = true;
	     }   	  
         if(source.equals(panel.ef)){
	 	   totalText += "F";
	 		  if(number == "0"){
	 		    number = "F";
	 	      }else {
	 		    number += "F";
	 	      }
	 	   panel.text.setText(totalText);	
	 	   operandPressed = false;
	       numPressed = true;  
     	 }
	 	/* If the source is not a number, it must be an operand.
	 	 * The first if statement checks if an operand is pressed
	 	 * before a number is entered. If a number has been pressed,
	 	 * we proceed by checking the operand's type.
	 	 */
        if((operandPressed == false) && (numPressed == true)){
	 	   if(source.equals(panel.plus)){
	 	    totalText += "+";
		    operand="+";
		    panel.text.setText(totalText);
		    
           /* we add the previously pressed number
		    * and the operand, to the ArrayList and we set them
		    * to their initial value.
		    */
		    myNumbers.add(number);
		    myNumbers.add(operand);
		    number = "0";
		    operand = "";
		    operandPressed = true; 
	        numPressed = false;
	 	 }   
	 	 if(source.equals(panel.minus)){
	 	   totalText += "-";
		   operand = "-";
		   panel.text.setText(totalText);
		     
		   myNumbers.add(number);
		   myNumbers.add(operand);
		   number = "0";
		   operand = "";
		   operandPressed = true;
	       numPressed = false;  
	 	 }   
	 	 if(source.equals(panel.multiply)){
	 	   totalText += "*";
		   operand = "*";
		   panel.text.setText(totalText);
		   
		   myNumbers.add(number);
		   myNumbers.add(operand);
		   number = "0";
		   operand = "";
		   operandPressed = true;
		   numPressed = false;
	 	 }   
	 	 if(source.equals(panel.divide)){
	 	   totalText += "/";
		   operand = "/";
		   panel.text.setText(totalText);
		   
		   myNumbers.add(number);
		   myNumbers.add(operand);
		   number = "0";
		   operand = "";
		   operandPressed = true;
		   numPressed = false;     
	 	 } 
	 	
	   }// end of if operand pressed
	 	
	 	 /*
	 	  * If the source is equal, first we check if there
	 	  * are at least 2 numbers and an operand in myNumbers.
	 	  * If yes, then it checks if the String is longer than 
	 	  * 16 characters. If it is, an error JFrame appears.
	 	  * Otherwise, do the computation.
	 	  */
	   if(source.equals(panel.equal)){
	 	 if((numPressed == true) && myNumbers.size()>1){
	 		if(totalText.length()>16){
	           JFrame f = new JFrame("Error");
	           JLabel l = new JLabel("USE SMALLER NUMBERS");
	           l.setHorizontalAlignment(JTextField.CENTER);
	            
	           f.setSize(300, 150);
	           f.add(l);
	           f.setLocationRelativeTo(null);
	           f.setResizable(false);
	           f.setVisible(true);
	     
	           totalText = "";
			   panel.text.setText(totalText);
			   number = "0";
			   operand = "";
			   myNumbers.clear();
			   operandPressed = true;
		       numPressed = false;
	         }else {   
	           operand = "=";
			   myNumbers.add(number);
			   myNumbers.add(operand);
		       number = "0";
		       operand = "";
		     
		       //stores the math expression to history
		       for(String i : myNumbers){
		    	 historyText += i;
		       }
	 		   //send the arraylist that holds the expression
		       //to the doComputations method
		       String result = doComputations(myNumbers);
		      
		       // add the result and the base to history text
		       historyText +=  result +"   Base " +panel.slider.getValue();
		       panel.text.setText(result);
		      
		       // maintain the result on the text in case the user wants to continue
		       // the calculation. Pass wiil check if the calculation is continued. 
		       totalText = result;
		       pass = 1;
		       myNumbers.clear(); // empty the list
		       myNumbers.add(result); 
		       operandPressed = true;
			   numPressed = false;
			   
		       if(compHistory.size() == 10){
		    	  compHistory.remove(0);
		       }
		         compHistory.add(historyText);
		         historyText = "";
		     }// end of else 
	       }
	 	}// end of source.equals(panel.equal);
	 		
	    // if history button is pressed , a history frame appears.
	 	if(source.equals(panel.history)){
	 	   String s = "" ;
	 	   panel.textArea.removeAll();
	 		 for(int i = 0; i < compHistory.size(); i++){
	 			s += compHistory.get(i);
	 			s += "\n";
	 		 }
	 	   panel.textArea.setText(s);
	 	   panel.historyFrame.setLocationRelativeTo(null);
	 	   panel.historyFrame.setVisible(true);
	 	}		
	 			
	 }// end of actionPerformed
 
	/**
	 * Evaluates a String that holds a mathematical expression.
	 * @param myNumbers The ArrayList that holds the numbers and the operands
	 * @return A String represantation of the result.
	 */
	 public String doComputations(ArrayList<String> myNumbers) {
		   String input = ""; 
		   String result="";
		   Object x = new Object();
		   int total=0 ;
		   
		   for (int i=0; i< myNumbers.size()-1; i++){   
			  String a = myNumbers.get(i);
			   /* if a is not an operand, convert the String number to its int representation at the 
			    * specified base. Then convert that int to its String representation and replace it in the
			    * Arraylist.
			   */
			    if(!a.equals("+") && !a.equals("-") && !a.equals("/") && !a.equals("*")  ){
			        myNumbers.set(i, Integer.toString( Integer.parseInt( myNumbers.get(i),panel.slider.getValue() )));
			    }  
			  input += myNumbers.get(i); // creates one String with the whole expression
		   }
		  
		   ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");
		 
		   //try to evaluate the expression
		   try {
	         x = engine.eval(input);
	     
	           if(x instanceof Double){ // if the result is double make it int.
	              double y = (double) x;
	        	  total = (int)y;		
	           } else {
	        	  total = (int) x;
	           }
		   } catch (ScriptException e) {
	         e.printStackTrace();
	       }
        // convert the result to the specified base. 
		result  = Integer.toString(total,panel.slider.getValue()); 
		return result.toUpperCase();
	 }
}

	

  
	

