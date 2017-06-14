/**
 * @author varathm - WelcomeService.java created Jun 14, 2017
 *
 * TODO
 */
package com.ihg.internaltools.pfm.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author varathm
 *
 */
@RestController
public class WelcomeService {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Value("${default.message:Default message not found.}")
    private String defaultMessage;

    @RequestMapping("/")
    public String defaultAction() {
        this.LOGGER.info("Application default page - welcome message : {} ", this.defaultMessage);
        return this.defaultMessage;
    }
}
