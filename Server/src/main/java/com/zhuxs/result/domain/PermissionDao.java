package com.zhuxs.result.domain;

import com.zhuxs.result.domain.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by shusesshou on 2017/9/20.
 */
public interface PermissionDao extends JpaRepository<Permission,Long> {
}
