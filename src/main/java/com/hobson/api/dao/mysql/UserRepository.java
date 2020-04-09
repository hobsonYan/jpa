package com.hobson.api.dao.mysql;

import com.hobson.api.model.mysql.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yan hongbo
 * @date 2020/4/9 14:14
 * @description
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    User findAllByUsername(String username);
}
