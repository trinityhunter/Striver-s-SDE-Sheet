class Solution {

    public static void helper(int[] candidates, int ind, int target){

        if(target<0){
            return;
        }

        if(target == 0){
            ma.add(new ArrayList<>(ca));
            return;
        }

        if(ind == candidates.length){
            return;
        }

        helper(candidates, ind+1, target);

        ca.add(candidates[ind]);
        helper(candidates, ind, target-candidates[ind]);
        ca.remove(ca.size()-1);

    }

    public static List<List<Integer>> ma;

    public static List<Integer> ca;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        ma = new ArrayList<>();

        ca = new ArrayList<>();

        helper(candidates, 0, target);

        return ma;

    }

}
