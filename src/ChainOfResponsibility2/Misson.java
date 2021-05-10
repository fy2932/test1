package ChainOfResponsibility2;

import ChainOfResponsibility.Leader;

public abstract class Misson {

    protected Misson successor;

    public void setSuccessor(Misson successor){
        this.successor = successor;
    }

    public abstract void handleRequest(MissonRequest request);

}
