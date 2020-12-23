package com.xinwen.springboottest.controller;

import com.xinwen.springboottest.Account;
import com.xinwen.springboottest.UserManagerInterface;
import com.xinwen.springboottest.entity.Spj_p;
import com.xinwen.springboottest.entity.Xinwen;
import com.xinwen.springboottest.reposity.Xinwenreposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/xinwen")
public class XinwenHander {
    @Autowired
    private Xinwenreposity xinwenreposity;

    @GetMapping("/findAll/{page}/{size}")
    public Page<Xinwen> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        Pageable pageable = PageRequest.of(page - 1, size);
        return xinwenreposity.findAll(pageable);
    }

    //摘要实现
    @PostMapping("/save")
    public String save(@RequestBody Xinwen xinwen) {
        String str1 = xinwen.getRiqi();
        String str2 = xinwen.getShijian();
        String fin = str1 + str2;
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 2018);
            UserManagerInterface userManager = (UserManagerInterface) registry.lookup("userManager");
            String zhaiyao = userManager.getString(fin);
            xinwen.setZhaiyao(zhaiyao);
            System.out.println(zhaiyao);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
        Xinwen result = xinwenreposity.save(xinwen);
        if(result != null){
            return "success";
        }else{
            return "error";
        }
    }

    @GetMapping("/findById/{riqi}")
    public Xinwen findById(@PathVariable("riqi") String riqi){
        return xinwenreposity.findById(riqi).get();
    }

    @PutMapping("/update")
    public String update(@RequestBody Xinwen xinwen){
        Xinwen result = xinwenreposity.save(xinwen);
        if(result != null){
            return "success";
        }else{
            return "error";
        }
    }

    @DeleteMapping("/deletebyid/{riqi}")
    public void deletebyid(@PathVariable("riqi") String riqi){
        xinwenreposity.deleteById(riqi);
    }

    //模糊查询
 /*   @GetMapping("/riqi")
    public int findByRiqiLike(){
        int j=0;
            List<Xinwen> s = xinwenreposity.findByRiqiLike("%"+"202001"+"%");
            for (int l = 0; l < s.size(); l++) {
                System.out.println(s.get(l));
                j++;
            }
        return j;
    }
*/
}

