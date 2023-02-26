package com.example.students2.controller;

import com.example.students2.dto.GetGroupDTO;
import com.example.students2.dto.GroupRequestAddDTO;
import com.example.students2.service.GroupService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/group" )
public class GroupController {

    private final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @PostMapping("/add")
    public void add(@RequestBody GroupRequestAddDTO groupRequestAddDTO){
        groupService.add(groupRequestAddDTO);
    }

    @GetMapping("/get")
    public GetGroupDTO get(@RequestParam Long id){
        return groupService.get(id);
    }

    @DeleteMapping("/delete")
    public void delete ( @RequestParam Long id ) {
        groupService.delete(id);
    }
}
