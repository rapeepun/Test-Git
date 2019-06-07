package th.co.orcsoft.training.model.party.response;

import java.util.List;

import th.co.orcsoft.training.model.common.AbsResponseModel;
import th.co.orcsoft.training.model.db.PartyModel;

public class GetAllPartyResponse extends AbsResponseModel{
	
	private List<PartyModel> partylist;

	public List<PartyModel> getPartylist() {
		return partylist;
	}

	public void setPartylist(List<PartyModel> partylist) {
		this.partylist = partylist;
	}
	
}
