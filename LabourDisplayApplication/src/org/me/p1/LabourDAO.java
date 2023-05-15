package org.me.p1;

import org.springframework.jdbc.core.JdbcTemplate;

public class LabourDAO {
	JdbcTemplate jdbcT;

	public void setJdbcT(JdbcTemplate jdbcT) {
		this.jdbcT = jdbcT;
	}

	public LabourDAO(JdbcTemplate jdbcT) {
		super();
		this.jdbcT = jdbcT;
	}
	
	public int insertLabour(Labour l1)
	{
		String ins="insert into Labour values("+l1.getLid()+", '"+l1.getHours()+"', '"+l1.getWages()+")";
		return jdbcT.update(ins);
	}
}
