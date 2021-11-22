// cmd to run : node insertion_sort.js 5 10 0 3 50 35
// 5 is size of array and rest all are elements
function insertionsort(arr){
    for (let i = 1; i<arr.length; i++){
        let current = arr[i];
        let j = i-1;
        while(j>=0 && arr[j] > current){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = current;
    }
    return arr;
}

let args = process.argv;
let n = parseInt(args[2]);
let j =3;
let arr = [];
for (let i = 0; i<n; i++){
    arr[i] = parseInt(args[j]);
    j++
}
console.log(insertionsort(arr));