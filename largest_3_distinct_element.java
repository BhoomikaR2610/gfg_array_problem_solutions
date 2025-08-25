You are given an array arr[], you need to find the top three largest distinct integers present in the array and return an array of size three in descending order.

Note: If there are less than three distinct elements in the array, then return the available distinct numbers in descending order.


class Solution {
    public int[] getThreeLargest(int arr[]) {
        // code here
        Arrays.sort(arr);
       ArrayList<Integer> b=new ArrayList<>();
        boolean visite[]=new boolean[100001];
        
        int index=0;
        for(int i=arr.length-1;i>=0;i--)
        
        {
            if(index<3&&!(visite[arr[i]]))
            {
                b.add(arr[i]);
                index++;
                visite[arr[i]]=true;
            }
        }
        int[] a=new int[b.size()];
        for(int i=0;i<b.size();i++)
        {
            a[i]=b.get(i);
        }
        return a;
    }
}
