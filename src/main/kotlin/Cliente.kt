class Cliente (
    var nome:String = "João",
    var cpf:Long = 85435465220,
    var endereco:String = "Rua Auderico Junior 287"
){

    override fun toString( ):String{
           return "Nome: ${nome}, CPF: ${cpf}, Endereço: ${endereco} "
    }
}