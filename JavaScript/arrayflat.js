bhaiya ye error aa rha h mere flat me

let arr = [10,20,[30, [40,50], 60], 70, [80, 90, [100, 110], 120], 35];
let res1 = arr.flat(1);
console.log(res1);

let res2 = arr.flat(2);
console.log(res2);

TypeError: arr.flat is not a function
    at Object.<anonymous> (/media/jatin/HDD Rough/Code/VS-Code/Linkedin_Momentum_Challenge/JavaScript/arrayflat.js:2:16)
    at Module._compile (internal/modules/cjs/loader.js:778:30)
    at Object.Module._extensions..js (internal/modules/cjs/loader.js:789:10)
    at Module.load (internal/modules/cjs/loader.js:653:32)
    at tryModuleLoad (internal/modules/cjs/loader.js:593:12)
    at Function.Module._load (internal/modules/cjs/loader.js:585:3)
    at Function.Module.runMain (internal/modules/cjs/loader.js:831:12)
    at startup (internal/bootstrap/node.js:283:19)
    at bootstrapNodeJSCore (internal/bootstrap/node.js:623:3)