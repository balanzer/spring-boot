/**
 * @author varathm - CampaignProcesController.java created Jun 14, 2017
 *
 * TODO
 */
package com.ihg.internaltools.pfm.api.cra;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cra/campaign", name = "CampaignProcesController", produces = MediaType.APPLICATION_JSON_VALUE)
public class CampaignProcesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CampaignProcesController.class);

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<String>> list() {
        LOGGER.info("list");
        List<String> results = new ArrayList<>();
        if (results.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<>(results, HttpStatus.OK);
    }
}
