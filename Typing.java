@SuppressWarnings("unused")
public class Typing {
    public static void main(String[] args) {
        
        // Typecasting:

            // 1. Int to String (primitive to object -> parsing)
            int age = 19;
            String age1 = String.valueOf(age);
            // or
            String age2 = Integer.toString(age);

            // 2. String to Int (object to primitive -> parsing)
            String num_val = "26";
            int num = Integer.parseInt(num_val);

            // 3. Int to Double (primitive to primitive -> typecasting)
            int val = 34;
            // (double) val
            double val_doub = (double) val;

            // 4. Double to Int (primitive to primitive -> typecasting)
            double value = 34.67;
            int value_int = (int) value;


        // Datatype Checking:

            // 1. For objects (Strings , scanner etc.)
            String name = "Sahil";
            System.out.println(name.getClass());
            
            // 2. For primitives (Integers , doubles etc.)
            int numm = 15;
            // first convert them into objects and then use above mentioned method
            System.out.println(((Object)numm).getClass());

            // 3. InstanceOf
            if (name instanceof String){
                System.out.println("Its a string!");
            }

    }
}
