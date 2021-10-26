package kr.or.medif.domain.vo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter @Setter
public class ExpertVO {
    private Long ept_pid;
    private String affiliation;
    private String position;
    private String nm;
    private String homepage;
    private String email;
    private String tel;
    private String specializedPartner;
    private String devPartner;
    private String productionPartner;
    private String interestMediDevice;
    private String certificate;
    private String academic;
    private String career;
    private String keywords;
    private String agree;
}
