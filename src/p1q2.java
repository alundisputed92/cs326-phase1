import java.util.*;
import Utilities.Error;
import OperandStack.*;
import Value.*;
public class EVM {
  public static void main(String argv[]) {

      // This is a small example of how to use the stack
      
      OperandStack operandStack = new OperandStack(100, "OperandStack Test");

      operandStack.push(new IntegerValue(32));
      operandStack.push(new IntegerValue(7));
	  operandStack.push(new IntegerValue(54));
	  operandStack.push(new IntegerValue(32));
	  operandStack.push(Value.makeValue("+"));
	  operandStack.push(Value.makeValue("*"));
	  operandStack.push(new IntegerValue(2));
	  operandStack.push(Value.makeValue("/"));
	  operandStack.push(Value.makeValue("-"));

  }

}
