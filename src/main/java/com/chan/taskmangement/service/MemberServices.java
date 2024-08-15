package com.chan.taskmangement.service;

import com.chan.taskmangement.model.Member;
import com.chan.taskmangement.repository.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberServices {
    MemberRepo memberRepo;
    //contructor injection
    @Autowired
    public MemberServices(MemberRepo memberRepo) {
        this.memberRepo = memberRepo;
    }
    public List<Member>FetchAllMembers(){
        return memberRepo.getAllMembers();
    }
}
