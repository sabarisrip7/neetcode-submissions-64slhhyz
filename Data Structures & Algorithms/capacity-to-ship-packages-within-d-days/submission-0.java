class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        for(int i=0;i<weights.length;i++){
            if(weights[i] > low){
                low = weights[i];
            }
            high += weights[i];
        }

        while(low < high){
            int mid = (low + high)/2;

            int require = 1;
            int current = 0;
            for(int i=0;i<weights.length;i++){
                if(current + weights[i] > mid){
                    require ++;
                    current = 0;
                }
                current += weights[i];
            }

            if(require <= days){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}