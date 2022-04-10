package calculator.app;

import io.swagger.annotations.ApiModelProperty;

public class Response {
    @ApiModelProperty(notes = "first number")
    private final int x;
    @ApiModelProperty(notes = "second number")
    private final int y;
    @ApiModelProperty(notes = "response code")
    private final int responseCode;
    @ApiModelProperty(notes = "status")
    private final String status;
    @ApiModelProperty(notes = "result")
    private final int res;

    public Response(int x, int y, int responseCode, String status, int res) {
        this.x = x;
        this.y = y;
        this.responseCode = responseCode;
        this.status = status;
        this.res = res;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public String getStatus() {
        return status;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRes() {
        return res;
    }
}
