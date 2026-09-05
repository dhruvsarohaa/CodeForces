# Solution to Codeforces - Minus Two

## Approach

The problem asks us to solve a specific array-based query for multiple test cases. In this solution, we categorize the elements of the given array based on their remainder when divided by 4 and whether they are odd or even. 

The approach follows these steps:
1. **Read Input**: We first read the number of test cases (`n`). For each test case, we read the size of the array (`a`) and the elements of the array.
2. **Categorization**: We iterate through the array and count three types of elements:
   - `odd`: Numbers that are not divisible by 2 (`arr[i] % 2 != 0`).
   - `even4`: Even numbers that are divisible by 4 (`arr[i] % 4 == 0`).
   - `even2`: Even numbers that leave a remainder of 2 when divided by 4 (`arr[i] % 4 == 2`).
3. **Result Calculation**: For each test case, the maximum count among these three categories (`odd`, `even4`, and `even2`) is calculated and printed.

## Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$ per test case, where $N$ is the number of elements in the array. We iterate through the array of size $a$ a constant number of times to classify the elements and find the maximum. Thus, for all test cases, the total time complexity is $\mathcal{O}(\sum N)$.
- **Space Complexity:** $\mathcal{O}(N)$ per test case, as we store the elements of the array in memory of size $a$.