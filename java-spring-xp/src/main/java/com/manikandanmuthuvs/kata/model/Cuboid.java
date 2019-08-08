package com.manikandanmuthuvs.kata.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cuboid {
    private Integer length;
    private Integer width;
    private Integer height;
}