# Sorted and Rotated Minimum - Solution in Java

This repository contains a Java solution for finding the minimum element in a sorted and rotated array.

## Problem Description

Given an array of integers `arr` sorted in ascending order, which is then rotated an unknown number of times, find the minimum element in the array. 

*Note: The array may contain duplicate elements, but standard versions of this problem usually assume all elements are unique. The approach below works efficiently for the standard variation.*

## Approach

The problem can be efficiently solved using a **Binary Search** approach in $O(\log N)$ time complexity. 

1. **Initialization**: Set two pointers, `left` at the beginning (`0`) and `right` at the end (`arr.length - 1`) of the array.
2. **Loop Condition**: Run a `while` loop as long as `left < right`.
3. **Mid Calculation**: Calculate the middle index `mid = left + (right - left) / 2`.
4. **Check Inflection Point**:
   * If `arr[mid] > arr[mid + 1]`, then `arr[mid + 1]` is the smallest element (the turning point), and we return it.
   * If `arr[mid] > arr[0]`, the minimum element must lie in the right half of the array, so we update `left = mid + 1`.
   * Otherwise, the minimum element lies in the left half (including `mid`), so we update `right = mid`.
5. **Fallback**: If the array is not rotated (i.e., it remains strictly sorted from the start), the loop finishes without returning inside, and the method returns `arr[0]`.

## Complexity Analysis

- **Time Complexity:** $O(\log N)$ — The search space is halved in each iteration of the binary search, where $N$ is the number of elements in the array.
- **Space Complexity:** $O(1)$ — Only a few variables (`left`, `right`, `mid`) are used, requiring constant extra space.