class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
       List< List<Integer>> ans = new ArrayList<>();
          back(candidates, target, ans, new ArrayList<>(), 0);
        return ans;
    }
    public void back(int[] candidates,int target,List<List<Integer>> ans,List<Integer> list,int index){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(target<0 || index>=candidates.length){
            return;
        }
        list.add(candidates[index]);
        back(candidates,target-candidates[index],ans,list,index+1);
        list.remove(list.size()-1);
         int next = index + 1;
        while (next < candidates.length && candidates[next] == candidates[index]) {
            next++;
        }

        back(candidates,target,ans,list,next); 
    }
}
