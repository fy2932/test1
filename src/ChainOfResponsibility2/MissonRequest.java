package ChainOfResponsibility2;

public class MissonRequest {


    private int enemyNumber;

    public MissonRequest(int enemyNumber){

        this.enemyNumber = enemyNumber;
    }



    public void setEnemyNumber(int enemyNumber) {
        this.enemyNumber = enemyNumber;
    }



    public int getEnemyNumber() {
        return this.enemyNumber;
    }
}
