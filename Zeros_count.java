Given an array arr of only 0's and 1's. The array is sorted in such a manner that all the 1's are placed first and then they are followed by all the 0's. Find the count of all the 0's.


// User function Template for Java

class Solution {
    int countZeroes(int[] arr) {
        // code here
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count++;
            }
        }
       return count;
    }
}