import static org.junit.Assert.*;

import org.junit.Test;

import application.App;

public class mainTestApp {

	@Test
	public void test() {
		App appref = new App();
		appref.getAccountManageVar().createAccount("Gnome", "King");
		appref.getAccountManageVar().createAccount("Ben", "Till");
		appref.getAccountManageVar().createAccount("Gnome", "Till");

		assertEquals(2,appref.getServiceRefVar().countFirstNames("Gnome"));
	}

}
