package org.pro;

import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseNew{
	
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}

	
}
