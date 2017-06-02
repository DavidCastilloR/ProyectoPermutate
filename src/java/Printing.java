/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;
public class Printing {
    
    int margin = 0;
    int increment = 3;
    String marginChar = " ";
    boolean verbose = false;

    public void print(String s){
        System.out.println(s);
    }
    public void write(String s){
        System.out.print(s);
    }
    public void resetMargin(){
	margin = 0;
	increment = 3;
        marginChar = " ";
    }
    public void incMargin(){
	margin += increment;
    }

    public void decMargin(){
	margin -= increment;
    }
    public void printMargin(String s){
	if (! verbose ) return;
	for (int i = 1; i <= margin; i++) 
		write(marginChar);
	print(s);
    }

function printPlain(s){
	if (! verbose ) return;
	print(s);
}
    
}
