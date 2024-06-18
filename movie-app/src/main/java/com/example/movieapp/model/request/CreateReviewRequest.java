package com.example.movieapp.model.request;

import jakarta.validation.constraints.Max;
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
public class CreateReviewRequest {
    String content;
    @Length(max = 10,message = "Đánh giá không được quá 10 sao")
    Integer rating;

    Integer movieId;
}
