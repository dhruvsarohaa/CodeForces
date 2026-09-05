# Watermelon - Solution in C++

This repository contains a C++ solution for the classic competitive programming problem **Watermelon** (often found on Codeforces).

## Problem Statement

Two friends buy a watermelon of weight $w$ kilos and they want to divide it such that each piece's weight is an even number. The parts do not have to be of equal sizes. You need to output `YES` if it's possible to divide the watermelon into two such parts, and `NO` otherwise.

## Approach

To solve this problem, we need to determine if a given integer $w$ can be expressed as the sum of two **positive even integers**, say $x$ and $y$. 
Mathematically:
1. $w = x + y$
2. $x > 0$ and $y > 0$
3. $x \pmod 2 = 0$ and $y \pmod 2 = 0$

From these conditions, we can deduce:
- If $w$ is odd, it is impossible to split it into two even integers because the sum of two even numbers is always even. Thus, $w$ must be even ($w \pmod 2 == 0$).
- If $w$ is too small (e.g., $w = 2$), the only possible positive integer divisions are $1 + 1$ (both odd) or $2 + 0$ (one part is zero, which violates the positive weight condition). Therefore, $w$ must be strictly greater than 2 ($w > 2$).

Thus, the condition for a successful division is:
$$\text{if } w > 2 \text{ and } w \pmod 2 == 0 \rightarrow \text{"YES"}$$
$$\text{else} \rightarrow \text{"NO"}$$

## C++ Source Code

```cpp
#include <iostream>
using namespace std;

int main() {
    int w;
    if (cin >> w) {
        if (w > 2 && w % 2 == 0) {
            cout << "YES\n";
        } else {
            cout << "NO\n";
        }
    }
    return 0;
}
```

## Complexity Analysis

- **Time Complexity:** $\mathcal{O}(1)$. The solution uses basic arithmetic and conditional checks, which execute in constant time.
- **Space Complexity:** $\mathcal{O}(1)$. Only a single integer variable `w` is used to store the input, requiring constant extra memory.