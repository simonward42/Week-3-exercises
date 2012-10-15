public class matrixScript {
   public static void main(String[] args) {
    System.out.println( "Let's test out Matrix.class...\n" );
    
    Matrix m = new Matrix(3,3);
    System.out.println( "Fresh 3-by-3 matrix looks like " + m.toString() );
    System.out.println( "or... " );
    m.prettyPrint();
    
    System.out.println( "\nLet's make a unit matrix... " );
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            if(i!=j){
                m.setElement(i, j, 0);
            }
        }
    }
    System.out.println( "...which looks like " + m.toString() );
    System.out.println( "or... " );
    m.prettyPrint();
        
    System.out.println( "Now, let's set the middle row (index *1*) to {2,4,6} " );
    m.setRow(1, "2,4,6");
    System.out.println( "...which looks like " + m.toString() );
    System.out.println( "or... " );
    m.prettyPrint();
    
    System.out.println( "Now, let's set the middle column (index *1*) to {3,5,7} " );
    m.setColumn(1, "3,5,7");
    System.out.println( "...which looks like " + m.toString() );
    System.out.println( "or... " );
    m.prettyPrint();

   }
}