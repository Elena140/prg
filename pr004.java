class Avtomobil {
	int pass; //количесиво пассажиров
	int v; //объем топливного бака в л.
	double rash; //расход топлива в л. на 100км.


}
class pr004 {
	public static void main(String args[]) {
		//Создание экземпляра класса
		Avtomobil lada = new Avtomobil();
		Avtomobil porshe = new Avtomobil();
	        int rasst, rasst2;

		//Присваивание звначений внутренним переменным экземплярам класса
		lada.pass = 4;
 		lada.v = 40;
		lada.rash = 5.5;

		porshe.pass = 1;
		porshe.v = 100;
		porshe.rash = 14.0;

		
		//Расчет расстояния, которое lada  проедет на полном баке		
		rasst = (int) (lada.v/lada.rash * 100);
		rasst2 = (int) (porshe.v/porshe.rash * 100);
		System.out.println("Lada проедет " + rasst + " кмю на полном баке");
		System.out.println("Porshe проедет " + rasst2 + " кмю на полном баке");	
	}
}
