package TodoApi.TodoApi;

public class AnnotionProccessor {
    public static void main(String[] args) {
        Class<TestService >  clazz = TestService.class;

        if (clazz.isAnnotationPresent(MyService.class)){
            System.out.println("My Service4 Annotion Work in RunTime:");
        }else System.out.println("My Service Annotion Doesnt Work in RunTime:");
    }
}
