package com.example.movieapp.model.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdatePasswordRequest {
    @NotEmpty(message = "Mật khẩu không được để trống")
    @Length(min = 3, message = "Mật khẩu không được it hơn 3 ký tự")
    String oldPassword;
    @NotEmpty(message = "Mật khẩu không được để trống")
    @Length(min = 3, message = "Mật khẩu không được it hơn 3 ký tự")
    String newPassword;
    @NotEmpty(message = "Mật khẩu không được để trống")
    @Length(min = 3, message = "Mật khẩu không được it hơn 3 ký tự")
    String confirmPassword;
}