package com.autonomous.pm.domain.structure;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Obs {	// 장애물 정보
	
	private Double lat;		// 위도(WGS84)
	private Double lng;		// 경도(WGS84)
	private Integer ty;			// 장애물 타입
	
}
