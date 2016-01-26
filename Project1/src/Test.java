
import java.util.Scanner;



/**
 *
 * @author Francis
 */
public class Test {
    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);

        RedBlackTree  rbt;
    rbt = new RedBlackTree(0);
        System.out.println("Red Black Tree Test\n");          
        char ch;
        /*  Perform tree operations  */
        do    
        {
            System.out.println("\nRed Black Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search");
            System.out.println("3. count nodes");
            System.out.println("4. check empty");
            System.out.println("5. clear tree");
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                int num = scan.nextInt();
                rbt.insert(num );                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to search");
                System.out.println("Search result : "+ rbt.find( scan.nextInt() ));
                break;                                          
            case 3 : 
                System.out.println("Nodes = "+ rbt.countNode());
                break;     
            case 4 : 
                System.out.println("Empty status = "+ rbt.isEmpty());
                break;     
            case 5 : 
                System.out.println("\nTree Cleared");
                rbt. empty ();
                break;         
            default : 
                System.out.println("Wrong Entry \n ");
                break;    
            }
            /*  Display tree  */
            
            System.out.print("\nIn order : ");
            rbt. inOrderPrint ( ) ; 
 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        }  while  ( ch ==  'Y' || ch ==  'y' ) ;   
    }
}
