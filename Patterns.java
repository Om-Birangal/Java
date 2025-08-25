public class Patterns {
    public static void main(String[] args) {
    //Star Pattern // 

    //Solid Rectangle Pattern
    /*
     *****
     *****
     *****
     *****
     
     */
    for(int i=1; i<=4; i++){
        for(int j = 1; j<=5; j++){
            System.out.print("*");
        }
        System.out.println("*");
    }
    System.out.println();
    System.out.println("---------------------------");
    //Number Pattern
    /*
    
    123451
    123452
    123453
    123454

    */
    for(int i=1; i<=4; i++){
        for(int j = 1; j<=5; j++){
            System.out.print(j);
        }
        System.out.println(i);
    }
    System.out.println();
    System.out.println("---------------------------");
    //Hollow Rectangle Pattern
    /*
    
     *****
     *   *
     *   *
     *****

     */
    for(int i=1; i<=4 ; i++){
        for(int j=1; j<=5; j++){
            if(i== 1 || j==1 || i==4 ||  j==5){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }       
        }
        System.out.println();
    }
    System.out.println("---------------------------");
    //Number Hollow Rectangle Pattern
    /*    
    
    12345
    12225
    13335
    12345

    */
    for(int i=1; i<=4 ; i++){
        for(int j=1; j<=5; j++){
            if(i== 1 || j==1 || i==4 ||  j==5){
                System.out.print(j);
            } else {
                System.out.print(i);
            }       
        }
        System.out.println();
    }
    System.out.println();
    System.out.println("---------------------------");
    //Half Pyramid Pattern
    /*     
    
     *
     **
     ***
     ****
    
     */

    for(int i=1; i<=4; i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println();
    System.out.println("---------------------------");
    //Half Pyramid Number Pattern
    /*
    
     1
     12
     123
     1234
    
     */
    for(int i=1; i<=4; i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    System.out.println();
    System.out.println("---------------------------");
     //Half Pyramid Number Pattern
    /*
    
    1
    2 3
    4 5 6
    7 8 9 10
    
    */
    int num = 1;
    for(int i=1; i<=4; i++){
        for(int j=1;j<=i;j++){
            System.out.print(num +" ");
            num++;
        }
        System.out.println();
    }
    System.out.println();
    System.out.println("---------------------------");
    //Half Pyramid Number Pattern
    /*
    
    1
    0 1
    1 0 1
    0 1 0 1

    */
     int number=4;
     for(int i=1; i<=number; i++){
        for(int j=1; j<=i; j++){
            if((i+j)%2==0){
                System.out.print("1 ");
            }else{
                System.out.print("0 ");
            }
        } System.out.println();
     }
     System.out.println();
     System.out.println("---------------------------");
    //Inverted Half Pyramid Pattern
    /*
    
    ****
    ***
    **
    *

    */
     for(int i=4; i>=1; i--){
        for(int j=i; j>=1; j--){
            System.out.print("*");
        }
        System.out.println();
     }
     System.out.println();
     System.out.println("---------------------------");
    //Inverted Half Pyramid Number Pattern
    /*

    1234
    123
    12
    1

    */
    for(int i=4; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
     }
    System.out.println();
    System.out.println("---------------------------");
    //Half Pyramid Star Pattern
    /*

       *
      **
     ***
    ****

     */
    int r =4;
    for(int i = 1; i <= r; i++){
        for(int j =1; j<= r-i; j++){
            System.out.print(" ");
        }
        for( int j =1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    System.out.println();
    System.out.println("---------------------------");
    //Half Pyramid Number Pattern
    /*

       1
      12
     123
    1234

    */
    
    for(int i = 1; i <= r; i++){
        for(int j =1; j<= r-i; j++){
            System.out.print(" ");
        }
        for( int j =1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
    System.out.println("---------------------------");
    //Butterfly Pattern
    /*

    *      *
    **    **
    ***  ***
    ********
    ***  ***
    **    **
    *      *

    */
int b=4;
    for(int i =1; i <= b; i++){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        int spaces =2*(b-i);
        for(int j=1; j<=spaces; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i =b; i >= 1; i--){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        int spaces =2*(b-i);
        for(int j=1; j<=spaces; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("---------------------------");
    //Parrallelogram Pattern
    /*

          *****
         *****
        *****
       *****
      *****

    */
    int a =5;
    for(int i =1; i<=a; i++){
        int spaces =(a-i);
        for(int j=1; j<=spaces ; j++){
            System.out.print(" ");
        }
        for(int j =1; j<=a; j++){
            System.out.print("*");
        }
        System.out.println();
    }
        //Number Pryamid Pattern
        /*

            1
           2 2
          3 3 3
         4 4 4 4 
        5 5 5 5 5

         */
        System.out.println("---------------------------");
        int x=5;
        for(int i=1; i<=x; i++){
            //spaces
            for(int j=1; j<=x-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        //Number Palendrome Pattern
        /*

            1
           212
          32123
         4321234
        543212345

         */
        int y=5;
        for(int i=1; i<=y; i++){
            //spaces
            for(int j=1; j<=(y-i); j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        int z=4;
        for(int i=1; i<=z; i++){
            //spaces
            for(int j=1; j<=(z-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=z; i>=1; i--){
            //spaces
            for(int j=1; j<=(z-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        //
        /*
        
            *
           **
          ***
         ****
        *****
         ****
          ***
           **
            *
        
        */    
        int m=5;
            for(int i=1; i<=m; i++){
                for(int j=1; j<=m-i; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=1; i<=m; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=m-i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("---------------------------");
            //
            /*

            */
            for(int i=5; i>=1; i--){
                //spaces
                for(int j=1; j<=5-i; j++){
                    System.out.print(" ");
                }
                ///stars
                for(int j=1; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println("---------------------------");
           }   

}