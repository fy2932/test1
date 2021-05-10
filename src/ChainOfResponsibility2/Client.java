package ChainOfResponsibility2;

public class Client {

    public static void main(String[] args) {
        Misson objBanzhang,objPaizhang,objYingzhang,objDiscussion;

        objBanzhang = new Banzhang();
        objPaizhang = new Paizhang();
        objYingzhang = new Yingzhang();
       // objDiscussion = new Discussion();

        objBanzhang.setSuccessor(objPaizhang);
        objPaizhang.setSuccessor(objYingzhang);
       // objYingzhang.setSuccessor(objDiscussion);

        MissonRequest lr1 = new MissonRequest(5);
        objBanzhang.handleRequest(lr1);

        MissonRequest lr2 = new MissonRequest(30);
        objBanzhang.handleRequest(lr2);

        MissonRequest lr3 = new MissonRequest(111);
        objBanzhang.handleRequest(lr3);

        MissonRequest lr4 = new MissonRequest(305);
        objBanzhang.handleRequest(lr4);
    }

}
