public class ArrayCopier {

    public void copy(int[] src, int[] dst){
            for(int i=0; i<=dst.length(); i++){
                if(i >= src.length()){
                    dst[i] = 0;
                } else {
                    dst[i] = src[i];
                }
            }
    }
        

}