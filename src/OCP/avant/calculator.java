package OCP.avant;

public class calculator {
    public int calculator( String operation,int a,int b){
        if (operation.equals("add")){
            return a+b;
        }
        else if(operation.equals("sub")){
            return a-b;
        }
        return 0;
    }
}
