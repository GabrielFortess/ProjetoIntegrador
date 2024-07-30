$(document).ready(function () {
     
$('#formLogin').submit(function (event) {
    event.preventDefault();
        let inSenha = $('#txtSenha').val();
        let inNome = $('#txtNome').val();
        $.ajax({
            url: 'http://localhost:8080/usuario/listar',
            method: 'GET',
            success: function (data) {
         for (let i = 0; i < data.length; i++) {
                    let ent = data[i];
                    let senha = ent.senha;
                    let nome = ent.nome;
                    let func = ent.funcao;

                    if (senha == inSenha & nome == inNome) {
                        switch (func) {
                            case 'admin':
                                window.location.href = "detUsuario";
                                break;
                            case 'coletor':
                                window.location.href = "cadDescarte";
                                break;
                            case 'separador':
                                window.location.href = "detDescarte";
                                break;
                           case 'transportador':
                                window.location.href = "detDestino";
                                break;
                            default:
                                alert('ERRO: busca de função');
                                break;
                        }
                    }

                }
            },
            error: function () {
                alert('Não foi possível carregar as listas da API.');
            }
        });
  });



 
  

});


