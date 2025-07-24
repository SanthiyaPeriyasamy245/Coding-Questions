package Queue;

class PlusOne {

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] digits = {1, 2, 3};
        int[] result = plusOne.plusOne(digits);
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
    public int[] plusOne(int[] digits) {

        int n=digits.length;

        for(int i=n-1;i>=0;i--)
        {
            if(digits[i]+1<10)
            {
                digits[i]=digits[i]+1;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }

        int[]arr=new int[digits.length+1];
        arr[0]=1;
        return arr;

    }
}