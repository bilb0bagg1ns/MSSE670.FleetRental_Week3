package com.fleetrental.model.services.loginservice;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.fleetrental.model.domain.Customer;
import com.fleetrental.model.services.factory.ServiceFactory;
import com.fleetrental.model.services.loginservice.LoginServiceImpl;

public class LoginServiceImplTest extends TestCase {

	private ServiceFactory serviceFactory;
	private Customer customer;

	/**
	 * @throws java.lang.Exception
	 */
	protected void setUp() throws Exception {
		super.setUp();

		serviceFactory = new ServiceFactory();

		customer = new Customer ("Simpson", "Homer", "homer@duff.com", "duff", "619.111.1234","619.111.1234");

	}

	/**
	 * Test method for {@link com.fleetrental.model.services.LoginService.LoginServiceImpl#authenticateCustomer(com.fleetrental.model.domain.Customer)}.
	 */
	public final void testAuthenticateCustomer() {

		//
		// USE THIS APPROOACH OF CASTING TO AN INTERFACE
		//
		// Here we are casting Factory output to ILoginService, which
		// means that loginService will only see methods declared in
		// the interface and implemented by LoginServiceImpl
		//
		ILoginService loginService = (ILoginService)serviceFactory.getLoginService();
		Assert.assertTrue(loginService.authenticateCustomer(customer));
        System.out.println("testAuthenticateCustomer PASSED");
		

		//
		// THIS TO ILLUSTRATE THAT YOU BY CASTING TO AN IMPL AND THE METHOD
        // VISIBILITY RULES THAT GET IMPOSED!!
        //
		// Here we are casting Factory output to LoginServiceImpl, which
		// means that loginServiceImpl will see not only methods declared in
		// the interface and implemented by LoginServiceImpl but also any
		// other additional public methods declared in LoginServiceImpl
		// but *not* private methods!!
		//
		// Good practice is to limit the impl to the methods declared in the interface and
		// additional methods(if really needed) be declared as private!
		//
		LoginServiceImpl loginServiceImpl = (LoginServiceImpl)serviceFactory.getLoginService();
		Assert.assertTrue(loginServiceImpl.authenticateCustomer(customer));
        System.out.println("testAuthenticateCustomer PASSED");
		

	}

}
