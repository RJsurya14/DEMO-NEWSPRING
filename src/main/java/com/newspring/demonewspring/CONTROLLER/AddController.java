package com.newspring.demonewspring.CONTROLLER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.newspring.demonewspring.dao.listRepository;
import com.newspring.demonewspring.model.collegeadmin;



@Controller

public class AddController {
    @Autowired
    listRepository ld;

@RequestMapping("/")
public String home()
{
   return "emplyee.jsp" ;
}

    @RequestMapping("/emplyee")
    @ResponseBody
    public String emplyee (collegeadmin l){
        ld.save(l);
        return "Successfully you run the program";
    } 
    
}
