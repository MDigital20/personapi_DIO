package one.digitalInnovation.personApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/people")

public class PersonController {

	@GetMapping
	public String getBook() {
		return "API test!!";
	}
}
