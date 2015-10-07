package com.buggy.repository;

import com.buggy.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by a on 15/9/21.
 */
public interface UserRepository extends PagingAndSortingRepository<User,Long> {

    //按照spring-data-jpa的规范进行方法的定义,就不需要对声明的抽象方法进行实现

}
