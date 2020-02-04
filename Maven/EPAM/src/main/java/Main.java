import gifts.*;
import sweets.*;

public class Main{
    public static void main(String args[]){
        Sweet a=new Chocolate("A",100,80,"DairyMilk");
        Sweet b=new Chocolate("B",200,10,"Kitkat");
        Sweet c=new Candy("C",1001,80,"Adi");

        Gift gifts=new Gift();
        gifts.add(a);
        gifts.add(b);
        gifts.add(c);

        System.out.println(gifts.getWeight());
        System.out.println(gifts.toString());
    }
}