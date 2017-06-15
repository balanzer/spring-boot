package com.ihg.internaltools.pfm;

import java.util.List;

import com.ihg.internaltools.pfm.cra.CampaignRequest;
import com.ihg.internaltools.pfm.error.ApplicationException;

public interface CampaignRequestService {

	List<CampaignRequest> listAll() throws ApplicationException;
}
