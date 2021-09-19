package com.hack.model;

import lombok.Data;

@Data
public class PermissionDto {

    private boolean username;
    private boolean location;
    private boolean phoneNumber;
    private boolean email;
    private boolean systemId;
    private boolean platformId;
    private boolean serialNumber;
    private boolean deviceDescription;
    private boolean IMEI;
    private boolean MAC;
    private boolean GoogleId;
    private boolean SIM;
}
