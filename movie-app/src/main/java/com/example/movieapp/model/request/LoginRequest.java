package com.example.movieapp.model.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.Length;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
<<<<<<< HEAD
@Builder
=======
>>>>>>> f26bf26f2b3ddaf48ba9fdfef84ec05492b9ebee
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoginRequest {
    @NotEmpty(message = "Email không được để trống")
    @Email(message = "Email không đúng định dạng")
    String email;
    @NotEmpty(message = "Mật khẩu không được để trống")
    @Length(min = 3, message = "Mật khẩu không được it hơn 3 ký tự")
    String password;
}
<<<<<<< HEAD

=======
>>>>>>> f26bf26f2b3ddaf48ba9fdfef84ec05492b9ebee
