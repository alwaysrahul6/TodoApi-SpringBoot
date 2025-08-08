package TodoApi.TodoApi;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("Anothertodo")
public class AnotherTodo implements TodoService{

    @Override
    public String doSomething() {
        return "Another Work Done With Another Service: ";
    }
}
