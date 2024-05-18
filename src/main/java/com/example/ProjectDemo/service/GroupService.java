package com.example.ProjectDemo.service;

import com.example.ProjectDemo.entity.Group;

import java.util.List;

public interface GroupService {
    Group createGroup(Group group);

    List<Group> getAllGroups();
}