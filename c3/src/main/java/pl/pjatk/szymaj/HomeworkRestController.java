package pl.pjatk.szymaj;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeworkRestController {

    // "/rp?reqParam='cos'"
    @GetMapping("/get")
    public ResponseEntity<Object> getReqParam(@RequestParam(value = "reqParam", required = false) Object reqParam) {
            return ResponseEntity.ok(reqParam);
    }

    // "/rp/'cos'"
    @GetMapping( "/get/{pathVariable}")
    public  ResponseEntity<Object> getValue(@PathVariable Object pathVariable) {
        return ResponseEntity.ok(pathVariable);
    }

    // "/post/token" + JSON file
    @PostMapping("/post/token")
    public ResponseEntity<Object> postRB(@RequestBody Object t) {
        if(t == null) {
            return ResponseEntity.ok("null");
        }
        else{
            return ResponseEntity.ok(t);
        }
    }

    @PutMapping("/put/{pathVariable}")
    public ResponseEntity<Object> putPV(@PathVariable Object pathVariable) {
        return ResponseEntity.ok(pathVariable);
    }

    @PutMapping("/put/token")
    public ResponseEntity<Object> putRB(@RequestBody Object t) {
        if(t == null) {
            return ResponseEntity.ok("null");
        }
        else{
            return ResponseEntity.ok(t);
        }
    }

    @DeleteMapping("/delete/{pathVariable}")
    public ResponseEntity<Object> deletePV(@PathVariable Object pathVariable) {
        return ResponseEntity.ok(null);
    }

}
