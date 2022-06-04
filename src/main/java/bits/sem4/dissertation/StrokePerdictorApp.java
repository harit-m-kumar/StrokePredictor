package bits.sem4.dissertation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bits.sem4.dissertation.data.entity.PatientsForStrokeCheck;
import bits.sem4.dissertation.repository.PatientForStrokeCheckRepository;

@SpringBootApplication
public class StrokePerdictorApp {
	
 	public static void main(String args[])throws Exception {
 		SpringApplication.run(StrokePerdictorApp.class, args);
 	}
 	
	@RestController
	@RequestMapping("/patients")
	public class RoomController {
		
		@Autowired
		private PatientForStrokeCheckRepository patientForStrokeCheckReposirory;
		
		@GetMapping
		public Iterable<PatientsForStrokeCheck> getRooms() {
			return this.patientForStrokeCheckReposirory.findAll();
			
		}
		
	}

}
