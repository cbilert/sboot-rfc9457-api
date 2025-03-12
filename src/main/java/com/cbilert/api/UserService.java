/**
 * Fóton Informática S.A.
 * Criação : 12-03-2025
 * Todos os direitos reservados
 */
 
package com.cbilert.api;

import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 * Descrição do Fonte.
 *
 * @author março/2025: cbilert
 */
@Service
public class UserService {
   public Optional<User> getUserById(Long id) {
      if (id == 1) {
         return Optional.of(new User(1L, "Adam Rs", "adam.rs@gmail.com"));
      }
      return Optional.empty();
   }

   public User createUser(User user) {
      return user;
   }
}
