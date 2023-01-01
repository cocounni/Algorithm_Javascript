class Solution2 {
    public long solution2(long n) {

        char[] arr = Long.toString(n).toCharArray();
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] > arr[i]) {
                    char tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }


        return Long.valueOf(new String(arr));
    }
}