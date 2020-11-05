import java.util.Scanner;

public class Operacoes {

	/*
	 *  Calculadora de FraÃ§Ãµes
	 */int d1,d2;
	
	// MÃ­nimo mÃºltiplo Comum
	public int mmc() {
		//mmc=a*b/mdc
		Scanner entrada = new Scanner(System.in);
		  int r, a = 0, b;
          int num1=this.d1;
		  int num2=this.d2;
		  System.out.print("Insira o primeiro denominador:");
		  num1= entrada.nextInt();
		  System.out.print("Insira o segundo denominador:");
		  num2= entrada.nextInt();
		 
		  a = num1;
		  b = num2;

		    do {
		     
		    	r= a % b;

		        a = b;
		        b = r;

		    } while (r != 0);
		
		 
		    return ( num1 * num2) / a;
	};
	// Soma
	 String somaFracao() {
		//r1=(mmc/d1)*n1
		//r2=(mmc/d2)*n2
		//(r1+r2)/mmc
		
		Scanner entrada = new Scanner(System.in);
		Operacoes operacoes = new Operacoes();
		int n1,n2;
		String soma;
		int d1=this.d1;
		int d2=this.d2;
		
		System.out.print("Insira o primeiro numerador:");
		n1= entrada.nextInt();
		System.out.print("Insira o segundo numerador:");
		n2= entrada.nextInt();
		int mmc= operacoes.mmc();
		/*aqui ele não faz a comparacao se d1 é diferente de d2 porque nao ta recebendo o valor das variaveis que esta no metodo mmc() 
		 
		 */
		if(d1!=d2) {
			
		soma=((mmc*d1)*n1)+((mmc*d2)*n2)+"/"+mmc;
	
		
		}
		else{
		
		soma=(n1+n2)+"/"+d1;
	
		}
		return soma;
		};

	// SubtraÃ§Ã£o
		String subtraiFracao() {
		int n1,n2;
		int d1=this.d1;
		int d2=this.d2;
		String subtracao=null;
		
		Operacoes operacoes = new Operacoes();
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o primeiro numerador:");
		n1= entrada.nextInt();
		System.out.print("Insira o segundo numerador:");
		n2= entrada.nextInt();
		int mmc= operacoes.mmc();
		
		if(d1!=d2) {
			
			
			subtracao=((mmc*d1)*n1)+((mmc*d2)*n2)+"/"+mmc;
			
			
			}
			else{
			
			subtracao=(n1+n2)+"/"+d1;
		
			}
			return subtracao;
	};
	
	// MultiplicaÃ§Ã£o
		static String multiplicaFracao() {
		//(n1*n2)/(d1*d2)
		Scanner entrada= new Scanner(System.in);
		int n1,d1;
		int n2,d2;
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
	// DivisÃ£o
	static String divideFracao() {
		//(n1*d2)/(d1*n2)
		Scanner entrada= new Scanner(System.in);
		int n1,d1;
		int n2,d2;
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
	 *  Calculadora de IMC
	 */
	
   static double imc() { 
   double altura;
   double peso; 
   double imc;
   Scanner entrada = new Scanner(System.in);
	System.out.println("Insira sua altura");
	altura = entrada.nextDouble();
	System.out.println("Insira seu peso");
	peso = entrada.nextDouble();
	 imc= peso/(altura*altura);
	 return imc;
	
	};
	
	
	/*
	 *  Calculadora de ConversÃ£o de Escalas TermomÃ©tricas
	 */
	
	static double celsiusToKelvin() {
		//K=C+273
		double c;
		double k;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira una temperatura em celsius:");
		c= entrada.nextDouble();
		return k=c+273.15;
	};
	
	static double celsiusToFahrenheit() {
		//F=1,8*C+32
		double c;
		double f;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira uma temperatura em celsius:");
		c= entrada.nextDouble();
		return f=(c*1.8)+32;
	
	};
	
	static double kelvinToCelcius() {
		//C=K-273.15
		double k;
		double c;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira uma temperatura em kelvin:");
		k= entrada.nextDouble();
		return c=k-273.15;
	};
	
	static double kelvinToFahrenheit() {
		//F =(K - 273.15)* 1.8+ 32
		double k;
		double f;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira uma temperatura em kelvin:");
		k= entrada.nextDouble();
		return f=((k-273.15)*1.8)+32;
	};
	
	static double fahrenheitToCelcius() {
		//℃ =(F- 32)/1.8
		double f;
		double c;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira uma temperatura em farenheit:");
		f= entrada.nextDouble();
		return c=(f-32)/1.8;
	};
	
	static double fahrenheitToKelvin() {
		//K =((℉ - 32)/1.8000)+273,15
		double f;
		double k;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira uma temperatura em farenheit:");
		f= entrada.nextDouble();
		return k=((f-32)/1.8)+273.15;
	};
	
	
	 public static void main(String[] args){
		 Operacoes operacoes = new Operacoes(); 
		 int menu;
		
		Scanner opcao = new Scanner(System.in);
		System.out.println("Escolha uma operação:");
		System.out.println("1.MMC");
		System.out.println("2.Soma de fração");
		System.out.println("3.Subtração de fração");
		System.out.println("4. Multiplicação de fração");
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
              System.out.println("O MMC dos números é: "+operacoes.mmc());
              break;
          case 2:
              System.out.println("O resultado é: "+operacoes.somaFracao() );
              break;
          case 3:
              System.out.println("O resultaod é: "+operacoes.subtraiFracao());
              break;
          case 4:
              System.out.println("O resultado é: "+multiplicaFracao());
              break;
          case 5:
              System.out.println("O resultado é: "+divideFracao());
              break;
          case 6:
        	  System.out.println("seu IMC é: "+imc() );
              break;
          case 7:
        	  System.out.println("A temperatura convertida em kelvin é: "+celsiusToKelvin());
              break;
          case 8:
        	  System.out.println("A temperatura convertida em farenheit é:"+celsiusToFahrenheit());
        	  break;
          case 9:
        	  System.out.println("A temperatura convertida em celcius é:"+kelvinToCelcius());
        	   break;
          case 10:
        	  System.out.println("A temperatura convertida em farenheit é:"+kelvinToFahrenheit());
        	   break;
          case 11:
        	  System.out.println("A temperatura convertida em celcius é:"+fahrenheitToCelcius());
        	  break;
          case 12:
        	  System.out.println("A temperatura convertida em kelvin é:"+fahrenheitToKelvin());
        	  break;
          
		
		}
	 }
	 
}

