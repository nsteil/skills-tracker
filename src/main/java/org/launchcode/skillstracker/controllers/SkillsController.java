package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String welcomePage(){
        return "<html>" +
                "<h1> Skills Tracker </h1>" +
                "<h2>Languages: </h2>" +
                "<table>" +
                "<tr>" +
                "<td>JavaScript</td>" +
                "</tr>" +
                "<tr>" +
                "<td>Java</td></tr>" +
                "<td>Python</td>" +
                "</tr>" +
                "</table>" +

                "</html>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String languageForm(){
        return "<html>" +
                "<body>" +
                "<form method='post' action='/form_results'>" +
                "<span>Name:</span><br>" +
                "<input type='text' name='name'><br>" +
                "<span>My favorite language:</span><br>" +
                "<select name='firstLanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<span>My second favorite language:</span><br>" +
                "<select name='secondLanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<span>My third favorite language:</span><br>" +
                "<select name='thirdLanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit'>" +
                "</body>" +
                "</form>" +
                "</html>";

    }
    @PostMapping("/form_results")
    @ResponseBody
    public String responseForm(@RequestParam String name,String firstLanguage, String secondLanguage, String thirdLanguage){
        return "<html>" +
                "<body>" +
                "<h1>"+name+"</h1>" +
                "<ol>" +
                "<li>" + firstLanguage + "</li>" +
                "<li>" + secondLanguage + "</li>" +
                "<li>" + thirdLanguage + "</li>" +
                "</body>" +
                "</html>";
    }
}
