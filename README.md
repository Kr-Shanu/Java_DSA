### Java_DSA

The given repo contains some of the important DSA questions in java.

The questions are as follows :


1.  [Age Detector](ageDetector.java) 
  - Find the current age of the user if user enters the last two digits of the year of birth and the current year.

2.  [Alice Apple](aliceApple.java) 
  - There are different kinds of apple trees in the four directions (East, West, North, South), which may grow both red and green apples    such that each tree grows exactly K apples, in the following manner:

  - N – number of trees to the north do not have red apples.
  - S – number of trees to the south do not have green apples.
  - W – number of trees in the west have some red apples.
  - E – number of trees in the east have some green apples.
  - However, the colors of apples can not be distinguished outside the house. So, the task is to find the minimum number of apples to be collected from the trees to guarantee M red apples. If it is not possible, print -1.

3.  [Binary Paliandrome](binaryPaliandrome.java) 
  - Check whether the given number is Binary Paliandrome or Not.

4.  [Co Prime](coPrime.java) 
  - Find sum of all co prime of the given number.

5.  [Confused Pappu](confusedPappu.java) 
  - Pappu is confused between 6 & 9. He works in the billing department of abc company and his work is to return the remaining amount to the customers. If the actual remaining amount is given we need to find the maximum possible extra amount given by the pappu to the customers.

6.  [GCD](gcd.java) 
  - Find the greatest common factor of two numbers.

7.  [Hour Glass](hourGlass.java) 
  - Given a 2D matrix, the task is to find the maximum sum of an hourglass.

  - An hour glass is made of 7 cells
in following form.
  -     A B C
  -       D
  -     E F G


  - Examples: 
  - 
  - Input 
  -         1 1 1 0 0 
  -         0 1 0 0 0 
  -         1 1 1 0 0 
  -         0 0 0 0 0 
  -         0 0 0 0 0 
  - Output : 7
  - Below is the hour glass with
  - maximum sum:
  -         1 1 1 
  -           1
  -         1 1 1
                                                      
  - Input   
  -         0 3 0 0 0
  -         0 1 0 0 0
  -         1 1 1 0 0
  -         0 0 2 4 4
  -         0 0 0 2 4
  - Output : 11
  - Below is the hour glass with
  - maximum sum
  - 1 0 0
  -   4
  - 0 2 4

8.  [Kaprekar](kaprekar.java) :
  -  A Kaprekar number is a number whose square when divided into two parts and such that sum of parts is equal to the original number and none of the parts has value 0. 

  - Input :  n = 45  
  - Output : Yes
  - Explanation : 452 = 2025 and 20 + 25 is 45

  - Input : n = 13
  - Output : No
  - Explanation : 132 = 169. Neither 16 + 9 nor 1 + 69 is equal to 13

9.  [Lab Allocation](labAllocation.java) : 

10. [Leader In Array](leaderInAnArray.java) 
  - Write a program to print all the LEADERS in the array. An element is leader if it is greater than all the elements to its right side. And the rightmost element is always a leader. For example in the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2. 
Let the input array be arr[] and size of the array be size.

11. [Lexicographic Paliandrome](lexicographicPaliandrome.java) 
  - Rearrange the characters of the given string to form a lexicographically first palindromic string. If no such string exists display message “no palindromic string”.

  - Examples:

  - Input : malayalam
  - Output : aalmymlaa

  - Input : apple
  - Output : no palindromic string

12. [Longest Occurance Of one By Flipping Only One Zero Of a Binary](longestOneByFlippingOneZero.java) 
  - Find the longest occurance of one in the binary number if we get to replace one of the zero of the given binary number.

13. [Majority Element](majorityElements.java) 
  - Write a function which takes an array and prints the majority element (if it exists), otherwise prints “No Majority Element”. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). 

Examples : 

  - Input 
  -     {3, 3, 4, 2, 4, 4, 2, 4, 4}
  - Output : 4
  - Explanation: The frequency of 4 is 5 which is greater
than the half of the size of the array size. 

  - Input 
  -      {3, 3, 4, 2, 4, 4, 2, 4}
  - Output : No Majority Element
  - Explanation: There is no element whose frequency is
greater than the half of the size of the array size.

14. [Finding Mango Tree](mango.java) 
  - Dora is very much interested in gardening and she decides to plant more trees in her garden. She plants trees in the order of rows and columns. She numbered the trees in column wise order. She planted the mango trees only in the second column from both first and last. But later when the trees grew up, she forgot where she planted mango trees. So help her find out whether the given tree number is a number of mango trees or not. Display whether “It is a mango tree” or “It is not a mango tree”.

15. [Max Multiple Of a Sub-Array](maxMultipleOfSubArray.java) 
  - Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers that has the largest sum. 

16. [Prime Number](prime.java) 
  - Find prime number between 2 to the number given by th e user.

17. [Reverse binary](reverseBinary.java) 
  - Reverse the binary number given by the user.

18. [Selection Sort](selectionSort.java) 
  - Perform selection sort in ascending and descending order of the given array.

19. [Series 7](series7.java) :

20. [Simple Sieve](simpleSieve) : 

21. [Strobogramatic Number](strobogrammatic.java) 
  - For the given length n, find all n-length Strobogrammatic numbers.

  - Strobogrammatic Number is a number whose numeral is rotationally symmetric so that it appears the same when rotated 180 degrees. In other words, Strobogrammatic Number appears the same right-side up and upside down.

  -     0 after 180° rotation : (0 → 0)
  -     1 after 180° rotation : (1 → 1)
  -     8 after 180° rotation : (8 → 8)
  -     6 after 180° rotation : (6 → 9)
  -     9 after 180° rotation : (9 → 6)

  - Examples :  - 

  - Input : n = 2
  - Output : 88  11  96  69

  - Input : n = 4
  - Output : 
  
  -          8008 1001 9006 6009 8888 1881 9886 6889 8118 1111
  -          9116 6119 8968 1961 9966 6969 8698 1691 9696 6699

22. [Sum Of Number Divisible by 3 & 5](sumOfNumberDivisibleBy3And5.java) 
  - Find all the number divisible by 3 and 5 between the given range


23. [Sum Of Prime Factors](sumOfPrimeFactors.java) 
  - Find sum of prime factors.

24. [Move the hyphen to the start](moveTheHyphenToTheStart.java)
  - Move all the hyphen in the sentence to the start of the string, also place spaces in between to distinguish different words.

  - Input :
  -          "Move-the-hyphen-to-the-start"

  - Output :
  -          "-----Move the hyphen to the start"

25. [MANACHERS](Manachers.java)
  - This is a method to check paliandrome number where we split the word into two half and compare them side by side.

  - Example :

  - Input :
  -          APPLE

  - Split it 
  -          AP-P-LE

  - Check P with L and A with E

  - Output :
  
  -          The given word is not paliandrome

26. [Concept of Natural Sorting](Natural_Sort.txt)
- Concept: Diffence between Computer and Natural Sorting.

27. [Block Swap Array](blockSwapArray.java) 
  - Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.

  - Example :-

  - Input:

  -          {1, 2, 3, 4, 5}
  -          d = 2

  - Output:

  -          Swapped array: {3, 4, 5, 1, 2}

28. [Count Co-Primes](coPrimeWithGCD.java)
  - Count the number of co prime the given number has, do remember a prime number has co prime number equal to n-1, where n is the prime number.

  - Example:-

  - Input:
  -          n = 13
  - Output:
  -          The count of coprime for 13 = 12

29. [Permutation](permutation.java)
  - Find all the permuation of a given character array or integer array.

  - Example

  - Input:
  -          {A, B, C}

  - Output:  
  -          ABC ACB BAC BCA CBA CAB