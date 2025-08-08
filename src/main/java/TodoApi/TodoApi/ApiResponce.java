package TodoApi.TodoApi;

public class ApiResponce {

    private String status;

    private String message;

    public ApiResponce(String status , String message){
        this.status = status;

        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }
}
