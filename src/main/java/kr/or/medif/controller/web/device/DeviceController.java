package kr.or.medif.controller.web.device;

import kr.or.medif.common.Base;
import kr.or.medif.domain.entity.Expert;
import kr.or.medif.domain.vo.api.device.ApiVO;
import kr.or.medif.domain.vo.api.device.RequestBody;
import kr.or.medif.domain.vo.api.device.Form;
import kr.or.medif.service.ApiExplorer;
import kr.or.medif.service.DeviceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class DeviceController extends Base {

    @Autowired
    private DeviceService deviceService;

    @Autowired
    private ApiExplorer apiExplorer;

    @RequestMapping("device/list")
    public String expertList(Model model,
                            @ModelAttribute Form form) {
        model.addAttribute("form", form);
        RequestBody objList = deviceService.getPrdLst(form);
        model.addAttribute("apiList", objList);
        model.addAttribute("mc", "device");
        return "pages/device/deviceList";
    }
}
