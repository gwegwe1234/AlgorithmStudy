// --- Directions
// Write a function that returns the number of vowels
// used in a string.  Vowels are the characters 'a', 'e'
// 'i', 'o', and 'u'.
// --- Examples
//   vowels('Hi There!') --> 3
//   vowels('Why do you ask?') --> 4
//   vowels('Why?') --> 0

function vowels(str) {
	// solution1
//	let count = 0;
//	for (let i = 0; i < str.length; i++) {
//		if (str[i].toLowerCase() === 'a' || str[i].toLowerCase() === 'e'
//				|| str[i].toLowerCase() === 'i' || str[i].toLowerCase() === 'o'
//				|| str[i].toLowerCase() === 'u')
//			count++;
//	}
//
//	return count;
	
	// solution2
//	let counter = 0;
//	const checker = "aeiou";
//	
//	for(let char of str.toLowerCase()){
//		if(checker.includes(char)){
//			counter++;
//		}
//	}
//	
//	return counter;
	
	// solution3 정규식 사용
	const matches = str.match(/[aeiou]/gi);
	return matches ? matches.length : 0
}

module.exports = vowels;
