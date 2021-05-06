package pl.pjatk.szymaj;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class MyRestController {



    @GetMapping("/hello")
    public ResponseEntity<String> getHelloWorld(@RequestParam(value = "reqParam", required = false) String reqParam) {
        if(reqParam == null) {
            return ResponseEntity.ok("Hello World");
        }
        else {
            return ResponseEntity.ok(reqParam);
        }
    }

    @GetMapping("/model")
    public ResponseEntity<Car> getModel() {
        Car car = new Car("Polonez");
        return ResponseEntity.ok(car);
    }
    @PostMapping("/model/token")
    public ResponseEntity<Car> sendModel(@RequestBody Car kar) {
        if(kar == null) {
            Car car = new Car("Polonez");
            return ResponseEntity.ok(car);
        }
        else{
            return ResponseEntity.ok(kar);
        }
    }

    @GetMapping( "/{someValue}")
    public  ResponseEntity<String> getValue(@PathVariable String someValue)
    {
        return ResponseEntity.ok(someValue);
    }



}
