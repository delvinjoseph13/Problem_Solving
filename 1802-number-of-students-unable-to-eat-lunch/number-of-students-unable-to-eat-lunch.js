/**
 * @param {number[]} students
 * @param {number[]} sandwiches
 * @return {number}
 */
class CustomQueue {
    constructor() {
        this.items = [];  
    }


    enqueue(x) {
        this.items.push(x);
    }


    dequeue() {
        if (this.isEmpty()) {
            return "Queue is empty";
        }
        return this.items.shift();
    }


    front() {
        if (this.isEmpty()) {
            return "Queue is empty";
        }
        return this.items[0];
    }

 
    isEmpty() {
        return this.items.length === 0;
    }

 
    size() {
        return this.items.length;
    }
}
var countStudents = function(students, sandwiches) {
    let queue=new CustomQueue();

    for(let student of students){
        queue.enqueue(student)
    }
    let passCount=0;
    let index=0;

    while(!queue.isEmpty() && passCount <queue.size()){
        if(queue.front()===sandwiches[index]){
            queue.dequeue();
            index++;
            passCount=0;
        }else{
            queue.enqueue(queue.dequeue());
            passCount++;
        }
    }
    return queue.size();
};