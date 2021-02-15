package com.autonomous.pm.model.Dto;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ResUsr
{
    @NonNull
    String loginId;

    @NotNull
    String usrNm;
    
    String grpNm;
    
    String athNm;
    
    Integer athLvl;
    
    @NonNull
    String athCd;
    
    @NonNull
    @JsonProperty("pm_as_key")
    String pmAsKey;
    
    @JsonProperty("expire_time")
    String expireTime;
    
    String refreshToken;
    
    
}