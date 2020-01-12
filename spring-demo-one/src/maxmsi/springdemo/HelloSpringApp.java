package maxmsi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		
		//load the spring conf

		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retreive bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// Get the context
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
		
	}

}
