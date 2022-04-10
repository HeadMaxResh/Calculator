package calculator.app;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/calc/")
@Api(value = "calc", tags = "Calc Service")
public class Controller {
    private static final String STATUS_SUCCESS = "Success";
    private static final String STATUS_NOT_SUCCESS = "Not success";
    private static final Integer STATUS_CODE_200 = 200;
    private static final Integer STATUS_CODE_500 = 500;

    @GetMapping("/sum/")
    @ApiOperation(value = "Summing numbers")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Status")})
    public Response sum(@RequestParam Integer x, @RequestParam Integer y) {
        return new Response(x, y, STATUS_CODE_200, STATUS_SUCCESS, x+y);
    }
    @GetMapping("/sub/")
    @ApiOperation(value = "Subtraction numbers")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Status")})
    public Response sub(@RequestParam Integer x, @RequestParam Integer y) {
        return new Response(x, y, STATUS_CODE_200, STATUS_SUCCESS, x-y);
    }
    @GetMapping("/mult/")
    @ApiOperation(value = "Multiplication of numbers")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Status")})
    public Response mult(@RequestParam Integer x, @RequestParam Integer y) {
        return new Response(x, y, STATUS_CODE_200, STATUS_SUCCESS, x*y);
    }
    @GetMapping("/div/")
    @ApiOperation(value = "Division of numbers")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Status")})
    public Response div(@RequestParam Integer x, @RequestParam Integer y) {
        return new Response(x, y, STATUS_CODE_200, STATUS_SUCCESS, x/y);
    }
    @ExceptionHandler({Throwable.class})
    public Response r (Throwable throwable){
        return new Response(Integer.MIN_VALUE, Integer.MIN_VALUE, STATUS_CODE_500, STATUS_NOT_SUCCESS, Integer.MIN_VALUE);
    }
}