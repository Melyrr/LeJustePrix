public class test{
    public static void main(String[] args) {
    int[] arr = {2,40,55,-6,-2,-3};

int closestIndex = 0;
int diff = Integer.MAX_VALUE;
for (int i = 0; i < arr.length; ++i) {
    int abs = Math.abs(arr[i]);
    if (abs < diff) {
        closestIndex = i;
        diff = abs;
    }
}   
System.out.println(arr[closestIndex ]);
    }
}