package com.hobson.api.dao.oracle;

import com.hobson.api.model.oracle.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yan hongbo
 * @date 2020/4/9 14:25
 * @description
 */
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}
