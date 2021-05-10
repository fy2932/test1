package ChainOfResponsibility2;

import ChainOfResponsibility2.Misson;
import ChainOfResponsibility2.MissonRequest;

public class Banzhang extends Misson {

    @Override
    public void handleRequest(MissonRequest request) {
        if (request.getEnemyNumber()<10){
            System.out.println("敌人数量为"+request.getEnemyNumber()+",班长下达作战命令");
        }else {
            if (this.successor != null){
                this.successor.handleRequest(request);
            }
        }
    }
}
