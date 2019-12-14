public class HelloArgs {

  public static void main(String[] args) {

    if (args.length == 2)
     System.out.println("Hello " + args[0] + " " + args[1]);
    else
     System.out.println("must enter one argument");
  }  // end main

}  // end class
