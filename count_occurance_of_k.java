Given an array arr[]. Your task is to return an integer denoting the total number of times digit k appears in the array.

class Solution {
    public int num(int k, int arr[]) {
        // code here
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int digit=arr[i];
        while(digit>0)
        {
            int temp=digit%10;
            if(temp==k)
            {
                count++;
            }
            digit=digit/10;
        }
        }
        return count;
    }
}
