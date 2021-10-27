package kr.or.medif.domain.vo.api.device;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

/**
 * Body 식품의약품안전처_의료기기 표준코드별 제품정보
 * @author : jerry
 * @version : 1.0.0
 * 작성일 : 2021/10/27
**/
@Getter
@Setter
public class RequestBody {
    @SerializedName("pageNo")
    private int pageNo;

    @SerializedName("totalCount")
    private int totalCount;

    @SerializedName("numOfRows")
    private int numOfRows;

    @SerializedName("items")
    private List<ObjectList> items = null;
}
