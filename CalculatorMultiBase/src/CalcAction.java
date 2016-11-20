import java.awt.Font;
import java.awt.event.*;
import java.util.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;




public class CalcAction implements ActionListener{
 private MyPanel panel;
 private String number ="0", operand = null, totalText="", historyText = "";
 private ArrayList<String> myNumbers = new ArrayList <String>();
 private ArrayList<String> compHistory = new  ArrayList <String>();
 
 boolean operandPressed = true, numPressed = false;
 
	public CalcAction(){
		
		panel = new MyPanel();
		panel.one.addActionListener(this);
		panel.two.addActionListener(this);
		panel.three.addActionListener(this);
		panel.four.addActionListener(this);
		panel.five.addActionListener(this);
		panel.six.addActionListener(this);
		panel.seven.addActionListener(this);
		panel.eight.addActionListener(this);
		panel.nine.addActionListener(this);
		panel.zero.addActionListener(this);
		panel.alpha.addActionListener(this);
		panel.beta.addActionListener(this);
		panel.gama.addActionListener(this);
		panel.delta.addActionListener(this);
		panel.epsilon.addActionListener(this);
		panel.ef.addActionListener(this);
		panel.plus.addActionListener(this);
		panel.minus.addActionListener(this);
		panel.multiply.addActionListener(this);
		panel.divide.addActionListener(this);
		panel.equal.addActionListener(this);
		panel.clear.addActionListener(this);
		panel.history.addActionListener(this);
	   
			
	}

   public MyPanel getPanel(){
	   return panel;
   }
	
 	
	@Override
	public void actionPerformed(ActionEvent e) {
	 	JButton source = (JButton) e.getSource();
	 	 if(panel.changed){
	 		   totalText = "";
		 	   panel.text.setText(totalText);
		 	   number = "0";
		 	   operand = "";
		 	   myNumbers.clear();
		 	   panel.changed = false;
		 	   operandPressed = true;
		 	   numPressed = false;
	 	 }
         

	 	if(source.equals(panel.clear)){
	 	   totalText = "";
	 	   panel.text.setText(totalText);
	 	   number = "0";
	 	   operand = "";
	 	   myNumbers.clear();
	 	   operandPressed = true;
	 	   numPressed = false;
	 	}
	 	
	 	  if(source.equals(panel.one)){
	 		  totalText += "1";
		 		  if(number == "0"){
		 		   number = "1";
		 	      }else {
		 		   number += "1";
		 	      }	 
		 		 panel.text.setText(totalText);
		 		operandPressed = false;
		         numPressed = true;
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
	 		operandPressed = false;
	         numPressed = true;
         
         panel.text.setText(totalText);	
	 	  
     	}
	 	 if((operandPressed == false) && (numPressed == true)){
	 	  if(source.equals(panel.plus)){
	 	    totalText += "+";
		    operand="+";
		    panel.text.setText(totalText);
		     
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
	 	
	 	 }
	 	
	 	if(source.equals(panel.equal)){
	       if(totalText.length() > 2){
	 		 if(totalText.length()>16){
	           panel.text.setFont(new Font("Arial",Font.BOLD,14));
	           panel.add(new JTextField(16));
	           
	           JFrame f = new JFrame("Error");
	           JLabel l = new JLabel("USE SMALLER NUMBERS");
	           l.setHorizontalAlignment(JTextField.CENTER);
	            
	           f.setSize(300, 150);
	           f.add(l); 
	           f.setResizable(false);
	           f.setVisible(true);
	     
	           totalText = "";
			   panel.text.setText(totalText);
			   number = "0";
			   operand = "";
			   myNumbers.clear();
			   operandPressed = true;
		       numPressed = false;
	         } else {
	            operand = "=";
		     
		        myNumbers.add(number);
		        myNumbers.add(operand);
		        number = "0";
		        operand = "";
		       
		     
		       for(String i : myNumbers){
		    	  historyText += i;
		       }
	 		
		       String result = doComputations(myNumbers);
		      
		       historyText +=  result +"   Base " +panel.slider.getValue();
		       panel.text.setText(result);
		     
		       totalText = "";
		       myNumbers.clear();
		        
		        
		        operandPressed = true;
			    numPressed = false;
		       if(compHistory.size() == 10){
		    	 compHistory.remove(0);
		       }
		       compHistory.add(historyText);
		       historyText = "";
	    }
	       }
	 	}
	 		
	 	if(source.equals(panel.history)){
	 		 String s = "" ;
	 		 panel.textArea.removeAll();
	 		 for(int i = 0; i < compHistory.size(); i++){
	 			s += compHistory.get(i);
	 			s += "\n";
	 		 }
	 		 panel.textArea.setText(s);
	 		 panel.historyFrame.setVisible(true);
	 	}		
	 		
	 		
		
	 		
	 		
	 }// end of operandPressed

	public String doComputations(ArrayList<String> myNumbers) {
		   String input = ""; 
		   String result="";
		   Object x = new Object();
		   int total=0 ;
		   
		   for (int i=0; i< myNumbers.size()-1; i++){
			    String a = myNumbers.get(i);
			    if(!a.equals("+") && !a.equals("-") && !a.equals("/") && !a.equals("*")  ){
			        myNumbers.set(  i, Integer.toString( Integer.parseInt( myNumbers.get(i),panel.slider.getValue() )));
			     
			    }  
			    
		    input += myNumbers.get(i);
		    
		   }
		  
		   ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");
		 
		   try {
	         x = engine.eval(input);
	     
	           if(x instanceof Double){
	              double y = (double) x;
	        	  total = (int)y;		
	           } else {
	        	  total = (int) x;
	           }
		   } catch (ScriptException e) {
	         e.printStackTrace();
	       }
		   

		   
		   result  = Integer.toString(total,panel.slider.getValue());
		  

		return result.toUpperCase();
	}

	
		
	}

	

  
	

