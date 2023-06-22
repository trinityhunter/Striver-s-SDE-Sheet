class Activity
{
    int start , finish;
    Activity(int start , int finish)
    {
        this.start = start;
        this.finish = finish;
    }
}
class myCMP implements Comparator<Activity>
{
    public int compare(Activity a1, Activity a2)
    {
        return a1.finish - a2.finish;
    }
}
class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        Activity arr[] = new Activity[n];
        for(int i=0;i<n;i++)
            arr[i] = new Activity(start[i] , end[i]);
        Arrays.sort(arr,new myCMP());
        
        int res = 1;
        int prev = 0;
        
        for(int i=1;i<n;i++)
        {
            if(arr[i].start > arr[prev].finish)
            {
                res++;
                prev = i;
            }
        }
        return res;
    }
}
