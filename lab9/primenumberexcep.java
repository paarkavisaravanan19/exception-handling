/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author Dell
 */
public class primenumberexcep {
    public static void main(String args[]) throws validexception{
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println("Your entered input range is from "+a+" to "+ b);
        try
        {
        prime obj1=new prime();
        System.out.println("======Prime numbers and its Validity======");
        obj1.display(a, b);
        obj1.validity(a, b);
  
       
        }
        catch(validexception t)
        {
            System.out.println(t);
        }
    }
    
}
class prime 
{
    void display(int a,int b) throws validexception
    {
        for(int i=a;i<=b;i++)
        {
        int counter=0;
        for(int j=a;j<=b;j++)
        {
            if((i%j)==0)
            {
                counter=counter +1;
               
            }
        }
            if(counter==2)
            {
                System.out.println(i);
            }
        }
        
   }
 void validity(int a,int b) throws validexception
    {
        if((a<=0 || b<=0)&&(a>b))
        {
          throw new validexception(" No,you have got it WRONG!! :-( Check your input once!!");
        }
}
}
class validexception extends Exception
{
    validexception (String s)
    {
        super(s);
    }
}



    
