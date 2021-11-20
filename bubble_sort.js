// cmd to run : node bubble_sort.js 5 10 0 3 50 35
// 5 is size of array and rest all are elements
function bubblesort(arr){
    for (let i =0 ; i <arr.length -1; i++){
        for (let j = i; j < arr.length; j ++){
            if (arr[i] > arr[j]){
                let temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    
    console.log(arr);
}
let args = process.argv;
console.log();
let junc = 2;
let n = parseInt(args[junc]); // index 0 1 me file name and dest hoga
junc++;
let arr = [];
for (let i = 0; i<n; i++){
    arr[i] = parseInt(args[junc]);
    junc++;
}
bubblesort(arr);