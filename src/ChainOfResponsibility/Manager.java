package ChainOfResponsibility;

//具体处理者（经理类）

public class Manager extends Leader{

    public Manager(String name){
        super(name);
    }

    @Override
    public void handleRequset(LeaveRequest request) {
        if (request.getLeaveDays()<10){
            System.out.println("经理"+name+"审批员工"+request.getLeaveName()+"的请假条，请假天数为"+request.getLeaveDays()+"天。");
        }else {
            if (this.successor != null){
                this.successor.handleRequset(request);
            }
        }
    }
}
