package spring.service.impl;

import java.util.HashSet;
import org.springframework.stereotype.Service;
import spring.model.RoleName;
import spring.model.User;
import spring.service.AuthenticationService;
import spring.service.RoleService;
import spring.service.ShoppingCartService;
import spring.service.UserService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;
    private final ShoppingCartService shoppingCartService;
    private final RoleService roleService;

    public AuthenticationServiceImpl(UserService userService,
                                     ShoppingCartService shoppingCartService,
                                     RoleService roleService) {
        this.userService = userService;
        this.shoppingCartService = shoppingCartService;
        this.roleService = roleService;
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setRoles(new HashSet<>());
        user.getRoles().add(roleService.getRoleByName(RoleName.USER.name()));
        userService.add(user);
        shoppingCartService.registerNewShoppingCart(user);
        return user;
    }
}
