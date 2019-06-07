package th.co.orcsoft.training.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import th.co.orcsoft.training.db.service.PartyService;
import th.co.orcsoft.training.model.common.AbsResponseModel;
import th.co.orcsoft.training.model.party.response.GetAllPartyResponse;

@RestController
@RequestMapping(value = "/api/party")
public class PartyController {

	@Autowired
	private PartyService partyService;
	
	@GetMapping(value="/getAllParty", produces= {MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody AbsResponseModel getMenuByList(HttpServletRequest request, HttpServletResponse response) 
	 throws Exception {

		GetAllPartyResponse getAllPartyResponse = new GetAllPartyResponse();
		getAllPartyResponse.setPartylist(partyService.getAllParty());
	return getAllPartyResponse;
	}
}
