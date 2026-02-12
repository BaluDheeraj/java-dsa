class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums={1,2,3,4,5,6,7,8,9};
        List<List<Integer>> res= new ArrayList<>();
        
        backtrack(nums,n,k,new ArrayList<>(),res,0);
        return res;
        
    }
    public void backtrack(int[] nums,int n ,int k,List<Integer> ans,List<List<Integer>> res,int index){
        if(ans.size()==k && n==0){
            if(res.contains(ans)){
                return;
            }
            else{
                res.add(new ArrayList<>(ans));
                return ;
            }
        }
        if(index>=nums.length || n<0){
            return ;
        }
        
        ans.add(nums[index]);
        backtrack(nums,n-nums[index],k,ans,res,index+1);
        ans.remove(ans.size()-1);
         backtrack(nums,n,k,ans,res,index+1);

    }
}
