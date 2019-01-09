class program5{
	public static void main(String args[]){
		long minutes = 4555222;
		float year = minutes/525600f;
		float months = minutes/43800f;
		float days = minutes/1440f;
		System.out.println("total no. of years are:" + year);
		System.out.println("total no. of months are:" + months);
		System.out.println("total no. of days are:" + days);
	}
}
