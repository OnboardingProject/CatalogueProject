package com.catalog.request;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {

	private String productName;
	private String contractSpend;
	private String stakeholder;
	private String productDescription;
	private List<String> categoryLevel;
	private List<String> categoryLevelDescription;
	private String createdBy;
	private String lastUpdatedBy;
	private Boolean isDeleted;

}
