package TodoApi.TodoApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class TodoController {

    private static List<Todo> todoList;

    TodoController(){
        todoList = new ArrayList<>();
        todoList.add(new Todo(1 , false , "Spring2" , 1));
        todoList.add(new Todo(2 , false , "System Design",2));
        todoList.add(new Todo(3 , false , "DSA" , 3));
        todoList.add(new Todo(4 , false , "OS" , 4));
    }

    @GetMapping("/todo")

    public List<Todo> getTodo(){
        return todoList;
    }

    @PostMapping("/todo")

    public Todo createTodo(@RequestBody Todo newTodo){
        todoList.add(newTodo);
        return newTodo;
    }

}
