package nota_fiscal;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class consumidor extends cartoes{
    private String cpf;
    private String nome;
    
    ArrayList<cupom_fiscal> alimentos = new ArrayList<>(10);
    Random random = new Random();

    public consumidor(){
        
    }
    
    Scanner scan = new Scanner(System.in);
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //EXIBIR INFORMAÇÕES DO CONSUMIDOR NA NOTA FISCAL
    public void info_consumidor(){
        if("00000000000".equals(this.cpf)){
            System.out.println("\t\t CPF: " + this.getCpf().substring(0, 3) + "." + this.getCpf().substring(3, 6) + "." + this.getCpf().substring(6, 9) + "-" + this.getCpf().substring(9, 11));
            System.out.println("-------------------------------------------------------");
            System.out.println(" ITEM | COD | DESC | QTD | UN | VL UN R$ | VL TOTAL R$");
            System.out.println("-------------------------------------------------------");
        }else{
            System.out.println("\t       CONSUMIDOR NÃO IDENTIFICADO\n\t\t  CPF: " + this.getCpf().substring(0, 3) + "." + this.getCpf().substring(3, 6) + "." + this.getCpf().substring(6, 9) + "-" + this.getCpf().substring(9, 11));
            System.out.println("-------------------------------------------------------");
            System.out.println(" ITEM | COD | DESC | QTD | UN | VL UN R$ | VL TOTAL R$");
            System.out.println("-------------------------------------------------------");
            }
        }
    
    //SABER SE O USUARIO TEM, OU NÃO, CADASTRO NO ESTABELECIMENTO
    public void opcao_cadastrar_usuario(){
        System.out.println("CONSUMIDOR CADASTRADO? [S/N]");
            String usuario = scan.nextLine().toUpperCase();
            while(!usuario.equals("S") && !usuario.equals("N")){
                System.out.println("OPÇÃO INVALIDA!");
                System.out.println("CONSUMIDOR CADASTRADO? [S/N]");
                String usuario_2 = scan.nextLine().toUpperCase();
                if("S".equals(usuario_2) || "N".equals(usuario_2)){
                    break;
                }
            }
                
            if(usuario.equals("S")){
                System.out.println("CPF: ");
                String cpff = scan.nextLine();
                this.setCpf(cpff);
                while(cpff.length()<11 || cpff.length()>11){
                    System.out.println("CPF INVALIDO!");
                    System.out.println("INFORME UM CPF VÁLIDO: ");
                    String cpff_1 = scan.nextLine();
                    if(cpff_1.length()==11){
                        this.setCpf(cpff_1);
                        break;
                    }
                }
                System.out.println("CONFIRMA?");
                String confirmacao = scan.nextLine().toUpperCase();
                while(!"S".equals(confirmacao) && !"N".equals(confirmacao)){
                    System.out.println("OPÇÃO INVALIDA!");
                    System.out.println("CONFIRMA?");
                    String confirmacao_1 = scan.nextLine().toUpperCase();
                    if("S".equals(confirmacao_1)){
                        break;
                    }while("N".equals(confirmacao_1)){
                        System.out.println("CPF: ");
                        cpff = scan.nextLine();
                        this.setCpf(cpff);
                        System.out.println("CONFIRMA?");
                        confirmacao = scan.nextLine().toUpperCase();
                        if("S".equals(confirmacao)){
                            break;
                        }
                    }
                }
                while("N".equals(confirmacao)){
                    System.out.println("CPF: ");
                    cpff = scan.nextLine();
                    this.setCpf(cpff);
                    System.out.println("CONFIRMA?");
                    confirmacao = scan.nextLine().toUpperCase();
                    if("S".equals(confirmacao)){
                        break;
                    }
                }

            }else{
                this.setCpf("00000000000");
            }
    
    
        }

}
