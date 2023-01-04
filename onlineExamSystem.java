
import java.util.*;
class onlineExamSystem
{
    Scanner sc = new Scanner(System.in);
    HashMap<String,Integer> map = new HashMap<String,Integer>();
    onlineExamSystem(){
        map.put("somya",45456743);
        map.put("nisha",45458965);
        map.put("Shobhit",54568887);
        map.put("Amaya",76554356);
        map.put("Aradhya",56437862);
    }
    public void signUp(){
        String Name;
        int pwd ;
        System.out.println("Enter Your Name");
        Name = sc.next();
        if(map.containsKey(Name))
        {
            System.out.println("\nName Already Registered!");
            return;
        }
        System.out.println("Enter Password ");
        pwd = sc.nextInt();
        map.put(Name,pwd);
        System.out.println();
        System.out.println("Name Registered Successfully! ");
        System.out.println();
    }
    public void SignIn()
    {
        String Name;
        int pwd;
        System.out.println("LOGIN");
        System.out.println("Enter Your Name:");
        Name = sc.next();
        System.out.println("Enter Passoword:");
        pwd = sc.nextInt();
        if(map.containsKey(Name) && map.get(Name)==pwd)
        {
            System.out.println("\nLogin successful!");
            menu();
        }
        else
        {
            System.out.println("\nInvalid Username or Password.\nTry again!!!\n");
            SignIn();
        }
    }
    public void menu()
    {
        int ch;
        System.out.println("\nEnter your Choice:");
        System.out.println("1.Update profile \n2.Start Exam \n3.Logout");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                map = update();
                menu();
                break;
            case 2:
                startExam();
                menu();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Wrong choice!!! Choose correct choice");
        }
    }
    public HashMap<String,Integer> update()
    {
        String update_id;
        int update_pwd;
        System.out.println("Enter Your Name:");
        update_id = sc.next();
        System.out.println("Enter Old Password:");
        update_pwd = sc.nextInt();
        if(map.containsKey(update_id) && map.get(update_id)==update_pwd)
        {
            System.out.println("Enter New Password:");
            update_pwd = sc.nextInt();
            map.replace(update_id,update_pwd);
            System.out.println("Password Changed Successfully!!!");
        }
        else
        {
            System.out.println("User not found.\n");
        }
        return map;
    }
    public void startExam()
    {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + 30;
        int result = 0,ans;

        while(System.currentTimeMillis()<endTime)
        {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Q1.Which Operation is used to enter values in Stack?");
            System.out.println("1.Push \t2.Pop \t3.Peek \t4.None");
            System.out.print("Enter Option: ");
            ans = sc.nextInt();
            if(ans == 1)
                result+=5;
            else
                result--;

            System.out.println("-------------------------------------------------------------");
            System.out.println("Q2.Which one of the following is not a Java feature?\n");
            System.out.println("1.Object-oriented\n" + "2.Use of pointers\n" + "Portable\n" +"Dynamic and Extensible\n");
            System.out.print("Enter Option: ");
            ans = sc.nextInt();
            if(ans == 2)
                result+=5;
            else
                result--;

            System.out.println("-------------------------------------------------------------");
            System.out.println("Q3.How many types of Inheritance are there in OOPs?");
            System.out.println("1.One\t2.Two\t3.Five\t4.Four");
            System.out.print("Enter Option: ");
            ans = sc.nextInt();
            if(ans == 3) result+=5;
            else result--;

            System.out.println("-------------------------------------------------------------");
            System.out.println("Q4How are String represented in memory in C?\n");
            System.out.println("1.Arrays of element\t 2.the object of some class\t 3.Same as other primitive data");
            System.out.print("Enter Option: ");
            ans = sc.nextInt();
            if(ans == 1) result+=5;
            else result--;

            System.out.println("-------------------------------------------------------------");
            System.out.println("Q5.Number of Basic Pillars of OOPs?\n");
            System.out.println("1.One\t2.Two\t3.Three\t4.Four");
            System.out.print("Enter Option: ");
            ans = sc.nextInt();
            if(ans == 4)
                result+=5;
            else
                result--;

            System.out.println("------------------------------------------------------------");
            System.out.println("Q6.Which of these cannot be used for a variable name in Java?");
            System.out.println("1.identifier & keyword\t" +"2.identifier\t" +"3.keyword\t" +"4.none of the mentioned\t");
            System.out.println("Enter Option: ");
            ans = sc.nextInt();
            if(ans == 3)
                result+=5;
            else
                result--;
            System.out.println("-------------------------------------------------------------");
            break;
        }
        System.out.println("Exam Finished!!!");
        System.out.println();
        System.out.println("Your Score is "+result);
        if(result>10)
            System.out.println("Congratulations you passed!!!");
        else
            System.out.println("Better Luck Next Time!!!");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        onlineExamSystem oes  = new onlineExamSystem();
        int choice = 0;
        do{
            System.out.println("Enter Your Choice: ");
            System.out.println("1.SignUp\t2.SignIn");
            choice = sc.nextInt();
            if(choice == 1) oes.signUp();
            else if(choice == 2) oes.SignIn();
            else System.out.println("Wrong Choice!");
        }while(choice != 2);

    }
}