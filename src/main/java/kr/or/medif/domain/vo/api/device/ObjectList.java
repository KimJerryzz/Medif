package kr.or.medif.domain.vo.api.device;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

/**
 * ObjectList 식품의약품안전처_의료기기 표준코드별 제품정보
 * @author : jerry
 * @version : 1.0.0
 * 작성일 : 2021/10/27
**/
@Getter
@Setter
public class ObjectList {
    @SerializedName("UDIDI_CD")
    private String UDIDI_CD;

    @SerializedName("PRDLST_NM")
    private String PRDLST_NM;

    @SerializedName("MDEQ_CLSF_NO")
    private String MDEQ_CLSF_NO;

    @SerializedName("CLSF_NO_GRAD_CD")
    private String CLSF_NO_GRAD_CD;

    @SerializedName("PERMIT_NO")
    private String PERMIT_NO;

    @SerializedName("PRMSN_YMD")
    private String PRMSN_YMD;

    @SerializedName("FOML_INFO")
    private String FOML_INFO;

    @SerializedName("PRDT_NM_INFO")
    private String PRDT_NM_INFO;

    @SerializedName("HMBD_TRSPT_MDEQ_YN")
    private String HMBD_TRSPT_MDEQ_YN;

    @SerializedName("DSPSBL_MDEQ_YN")
    private String DSPSBL_MDEQ_YN;

    @SerializedName("TRCK_MNG_TRGT_YN")
    private String TRCK_MNG_TRGT_YN;

    @SerializedName("TOTAL_DEV")
    private String TOTAL_DEV;

    @SerializedName("CMBNMD_YN")
    private String CMBNMD_YN;

    @SerializedName("USE_BEFORE_STRLZT_NEED_YN")
    private String USE_BEFORE_STRLZT_NEED_YN;

    @SerializedName("STERILIZATION_METHOD_NM")
    private String STERILIZATION_METHOD_NM;

    @SerializedName("USE_PURPS_CONT")
    private String USE_PURPS_CONT;

    @SerializedName("STRG_CND_INFO")
    private String STRG_CND_INFO;

    @SerializedName("CIRC_CND_INFO")
    private String CIRC_CND_INFO;
}
