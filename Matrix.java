import java.util.Arrays;
public class Matrix {
    private int[][] matrix;
    private int height, width;
    
    public Matrix(int height,int width){
        this.height = height;
        this.width = width;
        this.matrix = new int[height][width];
        for(int i=0; i<height ; i++){
            for(int j=0; j<width; j++){
                this.matrix[i][j] = 1;
            }
        }
    }
    
    public void setElement(int i, int j, int value){
        if(i>=0 && i<this.height && j>=0 && j<this.width){
            this.matrix[i][j] = value;
        } 
        else{
            System.out.println( "Invalid indices!" );
        }
    }
    
    public void setRow(int row, String numberstring){
        String[] numbers = numberstring.split(",");
        if(row<0 || row>=this.height){
            System.out.println( "Invalid row!" );
            return;
        }
        if(numbers.length != this.width){
            System.out.println( "Invalid number of columns!" );
            return;
        }
        int[] newRow = new int[this.width];
        for(int i=0; i<this.width; i++){
            newRow[i] = Integer.parseInt(numbers[i]);
        }
        this.matrix[row] = newRow;
    }
    
    public void setColumn(int column, String numberstring){
        String[] numbers = numberstring.split(",");
        if(column<0 || column>=this.width){
            System.out.println( "Invalid column!" );
            return;
        }
        if(numbers.length != this.height){
            System.out.println( "Invalid number of rows!" );
            return;
        }
        int[] newColumn = new int[this.height];
        for(int i=0; i<this.height; i++){
            newColumn[i] = Integer.parseInt(numbers[i]);
        }
        for(int i=0; i<this.height; i++){
            this.matrix[i][column] = newColumn[i];
        }
    }

    public String toString(){
        String mString = "[";
        for(int i=0; i<this.height; i++){
            for(int j=0; j<this.width; j++){
                mString += this.matrix[i][j];
                if(i == this.height-1 && j == this.width-1){
                    mString += "]";
                }
                else if(j == this.width-1){
                    mString += ";";
                }
                else{
                    mString += ",";
                }
            }
        }
        return mString;
    }

    public void prettyPrint(){
        String prettyString = "";
        for(int i=0; i<this.height; i++){
            for(int j=0; j<this.width; j++){
                prettyString += this.matrix[i][j];
                if(j == this.width-1){
                    prettyString += "\n";
                }
                else{
                    prettyString += "\t";
                }
            }
        }
        System.out.println( prettyString );        
    }

}