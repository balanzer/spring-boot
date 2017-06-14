/**
 * @author varathm - WelcomeService.java created Jun 14, 2017
 *
 * TODO
 */
package com.ihg.internaltools.pfm.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author varathm
 *
 */
@RestController
public class WelcomeService {

    @Value("${default.message:Default message not found.}")
    private String defaultMessage;

    @RequestMapping("/")
    public String greetings() {
        return this.defaultMessage;
    }
}
