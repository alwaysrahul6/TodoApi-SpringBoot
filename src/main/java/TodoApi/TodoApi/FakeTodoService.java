package TodoApi.TodoApi;

import org.springframework.stereotype.Component;

@Component("fakeTodoService")

public class  FakeTodoService implements TodoService{

    @TimeMonitor

    public String doSomething(){

        for (int i = 0; i < 1000000000; i++){
        }
        return "I do Something";
    }
}
