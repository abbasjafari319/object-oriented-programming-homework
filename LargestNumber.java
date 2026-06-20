package chapter11;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumber {
    public static void main(String[] args){
        ArrayList<Number> list=new ArrayList<>();
        list.add(45); 
        list.add(3445.53);
        list.add(new BigInteger("3432323234344343101"));
        list.add(new BigDecimal("2.0909090989091343433344343"));
        System.out.println("The largest num is "+getLargestNumber(list));
        
    }
    public static Number getLargestNumber(ArrayList<Number> list){
        if(list==null || list.size()==0){
            return null;
        }
        Number num=list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i).doubleValue()>num.doubleValue()){
                num=list.get(i);
            }
        }
        return num;
    }
    
    
}
