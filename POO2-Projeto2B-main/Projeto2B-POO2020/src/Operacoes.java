import java.util.Scanner;


/*
 * Classe que possui operações básicas de frações, imc e conversões termométricas
 * @author Gabrielly
 * 
*/

public class Operacoes {

	int d1,d2;
	/*
	 * Método que calcula o mmc de dois denominadores
	 * @param num1 - valor do primeiro denominador
	 * @param num2 - valor do segundo denominador
	 * @return valor do mmc
	*/
	
	//MMC
	public int mmc( int num1,int num2) {
		//mmc=a*b/mdc
		Scanner entrada = new Scanner(System.in);
		  int r, a = 0, b;
		 
		  System.out.print("Insira o primeiro denominador:");
		  num1= entrada.nextInt();
		  System.out.print("Insira o segundo denominador:");
		  num2= entrada.nextInt();
		  this.d1=num1;
		  this.d2=num2;
		  a = num1;
		  b = num2;

		    do {
		     
		    	r= a % b;

		        a = b;
		        b = r;

		    } while (r != 0);
		
		 
		    return ( num1 * num2) / a;
	};
	
	
	/*
	 * Método que calcula a soma de duas frações
	 * @param n1 - valor do primeiro numerador
	 * @param n2 - valor do segundo numerador
	 * @param d1 - valor do primeiro denominador
	 * @param d2 - valor do segundo denominador
	 * @return valor da soma
	*/
	
	// SOMA
	public String somaFracao() {
		//r1=(mmc/d1)*n1
		//r2=(mmc/d2)*n2
		//(r1+r2)/mmc
		
		int n1, n2;
		Scanner entrada = new Scanner(System.in);
		Operacoes operacoes = new Operacoes();
		boolean d;
		String soma=null;
		
		
		System.out.print("Insira o primeiro numerador:");
		n1= entrada.nextInt();
		System.out.print("Insira o segundo numerador:");
		n2= entrada.nextInt();
		this.d1=d1;
		this.d2=d2;
		System.out.print("Os denominadores são diferentes?");
		d= entrada.hasNext();
		
		if(d=true) {
			
		int mmc= mmc(d1, d2);
		soma=((mmc/d1)*n1)+((mmc/d2)*n2)+"/"+mmc;
		
		}
		if(d=false){
		
		soma=(n1+n2)+"/"+d1;
		
		}
		return soma;
		};

		
		
		/*
		 * Método que calcula a subtração de duas frações
		 * @param n1 - valor do primeiro numerador
		 * @param n2 - valor do segundo numerador
		 * @param d1 - valor do primeiro denominador
		 * @param d2 - valor do segundo denominador
		 * @return valor da subtração
		*/
		
	// SUBTRAÇÃO
		public	String subtraiFracao() {
		int n1, n2;
		boolean d;
		String subtracao=null;
		
		Operacoes operacoes = new Operacoes();
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o primeiro numerador:");
		n1= entrada.nextInt();
		System.out.print("Insira o segundo numerador:");
		n2= entrada.nextInt();
		this.d1=d1;
		this.d2=d2;
		//mmc();
		System.out.print("Os denominadores são diferentes?");
		d= entrada.hasNext();
		if(d=true) {
			
			int mmc= mmc(d1,d2);
			subtracao=((mmc/d1)*n1)-((mmc/d2)*n2)+"/"+mmc;
			
			
			}
			if(d=false){
			
			subtracao= (n1-n2)+"/"+d1;
		
			}
			return subtracao;
	};
	
	
	/*
	 * Método que calcula a multiplicação de duas frações
	 * @param n1 - valor do primeiro numerador
	 * @param n2 - valor do segundo numerador
	 * @param d1 - valor do primeiro denominador
	 * @param d2 - valor do segundo denominador
	 * @return valor da multiplicação
	*/
	
	// MULTIPLICAÇÃO
	public static String multiplicaFracao(int n1, int n2, int d1, int d2) {
		//(n1*n2)/(d1*d2)
		Scanner entrada= new Scanner(System.in);
		System.out.print("Insira o primeiro numerador:");
		n1= entrada.nextInt();
		System.out.print("Insira o primeiro denominador:");
		d1= entrada.nextInt();
		System.out.print("Insira o segundo numerador:");
		n2= entrada.nextInt();
		System.out.print("Insira o segundo denominador:");
		d2= entrada.nextInt();
		
		return ((n1*n2)+"/"+(d1*d2));
		
	};
	
	
	/*
	 * Método que calcula a divisão de duas frações
	 * @param n1 - valor do primeiro numerador
	 * @param n2 - valor do segundo numerador
	 * @param d1 - valor do primeiro denominador
	 * @param d2 - valor do segundo denominador
	 * @return valor da divisão
	*/
	
	// DIVISÃO
	public static String divideFracao(int n1, int n2, int d1, int d2) {
		//(n1*d2)/(d1*n2)
		Scanner entrada= new Scanner(System.in);
	
		System.out.print("Insira o primeiro numerador:");
		n1= entrada.nextInt();
		System.out.print("Insira o primeiro denominador:");
		d1= entrada.nextInt();
		System.out.print("Insira o segundo numerador:");
		n2= entrada.nextInt();
		System.out.print("Insira o segundo denominador:");
		d2= entrada.nextInt();
		
		return (n1*d2)+"/"+(d1*n2);
	};

	
	/*
	 * Método que calcula O imc
	 * @param altura- valor da altura
	 * @param peso - valor do peso
	 * @return valor do imc
	*/
	// CALCULADORA DE IMC
	 
	
	public static double imc( double altura, double peso) { 
	   
	 double imc=0.00;
	 Scanner entrada = new Scanner(System.in);
	 System.out.println("Insira sua altura: ");
	 altura = entrada.nextDouble();
	 System.out.println("Insira seu peso: ");
	 peso = entrada.nextDouble();
	 imc= peso/(altura*altura);
	 return imc;
	
	};
	
	
	
	//CALCULADORA DE CONVERSÃO DE ESCALAS TERMOMÉTRICAS

	
	/*
	 * Método que converte temperatura de celcius para kelvin
	 * @param c - valor da temperatura em celcius
	 * @return valor da temperatura em kelvin
	*/
	public static double celsiusToKelvin(double c) {
		//K=C+273
		double k;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira uma temperatura em celsius:");
		c= entrada.nextDouble();
		return k=c+273.15;
	};
	
	
	/*
	 * Método que converte temperatura de celcius para farenheit
	 * @param c - valor da temperatura em celcius
	 * @return valor da temperatura em farenheit
	*/
	
	public static double celsiusToFarenheit(double c) {
		//F=1,8*C+32
		double f;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira uma temperatura em celsius:");
		c= entrada.nextDouble();
		return f=(c*1.8)+32;
	
	};
	
	/*
	 * Método que converte temperatura de kelvin para celcius
	 * @param k - valor da temperatura em kelvin
	 * @return valor da temperatura em celcius
	*/
	public static double kelvinToCelcius(double k) {
		//C=K-273.15
		double c;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira uma temperatura em kelvin:");
		k= entrada.nextDouble();
		return c=k-273.15;
	};
	
	/*
	 * Método que converte temperatura de kelvin para farenheit
	 * @param k - valor da temperatura em kelvin
	 * @return valor da temperatura em farenheit
	*/
	public double kelvinToFarenheit(double k) {
		//F =(K - 273.15)* 1.8+ 32
		double f;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira uma temperatura em kelvin:");
		k= entrada.nextDouble();
		return f =((k-273.15)*1.8)+32;
	};
	
	/*
	 * Método que converte temperatura de farenheit para celcius
	 * @param f - valor da temperatura em farenheit
	 * @return valor da temperatura em celcius
	*/
	
	public double farenheitToCelcius(double f) {
		//â„ƒ =(F- 32)/1.8
		double c;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira uma temperatura em farenheit:");
		f= entrada.nextDouble();
		return c=(f-32)/1.8;
	};
	
	/*
	 * Método que converte temperatura de farenheit para  kelvin
	 * @param f - valor da temperatura em farenheit
	 * @return valor da temperatura em kelvin
	*/
	public static double farenheitToKelvin(double f) {
		//â„ª =((â„‰ - 32)/1.8000)+273,15
		double k;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira uma temperatura em farenheit:");
		f= entrada.nextDouble();
		return k=((f-32)/1.8)+273.15;
	};
	
	
	
	 public static void main(String[] args){
		 Operacoes operacoes = new Operacoes(); 
		 int num1=0;
		 int num2=0;
		 double k=0;
		 double f=0;
		 double c=0;
		 double peso=0;
		 double altura=0;
		 int n1=0;
		 int n2=0;
		 int d1=0;
		 int d2=0;
		 int menu;
		
		Scanner opcao = new Scanner(System.in);
		System.out.println("Escolha uma operação:");
		System.out.println("1.MMC");
		System.out.println("2.Soma de fração");
		System.out.println("3.Subtração de fração");
		System.out.println("4. Multiplição de fração");
		System.out.println("5.Divisão de fração");
		System.out.println("6.IMC");
		System.out.println("7.Celcius-Kelvin");
		System.out.println("8.Celcius-Farenheit");
		System.out.println("9.Kelvin-Celcius");
		System.out.println("10.Kelvin-Farenheit");
		System.out.println("11.Farenheit-Celcius");
		System.out.println("12.Farenheit-Kelvin");
		
		menu = opcao.nextInt();

		switch(menu) {
	
		  case 1:
              System.out.println("O MMC dos números é: "+operacoes.mmc(num1,num2));
              break;
          case 2:
              System.out.println("O resultado da soma é: "+operacoes.somaFracao());
              break;
          case 3:
              System.out.println("O resultado da subtração é: "+operacoes.subtraiFracao());
              break;
          case 4:
              System.out.println("O resultado da multiplição é: "+multiplicaFracao(n1,n2,d1,d2));
              break;
          case 5:
              System.out.println("O resultado da divisão é : "+divideFracao(n1, n2, d1, d2));
              break;
          case 6:
        	  System.out.println("Seu IMC é: 2.d"+imc(altura, peso));
              break;
          case 7:
        	  System.out.println("A temperatura convertida em kelvin é: "+celsiusToKelvin(c));
              break;
          case 8:
        	  System.out.println("A temperatura convertida em farenheit é:"+celsiusToFarenheit(c));
        	  break;
          case 9:
        	  System.out.println("A temperatura convertida em celcius é:"+kelvinToCelcius(k));
        	   break;
          case 10:
        	  System.out.println("A temperatura convertida em farenheit é:"+operacoes.kelvinToFarenheit(k));
        	   break;
          case 11:
        	  System.out.println("A temperatura convertida em celcius é:"+operacoes.farenheitToCelcius(f));
        	  break;
          case 12:
        	  System.out.println("A temperatura convertida em kelvin é:"+farenheitToKelvin(f));
        	  break;
          default:
        	  System.out.println("Opção inválida!");
		
		}
	 }
	 
}

