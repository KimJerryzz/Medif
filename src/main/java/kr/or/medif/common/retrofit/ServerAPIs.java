package kr.or.medif.common.retrofit;

import kr.or.medif.domain.vo.api.device.ApiVO;
import retrofit2.Call;
import retrofit2.http.*;

public interface ServerAPIs {
    @Headers({"Accept: application/json"})
    @GET("getMdeqStdCdPrdtInfoInq?")
    Call<ApiVO> getDeviceData(@Query(value = "serviceKey", encoded = true) String serviceKey,
                                    @Query("pageNo") int pageNo,
                                    @Query("numOfRows") int numOfRows,
                                    @Query("type") String type,
                                    @Query("UDIDI_CD") String UDIDI_CD,
                                    @Query("PRDLST_NM") String PRDLST_NM);
}
