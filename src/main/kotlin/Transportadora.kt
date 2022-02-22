class Transportadora (
    var nome:String,
    var cnpj:Long,
    var endereco:String
) {
    override fun toString(): String {
        return "Nome: ${nome}, CNPJ: ${cnpj}, Endereço: ${endereco}"
    }
}