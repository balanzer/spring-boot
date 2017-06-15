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

import com.ihg.internaltools.pfm.cra.CampaignRequest;

@RestController
@RequestMapping(value = "/cra", name = "CampaignProcesController", produces = MediaType.APPLICATION_JSON_VALUE)
public class CampaignProcesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CampaignProcesController.class);

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<CampaignRequest>> list() {
        LOGGER.info("list");
        List<CampaignRequest> campaigns = new ArrayList<>();
        campaigns.add(new CampaignRequest());
        if (campaigns.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(campaigns, HttpStatus.OK);
    }
}
