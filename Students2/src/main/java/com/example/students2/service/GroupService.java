package com.example.students2.service;

import com.example.students2.dto.GetGroupDTO;
import com.example.students2.dto.GroupRequestAddDTO;

public interface GroupService {

    void add (GroupRequestAddDTO groupRequestAddDTO);

    GetGroupDTO get (Long id);

    void delete (Long id);
}
