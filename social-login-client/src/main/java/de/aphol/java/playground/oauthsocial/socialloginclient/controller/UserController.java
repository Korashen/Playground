package de.aphol.java.playground.oauthsocial.socialloginclient.controller;

import de.aphol.java.playground.oauthsocial.socialloginclient.exceptions.ResourceNotFoundException;
import de.aphol.java.playground.oauthsocial.socialloginclient.model.User;
import de.aphol.java.playground.oauthsocial.socialloginclient.repository.UserRepository;
import de.aphol.java.playground.oauthsocial.socialloginclient.security.CurrentUser;
import de.aphol.java.playground.oauthsocial.socialloginclient.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}
