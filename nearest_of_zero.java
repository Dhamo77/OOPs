/*program to find the nearest number of zero*/
public class nearest_of_zero {
        public static void main(String[] args) {
            double[] mat ={-5,-1.7,2,12,1.7};
            System.out.println(find(mat));
        }
        public static double find(double[] arr){
            double near =Integer.MAX_VALUE;
            for (int i=1;i<arr.length;i++){
                double  min=arr[i];
                if(Math.abs(min)<Math.abs(near)||( (Math.abs(near)==Math.abs(min))&&min>near))
                    near = min;
            }
            return near;
        }
}
