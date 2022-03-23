package site.metacoding.test1;

import org.hibernate.annotations.ValueGenerationType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class controller {

    private final Repository repository;

    @GetMapping("/main")
    public String mainForm(Model model, @RequestParam(defaultValue = "") String keyword) {

        // model.addAttribute("borads", repository.findAll());
        model.addAttribute("borads", repository.mSearch(keyword));

        return "/main";
    }

}
