package ca.uwaterloo.cs.helloworld;

import com.google.common.base.Joiner;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello, world!" );

        Joiner joiner = Joiner.on("; ").skipNulls();
        String newMsg = joiner.join("Hello World", "in CS 3261");

        System.out.println(newMsg);
    }
}
