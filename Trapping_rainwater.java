package array;

public class Trapping_rainwater {
    public static int trapedRainwater(int arr[]){
        //calculate left maximum boundary - array
        int leftmax [] = new int [arr.length];
        leftmax[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            leftmax[i]= Math.max(arr[i],leftmax[i-1]);


        }
        //calculate right maximum boundary - array
        int rightmax[] = new int[arr.length];
        rightmax[arr.length-1] = arr[arr.length-1];
        for(int i =arr.length-2; i>=0; i--){
            rightmax[i] = Math.max(arr[i],rightmax[i+1]);

        }
        int trapedwater = 0;
        for(int i =0; i<arr.length; i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            trapedwater += waterlevel - arr[i];
        }
        return trapedwater;



    }
    public static void main(String [] args){
        int height [] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapedRainwater(height)) ;
    }
}
