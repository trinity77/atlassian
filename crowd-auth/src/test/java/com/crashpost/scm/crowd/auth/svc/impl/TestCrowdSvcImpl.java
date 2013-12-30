package com.crashpost.scm.crowd.auth.svc.impl;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.crashpost.scm.crowd.auth.svc.model.CrowdUser;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * Integration tests and example usage for the Crowd auth and basic user info
 * service
 * 
 * @author tobyboyd
 * 
 */
public class TestCrowdSvcImpl {

	private final static Logger log = LoggerFactory.getLogger(TestCrowdSvcImpl.class);

	/**
	 * Test getting basic user info. Easier test than post as it is a simple GET
	 * that can be duplicated in a browser window
	 * 
	 * @throws Exception
	 *             Thrown if the test fails, see exception in JUNIT tool
	 */
	@Test
	public void testBasicUserInfo() throws Exception {
		log.trace("testBasicUserInfo");

		String appUsername = "my_app_name_in_crowd";
		String password = "my_app_password_in_crowd";
		String hosturl = "localhost";
		int port = 8095;
		String protocol = "http";
		try {
			CrowdSvcImpl crowdSvc = new CrowdSvcImpl(appUsername, password, hosturl, port, protocol);
			crowdSvc.pullBasicUserInfo("fredstone");
		} catch (Exception ex) {
			log.error("unable to execute get user info", ex);
			Assert.fail(ex.toString());
			throw ex;
		}

	}

	/**
	 * Test authenticating a user
	 * 
	 * @throws Exception
	 *             Thrown if the authentication fails.
	 */
	@Test
	public void testAuthenticateUser() throws Exception {
		log.trace("testAuthenticateUser");

		String appUsername = "my_app_name_in_crowd";
		String password = "my_app_password_in_crowd";
		String hosturl = "localhost";
		int port = 8095;
		String protocol = "http";
		try {
			CrowdSvcImpl crowdSvc = new CrowdSvcImpl(appUsername, password, hosturl, port, protocol);
			JsonNode json = crowdSvc.authenticateUser("fredstone", "password");
			CrowdUser crowdUser = crowdSvc.crowdJsonToCrowdUser(new CrowdUser(), json);
			log.debug(crowdUser.toString());
		} catch (Exception ex) {
			log.error("unable to authenticate users", ex);
			Assert.fail(ex.toString());
			throw ex;
		}

	}

}
