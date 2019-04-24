public class Main {
     //creating a function that correctly prints a value
    public static void Print(char[] mas) {
        int i =0;
        //creating a cycle for array mas
        while (i < mas.length) {
            for (i = 0; i < (mas.length + 1); i++) {
                //creating array mass_2 that rewrites the value from mas
                 char mass_2[] = new char[i];
                 //creating a cycle for array mass_2
                   for(i=0; i<mass_2.length;i++) {
                       mass_2[i]=mas[i];
                       // output values
                       System.out.print(mass_2[i]);
                   }
                   System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        //creating array mas
       char[] mas = {'a','b','c','d','e'};
       //function call
         Print(mas);
    }


}
