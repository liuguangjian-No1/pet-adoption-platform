package com.jxau.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jxau.entity.Users;
import com.jxau.service.UsersService;
import com.jxau.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("user")
public class UsersController {

    @Autowired
    private UsersService usersService;


    @RequestMapping("users.action")
    @ResponseBody
    public Message getUsers(@RequestParam(value = "pn",defaultValue = "1") Integer pn){
        PageHelper.startPage(pn,6);
        List<Users> users = usersService.getUsers();
        PageInfo page=new PageInfo(users,4);
        return Message.success().add("pageInfo",page);
    }


    @RequestMapping("create.action")
    @ResponseBody
    public Message create(Users users,String username){

        if(usersService.findByUsername(username)!=null){
            return Message.fail();
        }

        if(usersService.addUser(users)>0){
            return Message.success();
        }else{
            return Message.fail();
        }
    }

    @RequestMapping("delete.action")
    @ResponseBody
    public Message deleteUsers(Integer id){
        if(usersService.deleteUser(id)>0){
            return Message.fail();
        }else{
            return Message.fail();
        }
    }

    @RequestMapping("update.action")
    @ResponseBody
    public Message updateUser(Users users, HttpServletRequest request){
        if(usersService.updateUser(users)>0){
            Users user=usersService.findById(users.getId());
            request.getSession().setAttribute("user",user);
            return Message.success();
        }else{
            return Message.fail();
        }
    }

    @RequestMapping("updatePic.action")
    @ResponseBody
    public Message updatePic(MultipartFile file, HttpServletRequest request){
        Users user=(Users) request.getSession().getAttribute("user");
        if(file!=null){
            String load = FileLoad.load(file);
            user.setPic(load);
        }
        if(usersService.updateUser(user)>0){
            Users users = usersService.findById(user.getId());
            request.getSession().setAttribute("user",users);
            return Message.success();
        }else{
            return Message.fail();
        }
    }
    @RequestMapping("findById.action")
    @ResponseBody
    public Message findById(Integer id){
        Users user = usersService.findById(id);
        if(user!=null){
            return Message.success().add("user",user);
        }else{
            return Message.fail();
        }
    }



    @RequestMapping("findByName.action")
    @ResponseBody
    public Message findByName(String userName,@RequestParam(value = "pn",defaultValue = "1") Integer pn){
        PageHelper.startPage(pn,4);
        List<Users> users = usersService.findByName(userName);
        if(users!=null){
            PageInfo page=new PageInfo(users,3);
            return Message.success().add("pageInfo",page);
        }else{
            return Message.fail();
        }
    }


    @RequestMapping("login.action")
    @ResponseBody
    public Message login(Users users, HttpServletRequest request){
        Users user = usersService.loginUser(users);
        if(user!=null){
            request.getSession().setAttribute("user",user);
            return Message.success().add("user",user);
        }else{
            return Message.fail();
        }
    }

    @RequestMapping("logout.action")
    public String logout(HttpServletRequest request, HttpServletResponse response){
        request.getSession().invalidate();
        return "redirect:/animal/user/index.jsp";
    }
}
