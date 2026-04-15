package edu.norcocollege.cis18b.week6.mini05;

/*
 * Demonstrates common generics restrictions and practical workaround patterns
*/
public class RestrictionsWorkaroundsDemo {

    public static void main(String[] args) {
        TypedRegistry registry = new TypedRegistry();

        // Wrapper types are used with generics because primitive types like int can't be used as type arguments
        registry.put("retries", 3);
        registry.put("status", "NEW");

        // Supplier<T> is used to create values instead of illegal code like new T()
        FactoryBox<String> messageFactory = new FactoryBox<>(() -> "Welcome");

        System.out.println("Default retries: " + registry.get("retries", Integer.class));
        System.out.println("Default status: " + registry.get("status", String.class));
        System.out.println("Created message: " + messageFactory.create());
    }
}