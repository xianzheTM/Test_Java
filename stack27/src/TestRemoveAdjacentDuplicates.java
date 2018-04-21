public class TestRemoveAdjacentDuplicates {
    public static void main(String[] args){
        RemoveAdjacentDuplicates obj=new RemoveAdjacentDuplicates();
        int[] A={1,9,6,8,8,8,0,1,1,0,6,5};
        int index=obj.removeAdjacentDuplicates(A);
        for(int i=0;i<=index;i++){
            System.out.print(" "+A[i]);
        }
    }
}
