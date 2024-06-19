package com.example.movieapp.model.request;

import jakarta.validation.constraints.Max;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.Length;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateReviewRequest {
    String content;
    @Length(max = 10,message = "Đánh giá không được quá 10 sao")
    Integer rating;

    Integer movieId;
}
