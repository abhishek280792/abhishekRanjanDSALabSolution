package bracketBalancing;//Write a program of Balancing Brackets, use a suitable data structure to print
//whether the string entered is a Balanced Brackets or Unbalanced String

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancingBrackets {
    public void bracketBalancer(String brackets){
        //Using deque to implement the bracket stack
        Deque<Character> bracketStack = new ArrayDeque<Character>();
        int bracketLength = brackets.length();
        for(int i=0;i<bracketLength;i++){
            char bracket = brackets.charAt(i);
            char check;
            if(bracket=='{'||bracket=='['||bracket=='('){
                bracketStack.push(bracket);
                continue;
            }
            //boundary condition if stack is empty
            if(bracketStack.isEmpty()){
                System.out.println("The entered bracket string is invalid");
            }
            //check for balancing brackets
            if(bracket==')'){
                check=bracketStack.getFirst();
                if(check=='('){
                    bracketStack.pop();
                }else {
                    System.out.println("The entered Strings do not contain Balanced Brackets");
                    break;
                }
            }
            if(bracket=='}'){
                check=bracketStack.getFirst();
                if(check=='{'){
                    bracketStack.pop();
                }else {
                    System.out.println("The entered Strings do not contain Balanced Brackets");
                    break;
                }
            }
            if(bracket==']'){
                check=bracketStack.getFirst();
                if(check=='['){
                    bracketStack.pop();
                }else {
                    System.out.println("The entered Strings do not contain Balanced Brackets");
                    break;
                }
            }
        }
        if(bracketStack.isEmpty()){
            System.out.println("The entered String has Balanced Brackets");
        }
    }
}
