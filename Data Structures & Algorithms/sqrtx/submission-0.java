// class Solution {
//     public int mySqrt(int x) {
//         int left =0,right = x;
//         int ans =0;
//         int mid = 0;

//         while(left <= right){
//             mid = (left+right)/2;

//             if(mid * mid == x){
//                 return mid;
//             }
//             else if(mid * mid < x){
//                 ans = mid;
//                 left = mid+1;
//             }
//             else{
//                 right = mid - 1;
//             }
//         }
//         return ans;
//     }
// }






public class Solution {
    public int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }
}