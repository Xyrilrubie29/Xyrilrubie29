
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carding Works
 */
public class Xyril_Boutique_Shop {

    
    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static int discount;
    public static double totalamount=0,pay, amountdue, finalamount, amountpayable;
    public static double OffDiscount, Initial, NetAmount, TotalDiscount;
    
    public static void menu(){
    System.out.println("\t\t\t\t      Xyril Boutique Shop Where Style Meets Confidence    ");
    System.out.println("\t\t\t\t                 Geverola St, Poblacion Malita            ");
    System.out.println("\t\t\t\t==========================================================");
    System.out.println("\t\t\t\t                         ~PRODUCTS~                       ");
    System.out.println("\t\t\t\t  NO.      NAME                                   PRICE   ");
    System.out.println("\t\t\t\t  01. Christian Dior Wallet                    Php. 499.00");
    System.out.println("\t\t\t\t  02. Louis Vuitton Bag                        Php.1999.50");
    System.out.println("\t\t\t\t  03. Channel Sling Bag                        Php. 899.00");
    System.out.println("\t\t\t\t  04. Trendy 3tier Puff Dress                  Php. 349.75");
    System.out.println("\t\t\t\t  05. Gingham Square Neck Puff Top             Php. 200.00");
    System.out.println("\t\t\t\t                                                          ");
    System.out.println("\t\t\t\t                       ~SPECIAL OFFER~                    ");
    System.out.println("\t\t\t\t                   Buy 2 Get 1 Free Wallet                ");
    System.out.println("\t\t\t\t  06. Hercel Backpack                        Php. 1,499.75");
    System.out.println("\t\t\t\t  07. Jansport Backpack                      Php. 1,499.75");
    System.out.println("\t\t\t\t                                                          ");
    System.out.println("\t\t\t\t  08. CANCEL                                              ");
    System.out.println("\t\t\t\t  00. Exit                                                ");
    System.out.println("\t\t\t\t==========================================================");
    }

    public static void payment(){
        if(again.equalsIgnoreCase("Y")){
            order();
        }else{
            System.out.println("\t\t\t\t");
            System.out.println("ENTER PAYMENT:");
            pay = input.nextDouble();
            if(pay <=amountpayable){
                System.out.println("\t\t\t\t");
                System.out.println("\t\t\t\t ERROR INSUFICIENT PAYMENT :(");
                    payment();//to loop back to payment
                
            }else{
            amountpayable = amountpayable - pay;
            System.out.println("\t\t\t\t                PAYMENT RECIEVED...                ");
            System.out.println("CHANGE..." +amountpayable);
            System.out.println("\t\t\t\t");
            System.out.println("\t\t\t\t");
            System.out.println("\t\t\t\t      THANK YOU FOR PURCHASING IN OUR PRODUCT, XOXO :) ");
            System.out.println("\t\t\t\t---------------------------------------------------");
            System.out.println("\t\t\t\t");
            System.out.println("\t\t\t\t");
            System.out.println("\t\t\t\t");
                menu();
                order();
            }
        }
}  
    public static void cancellation(){
        System.out.println("\t\t\t\t");// to cancel order   
        System.out.println("ENTER THE NO. OF THE PRODUCT YOU WISH TO PURCHASE");
        amountpayable = amountpayable-(amountpayable);
            menu();
            order();
    }
    public static void order(){
    System.out.println("\t\t\t\t");
    System.out.println("\t\t\t\t");
    System.out.println("TO SELECT ENTER THE NO. CODE OF EACH PRODUCT:");
    System.out.println("\t\t\t\t");
    System.out.println("\t\t\t\t Enter 01 for Christian Dior Wallet ");
    System.out.println("\t\t\t\t Press 02 for Louis Vuitton Bag  ");
    System.out.println("\t\t\t\t Press 03 for Channel Sling Bag");
    System.out.println("\t\t\t\t Press 04 for Trendy 3tier Puff Dress");
    System.out.println("\t\t\t\t Press 05 for Gingham Square Neck Puff top");
    System.out.println("\t\t\t\t Press 05 for Hercel Backpack");
    System.out.println("\t\t\t\t Press 06 for Jansport Backpack");
    System.out.println("\t\t\t\t");
    System.out.println("ENTER HERE:");
    System.out.println("=====> :");
    
    choose = input.nextInt();
        //conditions
        switch (choose) {
            case 1:
                System.out.println("YOU HAVE SELECTED CHRISTIAN DIOR WALLET ");
                System.out.println("\t\t\t\t");
                discount();
                System.out.println("QUANTITY..:");
                quantity = input.nextInt();
                totalamount = totalamount +(quantity*499);
                amountdue = totalamount;
                System.out.println("Initial Amount: Php" +totalamount);
                if (amountdue >=2000){
                    finalamount= amountdue*(0.05);
                    amountpayable = amountdue-finalamount;
                    System.out.println("\t\t\t\tYOU CAN AVAIL A VOUCHER!");
                    System.out.println("Total Amount: Php" +amountpayable);
                    
                }else if(amountdue < 2000){
                    finalamount = amountdue;
                    amountpayable= finalamount;
                    
                }       if (amountdue >= 3000){
                    finalamount= amountdue*(0.08);
                    amountpayable = amountdue-finalamount;
                    System.out.println("\t\t\t\tYOU CAN AVAIL A VOUCHER!");
                    System.out.println("Total Amount: Php" +amountpayable);
                    
                }else if(amountdue < 3000){
                    finalamount = amountdue;
                    amountpayable= finalamount;
                    
                }       System.out.println("PURCHASE AGAIN..:");
                System.out.println("\t\t\t\tPress Y to Continue");
                System.out.println("\t\t\t\tPress N to Pay or Cancel Order");
                System.out.println("ENTER HERE:");
                System.out.println("==>");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();
                }else{
                    System.out.println("\t\t\t\tTO ENTER PAYMENT: ENTER THE AMOUNT TWICE");
                    System.out.println("\t\t\t\t       TO CANCEL ORDER: Enter C        ");
                    System.out.println("HERE:");
                    
                    choose = input.nextInt();
                    if (choose==8){
                        System.out.println("\t\t\t\t            YOU CANCELLED YOUR ORDER");// to cancel order
                        cancellation();
                    }
                    
                    pay = input.nextDouble();
                    if(pay <=amountpayable){
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t ERROR INSUFICIENT PAYMENT :( ");
                        payment();//to loop back to payment
                        
                    }else{
                        
                        amountpayable = amountpayable - pay;
                        System.out.println("\t\t\t\t                PAYMENT RECIEVED...                ");
                        System.out.println("CHANGE... Php" +amountpayable);
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t       THANK YOU FOR PURCHASING IN OUR PRODUCT, XOXO :)  ");
                        System.out.println("\t\t\t\t---------------------------------------------------");
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t");
                        menu();
                        order();
                    }
                }       break;
            case 02:
                System.out.println("YOU HAVE SELECTED LOUIS VUITTON BAG ");
                System.out.println("\t\t\t\t");
                discount();
                System.out.println("QUANTITY..:");
                quantity = input.nextInt();
                totalamount = totalamount +(quantity*1999);
                amountdue = totalamount;
                System.out.println("Initial Amount: Php" +totalamount);
                if (amountdue >=2000){
                    finalamount= amountdue*(0.05);
                    amountpayable = amountdue-finalamount;
                    System.out.println("\t\t\t\tYOU CAN AVAIL A VOUCHER!");
                    System.out.println("Total Amount: Php" +amountpayable);
                    
                }else if(amountdue < 2000){
                    finalamount = amountdue;
                    amountpayable= finalamount;
                    
                }       if (amountdue >= 3000){
                    finalamount= amountdue*(0.08);
                    amountpayable = amountdue-finalamount;
                    System.out.println("\t\t\t\tYOU CAN AVAIL A VOUCHER!");
                    System.out.println("Total Amount: Php" +amountpayable);
                    
                }else if(amountdue < 3000){
                    finalamount = amountdue;
                    amountpayable= finalamount;
                    
                }       System.out.println("PURCHASE AGAIN..:");
                System.out.println("\t\t\t\tPress Y to Continue");
                System.out.println("\t\t\t\tPress N to Pay or Cancel Order");
                System.out.println("ENTER HERE:");
                System.out.println("==>");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();
                }else{
                    System.out.println("\t\t\t\tTO ENTER PAYMENT: ENTER THE AMOUNT TWICE");
                    System.out.println("\t\t\t\t       TO CANCEL ORDER: Enter C        ");
                    System.out.println("HERE:");
                    
                    choose = input.nextInt();
                    if (choose==8){
                        System.out.println("\t\t\t\t            YOU CANCELLED YOUR ORDER");// to cancel order
                        cancellation();
                    }
                    
                    pay = input.nextDouble();
                    if(pay <=amountpayable){
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t ERROR INSUFICIENT PAYMENT!:( ");
                        payment();//to loop back to payment
                        
                    }else{
                        
                        amountpayable = amountpayable - pay;
                        System.out.println("\t\t\t\t                PAYMENT RECIEVED...                ");
                        System.out.println("CHANGE... Php" +amountpayable);
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t     THANK YOU FOR PURCHASING IN OUR PRODUCT, XOXO :)   ");
                        System.out.println("\t\t\t\t---------------------------------------------------");
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t");
                        menu();
                        order();
                    }
                }       break;
            case 3:
                System.out.println("YOU HAVE SELECTED CHANNEL SLING BAG ");
                System.out.println("\t\t\t\t");
                discount();
                System.out.println("QUANTITY..:");
                quantity = input.nextInt();
                totalamount = totalamount +(quantity*899);
                amountdue = totalamount;
                System.out.println("Initial Amount: Php" +totalamount);
                if (amountdue >=2000){
                    finalamount= amountdue*(0.05);
                    amountpayable = amountdue-finalamount;
                    System.out.println("\t\t\t\tYOU CAN AVAIL A VOUCHER!");
                    System.out.println("Total Amount: Php" +amountpayable);
                    
                }else if(amountdue < 2000){
                    finalamount = amountdue;
                    amountpayable= finalamount;
                    
                }       if (amountdue >= 3000){
                    finalamount= amountdue*(0.08);
                    amountpayable = amountdue-finalamount;
                    System.out.println("\t\t\t\tYOU CAN AVAIL A VOUCHER");
                    System.out.println("Total Amount: Php" +amountpayable);
                    
                }else if(amountdue < 3000){
                    finalamount = amountdue;
                    amountpayable= finalamount;
                    
                }       System.out.println("PURCHASE AGAIN..:");
                System.out.println("\t\t\t\tPress Y to Continue");
                System.out.println("\t\t\t\tPress N to Pay or Cancel Order");
                System.out.println("ENTER HERE:");
                System.out.println("==>");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();
                }else{
                    System.out.println("\t\t\t\tTO ENTER PAYMENT: ENTER THE AMOUNT TWICE");
                    System.out.println("\t\t\t\t       TO CANCEL ORDER: Enter 08        ");
                    System.out.println("HERE:");
                    
                    choose = input.nextInt();
                    if (choose==8){
                        System.out.println("\t\t\t\t            YOU CANCELLED YOUR ORDER");// to cancel order
                        cancellation();
                    }
                    
                    pay = input.nextDouble();
                    if(pay <=amountpayable){
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t ERROR INSUFICIENT PAYMENT!:( ");
                        payment();//to loop back to payment
                        
                    }else{
                        
                        amountpayable = amountpayable - pay;
                        System.out.println("\t\t\t\t                PAYMENT RECIEVED...                ");
                        System.out.println("CHANGE... Php" +amountpayable);
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t      THANK YOU FOR PURCHASING IN OUR PRODUCT, XOXO :)   ");
                        System.out.println("\t\t\t\t---------------------------------------------------");
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t");
                        menu();
                        order();
                    }
                }       break;
            case 4:
                System.out.println("YOU HAVE TRENDY 3TIER PUFF DRESS");
                System.out.println("\t\t\t\t");
                discount();
                System.out.println("QUANTITY..:");
                quantity = input.nextInt();
                totalamount = totalamount +(quantity*349.75);
                amountdue = totalamount;
                System.out.println("Initial Amount: Php" +totalamount);
                if (amountdue >=2000){
                    finalamount= amountdue*(0.05);
                    amountpayable = amountdue-finalamount;
                    System.out.println("\t\t\t\tYOU CAN AVAIL A VOUCHER");
                    System.out.println("Total Amount: Php" +amountpayable);
                    
                }else if(amountdue < 2000){
                    finalamount = amountdue;
                    amountpayable= finalamount;
                    
                }       if (amountdue >= 3000){
                    finalamount= amountdue*(0.08);
                    amountpayable = amountdue-finalamount;
                    System.out.println("\t\t\t\tYOU CAN AVAIL A VOUCHER");
                    System.out.println("Total Amount: Php" +amountpayable);
                    
                }else if(amountdue < 3000){
                    finalamount = amountdue;
                    amountpayable= finalamount;
                    
                }       System.out.println("PURCHASE AGAIN..:");
                System.out.println("\t\t\t\tPress Y to Continue");
                System.out.println("\t\t\t\tPress N to Pay or Cancel Order");
                System.out.println("ENTER HERE:");
                System.out.println("==>");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();
                }else{
                    System.out.println("\t\t\t\t             ENTER PAYMENT              ");
                    System.out.println("\t\t\t\t       TO CANCEL ORDER: Enter C         ");
                    System.out.println("HERE:"); 
                    
                    choose = input.nextInt();
                    if (choose==8){
                        System.out.println("\t\t\t\t            YOU CANCELLED YOUR ORDER");// to cancel order
                        cancellation();
                    }
                    
                    pay = input.nextDouble();
                    if(pay <=amountpayable){
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t ERROR INSUFICIENT PAYMENT!:( ");
                        payment();//to loop back to payment
                        
                    }else{
                        
                        amountpayable = amountpayable - pay;
                        System.out.println("\t\t\t\t                PAYMENT RECIEVED...                ");
                        System.out.println("CHANGE... Php" +amountpayable);
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t      THANK YOU FOR PURCHASING IN OUR PRODUCT, XOXO :)  ");
                        System.out.println("\t\t\t\t---------------------------------------------------");
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t");
                        menu();
                        order();
                    }
                }       break;
            case 5:
                System.out.println("YOU HAVE SELECTED GINGHAM SQUARE NECK PUFF TOP");
                System.out.println("\t\t\t\t");
                discount();
                System.out.println("QUANTITY..:");
                quantity = input.nextInt();
                totalamount = totalamount +(quantity*200);
                amountdue = totalamount;
                System.out.println("Initial Amount: Php" +totalamount);
                if (amountdue >=2000){
                    finalamount= amountdue*(0.05);
                    amountpayable = amountdue-finalamount;
                    System.out.println("\t\t\t\tYOU CAN AVAIL A VOUCHER");
                    System.out.println("Total Amount: Php" +amountpayable);
                    
                }else if(amountdue < 2000){
                    finalamount = amountdue;
                    amountpayable= finalamount;
                    
                }       if (amountdue >= 3000){
                    finalamount= amountdue*(0.08);
                    amountpayable = amountdue-finalamount;
                    System.out.println("\t\t\t\tYOU CAN AVAIL A VOUCHER");
                    System.out.println("Total Amount: Php" +amountpayable);
                    
                }else if(amountdue < 3000){
                    finalamount = amountdue;
                    amountpayable= finalamount;
                    
                }       System.out.println("PURCHASE AGAIN..:");
                System.out.println("\t\t\t\tPress Y to Continue");
                System.out.println("\t\t\t\tPress N to Pay or Cancel Order");
                System.out.println("ENTER HERE:");
                System.out.println("==>");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();
                }else{
                    System.out.println("\t\t\t\t              ENTER PAYMENT             ");
                    System.out.println("\t\t\t\t       TO CANCEL ORDER: Enter C       ");
                    System.out.println("HERE:");
                    
                    choose = input.nextInt();
                    if (choose==8){
                        System.out.println("\t\t\t\t            YOU CANCELLED YOUR ORDER");// to cancel order
                        cancellation();
                    }
                    
                    pay = input.nextDouble();
                    if(pay <=amountpayable){
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t ERROR INSUFICIENT PAYMENT!:( !");
                        payment();//to loop back to payment
                        
                    }else{
                        
                        amountpayable = amountpayable - pay;
                        System.out.println("\t\t\t\t                PAYMENT RECIEVED...                ");
                        System.out.println("CHANGE... Php" +amountpayable);
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t      THANK YOU FOR PURCHASING IN OUR PRODUCT, XOXO :)    ");
                        System.out.println("\t\t\t\t---------------------------------------------------");
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t");
                        menu();
                        order();
                    }
                }       break;
            case 6:
                System.out.println("YOU HAVE SELECTED HERCHEL BACKPACK");
                System.out.println("\t\t\t\t");
                discount();
                System.out.println("QUANTITY..:");
                quantity = input.nextInt();
                totalamount = totalamount +(quantity*1499.75);
                amountdue = totalamount;
                System.out.println("Initial Amount: Php" +totalamount);
                if (amountdue >=2000){
                    finalamount= amountdue*(0.05);
                    amountpayable = amountdue-finalamount;
                    System.out.println("\t\t\t\tYOU CAN AVAIL A VOUCHER");
                    System.out.println("Total Amount: Php" +amountpayable);
                    
                }else if(amountdue < 2000){
                    finalamount = amountdue;
                    amountpayable= finalamount;
                    
                }       if (amountdue >= 3000){
                    finalamount= amountdue*(0.08);
                    amountpayable = amountdue-finalamount;
                    System.out.println("\t\t\t\tYOU CAN AVAIL A VOUCHER");
                    System.out.println("Total Amount: Php" +amountpayable);
                    
                }else if(amountdue < 3000){
                    finalamount = amountdue;
                    amountpayable= finalamount;
                    
                }       System.out.println("PURCHASE AGAIN..:");
                System.out.println("\t\t\t\tPress Y to Continue");
                System.out.println("\t\t\t\tPress N to Pay or Cancel Order");
                System.out.println("ENTER HERE:");
                System.out.println("==>");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();
                }else{
                    System.out.println("\t\t\t\t         ENTER PAYMENT                ");
                    System.out.println("\t\t\t\t       TO CANCEL ORDER: Enter C       ");
                    System.out.println("HERE:");
                    
                    choose = input.nextInt();
                    if (choose==8){
                        System.out.println("\t\t\t\t            YOU CANCELLED YOUR ORDER");// to cancel order
                        cancellation();
                    }
                    
                    pay = input.nextDouble();
                    if(pay <=amountpayable){
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t ERROR INSUFICIENT PAYMENT!:( ");
                        payment();//to loop back to payment
                        
                    }else{
                        
                        amountpayable = amountpayable - pay;
                        System.out.println("\t\t\t\t                PAYMENT RECIEVED...                ");
                        System.out.println("CHANGE... Php" +amountpayable);
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t     THANK YOU FOR PURCHASING IN OUR PRODUCT, XOXO :) ");
                        System.out.println("\t\t\t\t---------------------------------------------------");
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t");
                        menu();
                        order();
                    }
                }       break;
            case 7:
                System.out.println("YOU HAVE SELECTED JANSPORT BACKPACK");
                System.out.println("\t\t\t\t");
                discount();
                System.out.println("QUANTITY..:");
                quantity = input.nextInt();
                totalamount = totalamount +(quantity*1499.75);
                amountdue = totalamount;
                System.out.println("Initial Amount: Php" +totalamount);
                if (amountdue >=2000){
                    finalamount= amountdue*(0.05);
                    amountpayable = amountdue-finalamount;
                    System.out.println("\t\t\t\tYOU CAN AVAIL A VOUCHER");
                    System.out.println("Total Amount: Php" +amountpayable);
                    
                }else if(amountdue < 2000){
                    finalamount = amountdue;
                    amountpayable= finalamount;
                    
                }       if (amountdue >= 3000){
                    finalamount= amountdue*(0.08);
                    amountpayable = amountdue-finalamount;
                    System.out.println("\t\t\t\tYOU CAN AVAIL A VOUCHER");
                    System.out.println("Total Amount: Php" +amountpayable);
                    
                }else if(amountdue < 3000){
                    finalamount = amountdue;
                    amountpayable= finalamount;
                    
                }       System.out.println("PURCHASE AGAIN..:");
                System.out.println("\t\t\t\tPress Y to Continue");
                System.out.println("\t\t\t\tPress N to Pay or Cancel Order");
                System.out.println("ENTER HERE:");
                System.out.println("==>");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();
                }else{
                    System.out.println("\t\t\t\t           ENTER PAYMENT                ");
                    System.out.println("\t\t\t\t       TO CANCEL ORDER: Enter C         ");
                    System.out.println("HERE:");
                    
                    choose = input.nextInt();
                    if (choose==8){
                        System.out.println("\t\t\t\t            YOU CANCELLED YOUR ORDER");// to cancel order
                        cancellation();
                    }
                    
                    pay = input.nextDouble();
                    if(pay <=amountpayable){
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t ERROR INSUFICIENT PAYMENT!:( ");
                        payment();//to loop back to payment
                        
                    }else{
                        
                        amountpayable = amountpayable - pay;
                        System.out.println("\t\t\t\t                PAYMENT RECIEVED...                ");
                        System.out.println("CHANGE... Php" +amountpayable);
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t     THANK YOU FOR PURCHASING IN OUR PRODUCT, XOXO :)  ");
                        System.out.println("\t\t\t\t---------------------------------------------------");
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t");
                        System.out.println("\t\t\t\t");
                        menu();
                        order();
                    }
                }       break;
            case 0:
                System.exit(0); // to close the program
            default:
                break;
        }
    }
        public static void discount(){
              System.out.println("\t\t\t\t          A V A I L A B L E. P R O M O. D I S C O U N T.      ");
              System.out.println("\t\t\t\t--------------------------------------------------------------");
              System.out.println("\t\t\t\t");
              System.out.println("\t\t\t\t          5%  Discount for every Php 2,000.00 up purchase     ");
              System.out.println("\t\t\t\t          8% Discount for every Php 3,000.00 up purchase     ");
              System.out.println("\t\t\t\t");
              System.out.println("\t\t\t\t--------------------------------------------------------------");
}
public static void main(String[] args){
        menu();
        order();
        cancellation();
        discount();
        payment();
    }
}
              
