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
   public static void comparator(String datos){
        Pila p=new Pila(10);
      int i=0;  //()
        while(i<datos.length()){
         if(datos.charAt(i)=='('){
            p.push('(');
            }else if(datos.charAt(i)==')'){
             if(!p.estavacio() && p.peek()=='('){
                p.pop();
                }else{
                 p.push(')');
                 //break;
                }
            }
          if(datos.charAt(i)=='{'){
              p.push('{');
            }
             else if(datos.charAt(i)=='}' ){
             if(!p.estavacio() && p.peek()=='{'){
                p.pop();
                }else{
                 p.push('}');
                 //break;
                }
            }
          if(datos.charAt(i)=='['){
           p.push('[');
            }
            else if(datos.charAt(i)==']'){
             if(!p.estavacio() && p.peek()=='['){
                p.pop();
                }else{
                 p.push(']');
                 //break;
                }
            }   
            i++;
        }
        if(p.estavacio()){
         System.out.println("SI");
          }else{
            System.out.println("NO");
            }
        //p.vaciar();
    }
   public static void main(String [] args){
       
       
    
   System.out.println("{[()]}"); 
   System.out.println("{[(])}");
   System.out.println("{{[[(())]]}}"); 
   System.out.println("()}\n");
   
   comparator("{[()]}");
   comparator("{[(])}");
   comparator("{{[[(())]]}}");
   comparator("()}");
  }
}