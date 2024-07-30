$(document).ready(function () {
     
  function cadastrar(ent) {
        $.ajax({
            url: 'http://localhost:8080/descarte/adicionar',
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

        let ent = {
            nome: nome
        };
        cadastrar(ent);
  
    });
 
  

});


    