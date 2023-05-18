package com.example.auth.repository;

import com.example.auth.entitiy.Member;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {
    /*
    ******** - API Example - ********
    GET: members/{id}/{property} , /members, /members/search/{search}
    *********************************
     */
}
