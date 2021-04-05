package com.yandong.sharding_sphere.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TOrder implements Serializable {
    private Long tId;

    private String tName;

    private Integer tStatus;

    private static final long serialVersionUID = 1L;
}