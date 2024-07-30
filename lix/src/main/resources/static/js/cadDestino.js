$(document).ready(function () {
     
  function cadastrar(ent) {
        $.ajax({
            url: 'http://localhost:8080/destino/adicionar',
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
            let data = $('#data').val();
            let unidades = $('#unidades').val();

        let ent = {
                nome: nome,
                endereco: endereco,
                data: data,
                unidades: unidades          
        };
        cadastrar(ent);
  
    });
 
  

});


    