/**
 * Fóton Informática S.A.
 * Criação : 12-03-2025
 * Todos os direitos reservados
 */

package com.cbilert.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

/**
 * Descrição do Fonte.
 *
 * @author março/2025: cbilert
 */
public record User(
         @NotNull(message = "id must not be null") Long id,
         @NotEmpty(message = "name must not be empty") String name,
         @Email(message = "email should be valid") String email) {
}
