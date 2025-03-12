/**
 * Fóton Informática S.A.
 * Criação : 12-03-2025
 * Todos os direitos reservados
 */
 
package com.cbilert.api;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Descrição do Fonte.
 *
 * @author março/2025: cbilert
 */
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

   private final UserService userService;

   @GetMapping("{id}")
   public User getUser(@PathVariable Long id){
      return userService.getUserById(id)
               .orElseThrow(() -> new UserNotFoundException(id, "/api/users"));
   }

   @PostMapping
   public User createUser(@Valid @RequestBody User user) {
      return userService.createUser(user);
   }
}
