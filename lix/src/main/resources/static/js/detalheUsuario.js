$(document).ready(function () {
function carregar() {
$.ajax({
url: 'http://localhost:8080/usuario/listar', 
method: 'GET', 
success: function (data) { 
$('#tabela tbody').empty();
                for (let i = 0; i < data.length; i++) {
                    let usuario = data[i];


                    let id = $('<td>')
                            .text(usuario.id);


                    let nome = $('<input>')
                            .attr('type', 'text')
                            .val(usuario.nome)
                            .blur(function () {
                                atualizar($(this).closest('tr').attr('data-id'), {
                                    nome: $(this).val(),
                                    senha: usuario.senha,
                                    salario: usuario.salario,
                                    funcao: usuario.funcao,
                                    endereco: usuario.endereco,
                                    cpf: usuario.cpf
                                });
                            });

                    let senha = $('<input>')
                            .attr('type', 'text')
                            .val(usuario.senha)
                            .blur(function () {
                                atualizar($(this).closest('tr').attr('data-id'), {
                                    senha: $(this).val(),
                                    nome: usuario.nome,
                                    salario: usuario.salario,
                                    funcao: usuario.funcao,
                                    endereco: usuario.endereco,
                                    cpf: usuario.cpf
                                });
                            });
                            
                    let salario = $('<input>')
                            .attr('type', 'text')
                            .val(usuario.nome)
                            .blur(function () {
                                atualizar($(this).closest('tr').attr('data-id'), {
                                    salario: $(this).val(),
                                    senha: usuario.senha,
                                    nome: usuario.nome,
                                    funcao: usuario.funcao,
                                    endereco: usuario.endereco,
                                    cpf: usuario.cpf
                                });
                            });
                            
                   let funcao = $('<input>')
                            .attr('type', 'text')
                            .val(usuario.funcao)
                            .blur(function () {
                                atualizar($(this).closest('tr').attr('data-id'), {
                                    funcao: $(this).val(),
                                    senha: usuario.senha,
                                    salario: usuario.salario,
                                    nome: usuario.nome,
                                    endereco: usuario.endereco,
                                    cpf: usuario.cpf
                                });
                            });

                    let endereco = $('<input>')
                            .attr('type', 'text')
                            .val(usuario.endereco)
                            .blur(function () {
                                atualizar($(this).closest('tr').attr('data-id'), {
                                    endereco: $(this).val(),
                                    senha: usuario.senha,
                                    salario: usuario.salario,
                                    funcao: usuario.funcao,
                                    nome: usuario.nome,
                                    cpf: usuario.cpf
                                });
                            });
                            
                    let cpf = $('<input>')
                            .attr('type', 'text')
                            .val(usuario.cpf)
                            .blur(function () {
                                atualizar($(this).closest('tr').attr('data-id'), {
                                    cpf: $(this).val(),
                                    senha: usuario.senha,
                                    salario: usuario.salario,
                                    funcao: usuario.funcao,
                                    endereco: usuario.endereco,
                                    nome: usuario.nome
                                });
                            }); 
        
        let botaoDeletar = $('<button>')
        .text('Excluir')
        .click(function () {
        deletar($(this).closest('tr').attr('data-id'));
        });
        
        let tdNome = $('<td>').append(nome);
        let tdSenha = $('<td>').append(senha);
        let tdSalario = $('<td>').append(salario);
        let tdFuncao = $('<td>').append(funcao);
        let tdCpf = $('<td>').append(cpf);
        let tdEndereco = $('<td>').append(endereco);
        let tdExcluir = $('<td>').append(botaoDeletar);

        let tr = $('<tr>')
        .attr('data-id', usuario.id)
        .append(id)
        .append(tdNome)
        .append(tdSenha)
        .append(tdSalario)
        .append(tdFuncao)
        .append(tdCpf)
        .append(tdEndereco)
        .append(tdExcluir);
        $('#tabela tbody').append(tr);
        }
    } 
          });
}


    function atualizar(id, ent) {
        $.ajax({
            url: 'http://localhost:8080/usuario/atualizar/' + id,
            method: 'PUT',
            contentType: 'application/json',
        
            data: JSON.stringify({
                id: ent.id,
                nome: ent.nome,
                endereco: ent.endereco,
                senha: ent.senha,
                salario: ent.salario,
                funcao: ent.funcao,
                cpf: ent.cpf           
            }),
            success: function (data) {
                carregar();
            },
            error: function () {
                alert('Não foi possível atualizar na API.');
            }
        });
    }
    function deletar(id) {
        $.ajax({
            url: 'http://localhost:8080/usuario/deletar/' + id,
            method: 'DELETE',
            success: function (data) {
                carregar();
            },
            error: function () {
                alert('Não foi possível deletar na API.');
            }
        });
    }

////




    carregar();
});
