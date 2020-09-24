package com.cg.day2;

	public class Prog1 implements Device{


		public void doIt() {
			
		}

	}
	abstract class Phone1 extends Prog1 {
		
	}
	abstract class Phone2 extends Prog1 {
		
	}
	class Phone3 extends Prog1 implements Device {
		public void doStuff() {}
	}
	interface Device {
		public void doIt();
	}