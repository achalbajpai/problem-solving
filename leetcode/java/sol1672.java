class Solution {
    public int maximumWealth(int[][] accounts) {
        int maximumWealth = 0 ; // int maximumWealth = Integer.MIN_VALUE ;
        for(int[] account : accounts)
        {
            int sum = 0;
            for(int wealth : account) 
                sum += wealth;
                maximumWealth = Math.max(maximumWealth , sum);
        }
        return maximumWealth;
    }
}
