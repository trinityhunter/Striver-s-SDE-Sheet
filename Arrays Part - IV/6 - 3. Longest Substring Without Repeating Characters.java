class Solution {

    public int lengthOfLongestSubstring(String s) {
        
        int i = 0;

        int j = 0;

        HashMap<Character, Integer> hm = new HashMap<>();

        int max = 0;

        while(j<s.length()){

            hm.put(s.charAt(j), hm.getOrDefault(s.charAt(j), 0) + 1);

            if(j-i+1 == hm.size()){
                max = Math.max(max, j-i+1);
                j++;
            }
            else if(j-i+1 > hm.size()){

                while(j-i+1>hm.size()){
                    if(hm.get(s.charAt(i)) == 1){
                        hm.remove(s.charAt(i));
                    }
                    else{
                        hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) - 1);
                    }
                    i++;
                }

                if(j-i+1 == hm.size()){
                    max = Math.max(max, j-i+1);
                }

                j++;

            }

        }

        return max;

    }

}
