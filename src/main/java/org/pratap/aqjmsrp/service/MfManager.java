package org.pratap.aqjmsrp.service;

import java.util.ArrayList;

import javax.sql.DataSource;

public class MfManager {
	private DataSource dataSource;
	
	public MfManager() {
		
	}

	public MfManager(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public boolean mfSignOff(ArrayList listOfProductToBeReleased){
		return false;
	}
}
