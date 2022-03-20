# Updated-Subarray-Sum
One of your friends wants to test your intelligence. For that, he gave you an integer array 'A' consisting of 'N' positive integers. He asked you some questions, and you are supposed to answer all the questions correctly.
Each time he chooses an index 'i' where 1 <= 'i' <= 'N', and changes 'A[i]' = 0. Your task is to find the maximum subarray sum in the array 'A' such that the subarray has all non-zero elements.
He performs this operation on each index exactly once, and the order of indices chosen by him are given as a permutation 'P' of integers [1…N]. After each operation, find the maximum subarray sum without taking any 0 in the subarray.
Example :
N = 4
A = [2, 3, 5, 1]
P = [2, 4, 3, 1]

(Assume 1-based indexing in 'A' and 'P' to understand the following explanation).

In the first operation, he chooses P[1] = 2. After operation is performed, the updated array 'A' becomes [2, 0, 5, 1]. The maximum sum subarray without 0 is subarray [5, 1], which gives a sum of 6.

After the second operation at P[2] = 4, the updated array 'A' becomes [2, 0, 5, 0]. The maximum subarray sum is 5.

After the third operation, the updated array 'A' becomes [2, 0, 0, 0]. The maximum subarray sum is 2.

After the final operation, the updated array 'A' becomes [0, 0, 0, 0]. No subarray is found with non-zero elements. Hence the subarray sum is 0.

Return [6, 5, 2, 0] as our final answer.
Input Format :
The first line contains an integer 'T', denoting the number of test cases.
Then the test cases follow:

The first line of each test case contains an integer 'N', denoting the size of the array 'A'.

The second line contains 'N' space-separated integers, denoting the array 'A' elements.

The third line contains 'N' space-separated integers, denoting the permutation 'P' of indices.
Output Format :
For each test case, print 'N' space-separated integers denoting the maximum subarray sum (without taking 0s) after each operation is performed.

Print the output of each test case in a new line.
Note :
You are not required to print the expected output. It has already been taken care of. Just implement the function.
Constraints -
1 <= 'T' <= 10
1 <= 'N' <= 10^5
1 <= 'A[i]' <= 10^9
Sum of 'N' over all test cases doesn’t exceed 10^5.

Time Limit: 1 sec
Sample Input 1 :
2
4
7 2 9 8
3 2 4 1
4
2 2 2 3
2 3 4 1
Sample Output 1 :
9 8 7 0
5 3 2 0
Explanation For Sample Input 1 :
For test case 1:
Initially, array 'A' is [7, 2, 9, 8].

After the first operation, array 'A' becomes [7, 2, 0, 8]. The maximum sum subarray is [7, 2], which gives a sum of 9.

After the second operation array 'A' becomes [7, 0, 0, 8]. The maximum sum subarray is [2], which gives a sum of 8.

After the third operation array 'A' becomes [7, 0, 0, 0]. The maximum sum subarray is [7], which gives a sum of 7.

After the final operation, the updated array 'A' becomes [0, 0, 0, 0]. No subarray is found with non-zero elements. Hence the subarray sum is 0.

Return [9, 8, 7, 0] as our final answer.

For test case 2:
Initial array 'A' is [2, 2, 2, 3]. The states of the array after consecutive operations and respective maximum subarray sum are shown below:

A = [2, 0, 2, 3] have a subarray [2, 3] which gives a sum of 5.

A = [2, 0, 0, 3] have a subarray [3] which gives a sum of 3.

A = [2, 0, 0, 0] have a subarray [2] which gives a sum of 2.

A = [0, 0, 0, 0] have no subarray, hence sum is 0.

Return [5, 3, 2, 0] as our final answer.
Sample Input 2 :
3
5
1 2 3 4 5
4 2 3 5 1
2
2 2
1 2
5
5 5 5 5 5
5 4 3 2 1
Sample Output 2 :
6 5 5 1 0
2 0
20 15 10 5 0
