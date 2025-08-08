package TodoApi.TodoApi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {

    private static List<Todo> todoList;

    TodoController(){
        todoList = new ArrayList<>();
        todoList.add(new Todo(1 , false , "Spring2" , 1));
        todoList.add(new Todo(2 , false , "System Design",2));
        todoList.add(new Todo(3 , false , "DSA" , 3));
        todoList.add(new Todo(4 , false , "OS" , 4));
    }

    @GetMapping

    public ResponseEntity<List<Todo>> getTodo(){
        return ResponseEntity.ofNullable(todoList);
    }

    @PostMapping
    /**
     * we can use this annotation set the status code  @ResponseStatus(HttpStatus.CREATED)
     *
     * */

    public ResponseEntity<Todo> createTodo(@RequestBody Todo newTodo){
        todoList.add(newTodo);
        return ResponseEntity.status(HttpStatus.CREATED).body(newTodo);
    }

    @GetMapping("/todo/{todoId}")

    public ResponseEntity<Object> getTodoById(@PathVariable Long todoId){

        for (Todo todo : todoList){
            if (todo.getId() == todoId){
                return ResponseEntity.ok(todo);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Todo with Id" + todoId + "Not Found!");
    }


    /// Delete Request

    @DeleteMapping("/todo/{todoId}")

    public ResponseEntity<Object> deleteRequest(@PathVariable Long todoId){

        Iterator<Todo> iterator = todoList.iterator();

        while (iterator.hasNext()){
            Todo todo = iterator.next();

            if (todo.getId() == (todoId)){
                iterator.remove();
                return ResponseEntity.ok("Todo With Id " + todoId + "Succefully Deleted");
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).
                body(new ApiResponce("error", "Todo with id " + todoId + "Not found"));

    }
}
