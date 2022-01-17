package test.jacoco;

import org.junit.Assert;
import org.junit.Test;

public class MovieTest {

	@Test
	public void test() {
		Movie movie = new Movie();
		movie.tickets = 100;
		movie.numberOfsales = 70;
		
		Assert.assertFalse(movie.isTicketsSoldOut());
		Assert.assertEquals(30, (movie.tickets - movie.numberOfsales));
	}

}
