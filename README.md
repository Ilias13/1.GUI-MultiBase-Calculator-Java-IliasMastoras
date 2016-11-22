# Project Zero

A Swing project for CISC 3120, Fall 2016. See the [instructions](http://bc-cisc3120-f16.github.io/project1).

## Works Cited


The following code evaluates a String expression a returns the arithmetic result. I found this in a forum, https://coderanch.com/t/427393/java/Convert-String-expression, and i used it in doComputations method.


 ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");

 try { 
          x = engine.eval(input);
     } catch (ScriptException e) {
          e.printStackTrace();   
     }  
	  
     
     
     
     
