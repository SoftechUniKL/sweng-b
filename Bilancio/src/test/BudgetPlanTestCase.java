package test;

import static org.junit.Assert.*;
import model.BudgetPlanModel;

import org.junit.Test;


public class BudgetPlanTestCase {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		
		BudgetPlanModel testBudgetPlanModel = new  BudgetPlanModel();
		
		String file =  testBudgetPlanModel.filename;
		
		assertEquals("data/budget.csv", file);
	}

}
