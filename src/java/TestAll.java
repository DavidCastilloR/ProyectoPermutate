package java;
import java.TestPermutate;

public class TestAll {
    public static void test_permutate_all(int n){
        TestPermutate testPerm=new TestPermutate();
	testPerm.test_recursive_backtracking(n);
	testPerm.test_recursive_heap_sedgewick(n);
	testPerm.test_permutate_lexicographically(n);
	testPerm.test_permutate_naive(n);
}
    public static void main(String[] args)throws Exception{
        int n=Helper.DEFAULT_PERMUT_SIZE;
        if(args.length!=0){
            n=Integer.parseInt(args[0]);
        }
        
    }

var n = arguments[0] || DEFAULT_PERMUT_SIZE
print('\n*** Testing all permutation methods with ' + n + ' objects ***\n');
test_permutate_all(n);

print('\n *** Finished ***')
}
