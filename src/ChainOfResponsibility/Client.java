package ChainOfResponsibility;

public class Client {

    public static void main(String[] args) {
        Leader objDirector,objManager,objGeneralManager;

        objDirector = new Director("王明");
        objManager = new Manager("赵强");
        objGeneralManager = new GeneralManager("李波");

        objDirector.setSuccessor(objManager);
        objManager.setSuccessor(objGeneralManager);

        LeaveRequest lr1 = new LeaveRequest("张三",2);
        objDirector.handleRequset(lr1);

        LeaveRequest lr2 = new LeaveRequest("李四",7);
        objDirector.handleRequset(lr2);

        LeaveRequest lr3 = new LeaveRequest("王五",20);
        objDirector.handleRequset(lr3);

        LeaveRequest lr4 = new LeaveRequest("赵六",50);
        objDirector.handleRequset(lr4);

    }

}
