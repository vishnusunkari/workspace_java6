package prog.misc;

public class SortOrderOfN {
    public static void main(String [] args) {
        int a[] = {4, 112, 0, 65, 4, 190, 12, 50, 112, 0};
        int indexArray[] = new int[201];
        for(int i=0; i<indexArray.length; i++){
            indexArray[i]=0;
        }

        for(int i=0;i<a.length;i++){
            indexArray[a[i]] = indexArray[a[i]]+1;
        }

        for(int i=0; i<indexArray.length; i++){
            for(int j=0; j<indexArray[i]; j++){
                System.out.print(i+ ", ");
            }
        }

    }
}
