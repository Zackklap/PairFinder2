public class PairFinder {
    //loops through an array and checks if its added up to a value k.
    public static void findPairSums(int k, int[] arr){
        for(int i =0; i<arr.length-1;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i] + arr[j]==k)
                    System.out.println(arr[i]+" + "+ arr[j] + " = "+k);
            }
        }
    }
    //this used the fact that the array is sorted so you know that the length -1 is less than length, and i++ is > i. It then uses this fact to find the sum to k.
    public static void findPairSumsFaster(int k, int[] arr){
        SortCount.quickSort(arr); //sorts array
        int l=arr.length-1;
        for(int i=0; i<arr.length; i++){//loops through array
            if(i>l){
                break;
            }
            if(arr[i]+arr[l] == k) {
                System.out.println(arr[i] + " + " + arr[l] + " = " + k);//found the sum so we don't want i to change, but l too
                l--;
                i--;
            }
            else if(arr[i]+arr[l] > k){//value greater than k so we don't want i to change, but want l to go down.
                l--;
                i--;
                }
            }
        }

    public static void main(String[] args){
        int[] pog = new int[]{10, 4, 7, 7, 8, 5, 15};
        findPairSumsFaster(12,pog);
    }
}
