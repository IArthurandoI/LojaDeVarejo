class Fornecedor (
    var nome:String,
    var cnpj:Long
)
{
    override fun toString(): String {
        return "nome: ${nome}, CNPJ: ${cnpj}"
    }

}