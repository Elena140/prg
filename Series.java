public interface Series {
	int getNext(); //возврат следующего числа в последовательности 
	void reset(); //восстановление исходного состояния последовательности (сброс)
	void setStart(int x);  //установква начального значения в последовательности
}
