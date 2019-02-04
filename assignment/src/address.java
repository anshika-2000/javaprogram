
class address{
	
		String line1;
		String line2;
		String city;
		String state;
		int pincode;

		address(){
			line1 = "";
			line2 = "";
			city = "";
			state = "";
			pincode = 0;
		}

		address(String line1,String line2,String city,String state,int pincode){
            this.line1 = line1;
			this.line2 = line2;
			this.city = city;
			this.state = state;
			this.pincode = pincode;
		}
	
	    void DisplayAddress(){
		System.out.println(line1);
		System.out.println(line2);
		System.out.println(city);
		System.out.println(state);
		System.out.println(pinCode);
	}
}