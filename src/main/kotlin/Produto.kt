class Produto (
    var nome:String,
    var tipo:String,
    var quantidade:Byte,
    var preco:Double
){
    val validade: Array<String>? = null

    override fun toString(): String {
        return "nome: ${nome},\ntipo: ${tipo},\nquantidade: ${quantidade},\npreço: ${preco}\n"
    }
}





