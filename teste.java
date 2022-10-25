package nota_fiscal;
import java.util.Scanner;


public class teste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        consumidor usuario_consumidor = new consumidor();
        distribuidora distribuidora = new distribuidora();
        cupom_fiscal cupomfiscal = new cupom_fiscal();
        caixa caixa = new caixa();
        produtos mostrar = new produtos();
        
        caixa.informar_senha();
        
        
        while(true){
            System.out.println("INICIAR...[S/N]");
            String inicio_programa_1 = scan.nextLine().toUpperCase();
            while(!inicio_programa_1.equals("S") && !inicio_programa_1.equals("N")){
                System.out.println("OPÇÃO INVALIDA!");
                System.out.println("INICIAR...[S/N]");
                String inicio_programa_2 = scan.nextLine().toUpperCase();
                if("S".equals(inicio_programa_2)){
                    break;
                }else if("N".equals(inicio_programa_2)){
                    System.exit(0);
                }
            }
            if("N".equals(inicio_programa_1)){
                break;
            }
            
           
           
            usuario_consumidor.opcao_cadastrar_usuario();
            mostrar.opcao_adicionar_alimentos();
            mostrar.forma_pagamento();
            System.out.println(distribuidora.toString());
            distribuidora.Extrato();
            usuario_consumidor.info_consumidor();
            mostrar.opcao_mostrar_alimentos();
            cupomfiscal.requisitos_finais();
            }
        
        }
    }

