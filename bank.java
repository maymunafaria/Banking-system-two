
package bankingsystemtwo;

public class bank {
    
	public void Start_banking(){
		bkash fariabkash = new bkash("faria", "01778314306",12000 ,"1234");
		fariabkash.information();
                bkash maymunabkash = new bkash("maymuna", "01778314366",14000);
		maymunabkash.information();
                
                
		nagad farianagad = new nagad("faria", "01778314306",12000 ,"1234");
		farianagad.information();

                
                
		rocket fariarocket = new rocket("faria", "01778314306",12000 ,"1234");
		fariarocket.information();

		
            System.out.println("bkash\n");
            fariabkash.addmoney(500);
	    fariabkash.cashout(300,"45");
	    fariabkash.cashout(4000,"1234");
	    
	    
	    
	    maymunabkash.cashout(700);
	    maymunabkash.pinset("4567");
	    maymunabkash.cashout(500,"4567");
            
            System.out.println("nagad\n");
            farianagad.addmoney(500);
	    farianagad.cashout(300,"4095");
	    farianagad.cashout(4000,"1234");
            farianagad.cashout(700000 , "1234");
	    
	    
            System.out.println("rocket\n");
            fariarocket.addmoney(500);
	    fariarocket.cashout(300,"4578");
	    fariarocket.cashout(4000,"1234");
	    
	   
	    

	
	}    
}
    
