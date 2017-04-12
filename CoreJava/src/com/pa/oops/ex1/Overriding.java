package com.pa.oops.ex1;

class Animals {
	public void sound() {
		System.out.println("This is parent class.");
	}
}

class Dogs extends Animals {
	public void sound() {
		System.out.println("Dogs bark");
	}
}

class Cats extends Animals {
	public void sound() {
		System.out.println("Cats meow");
	}
}

class Monkeys extends Animals {
	public void sound() {
		System.out.println("Monkeys whoop.");
	}
}

class Overriding {
	public static void main(String[] args) {
		Animals d = new Dogs();
		Animals c = new Cats();
		Animals m = new Monkeys();
		d.sound();
		c.sound();
		m.sound();
	}
}