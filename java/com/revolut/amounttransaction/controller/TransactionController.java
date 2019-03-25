package com.revolut.amounttransaction.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revolut.amounttransaction.service.AccountDetailsService;

/**
 * Controller layer class to controller of MVC
 * 
 * @author Abirami Silambarasan
 * 
 */

@RestController
public class TransactionController {

	@RequestMapping(value = "/transaction")
	public String getTransferAmount(@RequestParam(value = "depositamount") long depositamount) {
		long Amount = 10000;
		try {

			AccountDetailsService a = new AccountDetailsService("Abirami", 0001234, 20000);
			AccountDetailsService b = new AccountDetailsService("Silambarasan", 1019876, 5000);
			// Transfer
			a.withdraw(depositamount, 500);
			System.out.println("a account balance" + a.getBalance());
			b.deposit(10000);
			System.out.println("b account balance" + b.getBalance());
		} catch (Exception e) {
			System.out.println("Exception in getTransferAmount .. " + e);
		}

		return "Abirami is depositing £" + depositamount + " to Silambarasan";

	}
}
