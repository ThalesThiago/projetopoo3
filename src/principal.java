public class principal {
    public static void main (String[] args){
        Cliente cliente1 = new Cliente();
        Conta conta1 = new Conta();
        Agencia agencia1 = new Agencia();
        Cartao cartao1 = new Cartao();
        Transacoes transacoes1 = new Transacoes();


        cliente1.nome="Thales Thiago de Barros Moura";
        cliente1.cpf="111.222.333-44";
        cliente1.datanascimento="26/08/2000";
        cliente1.endereco = "Rua: Nova, Nº: 56, Bairro: Santo Amaro, Cidade: Recife-PE";
        cliente1.naturalidade="Recife-PE";
        cliente1.telefone="(81) 94002-8922";

        conta1.tipoconta="Conta Corrente e Conta Poupança";
        conta1.statusconta="Ativa";
        conta1.saldoconta = 3500.89f;
        conta1.limitedecredito= 1550.89f;
        conta1.historicotransacoes="Depósito = R$600,00 / Saque = R$250,00";
        conta1.documentos = "RG: 42589-445 / CPF: 111.111.111-12 / Comprovante de Residência: residência.pdf";

        agencia1.localizacao= "R. do Príncipe, 526 - Boa Vista, Recife - PE, 50050-900";
        agencia1.telefone="94002-8922";
        agencia1.horariofuncionamento="08:00AM - 16:00PM";

        cartao1.tipo="Crédito";
        cartao1.numero="111.111.1154.78";
        cartao1.bandeira="MasterCard";
        cartao1.datavalidade="22/07/2026";
        cartao1.nometitular="Thales Thiago de Barros Moura";

        transacoes1.depositos=650.89f;
        transacoes1.saque=125.89f;
        transacoes1.emprestimos=00.00f;
        transacoes1.investimentos="CDB = R$900 / LCI = R$00.00 / LCA= R$00.00 / Tesouro Direto = R$1500,00";
        transacoes1.transferencia="Pix,TED";

        System.out.println(
                "Cliente --> " +"\n"+"Nome: " + cliente1.nome + "\n" +
                        "CPF: " + cliente1.cpf + "\n" +
                        "Data de Nascimento: " + cliente1.datanascimento + "\n" +
                        "Endereço: " + cliente1.endereco + "\n" +
                        "Naturalidade: " + cliente1.naturalidade + "\n" +
                        "Telefone: " + cliente1.telefone
        );

        System.out.println(
                "\n"+"Conta Bancária -->"+  "\n"+"Tipo da Conta: " +conta1.tipoconta + "\n" +
                        "Status: " + conta1.statusconta + "\n" +
                        "Saldo: " + conta1.saldoconta+ "\n" +
                        "Limite de Crédito: " +conta1.limitedecredito + "\n" +
                        "Histórico de Transações: " + conta1.historicotransacoes + "\n" +
                        "Documentos: " + conta1.documentos
        );

        System.out.println(
                "\n"+"Cartão -->"+"\n"+"Nome do Titular: " +cartao1.nometitular + "\n" +
                        "Tipo: " + cartao1.tipo + "\n" +
                        "Número: " + cartao1.numero+ "\n" +
                        "Data de Validade: " +cartao1.datavalidade + "\n" +
                        "Bandeira: " + cartao1.bandeira
        );

        System.out.println(
                "\n"+"Transações --> " +"\n"+"Depósitos: " + transacoes1.depositos + "\n" +
                        "Saques: " + transacoes1.saque + "\n" +
                        "Empréstimos: " + transacoes1.emprestimos + "\n" +
                        "Investimentos: " + transacoes1.investimentos + "\n" +
                        "Transferências: " + transacoes1.transferencia
        );


        System.out.println(
                "\n"+"Agência -->"+"\n"+"Banco Unicap"+"\n"+"Localização Agência: " +agencia1.localizacao + "\n" +
                        "Horário de Funcionamento: " + agencia1.horariofuncionamento + "\n" +
                        "Telefone: " + agencia1.telefone
        );




    }
}
