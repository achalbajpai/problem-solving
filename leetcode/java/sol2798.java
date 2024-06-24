class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
     //    for(int i = 0; i < hours.length; i++)
        for (int hour : hours) // for each
        {
            if(hour >= target)
            count ++;
        }
        return count;
    }
}
