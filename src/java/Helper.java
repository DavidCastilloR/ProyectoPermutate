package java;


public class Helper {
    
    
    
 // Helper variables and helper functions
int swaps = 0;            // counts swaps
int permutation = 0;      // counts permutations
int insertions = 0;       // counts insertions
PermTester permTester;           // verifies correctness
String method = "";          // indicates the algroithms currently used

// if not indicated algorithms uses this number for generation
int DEFAULT_PERMUT_SIZE = 4;

// Algorithm names (method)
String BACKTRACKING   = "backtrack";
String HEAP_SEDGEWICK = "heap_sedgewick";
String LEXIC          = "lexicographic";
String NAIVE          = "naive";

// Array of letters used to permutate (max = 20)
String[] baseArray = {"A", "B", "C", "D", "E", "F", "G", "H",
                 "I", "J", "K", "L", "M", "N", "O", "P",
				 "Q", "R", "S", "T"
                };
/*
 Simple exchange function with counter (reset every time a function is tested)
*/
public void swap(String[] a,int i,int j){
	if ( i == j) 
		return;
	swaps += 4;
	String t = a[i];
	a[i] = a[j];
	a[j] = t;
}
/*
  inserts x a every position i in p with counting
*/
public String[] insertAt(String[] p,int i,String x){
  
	String[] res = {};
	for(int k = 0; k < i; k++){
		insertions++;
		res[res.length] = p[k];
	}
	insertions++;
	res[res.length] = x;
	for(int k = i; k < p.length; k++){
		insertions++;
		res[res.length] = p[k];
	}
	return res;
}

public int fact(int n){
	int f = 1;
	for (int i = 1; i <=n; f *= i, i++);
	return f;
}


//Slice workaround
public String[] slice(String[] r,int f){
    String[] aux = {};
    for(int k = 0; k < f; k++){
        aux[k] = r[k];
}

    return aux;

}




public String[] genArray(int n){
        if(n == 0){n = DEFAULT_PERMUT_SIZE;}
	n = n % baseArray.length;
	return slice(baseArray, n);
}

//TO DO...
//public showPermutation(a){
//	if (permTester)
//	   permTester.add(new Permutation(method, a));
//	printPlain(format("%3.0f) %s", ++permutation, a.toString()));
//}
//
//
//function reset(method, n){
//	resetMargin();
//	permutation = 0;
//	swaps = 0;
//	insertions = 0;
//	method = "";
//	permTester = null;
//	
//}
}
