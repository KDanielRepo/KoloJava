package model;

import lombok.Data;

import java.util.Date;

@Data
public class Book extends AbstractNameEntity {
	private Date creationDate;
	private int pageNo;

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
}
