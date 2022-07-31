package com.simplilearn.inheritance;

public class MontainBike1 extends Bicycle {
	
	
	//extends keyword indicated that you are making a new class that is 
		//derived from an existing class
		//meaning of 'extends' means increasing functionality
		
		
		//here the class which is inherited is called parent class or superclass
		//and new class is  called child class  or subclass 
		
		private  int seatHeight1;
		
		public MontainBike1(int gear, int speed, int seatHeight) {
			super(gear, speed);
			// TODO Auto-generated constructor stub
			this.seatHeight1=  seatHeight;
		}

		public int getSeatHeight1() {
			return seatHeight1;
		}

		public void setSeatHeight(int seatHeight) {
			this.seatHeight1 = seatHeight;
		}

		@Override
		public String toString() {
			return "MontainBike [" + super.toString()+"\nSeatHeight="+seatHeight1+ "]";
		}
		//extends keyword indicated that you are making a new class that is 
		//derived from an existing class
		//meaning of 'extends' means increasing functionality
		
		
		//here the class which is inherited is called parent class or superclass
		//and new class is  called child class  or subclass 
		
		private  int seatHeight;
		
		public void MontainBike(int gear, int speed, int seatHeight) {
			super(gear, speed);
			// TODO Auto-generated constructor stub
			this.seatHeight1=  seatHeight;
		}

		public int getSeatHeight() {
			return seatHeight1;
		}

		public void setSeatHeight1(int seatHeight) {
			this.seatHeight1 = seatHeight;
		}

		@Override
		public String toString1() {
			return "MontainBike [" + super.toString()+"\nSeatHeight="+seatHeight1+ "]";
		}


}
