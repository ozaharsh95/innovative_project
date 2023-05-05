
var dd=[]
// var mySet=new Set();
// mySet.add(0);
var k=0;
var arr=[];
var maxi=[];
var l1=[];
var ds=[];
var numOfInterval=0;
var l2=[];

var labelAnsChart=[];
var dataSetAns=[];

var flag=false;
var flag2=false;

function isNum(value){
    const c=+value;
    if(c){
        return true;
    }else{
        return false;
    }
}

function myFunction(){
    var x = document.getElementById("myNumber");
    var currentVal = x.value;
    numOfInterval=currentVal;
    flag=true;
    for(var i=0;i<currentVal;i++){
        const obj={
            start:"abc",
            end:"def",
            weight:"xxx"
        }
        obj.start=prompt('Enter the starting of: ');
        if(obj.start.trim().length===0||obj.start===null){
            alert('Please Enter the Valid Input');
            return;
        }
        if(!isNum(obj.start)){
            alert('Please Enter Numeric value');
            return;
        }
        obj.end=prompt('Enter the ending of: ');
        if(obj.end.trim().length===0||obj.end===null){
            alert('Please Enter the Valid Input');
            return;
        }
        if(!isNum(obj.end)){
            alert('Please Enter Numeric value');
            return;
        }
        obj.weight=prompt('Enter the weight of ');
        if(obj.weight.trim().length===0||obj.weight===null){
            alert('Please Enter the Valid Input');
            return;
        }
        if(!isNum(obj.weight)){
            alert('Please Enter Numeric value');
            return;
        }
        // mySet.add(parseInt(obj.end));
        maxi.push(parseInt(obj.end));
        dd.push(obj);
        console.log(obj.start,obj.end,obj.weight);
    }

    k=Math.max.apply(null,[...maxi]);
    // console.log(maxi);
    // console.log(parseInt(k));
    if(k>0){
        arr=new Array(k-1).fill(0);
        console.log(arr.length);
        dd.forEach(function(d){
            let s=parseInt(d.start);
            let e=parseInt(d.end);
            let w=parseFloat(d.weight);
            
            for(let i=s-1;i<e-1;i++){
                arr[i]+=w;
            }
            
        });
    }else{
        console.log("ERROR IN ARRAY LENGTH");
        return;
    }
    // console.log(arr);
    
}

function labelMake(a){
    let b=parseInt(a);
    for(let i=1;i<=b;i++){
        l1.push(i.toString(10));
    }
}

function labMake(index){
    return index.toString(10);
}

function dataBanavo(index){
    let startValue=dd[index].start;
    let endValue=dd[index].end;
    let weightValue=dd[index].weight;
    
    let list=[];

    for(let i=1;i<=endValue;i++){
       
        if(i>=startValue){
            list.push(weightValue);
        }else{
            list.push(null);
        }
    }

    return list;
}

function dsMake(num){
    let n=num;
    for(let i=0;i<n;i++){
        let lab=labMake(i);
        let arrayData=dataBanavo(i);
        const obj={
            label:lab,
            data: arrayData,
            backgroundColor:[
                'rgba(255, 26, 104, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
                'rgba(75, 192, 192, 0.2)',
                'rgba(153, 102, 255, 0.2)',
                'rgba(255, 159, 64, 0.2)',
                'rgba(0, 0, 0, 0.2)'
        
        ],
            borderColor:[
                'rgba(255, 26, 104, 1)',
                'rgba(54, 162, 235, 1)',
                'rgba(255, 206, 86, 1)',
                'rgba(75, 192, 192, 1)',
                'rgba(153, 102, 255, 1)',
                'rgba(255, 159, 64, 1)',
                'rgba(0, 0, 0, 1)'
            
            ],
            borderWidth:1
        }
        ds.push(obj);
    }

}
function myFunction2(){

    if(flag!=true){
        alert("First enter valid inputs before generating the graph...");
        return;
    }

    flag2=true;
    labelMake(k);
    dsMake(numOfInterval);
    // var trr=myFunction();

    const data={
        labels:l1,
        datasets:ds
    };
    // console.log(l1);
    // console.log(arr);
    // console.log(dd);
    console.log(ds);
    // console.log(data);
    const config = {
        type: 'line',
        data,
        options: {
          scales: {
              x:{
                  // min:'1',
                  // max:'7'
                  title:{
                    display: true,
                    text: 'Range of intervals'
                  }
              },
            y: {
              beginAtZero: true,
              title:{
                display: true,
                text: 'Weights of intervals'
              }
            }
          },
          plugins:{
            title:
            {
                display: true,
                text: 'System of weighted intervals'
            }
      }
        }
      };
  
      // render init block
      const myChart = new Chart(
        document.getElementById('myChart1'),
        config
      );
  
      // Instantly assign Chart.js version
      const chartVersion = document.getElementById('chartVersion');
      chartVersion.innerText = Chart.version;
}

function makeLabelAns(b){
    
    for(let i=1;i<=b;i++){
        labelAnsChart.push(i.toString(10));
    }
}

function makeSmallData(index){
    let value=arr[index];
    let list=[];
    /*
            0
            0 
        1       2
        [v,v]

            0     1
        1   2    3
        [null,v,v]
    */
    for(let i=0;i<=index+1;i++){
        if(i==index||i==index+1){
            list.push(value);
        }else{
            list.push(null);
        }
    }

    return list;
}

function makeDataSetAns(number){
    for(let i=0;i<number;i++){
        let lab=i.toString(10);
        let arrayData=makeSmallData(i);
        const obj={
            label:lab,
            data: arrayData,
            backgroundColor:[
                'rgba(255, 26, 104, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
                'rgba(75, 192, 192, 0.2)',
                'rgba(153, 102, 255, 0.2)',
                'rgba(255, 159, 64, 0.2)',
                'rgba(0, 0, 0, 0.2)'
        
        ],
            borderColor:[
                'rgba(255, 26, 104, 1)',
                'rgba(54, 162, 235, 1)',
                'rgba(255, 206, 86, 1)',
                'rgba(75, 192, 192, 1)',
                'rgba(153, 102, 255, 1)',
                'rgba(255, 159, 64, 1)',
                'rgba(0, 0, 0, 1)'
            
            ],
            borderWidth:1
        }

        dataSetAns.push(obj);
    }
}

function myfuncAns(){
    console.log(arr);
    if(flag2!=true){
        alert("Please Generate 1st Graph....");
    }
    makeLabelAns(k);
    makeDataSetAns(k);
    const data={
        labels:labelAnsChart,
        datasets:dataSetAns
    };
    console.log(dataSetAns)
    const config = {
        type: 'line',
        data,
        options: {
          scales: {
              x:{
                  // min:'1',
                  // max:'7'
                  title:{
                    display: true,
                    text: 'Range of intervals'
                  }
              },
            y: {
              beginAtZero: true,
              title:{
                display: true,
                text: 'Sum of weight of intervals'
              }
            }
          },
          plugins:{
                title:
                {
                    display: true,
                    text: 'System of sum of weighted intervals'
                }
          }
        }
      };
      const myChart = new Chart(
        document.getElementById('myChart2'),
        config
      );
  
      // Instantly assign Chart.js version
      const chartVersion = document.getElementById('chartVersion');
      chartVersion.innerText = Chart.version;
}