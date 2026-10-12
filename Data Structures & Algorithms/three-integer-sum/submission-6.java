class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> output = new HashSet<>();

        for (int i=0; i<n-2; i++) {
            int left = i+1, right = n-1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> triplet = new ArrayList<>(List.of(nums[i], nums[left], nums[right]));
                    output.add(triplet);
                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return new ArrayList<>(output);
    }
}

class Solution1 {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int n = nums.length;        
        Set<List<Integer>> output = new HashSet<>();

        for (int i=0; i<n-2; i++) {
            // target = -nums[i]
            Set<Integer> seen = new HashSet<>();
            for (int j=i+1; j<n; j++) {
                int complement = - (nums[i] + nums[j]);
                if (seen.contains(complement)) {
                    List<Integer> triplet = new ArrayList<>(List.of(nums[i], nums[j], complement));
                    Collections.sort(triplet);
                    output.add(triplet);
                }
                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(output);
    }
}


class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int n = nums.length;
        Set<List<Integer>> output = new HashSet<>();

        for (int i=0; i<n-2; i++) {
            for (int j=i+1; j<n-1; j++) {
                for (int k=j+1; k<n; k++) {
                    if (nums[i]+nums[j]+nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
                        Collections.sort(triplet);
                        output.add(triplet);
                    }
                }
            }
        }

        return new ArrayList<>(output);
    }
}
