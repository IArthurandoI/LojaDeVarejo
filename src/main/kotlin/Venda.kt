class Venda (
    var quantidade:Int,
    var produto:Produtos = Produtos.Chocolate,
    var cliente:String,
    var vendedor:String,
    var fornecedor:String,
) {
    override fun toString(): String {
        return "Quantidade: ${quantidade},\nProduto: ${produto},\nCliente:${cliente},\nVendedor:${ vendedor }, \nFornecedor: ${ fornecedor }"}
    }
