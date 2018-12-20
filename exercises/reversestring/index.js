// --- Directions
// Given a string, return a new string with the reversed
// order of characters
// --- Examples
//   reverse('apple') === 'leppa'
//   reverse('hello') === 'olleh'
//   reverse('Greetings!') === '!sgniteerG'

function reverse(str) {
	
	//way1
//	let reversed = '';
//	
//	for (let character of str){
//		reversed = character + reversed;
//	}
//	
//	return reversed;
	
	//way2
//	return str.split('').reduce((reversed, character) => {
//		return character + reversed;
//	},'');

	
	//way3 람다식인듯
	return str.split('').reduce((reversed, character) => character + reversed,'');
	
}

reverse('asdf');

module.exports = reverse;
