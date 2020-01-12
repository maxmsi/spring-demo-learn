package maxmsi.springdemo;

public class BassebalCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BassebalCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return " spend 30 minutes on running";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
