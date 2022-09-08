
//Program to print Hello World in Java 

/* public class Sample{
    public static void main(String[] args){
        System.out.println("Hello world");
        System.out.print("Good Morning");
    }
} */

//Java Variables
//Variables are containers for storing data values.

/* String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false */

/* public class Sample{
    public static void main(String[] args){
        String name="Naveen";
        System.out.println(name);

        int myAge=20;
        System.out.println(myAge);

        int a;
        a=10;
        System.out.println(a);

        int b=10;
        b=20;
        System.out.println(b);

        final int c=100; //final Keyword
        //c=200; // error: cannot assign a value to final variable c

        //Other types
        int myNum = 10;
        float myFloatNum = 7.143f;
        char myLetter = 'N';
        boolean myBool = false;
        String myText = "Naveen";

        System.out.println("Hello "+myText);
        System.out.println(myNum + myFloatNum);
    }
} */

// Identifiers
/* The general rules for naming variables are:

Names can contain letters, digits, underscores, and dollar signs
Names must begin with a letter
Names should start with a lowercase letter and it cannot contain whitespace
Names are case sensitive ("myVar" and "myvar" are different variables)
Reserved words (like Java keywords, such as int or boolean) cannot be used as names
 */

//Scientific Numbers 

/* public class Sample{
    public static void main(String[] args){
        float myFloat=25.013f;
        double myDouble=14.3256d;
        System.out.println(myFloat);
        System.out.println(myDouble);
    }
} */

//boolean datatype

/* public class Sample{
    public static void main(String[] args){
        boolean isNum=true, isDigit=false;
        System.out.println(isNum);
        System.out.println(isDigit);
    }
} */

//Char Datatype

/* public class Sample{
    public static void main(String[] args){
        char myGrade='A';
        System.out.println(myGrade);

        char myGrade1=65, myGrade2=97;
        System.out.println(myGrade1); // prints A (ASCII Code)
        System.out.println(myGrade2); // prints a (ASCII Code)
    }
} */

//String Datatype

/* public class Sample{
    public static void main(String[] args){
         String greeting="Hello Naveen";
        System.out.print(greeting);
    }
} */

//Type Casting

/* public class Sample{
    public static void main(String[] args){
        float myFloat=3.143f;
        System.out.println(myFloat);
        System.out.println((int)myFloat);
    }
} */

//JAVA OPERATORS
//Arithmetic Operators

/* public class Sample{
    public static void main(String[] args){
        System.out.println(5+25);
        System.out.println(35-25);
        System.out.println(5*2);
        System.out.println(5/5);
        System.out.println(25%2);
        int a=5;
        a++;
        System.out.println(a);
        //Decrement --
    }
}  */

//Assignment Operator 
/* public class Sample{
    public static void main(String[] args){
        int a=5;
        System.out.println(a);
        a+=5;
        System.out.println(a); 
        //+= -= *= /= %= &= |= ^= >>= <<=
    }
} */

//Comparison Operator
/* public class Sample{
    public static void main(String[] args){
        int x=10,y=20;
        System.out.println(10 == 20);
        System.out.println(10 != 20);
        System.out.println(10 < 20);
        System.out.println(10 > 20);
        System.out.println(10 <= 20);
        System.out.println(10 >= 20);
        System.out.println(10 != 20);
    }
} */

//Logical Operators
/* public class Sample{
    public static void main(String[] args){
        int x=4,y=20;
        System.out.println(x < 5 &&  y < 10);
        System.out.println(	x < 5 || y < 4);
        System.out.println(!(x < 5 && y < 10));
    }
} */

//Strings
/* public class Sample{
    public static void main(String[] args){
        String name="Naveen";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf("n"));
    }
} */

//String Concatenation
/* public class Sample{
    public static void main(String[] args){
        String firstName="Naveen ",lastName="R";
        System.out.println(firstName+lastName);
        System.out.println(firstName.concat(lastName));

        int a=10,b=20;
        System.out.println(a+b); //30
        String c="10",d="20";
        System.out.println(c+d); //1020
        String e="10";
        int f=20;
        System.out.println(e+f); //1020
        
    }
} */

//Java Special Characters 
/* public class Sample{
    public static void main(String[] args){
        String greeting="Hello,'Good Morning'";
        System.out.println(greeting);
        String greeting1="Hello,\"Good Morning\"";
        System.out.println(greeting1);
    }
} */

//Java Math
/* public class Sample{
    public static void main(String[] args){
        System.out.println(Math.max(5,10));
        System.out.println(Math.min(10,5));
        System.out.println(Math.sqrt(36));
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100));

    }
} */

//Loops
//if-else
/* public class Sample{
    public static void main(String[] args){
        if(false){
            System.out.println("I am a Good Programmer");
        }else{
            System.out.println("I am a Good Love Guru");
        }

    }
} */ 

//ternary operator
/* public class Sample{
    public static void main(String[] args){
        String result=(false)?"Naveen":"Reethu";
        System.out.println(result);
    }
} */

//Switch

/* public class Sample{
    public static void main(String[] args){
        int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
    }
} */


//while Loop
/* public class Sample{
    public static void main(String[] args){
        int i = 0;
        while (i < 5) {
            System.out.print(i+" ");
            i++;
        }
    }
} */

//do while
/* public class Sample{
    public static void main(String[] args){
       int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5); 
        }
} */


//for loop
/* public class Sample{
    public static void main(String[] args){
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
} */

//for-each
/* public class Sample{
    public static void main(String[] args){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            for (String i : cars) {
            System.out.println(i);
            }
    }
} */

//break-continue
/* public class Sample{
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
            continue;
            //break;
        }
            System.out.println(i);
        }
    }
} */

//Multi Dimensional Array
// 2D Array
/* public class Sample{
    public static void main(String[] args){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        // System.out.println(arr.length);
        // System.out.println(arr[0].length);

        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
} */

//Three Dimensional Array
// 3D Array
/* public class Sample{
    public static void main(String[] args){
        int arr[][][]={{1,2,3},{4,5,6},{7,8,9}};
        // System.out.println(arr.length);
        // System.out.println(arr[0].length);

        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
} */

/* public class Sample{
    public static void main(String[] args){
        int MarkedOrCostPrice(int n ,int percent,int sp){
            if (n=1){
                result=(sp*100)/(100-)
            }
            else if (){
                result=(sp*100)/
            }
        }
    }
} */

public class Sample{
    public static void main (String[] args){
        int SumOfElements(int arr[],int n){
            
        }
    }
}