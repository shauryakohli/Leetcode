class Solution {
  
     public static int getNumber(int n){
         System.out.println(n);
         if(n<10){
            if(n==1) return 1;
            if(n==7) return 1;
        return 0;
        } 
        int sum=0, num =0;
         while(n!=0){
            System.out.printf("Inside while : n = %d, num = %d\n",n,num);
            num = n % 10;
            sum = sum + (num * num);
            n = n / 10;
        }
       return getNumber(sum);
    }
      public boolean isHappy(int n) {
        if(getNumber(n) == 1) return true;
        return false;
    }
}