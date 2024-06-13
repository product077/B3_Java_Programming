package day36_inheritance.app;
/*
Create a class youtub

    - youtub class inherits App class

    - create constructor to call parent constructor and set up variables (name and version)

    - create method:
        watchVideo()
            Example output: prints Watching java tutorial on $name
 */

public class YouTubeOne extends App {

    public YouTubeOne(double version) {
        super("YouTube", version);
    }

    public void watchVideo (){
        System.out.println("Watching java tutorial on " + name);
    }

}