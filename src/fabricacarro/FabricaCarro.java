/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fabricacarro;

/**
 *
 * @author Noa
 */
public class FabricaCarro {
    
    public static void main( String[] args )
    {
        //Classe Carro.java que criamos junto em aula.
        Carro carros [] = new Carro[3];
        
        for ( int i = 0; i < 3; i++ )
        {
            Carro c = new Carro();
            c.modelo = Entrada.leiaString( "Modelo do carro " + ( i + 1 ) );
            c.velocidadeMaxima = Entrada.leiaInt( "Velocidade máxima do " + c.modelo );
            
            System.out.println( "Carro " + c.modelo + " cadastrado com sucesso" );
            
            carros[i] = c;
        }
        
        while ( true )
        {
            int i = Entrada.leiaInt( "Digite uma opção \n" +
                                     " [ 0 ] -  Ligar o carro \n" + 
                                     " [ 1 ] -  Acelerar o carro \n" + 
                                     " [ 2 ] -  Frear o carro \n" + 
                                     " [ 3 ] -  Desligar o carro \n" +
                                     " [ 4 ] -  Velocidade atual \n" +
                                     " [ 5 ] -  Sair");
            
            if ( i == 5 )
            {
                System.exit( 0 );
            }
            
            String modelo = Entrada.leiaString( "Qual o modelo do carro?" );
            
            Carro carro = null;
            
            for ( int j = 0; j < 3; j++ )
            {
                //vai cair aqui 3x, uma para cada posição do vetor.
                //buscamos o atributo modelo do objeto carro para comparar com o valor do digitado no Entrada.leia...
                if ( carros[j].modelo.toLowerCase().contains( modelo.toLowerCase() ) )
                {
                    carro = carros[j];
                }
            }
            
            if ( carro != null )
            {
                switch ( i)
                {
                    case 0:
                        carro.ligar();
                        break;
                    case 1:
                        carro.acelerar();
                        break;
                    case 2:
                        carro.frear();
                        break;
                    case 3:
                        carro.desligar();
                        break;
                    case 4:
                        System.out.println( carro.modelo + " = " + carro.velocidade + "km/h" );
                        break;
                }
            }
            
            else
            {
                System.out.println( "Carro nao encontrado!" );
            }
                    
        
        }
    }
}
