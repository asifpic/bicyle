package homework.Bike;

public class pedal0 extends pedal {

	public pedal0(int rotation) {
		super(rotation);
	}
	
	@Override
	void pedalmoving() {
		++rotation;
		
		while(true) {
		if(rotation > 0) {
			System.out.println("페달이 " + rotation + "회전 수로 움직입니다.");
		} else {
			System.out.println("페달이 회전을 멈춥니다.");
		} // else-if
		} // while
	}
} // end class


