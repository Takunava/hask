package com.hack.model;


import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class AppDto {

    private String id;
    private String name;
    private String icon;
    private Integer dangerLvl;
    private PermissionDto permissions;

}
