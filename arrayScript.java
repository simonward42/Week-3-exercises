import java.util.Arrays;

public class arrayScript {
   public static void main(String[] args) {
    System.out.println( "Let's test out ArrayCopier.class:" );
    System.out.println( " firstly when both arrays are the same size...\n" );
    int[] src = {1,2,3,4,5};
    int[] dst = new int[5];

    System.out.println( " src = " + Arrays.toString(src) + ", dst = " + Arrays.toString(dst) );
    System.out.println( " calling copy(src, dst)..." );

    ArrayCopier copier = new ArrayCopier();
    copier.copy(src, dst);
    System.out.println( " src = " + Arrays.toString(src) + ", dst = " + Arrays.toString(dst) );
 
    System.out.println( "\n when the source array is longer...\n" );
    int[] longSrc = {1,2,3,4,5,6,7,8,9,10};
    int[] shortDst = new int[5];
    
    System.out.println( " src = " + Arrays.toString(longSrc) + ", dst = " + Arrays.toString(shortDst) );
    System.out.println( " calling copy(src, dst)..." );

    copier.copy(longSrc, shortDst);
    System.out.println( " src = " + Arrays.toString(longSrc) + ", dst = " + Arrays.toString(shortDst) );
    
    System.out.println( "\n and when the source array is shorter...\n" );
    int[] shortSrc = {1,2,3,4,5};
    int[] longDst = new int[10];
    
    System.out.println( " src = " + Arrays.toString(shortSrc) + ", dst = " + Arrays.toString(longDst) );
    System.out.println( " calling copy(src, dst)..." );

    copier.copy(shortSrc, longDst);
    System.out.println( " src = " + Arrays.toString(shortSrc) + ", dst = " + Arrays.toString(longDst) );
    
   }
}