const reverse = (arr) => {
    let left = 0, right = arr.length -1;
    while(left <= right){
        let temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
    return arr;
}
const arr = [1,3,2,2,-4,-6,-2,8]
console.log(reverse(arr));
