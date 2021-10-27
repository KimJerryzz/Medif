package kr.or.medif.domain.vo.api.device;

import com.google.gson.annotations.SerializedName;
import kr.or.medif.domain.vo.SearchVO;
import lombok.Getter;
import lombok.Setter;

/**
 * OpenApiVO 식품의약품안전처_의료기기 표준코드별 제품정보
 * @author : jerry
 * @version : 1.0.0
 * 작성일 : 2021/10/27
**/
@Getter
@Setter
public class ApiVO extends SearchVO {
    // RequestBody
    @SerializedName("header")
    private RequestHeader requestHeader;

    @SerializedName("body")
    private RequestBody requestBody;
}
