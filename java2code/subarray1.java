import java.util.*;

/*sub array sum */
public class subarray1 {
   public static void subarray(int number[]){
            for(int i=0;i<=number.length;i++){
                int start=i;
                for(int j=i;j<number.length;j++){
                    int end =j;
                    for(int k=start;k<=end;k++){
                        
                        System.out.print(number[k]+" ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println("    sub array");

}    


            



    public static void main(String[] args){
        int number[]={2,4,6,8,10};
        subarray(number);
        
        
    }
    
}