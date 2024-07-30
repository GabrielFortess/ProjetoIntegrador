$(document).ready(function () {
     
  function cadastrar(ent) {
        $.ajax({
            url: 'http://localhost:8080/usuario/adicionar',
            method: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(ent),
                success: function () {
                          alert('Cadastrado');
                },            
            error: function () {
                alert('Não foi possível criar a tarefa na API.');
            }
        });
    }
    $('#formCadastrar').submit(function (event) {
        event.preventDefault();
            let nome = $('#nome').val();
            let endereco = $('#endereco').val();
            let senha = $('#senha').val();
            let salario = $('#salario').val();
            let funcao = $('#funcao').val();
            let cpf = $('#cpf').val();

        let ent = {
                nome: nome,
                endereco: endereco,
                senha: senha,
                salario: salario,
                funcao: funcao,
                cpf: cpf                   
        };
        cadastrar(ent);
  
    });
 
  

});


    