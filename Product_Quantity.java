package complexloop;
import java.util.*;
public class Product_Quantity {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		int ItemNO[] = {101,102,103,104}, Price[]= {42,50,500,40}, Stock[] = {10,20,15,16};
		int Itno=0, Qty=0;
		System.out.print("Enter Item Code : ");
		Itno = obj.nextInt();
		System.out.print("Enter Quantity Required : ");
		Qty = obj.nextInt();
		for (int i =0; i<=3; i++ ) {
			if (ItemNO[i]==Itno && Stock[i]>=Qty) {
				int restQty=0;
				float cost=0;
				restQty = Stock[i]-Qty;
				cost = Price[i]*Qty;
				System.out.println(cost+" INR");
				System.out.println(restQty+" LEFT");
				break;
			}
			else if (ItemNO[i]==Itno && Stock[i]<Qty) {
				System.out.println("OUT OF STOCK");
				System.out.println(Stock[i]+" LEFT");	
				break;
			}
			else {
			
		 }
		}
	}
  }
