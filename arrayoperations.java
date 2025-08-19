import java.util.Arrays;
import java.util.Scanner;
public class arrayoperations{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[20];
        int size=5;
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=50;
        arr[4]=40;
        while(true){
            System.out.println("\narray operations menu:");
            System.out.println("1.Access");
            System.out.println("2.Insert");
            System.out.println("3.Delete");
            System.out.println("4.Search");
            System.out.println("5.Sort");
            System.out.println("6 Display");
            System.out.println("7.Exit");
            System.out.println("Enter choice:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter index to access:");
                    int index=sc.nextInt();
                    if(index>=0&&index<size){
                        System.out.println("Element at index"+index+"is"+arr[index]);
                    }
                    else{
                        System.out.println("Invalid index!");
                    }
                    break;
                case 2:
                    System.out.print("Enter position (0 to"+size+"):");
                    int pos=sc.nextInt();
                    System.out.print("Enter element to insert:");
                    int element=sc.nextInt();
                    if(pos>=0&&pos<=size){
                        for(int i=size;i>pos;i--){
                            arr[i]=arr[i-1];
                        }
                        arr[pos]=element;
                        size++;
                        System.out.println("Element inserted.");
                    }
                    else{
                        System.out.println("Invalid position!");
                    }
                    break;
                case 3:
                    System.out.println("Enter position to delete (0 to"+(size-1)+"):");
                    pos=sc.nextInt();
                    if (pos>=0&&pos<size){
                        for(int i=pos;i<size-1;i++){
                            arr[i]=arr[i+1];
                        }
                        size--;
                        System.out.println("Element deleted.");
                    }
                    else{
                        System.out.println("Invalid position!");
                    }
                    break;
                case 4:
                    System.out.println("Enter element to search:");
                    element=sc.nextInt();
                    boolean found=false;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] == element) {
                            System.out.println("Element found at index"+i);
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Element not found.");
                    }
                    break;
                case 5:
                    Arrays.sort(arr,0,size);
                    System.out.println("Array sorted:");
                    break;
                case 6:
                    System.out.print("Array elements:");
                    for(int i=0;i<size;i++)
                    {
                        System.out.println(arr[i]+"");
                    }
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }

        }
    }
}