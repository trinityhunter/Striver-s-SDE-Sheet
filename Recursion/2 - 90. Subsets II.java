class Solution {

    public static void helper(int[] nums, int ind){

        if(ind == nums.length){
            if(!set.contains(ca)){
                set.add(ca);
                ma.add(new ArrayList<>(ca));
            }
            return;
        }

        helper(nums, ind+1);

        ca.add(nums[ind]);
        helper(nums, ind+1);
        ca.remove(ca.size()-1);

    }

    public static List<List<Integer>> ma;

    public static List<Integer> ca;

    public static HashSet<List<Integer>> set;

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        ma = new ArrayList<>();

        ca = new ArrayList<>();

        set = new HashSet<>();

        Arrays.sort(nums);

        helper(nums, 0);

        return ma;

    }

}
