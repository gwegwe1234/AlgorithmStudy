// --- Directions
// Given a string, return true if the string is a palindrome
// or false if it is not.  Palindromes are strings that
// form the same word if it is reversed. *Do* include spaces
// and punctuation in determining if the string is a palindrome.
// --- Examples:
//   palindrome("abba") === true        --> Reverse "abba" same. 좌우가 같은거
//   palindrome("abcdefg") === false

function palindrome(str) {
	/*
	 * 1st Solution
	 */
	const reversed = str.split('').reverse().join('');
	
	return str === reversed;
	
	
	
	
	/*
	 * 2nd Solution
	 */
//	str.split('').every((char, i) => {
//		return char === str[str.length - i - 1];
//	});
}

module.exports = palindrome;
