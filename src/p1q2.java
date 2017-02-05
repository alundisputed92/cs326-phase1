import java.util.*;
import Utilities.Error;
import OperandStack.*;
import Value.*;
public class p1q2 {
  public static void main(String argv[]) {

      // This is a small example of how to use the stack
      
      OperandStack operandStack = new OperandStack(100, "OperandStack Test");

	 // if we have an expression line 54 + 32 we can translate that into postfix 
      // like this: 54 32 +
      // so it becomes: push(54), push (32), pop() twice and add and push the result.
	operandStack.push(new IntegerValue(54));
    operandStack.push(new IntegerValue(32));
	
	//declaring variables of type Value to recieved popped stack values
	Value v1, v2;
	
	v2 = operandStack.pop();
    v1 = operandStack.pop();
	
	   // Note, since the stack holds 'Value' values we have to cast the 
      // values popped to the right kind.
    IntegerValue v3, v4;
    v4 = (IntegerValue)v2;
	v3 = (IntegerValue)v1;
	
	
	
  operandStack.push(new IntegerValue(v4.getValue() + v3.getValue())); //==> 86
        System.out.println("peeking: " +operandStack.peek(1)); //==> Hello


	
  }

}
