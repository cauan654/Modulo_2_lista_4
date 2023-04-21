contaCorrente = {
    saldo: 500,
    faturaAtual: 300,
    creditoDisponivel: 250,
    extrato: [],
  
    exibirExtrato: true,
  
    adicionarEntrada: function (data, valor) {
        entrada = {data: data, valor: valor};
      this.extrato.push(entrada);
    },
  
    pagarFaturaAtual: function () {
      if (this.saldo >= this.faturaAtual) {
        this.saldo -= this.faturaAtual;
        console.log("Fatura paga com sucesso!");
      } else if (this.creditoDisponivel >= (this.faturaAtual - this.saldo)) {
        this.creditoDisponivel -= (this.faturaAtual - this.saldo);
        this.saldo = 0;
        console.log("Fatura paga com sucesso!");
      } else {
        console.log("Você não possui saldo suficiente para pagar a fatura atual. Experimente pegar crédito para conseguir pagar.");
      }
    },
  
    imprimirExtrato: function () {
      if (this.exibirExtrato) {
        console.log("Extrato:");
        for (i = 0; i < this.extrato.length; i++) {
          console.log("Data: " + this.extrato[i].data + " | Valor: " + this.extrato[i].valor);
        }
        
      } else {
        console.log("Exibição de extrato desativada.");
      }
    }
  };
  
  contaCorrente.adicionarEntrada("01/04/2023", 150);
  contaCorrente.adicionarEntrada("02/04/2023", 50);
  
  contaCorrente.imprimirExtrato();
  
  console.log("Saldo: R$" + contaCorrente.saldo);
  console.log("Fatura atual: R$" + contaCorrente.faturaAtual);
  console.log("Crédito disponível: R$" + contaCorrente.creditoDisponivel);
  
  contaCorrente.pagarFaturaAtual();
  
  console.log("Saldo: R$" + contaCorrente.saldo);
  console.log("Crédito disponível: R$" + contaCorrente.creditoDisponivel);
