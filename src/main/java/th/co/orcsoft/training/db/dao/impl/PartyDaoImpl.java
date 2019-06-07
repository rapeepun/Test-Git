package th.co.orcsoft.training.db.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import th.co.orcsoft.training.db.dao.AbsCorDao;
import th.co.orcsoft.training.db.dao.PartyDao;
import th.co.orcsoft.training.model.db.PartyModel;

@Repository
public class PartyDaoImpl extends AbsCorDao implements PartyDao{

	@Override
	public List<PartyModel> getAllParty() {
		String sql = "SELECT ptyID,ptyName FROM party";
		List<PartyModel> list = namedParameterJdbcTemplate.query(sql, new BeanPropertyRowMapper<PartyModel>(PartyModel.class));
		return list;
	}
	
}
