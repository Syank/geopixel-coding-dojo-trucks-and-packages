package gropixel.coding.dojo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/truck")
public class TruckController {
	
	@Autowired
	private TruckRepository truckRepository;

	@GetMapping
	public List<Truck> getTrucks() {
		return truckRepository.findAll();
	}
}
