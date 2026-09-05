# Solution Explanation - C - 101

## Problem Approach

The problem asks us to process an array containing elements `1`, `0`, and `-1`. The goal is to replace the `-1` values with either `1` or `0` according to specific boundary conditions (usually related to prefix/suffix sums or finding the first/last occurrences of `1` and handling `-1`s appropriately).

Our approach in this Java solution is as follows:

1. **Left-to-Right Scan**: We iterate through the array from the beginning to find the first occurrence of `1` or `-1`.
   - If we encounter a `1` first, we record that a `1` exists on the left (`countLeft++`) and stop searching from this direction.
   - If we encounter a `-1` before any `1`:
     - If no `1` has been seen yet (`countLeft == 0`), we turn this first `-1` into a `1`.
     - Otherwise, we assign `0` to it.

2. **Right-to-Left Scan**: Similarly, we iterate from the end of the array to the beginning.
   - If we encounter a `1`, we record it (`countRight++`) and stop.
   - If we encounter a `-1`:
     - If no `1` has been seen from the right yet (`countRight == 0`), we turn this `-1` into a `1`.
     - Otherwise, we assign `0` to it.

3. **Cleanup**: After processing the boundaries, any remaining `-1` values in the middle of the array are simply replaced with `0`.

4. **Output**: Finally, the modified array is printed.

---

## Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$ per test case, where $N$ is the number of elements in the array. We iterate through the array a constant number of times (at most 3 passes: left scan, right scan, and cleanup).
- **Space Complexity:** $\mathcal{O}(N)$ to store the array elements for each test case.