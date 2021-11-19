package spring.dao;

import java.util.Optional;
import spring.model.Role;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getRoleByName(String roleName);
}
