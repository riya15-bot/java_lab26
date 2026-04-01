// Merging two sorted arrays into a single sorted array
public class MergeArray{
    public static void main(String[]args){
        int A[] = {1,3,5};
        int B[]= {2,4,6};
        int C[]= new int [A.length + B.length];

        int i=0, j=0, k=0;
        while (i <A.length && j<B.length){
            if (A[i] < B[j])
                C[k++] = A[i++];
        
            else 
                C[k++] = B[j++];
        }
            while (i < A.length && j< B.length)
                C[k++] = A[i++];
        
            while (j < B.length)
                C[k++] = B[j++];
            

            System.out.println("Merged Array: ");
            for (int num: C)
                System.out.println(num + " ");
        }
    }
