 
public class sort
{
    public static void sort012(int[] arr){
    //Take 3 pointers
        int i=0,j=0;
        int k=arr.length-1;
        while(j<=k){
        
            if(arr[j]==0){
                swap(arr,i,j);
                i++;
                j++;
            }else if(arr[j]==1){
                j++;
            }else{
                swap(arr,j,k);
                k--;
            }
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];//1
        arr[i]=arr[j];//0
        arr[j]=temp;
    }
}

