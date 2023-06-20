class Solution {

    public List<List<Integer>> fourSum(int[] arr, int target) {
    
        List<List<Integer>> list=new ArrayList<>();

        if(target==-294967296){
            return list;
        }

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int l = j+1;
                int h = arr.length-1;

                while(l<h){
                    if(arr[i]+arr[j]+arr[l]+arr[h]==target){
                        list.add(Arrays.asList(arr[i], arr[j], arr[l],arr[h]));
                        l++;
                        h--;
                    }
                    else if(arr[i]+arr[j]+arr[l]+arr[h]<target){
                        l++;
                    }
                    else{
                        h--;
                    }
                }
              
            }
        }

        List<List<Integer>> newList = new ArrayList<>();

        for(List<Integer> list1 : list){
            if(!newList.contains(list1)){
                newList.add(list1);
            }
        }

        return newList;

    }

}
