class Solution {
    
    public int longestConsecutive(int[] nums) {
        
        HashMap<Integer, Boolean> hm = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i], true);
            }
        }
        
        int max = 0;
        
        for(int key: hm.keySet()){
            if(!hm.containsKey(key-1)){
                
                int old = key+1;
                
                int count = 1;
                
                while(hm.containsKey(old)){
                    count++;
                    old++;
                }
                
                max = Math.max(max, count);
            }
        }
        
        return max;
        
    }

}
