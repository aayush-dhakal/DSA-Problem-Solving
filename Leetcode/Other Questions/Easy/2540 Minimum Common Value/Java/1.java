import java.util.HashSet;

class Solution {
  public int getCommon(int[] nums1, int[] nums2) {

    HashSet<Integer> firstArraySet = new HashSet<>();

    // store first element array as a hash set
    for (int num : nums1) {
      firstArraySet.add(num);
    }

    // if there is a set element for nums2 then that is the first match
    for (int num : nums2) {
      if (firstArraySet.contains(num)) {
        return num;
      }
    }

    return -1;
  }
}

// import java.util.HashSet;

// public class Main {
// public static int getCommon(int[] nums1, int[] nums2) {
// HashSet<Integer> set = new HashSet<>();

// for (int num : nums1) {
// set.add(num);
// }

// for (int num : nums2) {
// if (set.contains(num)) {
// return num;
// }
// }

// return -1;
// }

// public static void main(String[] args) {
// int[] nums1 = {1, 2, 3};
// int[] nums2 = {2, 3};
// System.out.println(getCommon(nums1, nums2));
// }
// }
