package com.revolut.amounttransaction.controller.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.revolut.amounttransaction.controller.TransactionController;

public class TransactionControllerTest {

	@Test
	public void testGetTransferAmount() {

		TransactionController transctnContrl = new TransactionController();
		assertEquals("Abirami is depositing £200 to Silambarasan", transctnContrl.getTransferAmount(200));
		assertEquals("Abirami is depositing £1100 to Silambarasan", transctnContrl.getTransferAmount(1100));
	}

}
