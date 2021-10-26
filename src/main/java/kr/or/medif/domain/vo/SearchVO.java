package kr.or.medif.domain.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchVO {
    private Integer pageSize;
    private Integer page;
    private String srchType;
    private String srchField;

}
