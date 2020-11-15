package com.drmarkdown.auth.controllers;

import com.drmarkdown.auth.dtos.RoleDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/role")
public class RoleController {

    @PostMapping("/create")
    public RoleDTO createRole(@RequestBody RoleDTO roleDTO) {
        RoleDTO resp = new RoleDTO();
        resp.setRole(roleDTO.getRole());
        resp.setCreatedAt(new Date());
        return resp;
    }

    @GetMapping("/info/{roleId}")
    public RoleDTO getRoleInfo(@PathVariable String roleId) {
        RoleDTO resp = new RoleDTO();
        resp.setRole("Hyper-Super-Maximus");
        resp.setCreatedAt(new Date());
        return resp;
    }
}
