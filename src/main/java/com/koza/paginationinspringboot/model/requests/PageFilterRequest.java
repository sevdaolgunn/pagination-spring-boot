package com.koza.paginationinspringboot.model.requests;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PageFilterRequest {
    private Integer page;
    private Integer size;
}
