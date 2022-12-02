package cz.czechitas.java2webapps.ukol5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Kontroler obsluhující registraci účastníků dětského tábora.
 */
@Controller
public class RegistraceController {

  @GetMapping("")
  public String index(@ModelAttribute ("form")RegistraceForm form ) {
    return "/formular";
  }
    @PostMapping("")
    public Object form(@Valid @ModelAttribute ("form") RegistraceForm form, BindingResult bindingResult){
    return "/formular";
    }
}
