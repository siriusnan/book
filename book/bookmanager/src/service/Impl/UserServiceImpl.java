package service.Impl;

import dao.UserDao;
import service.UserService;
import vo.User;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDao();


    @Override
    public boolean login(User user) {
        String loginAccount = user.getAccount();
        String loginPassword = user.getPassword();
        String password = userDao.queryByAccount(loginAccount).getPassword();
//        用户登陆测试
//        System.out.println(loginPassword+"          "+password);
//        System.out.println((password.equals(loginPassword))+"          "+ (password != null) );
        if (password != null){
            if (password.equals(loginPassword)) {
                return true;
            }
        }
        return false;

    }

    @Override
    public boolean register(User user) {
        String password = userDao.insertUser(user).getPassword();
//        用户注册测试
//        System.out.println(password);
//        System.out.println();
        if(password == null){
            return false;
        }else if (password.equals("succ")) {
            return true;
        }else {
            return false;
        }

    }
}
