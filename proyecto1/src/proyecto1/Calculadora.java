/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

//cambio desde git
/*
    prueba para ejercicio con david 
*/
//desde git 1234

/**
 *
 * @author redes
 */
/**
 *
 * @see 
 */
/**
 *
 * @version no sale
 */
/**
 *
 * @since 06 - 02 - 2023
 */

/**
 *
 * @return 
 */
/**
 *
 * @author redes
 */
/**
 *
 * @author redes
 */

public class Calculadora {
    private int num1;
    private int num2;
    /**
 *
 *@param a primer operador 
 *@param b segundo operador 
 */
    public Calculadora(int a, int b){
        num1=a;
        num2=b;
    }
    /**
    *
    * @return devuelve la suma
    */
    public int suma(){
        int result=num1+num2;
        return result;
    }
    /**
    *
    * @return devuelve la retsa 
    */
    public int resta(){
        int result;
        if (resta2())   result = num1-num2;
        else            result = num2-num1;
        return result;
    }
    /**
    *
    * @return devuelve true o false
    */    
    public boolean resta2(){
        if (num1 > num2)    return true;
        else                return false;
    }
    /**
    *
    * @return devuelve la multiplicacion 
    */
    public int multiplica(){
        int result=num1*num2;
        return result;
    }
    /**
    *
    * @return devuelve la division  
    */
    public int divide(){
        int result=num1/num2;
        return result;
    }
    /**
    *
    * @return comprueba si el numero 1 0 y hace la division  
    */
    public Integer divide2(){
        if(num2==0) return null;
        int result=num1/num2;
        return result;
    }
    /**
    *@throws ArithmeticException divide por 0
    *@return comprueba si el numero 2 0 y hace la division  
    *@exception ArithmeticException divide por 0
    */
     public int divide0(){
        if(num2==0) 
            throw new java.lang.ArithmeticException("División por 0");
        else{
            int result=num1/num2;
            return result;
        }
    }
     
    /**
     * @param args the command line argument
     * @deprecated hay que cambiarlo
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calcu = new Calculadora(20, 10);
        System.out.println(calcu.suma());
    }
    
}
