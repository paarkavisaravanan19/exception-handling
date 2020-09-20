/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class exception {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
       char s = 0;
   
        do
        {
             System.out.println("Enter any number from 1 to 4");
             int a=obj.nextInt();
            switch(a)
            {
                case 1:
                {
                    try 
                    {
                        System.out.println("enter the number:");
                        int b=Integer.parseInt(obj.next());
                        System.out.println("enter the number");
                        int c=Integer.parseInt(obj.next());
                        System.out.println(b/c);
                    }
                    catch(ArithmeticException e)
                    {
                        System.out.println(e);
                    }
                    break;
                }
                case 2:
                {
                      try
                    {
                        int d[]=new int[5];          
                        System.out.println("enter the number of elements to be inserted");
                        int w=obj.nextInt();
                     
                        
                            for(int i:d)
                            {
                                d[i]=obj.nextInt();
                            }
                            for (int i:d)
                            {
                                System.out.println(d[i]);
                            }
                        
                    }
                    catch(ArrayIndexOutOfBoundsException t)
                    {
                        System.out.println(t);
                    }
                        
                    break;
                }
                case 3:
                {
                    try
                    {
                         System.out.println("enter the number:"); 
                        int b=Integer.parseInt(obj.next());
                         System.out.println("enter the number:");
                        int c=Integer.parseInt(obj.next());
                    }
                    catch(NumberFormatException f)
                    {
                        System.out.println(f);
                    }
                    break;
                }
            case 4:
                {
                    try
                    {
                        String s1=new String("helloworld");
                        System.out.println(s1.substring(12));
                    }
                    catch(Exception j)
                    {
                        System.out.println(j);
                    }
                    break;
                }
                default:
                {
                
        
                    System.out.println("Enter the correct Input");
                    break;
                }
            }
            System.out.println("=====================");
            
            System.out.println("enter 'y' to continue ");
             s=obj.next().charAt(0);
             System.out.println("=====================");
        }while(s=='y'||s=='Y');
            
        
    }
        }




        
        
        
        
        
    
    

