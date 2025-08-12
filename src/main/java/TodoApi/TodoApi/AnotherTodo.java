package TodoApi.TodoApi;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("anotherTodoService")
public class AnotherTodo implements TodoService{
    @TimeMonitor
    @Override
    public String doSomething() {

        for (int i = 0; i < 1000000000; i++ ){

        }
        return "Another Work Done With Another Service: ";
    }
}
