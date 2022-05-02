package bracketBalancing;

import java.util.Scanner;

//Main class for taking input and checking for balanced brackets
public class BalancerMain {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String bracketString = sc.nextLine();
        BalancingBrackets obj = new BalancingBrackets();
        obj.bracketBalancer(bracketString);
    }
}
