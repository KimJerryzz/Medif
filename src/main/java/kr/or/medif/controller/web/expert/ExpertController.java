package kr.or.medif.controller.web.expert;

import kr.or.medif.common.Base;
import kr.or.medif.domain.entity.Expert;
import kr.or.medif.domain.vo.SearchVO;
import kr.or.medif.service.ExpertService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class ExpertController extends Base {

    @Autowired
    private ExpertService expertService;

    @RequestMapping("expert/list")
    public String expertList(Model model,
                        @PageableDefault Pageable pageable,
                        @ModelAttribute SearchVO searchVO){
        model.addAttribute("mc", "expert");
        model.addAttribute("form", searchVO);
        Page<Expert> experts = expertService.list(pageable, searchVO);
        model.addAttribute("expertsList", experts);
        return "pages/expert/expertList";
    }

    @RequestMapping("expert/detail/{id}")
    public String expertDetail(Model model,
                             @PathVariable(name = "id") Long id){

        Expert load = expertService.load(id);
        model.addAttribute("data", load);
        model.addAttribute("mc", "expert");
        return "pages/expert/expertDetail";
    }
}
