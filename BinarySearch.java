public class BinarySearch {
    public static void main(String[] args){
        int[]arr={10,20,30,40,50};
        int key=30,l=0,r=arr.length-1,mid,pos=-1;
            while(l<=r){
                mid=(l+r)/2;
                if (arr[mid]==key){pos=mid;break;}
                else if(arr[mid]<key)l=mid+1;
                else r=mid-1;
            }
            System.out.println(pos==-1?"not found":"found at index"+pos);
    }
}
