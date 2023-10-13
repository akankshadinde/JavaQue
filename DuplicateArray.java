public class DuplicateArray{
    public static void main(String[] args) {
        // Initilize an array
        int arr[] = {5,6,4,1,0,0,9,8,9,5};
        System.out.println("Duplicate Numbers given below : ");
        //logic for find duplicate values 
        for(int i=0;i<arr.length;i++){  
            for(int j=i+1;j<arr.length;j++){
                // if for comparing two elements with each other  
                if(arr[i]==arr[j]){
                    // print duplicate value
                    System.out.println(arr[i]);
                }
            }
        }
    }
}