package action;

import com.opensymphony.xwork2.ActionSupport;
import service.Impl.UserServiceImpl;
import service.UserService;
import vo.User;

public class UserAction extends ActionSupport {
    private User user;
    private String info;
    private UserService userService = new UserServiceImpl();

    public String login() throws Exception {
        if(userService.login(user)){
            return "showUser";
        }else {
            info = "登陆失败";
            return "return";
        }
    }


    public String register() throws Exception {
        if(userService.register(user)){
            info = "注册成功";
            return "return";
        }else {
            info = "注册失败";
            return "regFail";
        }

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
