package achoo;
import java.util.*;
import java.text.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Kelleher
 */
public class Problem20 {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.print("What is the order amount? ");
        double amt = a.nextDouble();
        a.nextLine();
        System.out.print("What state do you live in? ");
        String st = a.nextLine();
        System.out.print("What county do you live in? ");
        String cnt = a.nextLine();
        double tax = 0;
        if(st.equals("Wisconsin")){
            if(cnt.equals("Eau Claire"))
                tax = .055;
            else if(cnt.equals("Dunn"))
                tax = .054;
            else tax = .05;
        }
        else if(st.equals("Illinois"))
            tax = .08;
        if(tax!=0)
            System.out.println("Tax: $"+tax);
        System.out.println("Total: "+nf.format(amt+(amt*tax)));
    }
}
