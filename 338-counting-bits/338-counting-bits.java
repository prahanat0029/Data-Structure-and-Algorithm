class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        
        for(int i=1; i<=n; i++){
            int count = 0;
            count = Integer.bitCount(i);
            // int j=i;
            // while(j>0){
            //     count += j&1;
            //    j=j>>1;
            // }
            arr[i]=count;
        }
        return arr;
    }
}