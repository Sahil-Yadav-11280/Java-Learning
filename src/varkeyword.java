@SuppressWarnings("unused")
public class varkeyword {
    public static void main(String[] args){
        // var keyword can be used to define variables with unkown datatypes  - in this you let the compiler decide the type of variable

        // restriction:
        // 1. can only be used on local variables
        // 2. once a type is defined it cannot be changed
        // 3. var cannot be used for fields , methods , construtors or initializers

        // ex->
        var message = "Hellow";
        message = "Sahil";
    }
}
