var getCommon = function (nums1, nums2) {
  // store first element array as a set
  const firstArraySet = new Set(nums1);

  // console.log(firstArraySet);

  // if there is a set element for nums2 then that is the first match
  for (num of nums2) {
    if (firstArraySet.has(num)) {
      return num;
    }
  }

  return -1;
};

console.log(getCommon([1, 2, 3], [2, 3]));
