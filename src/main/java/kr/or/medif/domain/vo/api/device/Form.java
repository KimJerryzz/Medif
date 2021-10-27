package kr.or.medif.domain.vo.api.device;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class Form {
    private String ServiceKey = "YVYqI5EL%2FZJqSDmbcc4E%2F4%2FoQkog00FmCdJsibn552lLarlWw%2B4w%2F8f4LS1hWN1O%2F4bignRQbyJwwVFRPhKkEg%3D%3D";
    private Integer pageNo;
    private Integer numOfRows = 10;
    private String type = "json";
    private String UDIDI_CD;
    private String PRDLST_NM;
}
