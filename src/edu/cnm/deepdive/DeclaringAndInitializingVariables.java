package edu.cnm.deepdive;

public class DeclaringAndInitializingVariables {

  public static void main(String[] args) {
    // declaring and initializing in two lines.
    int myNumber;
//    System.out.println("myNumber after declaring but before initializing: " + myNumber);
//    does not compile because the number needs to be initialized.
    myNumber = 4;
    System.out.println("myNumber after declaring and after initializing: " + myNumber);

    // declaring and initializing in one line.
    int myNumber2 = 10;

    float myFloat1, myFloat2, myFloat3; // not the best practice but accepted.
    float myFloat4 ; float myFloat5; // compiles but should be written on two lines. Note that the
    //declaration is repeated after the first semicolon.
    // float myFloat6; myFloat7; does not compile because myFloat7 did not receive an declaration.

    float myFloat8 = 5f, myFloat9 = 10f, myFloat10; // will compile.
    boolean b1, b2;

    //double d1, double d2; does not compile because the declaration is repeated after a colon.
    int number = 10;
    int Number = 8; // line 25 and 26 compile because Java is case sensitive. Not good practice.
  }
}
