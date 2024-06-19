package com.example.movieapp.model.request;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.Length;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdateReviewRequest {
    String content;
    @Length(max = 10,message = "Đánh giá không được quá 10 sao")
    Integer rating;
}

