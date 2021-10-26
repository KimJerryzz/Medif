package kr.or.medif.domain.entity;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter @Setter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_expert")
@DynamicUpdate
public class Expert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ept_pid")
    private Long id;

    @Column(name = "affiliation")
    private String affiliation;

    @Column(name = "position")
    private String position;

    @Column(name = "nm")
    private String nm;

    @Column(name = "homepage")
    private String homepage;

    @Column(name = "email")
    private String email;

    @Column(name = "tel")
    private String tel;

    @Column(name = "specialized_partner")
    private String specializedPartner;

    @Column(name = "dev_partner")
    private String devPartner;

    @Column(name = "production_partner")
    private String productionPartner;

    @Column(name = "interest_medi_device")
    private String interestMediDevice;

    @Column(name = "certificate")
    private String certificate;

    @Column(name = "academic")
    private String academic;

    @Column(name = "career")
    private String career;

    @Column(name = "keywords")
    private String keywords;

    @Column(name = "agree")
    private String agree;
}
