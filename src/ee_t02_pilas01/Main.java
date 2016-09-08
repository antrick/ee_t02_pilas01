/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t02_pilas01;

/**
 *
 * @author andy
 */
public class Main
{
   public static void main(String [] args){
    Pila p=new Pila(10);
   System.out.println("{[()]}"); 
   System.out.println("{[(])}");
   System.out.println("{{[[(())]]}}\n"); 
   
   p.comparator("{[()]}");
   p.comparator("{[(])}");
   p.comparator("{{[[(())]]}}");
   
  }
}
