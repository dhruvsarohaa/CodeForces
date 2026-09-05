# Solution for Codeforces Problem: Moo Language School J

This repository contains a Java solution for the problem **Moo Language School J**.

## Problem Approach

The problem requires us to analyze a binary string of length $a$ divided into blocks (or chunks) of a specific size $b$. For each block of size $b$, we need to check if all characters within that block are `'1'`. If a block does not contain any `'0'` (i.e., it consists entirely of `'1'`s), we increment our counter. Finally, we output the total count of such valid blocks for each test case.

### Step-by-Step Algorithm:
1. Read the number of test cases, $n$.
2. For each test case:
   - Read $a$ (the length of the string) and $b$ (the size of each block).
   - Read the binary string `str`.
   - Initialize a counter `ans` to `0`.
   - Iterate through the string in steps of size $b$ (from `i = 0` to `str.length()` with increments of $b$).
   - For each block starting at index `i` and ending at `i + b`:
     - Use a boolean flag to check if the character `'0'` exists in the current block.
     - If a `'0'` is found, set the flag to `true` and break out of the inner loop.
     - If the flag remains `false` after checking the entire block, increment the `ans` counter.
   - Print the final value of `ans` for the current test case.

---

## Complexity Analysis

- **Time Complexity:** 
  - For each test case, the outer loop runs $\frac{a}{b}$ times.
  - The inner loop runs $b$ times to check the characters in each block.
  - Thus, the total time complexity per test case is $\mathcal{O}\left(\frac{a}{b} \times b\right) = \mathcal{O}(a)$, where $a$ is the length of the string.
  - For $n$ test cases, the overall time complexity is $\mathcal{O}(\sum a)$, which is very efficient and well within standard time limits.

- **Space Complexity:** 
  - $\mathcal{O}(a)$ to store the string of length $a$ in memory for each test case, along with a few primitive variables taking $\mathcal{O}(1)$ auxiliary space.