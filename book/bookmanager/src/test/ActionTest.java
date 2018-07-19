package test;

import com.opensymphony.xwork2.ActionSupport;

public class ActionTest extends ActionSupport {
    private Student testReq;

    @Override
    public String execute() throws Exception {
        System.out.println("************************************************************");
        System.out.println(testReq.getId());
        testReq.setId(testReq.getId()+1);
        return "test";
    }

    public Student getTestReq() {
        return testReq;
    }

    public void setTestReq(Student testReq) {
        this.testReq = testReq;
    }
}
