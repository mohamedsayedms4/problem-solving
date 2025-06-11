# A. Count Numbers

**Time Limit:** 1 second  
**Memory Limit:** 256 megabytes

You have an empty array and `q` queries, each of them in the following format:

- `1 x` — add `x` to the array  
- `2 x` — print the number of occurrences of `x` in the array

---

## 📥 Input

- The first line contains two integers `n` and `q` (`1 ≤ n, q ≤ 10^5`) — the upper bound of values and the number of queries.
- The next `q` lines each contain two integers `z` and `x`:
  - If `z == 1`: add `x` to the array.
  - If `z == 2`: print how many times `x` has occurred so far.

---

## 📤 Output

For every query of type `2 x`, print a single line containing the number of occurrences of `x`.

---

## 🔍 Example

### Input
6 7
1 1
1 6
1 3
2 1
1 3
2 3
2 5

### Output
1
2
0
