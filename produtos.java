
package nota_fiscal;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class produtos extends cartoes {
    ArrayList<cupom_fiscal> alimentos = new ArrayList<>(10);
    Random random = new Random();
    Scanner scan = new Scanner(System.in);
    
    //OPÇÃO DE ADICIONAR E EXCLUIR ALIMENTOS
    public void opcao_adicionar_alimentos(){
        String opcao = null;
        int uni = 0;
        float preco =0;
        int qtd_alimentos;
        try{
            System.out.println("QUANTIDADE DE ALIMENTOS: ");
            qtd_alimentos = Integer.parseInt(scan.nextLine());
        }catch(NumberFormatException p){
            System.out.println("ERRO!");
            
            System.out.println("QUANTIDADE DE ALIMENTOS: ");
            qtd_alimentos = Integer.parseInt(scan.nextLine());
        }
        for(int i=0;i<qtd_alimentos;i++){
            System.out.printf("Produto %d: ",i+1);
            String alimento_1 = scan.nextLine().toUpperCase();
            try{
              System.out.print("Uni: ");
              uni = Integer.parseInt(scan.nextLine()); 
            }catch(NumberFormatException e){
                System.out.println("ERRO!");
                
                System.out.print("Uni: ");
                uni = Integer.parseInt(scan.nextLine()); 

            }
            try{
                System.out.println("PREÇO: ");
                preco = Float.parseFloat(scan.nextLine());
            }catch(NumberFormatException a){
                System.out.println("ERRO!");
                System.out.println("O VALOR DIGITADO É STRING");
                System.out.println("PREÇO: ");
                preco = Float.parseFloat(scan.nextLine());
            }
            cupom_fiscal al = new cupom_fiscal(i+1, alimento_1, (int)uni, preco);
            alimentos.add(al);


        }
            

    
    float total=0;
    for(cupom_fiscal j: alimentos){
        total += j.valor_total();
    }
    System.out.printf("\nTOTAL R$ %.2f\n" , total);
    System.out.println("RETIRAR PRODUTO [1] \tADICIONAR PRODUTO [2] \t[PAGAR] [3]");
    String option = scan.nextLine();
    while(!"3".equals(option)){
        if("3".equals(option)){
            break;
        }if("2".equals(option)){
            try{
                System.out.println("QUANTIDADE DE ALIMENTOS: ");
                qtd_alimentos = Integer.parseInt(scan.nextLine());
            }catch(NumberFormatException p){
                System.out.println("ERRO!");
                System.out.println("QUANTIDADE DE ALIMENTOS: ");
                qtd_alimentos = Integer.parseInt(scan.nextLine());
            }
            for(int i=0;i<qtd_alimentos;i++){
                System.out.printf("Produto %d: ",i+1);
                String alimento_1 = scan.nextLine().toUpperCase();
                try{
                  System.out.print("Uni: ");
                  uni = Integer.parseInt(scan.nextLine()); 
                }catch(NumberFormatException e){
                    System.out.println("ERRO!");
                    System.out.print("Uni: ");
                    uni = Integer.parseInt(scan.nextLine()); 

                }
                try{
                    System.out.println("PREÇO: ");
                    preco = Float.parseFloat(scan.nextLine());
                }catch(NumberFormatException a){
                    System.out.println("ERRO!");
                    System.out.println("PREÇO: ");
                    preco = Float.parseFloat(scan.nextLine());
                }
                cupom_fiscal al = new cupom_fiscal(i+1, alimento_1, (int)uni, preco);
                alimentos.add(al);
                

            }
            System.out.println("RETIRAR PRODUTO [1] \tADICIONAR PRODUTO [2] \t[PAGAR] [3]");
            option = scan.nextLine();
        }
        if("1".equals(option)){
        for(cupom_fiscal i: alimentos){
            System.out.printf("0"+i.getNum() + " " + random.nextInt(9999999)+ " " + i.getNome() + " "+ (int)i.getUni() +" UNI X" +" "+ i.getPreco() + "  " + "%.2f\n" , i.valor_total());

            }
        System.out.println("INFORME O PRODUTO QUE DESEJA RETIRAR: [PRODUTO 1 = 0]");
        int n_produto = Integer.parseInt(scan.nextLine());
        alimentos.remove(n_produto);
        System.out.println("DESEJA RETIRAR MAIS: [S/N]");
        String option_retirar = scan.nextLine().toUpperCase();
        while("S".equals(option_retirar)){
            System.out.println("INFORME O PRODUTO QUE DESEJA RETIRAR: [PRODUTO 1 = 0]");
            n_produto = Integer.parseInt(scan.nextLine());
            alimentos.remove(n_produto);
            System.out.println("DESEJA RETIRAR MAIS: [S/N]");
            option_retirar = scan.nextLine().toUpperCase();
            if("N".equals(option_retirar)){
                break;
                }
            }if("N".equals(option_retirar)){
                break;
            }
       
        
         }
        }
    }

    //OPÇÃO DE MOSTRAR ALIMENTOS ADICIONADOS
    public void opcao_mostrar_alimentos(){
        for(cupom_fiscal i: alimentos){
                System.out.printf("0"+i.getNum() + " " + random.nextInt(9999999)+ " " + i.getNome() + " "+ (int)i.getUni() +" UNI X" +" "+ i.getPreco() + "  " + "%.2f\n" , i.valor_total());
                }


            System.out.println("-------------------------------------------------------");
            float total=0;
            for(cupom_fiscal j: alimentos){
                total += j.valor_total();
            }

            System.out.printf("VALOR TOTAL:\t\t\t\t          %.2f\n" , total);
            alimentos.clear();
    }
    public void forma_pagamento(){
        float total=0;
            for(cupom_fiscal j: alimentos){
                total += j.valor_total();
            }
        String pagamento;
        System.out.printf("VALOR TOTAL:\t\t\t\t          %.2f" , total);
        System.out.printf("\nCartão de Crédito \t\t\t          %.2f\n" , total);
        System.out.println("\nFORMA DE PAGAMENTO");
        System.out.println("DINHEIRO [1]\tCARTÃO [2]\tVALE-ALIMENTAÇÃO [3]");
        pagamento = scan.nextLine();
        while(!"1".equals(pagamento) && !"2".equals(pagamento) && !"3".equals(pagamento)){
            System.out.println("OPÇÃO INVALIDA!");
            System.out.println("DINHEIRO [1]\tCARTÃO [2]\tVALE-ALIMENTAÇÃO [3]");
            pagamento = scan.nextLine();
            if("1".equals(pagamento) || "2".equals(pagamento) ||"3".equals(pagamento)){
                break;
            }
        }
        
        //PAGAMENTO//
        switch(pagamento){
            //DINHEIRO//
            case "1":
                System.out.println("INFORME O VALOR PARA RECEBER O TROCO: ");
                float valor_dado = Float.parseFloat(scan.nextLine());
                while(valor_dado<total){
                    System.out.println("ERRO!\nINSIRA UM VALOR VÁLIDO: ");
                    valor_dado = Float.parseFloat(scan.nextLine());
                    if(valor_dado>=total){
                        break;
                    }
                }
                float troco = valor_dado - total;
                System.out.printf("\nSEU TROCO É R$%.2f\n", troco);
                break;
            //CARTÕES
            case "2":
                System.out.println("CARTÃO CREDITO [1] \tCARTÃO SUPERMERCADO [2] \tCARTÃO DÉBITO [3]");
                String opcao_cartao = scan.nextLine();
                while(!"1".equals(opcao_cartao) && !"2".equals(opcao_cartao) && !"3".equals(opcao_cartao)){
                    System.out.println("OPÇÃO INVALIDA!");
                    System.out.println("CARTÃO CREDITO [1] \tCARTÃO SUPERMERCADO [2] \tCARTÃO DÉBITO [3]");
                    opcao_cartao = scan.nextLine();
                    if("1".equals(opcao_cartao) || "2".equals(opcao_cartao) ||"3".equals(opcao_cartao)){
                        break;
                    }
                }
                switch(opcao_cartao){
                    //CARTÃO CREDITO//
                    case "1":
                        boolean z = true;
                        while(z==true){
                            if(total>super.getLimite_cartao_de_credito()){
                                System.out.println("TRANSAÇÃO RECUSADA!");
                                System.out.println("VOCÊ NÃO POSSUI LIMITE SUFICIENTE");
                                z=false;
                            }if(total<=super.getLimite_cartao_de_credito()){
                                break;
                                }
                            
                            }
                        if(total>super.getLimite_cartao_de_credito()){
                            break;
                        }
                        
                        System.out.println("Nº DE PARCELAS [1]|[2]|[3]|[4]");
                        String parcelas = scan.nextLine();
                        while(!"1".equals(parcelas) && !"2".equals(parcelas) && !"3".equals(parcelas) && !"4".equals(parcelas)){
                            System.out.println("Nº DE PARCELAS INVALIDAS!!!");
                            System.out.println("Nº DE PARCELAS [1]|[2]|[3]|[4]");
                            parcelas = scan.nextLine();
                            if("1".equals(parcelas) || "2".equals(parcelas) || "3".equals(parcelas) || "4".equals(parcelas)){
                                break;
                                }
                            }
                        
                        
                        
                        if("1".equals(parcelas)){
                            float parcela_1 = total/1;
                            if(parcela_1<=super.getLimite_cartao_de_credito()){
                                System.out.printf("\nO PRECO TOTAL PARCELADO EM 1X É R$%.2f\n", parcela_1);
                                System.out.println("TRANSAÇÃO APROVADA!");
                            }
                            
                        }else if("2".equals(parcelas)){
                            float parcela_2 = total/2;
                            if(parcela_2<=super.getLimite_cartao_de_credito()){
                                System.out.printf("\nO PRECO TOTAL PARCELADO EM 2X É R$%.2f\n", parcela_2);
                                System.out.println("TRANSAÇÃO APROVADA!");
                            }
                        }else if("3".equals(parcelas)){
                            float parcela_3 = total/3;
                            if(parcela_3<=super.getLimite_cartao_de_credito()){
                            System.out.printf("\nO PRECO TOTAL PARCELADO EM 3X É R$%.2f\n", parcela_3);
                            System.out.println("TRANSAÇÃO APROVADA!");
                            }   
                        }else if("4".equals(parcelas)){
                            float parcela_4 = total/4;
                            if(parcela_4<=super.getLimite_cartao_de_credito()){
                                System.out.printf("\nO PRECO TOTAL PARCELADO EM 4X É R$%.2f\n", parcela_4);
                                System.out.println("TRANSAÇÃO APROVADA!");
                            }
                        }
                        break;
                    case "2":
                        //CARTÃO SUPERMERCARDO
                        boolean x = true;
                        while(x==true){
                            if(total>super.getLimite_cartao_de_super()){
                                System.out.println("TRANSAÇÃO RECUSADA!");
                                System.out.println("VOCÊ NÃO POSSUI LIMITE SUFICIENTE");
                                x=false;
                            }if(total<=super.getLimite_cartao_de_super()){
                                break;
                                }
                            
                            }
                        if(total>super.getLimite_cartao_de_super()){
                            break;
                        }
                        System.out.println("Nº DE PARCELAS [1]|[2]|[3]|[4]");
                        String parcelas_supermercado = scan.nextLine();
                        while(!"1".equals(parcelas_supermercado) && !"2".equals(parcelas_supermercado) && !"3".equals(parcelas_supermercado) && !"4".equals(parcelas_supermercado)){
                            System.out.println("Nº DE PARCELAS INVALIDAS!!!");
                            System.out.println("Nº DE PARCELAS [1]|[2]|[3]|[4]");
                            parcelas_supermercado = scan.nextLine();
                            if("1".equals(parcelas_supermercado) || "2".equals(parcelas_supermercado) || "3".equals(parcelas_supermercado) || "4".equals(parcelas_supermercado)){
                                break;
                            }
                        }
                        if("1".equals(parcelas_supermercado)){
                            float parcela_1 = total/1;
                            System.out.printf("\nO PRECO TOTAL PARCELADO EM 1X É R$%.2f\n", parcela_1);
                            System.out.println("TRANSAÇÃO APROVADA!");
                        }else if("2".equals(parcelas_supermercado)){
                            float parcela_2 = total/2;
                            
                            System.out.printf("\nO PRECO TOTAL PARCELADO EM 2X É R$%.2f\n", parcela_2);
                            System.out.println("TRANSAÇÃO APROVADA!");
                        }else if("3".equals(parcelas_supermercado)){
                            float parcela_3 = total/3;
                            
                            System.out.printf("\nO PRECO TOTAL PARCELADO EM 3X É R$%.2f\n", parcela_3);
                            System.out.println("TRANSAÇÃO APROVADA!");
                        }else if("4".equals(parcelas_supermercado)){
                            float parcela_4 = total/4;
                            
                            System.out.printf("\nO PRECO TOTAL PARCELADO EM 4X É R$%.2f\n", parcela_4);
                            System.out.println("TRANSAÇÃO APROVADA!");
                        }
                        break;
                    case "3":
                        //CARTÃO DE DEBITO
                        boolean y = true;
                        while(y==true){
                            if(total>super.getLimite_cartao_de_debito()){
                                System.out.println("TRANSAÇÃO RECUSADA!");
                                System.out.println("VOCÊ NÃO POSSUI LIMITE SUFICIENTE");
                                y=false;
                            }if(total<=super.getLimite_cartao_de_debito()){
                                break;
                                }
                            
                            }
                        if(total>super.getLimite_cartao_de_debito()){
                            break;
                        }
                        System.out.println("TRANSAÇÃO APROVADA!");
                        break;
                }
                
                break;
            //VALE-ALIMENTAÇÃO//
            case "3":
                boolean a = true;
                while(a==true){
                    if(total>super.getLimite_vale_alimentacao()){
                        System.out.println("TRANSAÇÃO RECUSADA!");
                        System.out.println("VOCÊ NÃO POSSUI LIMITE SUFICIENTE");
                        a=false;
                    }if(total<=super.getLimite_vale_alimentacao()){
                        break;
                        }
                    }
                if(total>super.getLimite_vale_alimentacao()){
                    break;
                }
                System.out.println("TRANSAÇÃO APROVADA!");
                break;
        }
    }
    
}

