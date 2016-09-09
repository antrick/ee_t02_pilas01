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

    public class Pila
{
    private int max;
    private int tope;
    private char obc[];
    public Pila(int max){
     this.max=max;
     tope=-1;
     obc=new char [max];
    }
    public boolean estallena(){
     return tope==max-1;
    }
    public boolean estavacio(){
     return tope==-1;
    }
    public void push(char n){
        if(!estallena()){
         tope++;
         obc[tope]=n;
        }else{
         System.out.println("desbordamiento");
        }
    }
     public char pop(){
     char n=' ';
     if(!estavacio()){
        n=obc[tope];
        tope--;
        return n;
        }else{
         System.out.println("subdesbordamiento");
        }
     return n;
    }
    public char peek(){
     char n=' ';
     if(!estavacio()){
        n=obc[tope];
       return n;
        }else{
        System.out.println("pila vacia");
        }
     return n;
    }
    public void comparator(String datos){
      int i=0;  //()
        while(i<datos.length()){
         if(datos.charAt(i)=='('){
            push('(');
            }else if(datos.charAt(i)==')'){
             if(!estavacio() && peek()=='('){
                pop();
                }else{
                 push(')');
                 break;
                }
            }
          if(datos.charAt(i)=='{'){
              push('{');
            }
             else if(datos.charAt(i)=='}' ){
             if(!estavacio() && peek()=='{'){
                pop();
                }else{
                 push('}');
                 break;
                }
            }
          if(datos.charAt(i)=='['){
            push('[');
            }
            else if(datos.charAt(i)==']'){
             if(!estavacio() && peek()=='['){
                pop();
                }else{
                 push(']');
                 break;
                }
            }
                 
            i++;
        }
        if(estavacio()){
         System.out.println("SI");
          }else{
            System.out.println("NO");
            }
        if(!estavacio()){
         tope=-1;
        }
    }
}
// (()
// (
