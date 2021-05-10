package ChainOfResponsibility2;

public class Paizhang extends Misson{

    @Override
    public void handleRequest(MissonRequest request) {
        if (request.getEnemyNumber()<50){
            System.out.println("敌人数量为"+request.getEnemyNumber()+",排长下达作战命令");
        }else {
            if (this.successor != null){
                this.successor.handleRequest(request);
            }
        }
    }
}
