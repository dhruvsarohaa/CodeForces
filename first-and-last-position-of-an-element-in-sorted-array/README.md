# First and Last Position of an Element In Sorted Array

This repository contains a Java solution for the **"First and Last Position of an Element In Sorted Array"** problem (commonly found on platforms like Coding Ninjas / CodeStudio, GeeksforGeeks, and LeetCode).

## Problem Statement

Given a sorted array of integers `arr` of size `n` and an integer `x`, find the first and last position (0-indexed) of the occurrence of `x` in the array. 

- If `x` is not present in the array, return `[-1, -1]`.

## Approach

The problem can be efficiently solved using the **Binary Search** algorithm. Since the array is already sorted, we can perform two separate binary searches:

1. **Finding the First Occurrence:**
   - Initialize `left = 0` and `right = n - 1`.
   - While `left <= right`, calculate the middle index `mid`.
   - If `arr.get(mid) == x`, we record this potential answer (`first = mid`) and continue searching in the left half (`right = mid - 1`) to check if there are any earlier occurrences of `x`.
   - If `arr.get(mid) < x`, move the search space to the right (`left = mid + 1`).
   - If `arr.get(mid) > x`, move the search space to the left (`right = mid - 1`).

2. **Checking Existence:**
   - After the first binary search, if `first` remains `-1`, it means `x` is not in the array, so we directly return `[-1, -1]`.

3. **Finding the Last Occurrence:**
   - Reset `left = 0` and `right = n - 1`.
   - While `left <= right`, calculate `mid`.
   - If `arr.get(mid) == x`, we record this potential answer (`last = mid`) and continue searching in the right half (`left = mid + 1`) to check if there are any later occurrences of `x`.
   - If `arr.get(mid) < x`, move the search space to the right (`left = mid + 1`).
   - If `arr.get(mid) > x`, move the search space to the left (`right = mid - 1`).

4. Finally, store `first` and `last` in an integer array and return it.

## Complexity Analysis

- **Time Complexity:** $O(\log n)$
  - We perform two independent binary searches on an array of size `n`. Each binary search takes logarithmic time. Therefore, the overall time complexity is $O(\log n) + O(\log n) = O(\log n)$.

- **Space Complexity:** $O(1)$
  - The algorithm uses a constant amount of extra space for pointers (`left`, `right`, `mid`, `first`, `last`) and the resulting array of size 2.