package kr.or.medif.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class HomeController extends Base {

    @Autowired
    private ExpertService expertService;

    @RequestMapping("/")
    public String index(Model model,
                        @PageableDefault Pageable pageable,
                        @ModelAttribute SearchVO searchVO){
        model.addAttribute("form", searchVO);
        Page<Expert> experts = expertService.list(pageable, searchVO);
        model.addAttribute("expertsList", experts);
        log.info(experts.getTotalElements() + "LOG");
        return "index";
    }

    @RequestMapping("/expert/list")
    public String expertList(Model model,
                        @PageableDefault Pageable pageable,
                        @ModelAttribute SearchVO searchVO){
        model.addAttribute("form", searchVO);
        Page<Expert> experts = expertService.list(pageable, searchVO);
        model.addAttribute("expertsList", experts);
        log.info(experts.getTotalElements() + "LOG");
        return "index";
    }
}
