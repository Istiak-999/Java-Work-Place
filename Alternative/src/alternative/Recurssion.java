
package alternative;

public class Recurssion {
    int recursion(int size){
        if(size==0)
            return 0;
        if(size==1 || size==2)
            return 1;
        return recursion(size-1)+recursion(size-2);
    }
    
}
