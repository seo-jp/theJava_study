package test.jacoco;

public class Movie {
	
	int tickets; // 보유 티켓수
	int numberOfsales; // 판매 티켓수
	
	public boolean isTicketsSoldOut() { // 티켓 매진여부
		
		if(tickets == 0) return false;
		if(numberOfsales < tickets) return false;
		
		return true;
		
	}
	

}