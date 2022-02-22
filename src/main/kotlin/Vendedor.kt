class Vendedor (
    var nome:String,
    var cpf:Long,
    var salario:Double
){
    val cursos: Array<String>? = null

    override fun toString(): String {
        return "Nome: ${nome},\nCPF: ${cpf},\nSalario: ${salario}\n"
    }
}
