// public class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> res=new ArrayList<>();
//         if(nums==null|| nums.length==0)
//             return res;
//         helper(res, new ArrayList<>(),nums, 0);
//         return res;
//     }
    
//     public void helper(List<List<Integer>> res, List<Integer> list, int nums[], int pos){
//         res.add(new ArrayList<Integer>(list));
//         for(int i=pos; i< nums.length;i++){
//             list.add(nums[i]);
//             helper(res, list, nums, i+1);
//             list.remove(list.size()-1);
//         }
//     }
// }

public class Solution {
    public List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());

        Arrays.sort(S);
        for(int i : S) {
            List<List<Integer>> tmp = new ArrayList<>();
            for(List<Integer> sub : res) {
                List<Integer> a = new ArrayList<>(sub);
                a.add(i);
                tmp.add(a);
            }
            res.addAll(tmp);
        }
        return res;
    }
}