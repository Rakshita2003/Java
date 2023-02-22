class Main{
    static int max(int[] arr){
    if(arr.length==0){
        return -1;
    }
        int maxVal=arr[0];
        for(int i=1;i<arr.length;i++) {
            if (arr[i] > maxVal) { //to find min value just use "<" sign
                maxVal = arr[i];
            }
        }
            return maxVal;
    }

    public static void main(String[] args) {
        int[] arr={1,23,9,18,99};

        System.out.println(max(arr));
    }
}
