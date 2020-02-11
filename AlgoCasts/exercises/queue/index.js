// --- Description
// Create a queue data structure.  The queue
// should be a class with methods 'add' and 'remove'.
// Adding to the queue should store an element until
// it is removed
// --- Examples
//     const q = new Queue();
//     q.add(1);
//     q.remove(); // returns 1;

// Queue를 배열로 만든다. 
class Queue {
	constructor(){
		this.data = [];
	}
	
	add(record){
		this.data.unshift(record);        // unshift는 맨앞에 추가 
	}
	
	remove(){
		return this.data.pop();
	}
}

module.exports = Queue;
