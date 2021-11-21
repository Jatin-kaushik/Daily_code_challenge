// cmd to run : node selection_sort.js 5 10 0 3 50 35
// 5 is size of array and rest all are elements

function selectionsort(arr){
    for (let i =0; i < arr.length -1; i++){
        let minidx = i;
        for (let j  = i+1; j <arr.length; j++){
            if (arr[minidx] > arr[j]){
                minidx = j;
            }
        }
        if (minidx != i){
            let temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }
    }
    return arr;
}
let args = process.argv;
let j = 2
let n = parseInt(args[j]);
j++;
let arr = [];
for (let i = 0; i <n; i++){
    arr[i] = parseInt(args[j]);
    j++;
}
console.log(selectionsort(arr));