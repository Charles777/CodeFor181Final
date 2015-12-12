package base;

import static org.junit.Assert.*;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.RateDomainModel;
import util.HibernateUtil;

public class RatePullTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		}
	

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		double x = RateDAL.getRate(724);
		System.out.println(x);
		assertTrue(x == 4);
		
	}

}
