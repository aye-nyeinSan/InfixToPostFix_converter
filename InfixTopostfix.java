import java.util.LinkedList;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InfixTopostfix<character> {
   private String infix; 
    public InfixTopostfix(){
       }

    public InfixTopostfix(String infix) {
      this.infix=infix;
    
    }
    public String convert(){
        Stack<Character> operatorStack=new Stack<>();
        
       LinkedList<Character> postfix=new LinkedList<>();

        for(int i=0;i< this.infix.length();i++){
            char character=infix.charAt(i);//a,-,b
            
            if (Character.isLetterOrDigit(character)) {//-
                postfix.push(character);//postfix:a,b  
            }
            else if (character=='(') {
                operatorStack.push(character);
            } else if(character==')'){

                while ( !(operatorStack.peek()=='(')) { 
                    
                    if (this.PRECEDENCE_MAP(character)<= this.PRECEDENCE_MAP(operatorStack.peek())) {
                        postfix.push(operatorStack.pop());
                    }
                }
                operatorStack.pop();//pop '('
            }
             else { 
                while(!(operatorStack.isEmpty()) && this.PRECEDENCE_MAP(character)<= this.PRECEDENCE_MAP(operatorStack.peek())){
                    postfix.push(operatorStack.pop());
                }
                operatorStack.push(character);
             }
    
            }
                //output all operator in stack 
              while (!(operatorStack.isEmpty())) {
                postfix.push(operatorStack.pop());
              }
     
        for (int j = 0; j < operatorStack.size(); j++) {
            System.out.print(operatorStack.get(j));
        }
    StringBuilder builder=new StringBuilder(postfix.size());
    
    for (Character c : postfix) {
        builder.append(c);
    }

         
        return builder.reverse().toString();// abcd+e-/fg^h*i+ *-


    }
   
    
    
    

    public  final int PRECEDENCE_MAP(char character){
        switch (character) {
            case '+': return 1;
            case '-': return 1;
            case '*': return 2;
            case '/': return 2;
            case '%': return 2;
            case '^': return 3;
            default: return -1;
        }
        
    }
   

}