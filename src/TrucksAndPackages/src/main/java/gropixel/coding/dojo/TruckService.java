package gropixel.coding.dojo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruckService {

    @Autowired
    private TruckRepository truckRepository;

    public List<Truck> findAll() {
        return truckRepository.findAll();
    }

}
