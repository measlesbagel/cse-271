/***
 *
 * @caglema
 *
 */
public class CodingBat {

	// Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
	// Compute the result recursively (without loops).
	public static int factorial(int n) {
		return (n == 0) ? 1 : n * factorial(n-1);
	}


	// We have a number of bunnies and each bunny has two big floppy ears. We want to compute
	// the total number of ears across all the bunnies recursively (without loops or multiplication).
	public static int bunnyEars(int bunnies) {
		return (bunnies == 0) ? 0 : 2 * 1 +  (bunnyEars(bunnies-1));
	}


	// The Fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition.
	// The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value
	// is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
	// Define a recursive fibonacci(n) method that returns the nth Fibonacci number, with n=0 representing the
	// start of the sequence.
	public static int fibonacci(int n) {
		if(n == 0) return 0;
  	return (n == 1) ? 1 : fibonacci(n-1) + fibonacci(n-2);
	}


	// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
	// The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively
	// return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
	public static int bunnyEars2(int bunnies) {
		if(bunnies == 0) return 0;
  	if(bunnies%2 == 0) return 3 + bunnyEars2(bunnies-1);
  	return 2 + bunnyEars2(bunnies-1);
	}


	// We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks,
	// the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total
	// number of blocks in such a triangle with the given number of rows.
	public static int triangle(int rows) {
		return (rows == 0) ? 0 : rows + triangle(rows-1);
	}


	// Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10
	// yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
	public static int sumDigits(int n) {
		return (n == 0) ? 0 : n%10 + sumDigits(n/10);
	}


	// Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2.
	// (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes
	// the rightmost digit (126 / 10 is 12).
	public static int count7(int n) {
		if(n == 0) return 0;
  	if(n%10 == 7) return 1 + count7(n/10);

  	return count7(n/10);
	}


	// Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, except
	// that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields
	// the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
	public static int count8(int n) {
		if(n == 0) return 0;
  	if(n%10 == 8 && (n/10)%10 == 8) return 2 + count8(n/10);
  	if(n%10 == 8) return 1 + count8(n/10);

  	return count8(n/10);
	}


	// Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power,
	// so powerN(3, 2) is 9 (3 squared).
	public static int powerN(int base, int n) {
		if(n == 1) return base;
  	return base * powerN(base, n-1);
	}


	// Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
	public static int countX(String str) {
		if(str.isEmpty()) return 0;
  	if(str.startsWith("x")) return 1 + countX(str.substring(1));

  	return countX(str.substring(1));
	}



	// Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
	public static int countHi(String str) {
		if(str.length() <= 1) return 0;
  	if(str.substring(0,2).equals("hi")) return 1 + countHi(str.substring(2));

  	return countHi(str.substring(1));
	}


	// Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been
	// changed to 'y' chars.
	public String changeXY(String str) {
  	String ret = "";
  	return changeXY(str, ret);
	}

	private String changeXY(String str, String ret) {
  	if(str.length() == 0) return ret;
  	if(str.substring(0,1).equals("x")) return ret + "y" + changeXY(str.substring(1), ret);

  	return ret + str.substring(0,1) + changeXY(str.substring(1), ret);
	}


	// Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been
	// replaced by "3.14".
	public String changePi(String str) {
  	String ret = "";
  	return changePi(str, ret);
	}

	private String changePi(String str, String ret) {
	  if(str.length() < 2) return ret + str;
  	if(str.substring(0,2).equals("pi")) return ret + "3.14" + changePi(str.substring(2), ret);

  	return ret + str.substring(0,1) + changePi(str.substring(1), ret);
	}


	// Given a string, compute recursively a new string where all the 'x' chars have been removed.
	public static String noX(String str) {
		if(str.length() == 0) return str;
		String first = str.startsWith("x") ? "" : str.substring(0,1);

		return first + noX(str.substring(1));
	}


	// Given an array of ints, compute recursively if the array contains a 6. We'll use the convention of
	// considering only the part of the array that begins at the given index. In this way, a recursive call
	// can pass index+1 to move down the array. The initial call will pass in index as 0.
	public static boolean array6(int[] nums, int index) {
		if(index > nums.length-1) return false;
  	if(nums[index] == 6) return true;

  	return array6(nums, index+1);
	}


	// Given an array of ints, compute recursively the number of times that the value 11 appears in the array.
	// We'll use the convention of considering only the part of the array that begins at the given index.
	// In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
	public static int array11(int[] nums, int index) {
		if(index > nums.length-1) return 0;
  	if(nums[index] == 11) return 1 + array11(nums, index+1);

  	return 0 + array11(nums, index+1);
	}


	// Given an array of ints, compute recursively if the array contains somewhere a value followed in the
	// array by that value times 10. We'll use the convention of considering only the part of the array that
	// begins at the given index. In this way, a recursive call can pass index+1 to move down the array.
	// The initial call will pass in index as 0.
	public static boolean array220(int[] nums, int index) {
		if(nums.length <= 1) return false;
  	if(index > nums.length-2) return false;
  	if(nums[index] == nums[index+1]/10 && nums[index+1]%10 == 0) return true;

  	return array220(nums, index+1);
	}


	// Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
	public static String allStar(String str) {
		if(str.length() <= 1) return str;
  	String stars = str.substring(0,1) + "*";

  	return stars + allStar(str.substring(1));
	}


	// Given a string, compute recursively a new string where identical chars that are adjacent in the original
	// string are separated from each other by a "*".
	public static String pairStar(String str) {
		if(str.length() <= 1) return str;
  	String stars = (str.substring(0,1).equals(str.substring(1,2))) ? str.substring(0,1) + "*" : str.substring(0,1);

  	return stars + pairStar(str.substring(1));
	}


	// Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to
	// the end of the string.
	public String endX(String str) {
  	String ret = "";
  	String ret2 = "";
  	return endX(str, ret, ret2);
	}

	private String endX(String str, String ret, String ret2) {
  	if(str.isEmpty()) return str;
  	ret = (str.startsWith("x")) ? "" : str.substring(0,1);
  	ret2 = (str.startsWith("x")) ? "x" : "";

  	return ret + endX(str.substring(1), ret, ret2) + ret2;
	}


	// We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make
	//  a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the
	//  number of pairs in the given string.
	public static int countPairs(String str) {
		if(str.length() <= 2) return 0;
	  if(str.substring(2,3).equals(str.substring(0,1))) return 1 + countPairs(str.substring(1));

  	return 0 + countPairs(str.substring(1));
	}


	// Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
	public static int countAbc(String str) {
		if(str.length() <= 2) return 0;
  	if(str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba"))
    	return 1 + countAbc(str.substring(1));

  	return 0 + countAbc(str.substring(1));
	}


	// Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11"
	// substrings should not overlap.
	public static int count11(String str) {
		if(str.length() <= 1) return 0;
  	if(str.substring(0,2).equals("11"))
    	return 1 + count11(str.substring(2));

  	return 0 + count11(str.substring(1));
	}


	// Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been
	// reduced to a single char. So "yyzzza" yields "yza".
	public String stringClean(String str) {
  	return cleanString(str, "");
	}

	private String cleanString(String s, String ret) {
		if(s.length() < 2) return ret + s;
		if(s.charAt(0) != s.charAt(1)) ret += s.charAt(0);

		return cleanString(s.substring(1), ret);
	}


	// Given a string, compute recursively the number of times lowercase "hi" appears in the string, however
	// do not count "hi" that have an 'x' immediately before them.
	public static int countHi2(String str) {
		int len = str.length();
  	if(len < 2) return 0;
  	if(str.substring(len-2, len).equals("hi"))
    	if((len > 2 && !str.substring(len-3,len-2).equals("x")) || len == 2)
      	return 1 + countHi2(str.substring(0, len-1));
    	else
	      return 0 + countHi2(str.substring(0, len-1));

  	return 0 + countHi2(str.substring(0, len-1));
	}


	// Given a string that contains a single pair of parenthesis, compute recursively a new string made of only
	// of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
	public static String parenBit(String str) {
		if(str.isEmpty()) return str;
  	if(str.startsWith("(")) {
    	if(str.substring(str.length()-1).equals(")")) {
      	return str;
    	} else {
      	return parenBit(str.substring(0, str.length()-1));
    	}
  	} else {
    	return parenBit(str.substring(1));
  	}
	}


	// Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))".
	// Suggestion: check the first and last chars, and then recur on what's inside them.
	public static boolean nestParen(String str) {
		if (str.isEmpty()) return true;
		if (str.charAt(0) == '(' && str.charAt(str.length()-1) == ')')
	 		return nestParen(str.substring(1,str.length()-1));
  	else
	 		return false;
	}


	// Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in
	// the string, without the sub strings overlapping.
	public static int strCount(String str, String sub) {
		if(str.length() < sub.length()) return 0;
  	if(str.substring(0,sub.length()).equals(sub)) {
    	return 1 + strCount(str.substring(sub.length()), sub);
  	}

  	return 0 + strCount(str.substring(1), sub);
	}


	// Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in
	// the string somewere, possibly with overlapping. N will be non-negative.
	public boolean strCopies(String str, String sub, int n) {
  	return strCopies(str, sub, n, 0);
	}

	private boolean strCopies(String str, String sub, int n, int total) {
  	if(str.length() < sub.length() && total >= n) return true;
  	if(str.length() < sub.length() && total < n) return false;
  	if(str.substring(0,sub.length()).equals(sub)) {
    	total++;
    	return strCopies(str.substring(1), sub, n, total);
  	}

  	return strCopies(str.substring(1), sub, n, total);
	}


	// Given a string and a non-empty substring sub, compute recursively the largest substring which starts and
	// ends with sub and return its length.
	public int strDist(String str, String sub) {
  	return strDist2(str, sub).length();
	}

	private String strDist2(String str, String sub) {
  	int strL = str.length();
  	int subL = sub.length();

  	if(str.isEmpty()) return str;
  	if(str.startsWith(sub)) {
    	if (str.substring(strL-subL, strL).equals(sub)) {
	      	return str;
    	} else {
	      	return strDist2(str.substring(0, strL-1), sub);
	    	}
  	} else {
    	return strDist2(str.substring(1), sub);
  	}
	}

}
