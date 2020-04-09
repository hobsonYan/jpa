package com.hobson.api.service.impl;

import com.hobson.api.dao.mysql.UserRepository;
import com.hobson.api.dao.oracle.UserRoleRepository;
import com.hobson.api.model.mysql.User;
import com.hobson.api.model.oracle.UserRole;
import com.hobson.api.service.TestJpaRepositoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yan hongbo
 * @date 2020/4/9 14:27
 * @description
 */
@Service
public class TestJpaJpaRepositoryServiceImpl implements TestJpaRepositoryService {

    @Resource
    private UserRepository userRepository;

    @Resource
    private UserRoleRepository userRoleRepository;

    @Override
    public Map<String, Object> testJpa() {

        Map<String, Object> result = new HashMap<>();
        User user = new User();
        user.setName("hobson");
        user.setEmail("123@hobson.com");
        user.setPassword("123456");
        user.setPhone("12345678998");
        user.setUsername("641");
        user.setCreatetime(new Date());
        userRepository.save(user);

        User newUser = userRepository.findAllByUsername("641");
        result.put("user", newUser);

        UserRole userRole = new UserRole();
        userRole.setUserId(Long.parseLong(newUser.getId().toString()));
        userRole.setRoleId(641L);
        long count = userRoleRepository.count();
        result.put("count", count);

        return result;
    }
}
