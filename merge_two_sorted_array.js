// cmd to run : node merge_two_sorted_array.js 3 10 20 30 5 0 15 17 25 50
// 3 is size of array and next 3 are elements of arr1, 5 is size of arr2 and left all are elements of arr2
function mergearray(arr1, arr2){
    let i= 0;
    let j = 0;
    let k = 0;
    let res = [];
    // console.log(arr1, arr2);

    while(i<arr1.length && j<arr2.length){
        // console.log(arr1[i], arr2[j]);
        if (arr1[i] < arr2[j]){
            // console.log("if");
            res[k] = arr1[i];
            k++;
            i++;
        }
        else{
            // console.log("else");
            res[k] = arr2[j];
            k++;
            j++;
        }
    }
    if (i == arr1.length){
        while(j== arr2.length){
            res[k] = arr2[j];
            k++;
            j++;
        }
    }
    if (j == arr2.length){
        while(i== arr1.length){
            res[k] = arr1[i];
            i++;
            k++;
        }
    }
    return res;
}

let args = process.argv;
let n1 = parseInt(args[2]);
let arr1 = [];
let j =3;
for(let i = 0; i< n1; i++){
    arr1[i] = parseInt(args[j]);
    j++;
}
let n2 = parseInt(args[j]);
j++;
let arr2 = [];
for (let i = 0; i<n2; i++){
    arr2[i] = parseInt(args[j]);
    j++;
}

console.log(mergearray(arr1, arr2));