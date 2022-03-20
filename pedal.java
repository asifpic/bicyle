package homework.Bike;

public class pedal {

	//필드
	static int size; // 크기
	static int weight; // 무게
	String material; //재질
	
	// 상태
	int rotation; // 회전수 1 이상이면 굴러가고 1 미만이면 멈춘다

	
	// 부품
	
	// 생성자
	pedal(){
		;;
	} // 기본 생성자 1
	
	pedal(int size, int weight, String material){
		pedal.size = size;
		pedal.weight = weight;
		this.material = material;
	} // 생성자 2
	
	pedal(int rotation) {
		this.rotation = rotation;
		
	} // 생성자 3
	
	
	// 상태

	void pedalmoving() { // 페달이 움직이는가?
		while(true) {
			if(rotation > 0) {
				System.out.println("회전수: " +rotation+ " 로 달립니다.");
			} else {
				System.out.println("자전거가 멈춥니다.");
			} //else
			
		} //while
	} //void

} // class


	