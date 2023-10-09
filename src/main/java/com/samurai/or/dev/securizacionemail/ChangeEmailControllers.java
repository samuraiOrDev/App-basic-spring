package com.samurai.or.dev.securizacionemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.samurai.or.dev.securizacionemail.models.dao.IChangeEmail;
import com.samurai.or.dev.securizacionemail.models.entities.ChangeEmail;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChangeEmailControllers {

    @Autowired
    private IChangeEmail iChangeEmail;

    @GetMapping(value = "/list")
    public ModelAndView list(ModelAndView mv) {
        mv.setViewName("view");
        mv.addObject("title", "ChangeEmail Testong");
        System.out.println("ClienId: " + iChangeEmail.findAll().get(0).getClientId());
        mv.addObject("listChangeEmail", iChangeEmail.findAll());
        return mv;
    }

    @GetMapping("/form")
    public ModelAndView create(ModelAndView mv) {
        ChangeEmail changeEmail = new ChangeEmail();
        mv.setViewName("form");
        mv.addObject("title", "Formulariop de ChangeEmail");
        mv.addObject("changeEmai", changeEmail);
        return mv;
    }

    @PostMapping("/form")
    public String save(ChangeEmail changeEmail) {
        iChangeEmail.save(changeEmail);
        return "redirect:listar";
    }
}
