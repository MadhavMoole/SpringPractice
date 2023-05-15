package org.me.p1;

import org.springframework.stereotype.Component;

@Component
public class Labour {
	int lid;
	int hours;
	int wages;

	public Labour(int lid, int hours, int wages) {
		super();
		this.lid = lid;
		this.hours = hours;
		this.wages = wages;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getWages() {
		return wages;
	}

	public void setWages(int wages) {
		this.wages = wages;
	}
	
	
}
