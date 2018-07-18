package com.zqh.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @RequestMapping("/getMembers")
    public String getMembers() {
        return "members";
    }
}
