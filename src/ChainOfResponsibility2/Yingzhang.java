package ChainOfResponsibility2;

public class Yingzhang extends Misson{

    @Override
    public void handleRequest(MissonRequest request) {
        if (request.getEnemyNumber()<200){
            System.out.println("敌人数量为"+request.getEnemyNumber()+",营长下达作战命令");
        }else {
            System.out.println("敌人数量为"+request.getEnemyNumber()+",需要开会讨论再下达作战命令");
        }
    }
}
