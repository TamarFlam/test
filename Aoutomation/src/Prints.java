
public class Prints {
	//פונקציה המחייבת יצירת אובייקט (ללא STATIC
	 void printArry(int[]Arry) {
		for(int i=0;i<Arry.length;i++) {
			System.out.println(Arry[i]);
		}

}
	 //אין צורך ליצור אובייקט-STATIC, יש להגדיר בקלאס הראשי EXTEND
	static void printArry2(int[]Arry) {
		for(int i=0;i<Arry.length;i++) {
			System.out.println(Arry[i]);
		}

}
}