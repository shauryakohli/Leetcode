class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer>list=new ArrayList<>();
        List<Integer>li=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            list.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(list.contains(nums2[i]))
            {
                li.add(nums2[i]);
                int x=list.indexOf(nums2[i]);
                list.remove(x);
            }
        }
        int arr[]=new int[li.size()];
        for(int i=0;i<li.size();i++)
        {
              arr[i]=li.get(i);
        }
            
        return arr;
    }
}

// List<Integer> li=new ArrayList<>();
//                 List<Integer> list=new ArrayList<>();
//                 for(int i=0;i<a1.length;i++){
//                     list.add(a1[i]);
//                 }
//                 for(int i=0;i<a2.length;i++){
//                     if(list.contains(a2[i])){
//                         li.add(a2[i]);
//                         int x=list.indexOf(a2[i]);
//                         list.remove(x);
//                     }
//                 }
//             int ans[]=new int[li.size()];
//             for(int i=0;i<li.size();i++)
//                 ans[i]=li.get(i);
//         return ans;``