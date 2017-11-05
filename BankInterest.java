
public class BankInterest {
    public static void main(String[] args) {
    	double rate = 0.03;
    	int firstmoney = 100000;
    	double firstyear = firstmoney + (firstmoney*rate);
    	double secondyear = firstyear + (firstyear*rate);
    	double thirdyear = secondyear + (secondyear*rate);
    	double fourthyear = thirdyear + (thirdyear*rate);
    	double fifthyear = fourthyear + (fourthyear*rate);
    	
    	System.out.println("5³â ÈÄÀÇ ±İÇÙ: " + fifthyear);
    	
    	
    	
    }
}
