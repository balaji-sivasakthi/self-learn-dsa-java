public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 40, 20, 51, 59};
        int target = 110;
        Integer index = null;
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] == target){
                index = i;
            }
        }
        if(index == null){
            System.out.println("Element not found");
        }else{
            System.out.println("Element Found at the index " + index);
        }
    }    
}
