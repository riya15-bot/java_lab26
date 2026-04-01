// Java program to count the frequency of each element in an array
public class FrequencyArray {
    public static void main(String[] args){
        int arr[]= {1, 2, 3, 4, 5, 1, 2, 3};
        int visited = -1;
    
        int freq[]= new int [arr.length];
        for(int i=0; i< arr.length; i++){
            int count =1 ;
            for( int j = i+1; j<arr.length; j++){
                if (arr[i]==arr[j]){
                    count++;
                    freq[j]= visited;

                }
            }
            if (freq[i] != visited){
                freq[i]= count;
            }
            for (int k =0; k< freq.length; k++){
                if (freq[k] != visited){
                    System.out.println(arr[k] + " occurs " + freq[k] + " times");
                }
            }
        }
    }
}
