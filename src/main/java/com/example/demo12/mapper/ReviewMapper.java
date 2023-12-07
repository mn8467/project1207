package com.example.demo12.mapper;

import com.example.demo12.model.Review;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewMapper {
    public List<Review> getReview();
}
