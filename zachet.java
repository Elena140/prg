class Product {
	    public void kategori() {
		            System.out.println("Разные категории товаров");
			        }
}

class Book extends Product {
	        public void kategori() {
			        System.out.println("Категория товара: книги");
				    }
}

class Electronics extends Product {
	        public void kategori() {
			        System.out.println("Категория товара: электроника");
				    }
}

class Detection {
	    public static void main(String[] args) {
		            Product razdel = new Product(); 
		            Product book = new Book();    
	       		    Product electronics = new Electronics();
 			    
			    razdel.kategori(); 
                            razdel = book;   
			    razdel.kategori();
			    razdel = electronics;
			    razdel.kategori();
	}
}
