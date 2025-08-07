package TodoApi.TodoApi;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class TodoController {

    private static List<Todo> todos;

    TodoController(){
        todos = new ArrayList<>();
        todos.add(new Todo(1 , false , "Spring2" , 1));
        todos.add(new Todo(2 , false , "System Design",2));
        todos.add(new Todo(3 , false , "DSA" , 3));
        todos.add(new Todo(4 , false , "OS" , 4));
    }

}
