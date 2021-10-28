package kr.or.medif.service;

import kr.or.medif.common.Base;
import kr.or.medif.common.Constants;
import kr.or.medif.common.retrofit.ServerAPIs;
import kr.or.medif.domain.vo.api.device.ApiVO;
import kr.or.medif.domain.vo.api.device.Form;
import kr.or.medif.domain.vo.api.device.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

@Service
public class DeviceService extends Base {
    @Autowired
    private ServerAPIs serverAPIs;

    public RequestBody getPrdLst(Form form)  {
        if(form.getPageNo() == null) {
            form.setPageNo(1);
        }
        Call<ApiVO> call = serverAPIs.getDeviceData(form.getServiceKey(), form.getPageNo(), form.getNumOfRows() ,form.getType() ,form.getUDIDI_CD(), form.getPRDLST_NM());
        try {
            Response<ApiVO> response = call.execute();
            if(response.isSuccessful()) {
                return response.body().getRequestBody();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new RequestBody();
    }
}
