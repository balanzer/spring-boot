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

    private static final Logger LOGGER = LoggerFactory.getLogger(WelcomeService.class);

    @Value("${default.message:Default message not found.}")
    private String defaultMessage;

    @RequestMapping("/")
    public String greetings() {
        LOGGER.debug("Welcome - debug {} ", this.defaultMessage);
        LOGGER.error("Welcome - error {} ", this.defaultMessage);
        LOGGER.info("Welcome - info {} ", this.defaultMessage);
        return this.defaultMessage;
    }
}
