public class RemoveAdjacentDuplicates {
    public int removeAdjacentDuplicates(int[] A){
        int stkptr=-1;
        int i=0;
        while(i<A.length){
            if(stkptr==-1||A[stkptr]!=A[i]){
                stkptr++;
                A[stkptr]=A[i];
                i++;
            }else{
                while (i<A.length&&A[stkptr]==A[i]){
                    i++;
                }
                stkptr--;
            }
        }
        return  stkptr;
    }
}
