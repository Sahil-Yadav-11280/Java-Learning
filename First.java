// IN java program should begin wiht a main clas whose name is same as filename, inside that java finds the main() function as it acts as the starting position

// Java is a native OOPS language so everything in java is an object

//before every class or object you must define its access modifier , that is either it is public , protected or private

// basic syntax ex-




// 1.

// public class First{
//     public static void main(String[] args) {
//         System.out.println("Hello , World!");
//     }
// }





// Access modifiers:
// 1. Private (default) - only accessible in same class
// 2. Protected - only accessible in same class and subclass
// 3. Public - accessible anywhere in java universe => used in main so that jvm can access main class and function

//Static (Class level modifier):
// 1. allows method to be called without creating an instance (object) , in the above example no object of First class was created still the program ran cause JVM could call main function without creating an object

// String[] args (command line arguments):
// 1. String[] - array of strings
// 2. args - variable name for arguments passed in command line while executing , this can be any variable name like argum , sahil , data , etc. anything which is a valid variable is possible
// 3. String[] args - catches the arguments passed im command line
// ex - if I passed "java First.java sahil" then in the program args[0] = sahil

// Lets see with an example




// 2. 

public class First{
    public static void main(String[] sahil){
        System.out.println("Hello " + sahil[0]);
    }

    // would only run via terminal since an argument is needed , running from coderunner would cause an error
}




