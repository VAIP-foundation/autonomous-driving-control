package com.autonomous.pm.model.Dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResFailCnt {

	private Long idV;	// 차량ID
	private String vrn;	// 차량번호
	private String term;// 터미널
//	private String dts;	// 일자
	private int failCnt;	// 고장횟수
	
}