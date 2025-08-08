package TodoApi.TodoApi;

import org.springframework.stereotype.Component;

@Component("FakeTodo")

public class FakeTodoService implements TodoService{
    public String doSomething(){
        return "I do Something";
    }
}
