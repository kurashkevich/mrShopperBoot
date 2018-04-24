package com.mrshopper.project.controller;

import com.mrshopper.project.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/roles")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;
}
