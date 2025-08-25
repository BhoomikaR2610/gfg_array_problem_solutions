
Given an array, arr of positive integers. Find the third largest element in it. Return -1 if the third largest element is not found.

class Solution {
    int thirdLargest(int arr[]) {
        // Your code here
        Arrays.sort(arr);
        if(arr.length>=3)
        {
            return arr[arr.length-3];
        }
        else 
        {
            return -1;
        }
    }
}
