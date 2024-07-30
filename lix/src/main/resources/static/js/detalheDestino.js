$(document).ready(function () {
function carregar() {
$.ajax({
url: 'http://localhost:8080/destino/listar', 
method: 'GET', 
success: function (data) { 
$('#tabela tbody').empty();
                for (let i = 0; i < data.length; i++) {
                    let destino = data[i];


                    let id = $('<td>')
                            .text(destino.id);


                    let nome = $('<input>')
                            .attr('type', 'text')
                            .val(destino.nome)
                            .blur(function () {
                                atualizar($(this).closest('tr').attr('data-id'), {
                                    nome: $(this).val(),
                                    endereco: destino.endereco,
                                    data: destino.data,
                                    unidades: destino.unidades
                                });
                            });

                    let endereco = $('<input>')
                            .attr('type', 'text')
                            .val(destino.endereco)
                            .blur(function () {
                                atualizar($(this).closest('tr').attr('data-id'), {
                                    nome: destino.nome,
                                    endereco: $(this).val(),
                                    data: destino.data,
                                    unidades: destino.unidades
                                });
                            });

                    let dataEntrega = $('<input>')
                            .attr('type', 'date')
                            .val(destino.data)
                            .blur(function () {
                                atualizar($(this).closest('tr').attr('data-id'), {
                                    nome: destino.nome,
                                    endereco: destino.endereco,
                                    data: $(this).val(),
                                    unidades: destino.unidades
                                });
                            });

                    let unidades = $('<input>')
                            .attr('type', 'text')
                            .val(destino.unidades)
                            .blur(function () {
                                atualizar($(this).closest('tr').attr('data-id'), {
                                    nome: destino.nome,
                                    endereco: destino.endereco,
                                    data: destino.data,
                                    unidades: $(this).val()
                                });
                            });
        
        
        let botaoDeletar = $('<button>')
        .text('Excluir')
        .click(function () {
        deletar($(this).closest('tr').attr('data-id'));
        });
        
        let tdNome = $('<td>').append(nome);
        let tdEndereco = $('<td>').append(endereco);
        let tdData = $('<td>').append(dataEntrega);
        let tdUnidades = $('<td>').append(unidades);
        let tdExcluir = $('<td>').append(botaoDeletar);
        
        let tr = $('<tr>')
        .attr('data-id', destino.id)
        .append(id)
        .append(tdNome)
        .append(tdEndereco)
        .append(tdData)
        .append(tdUnidades)
        .append(tdExcluir);
        $('#tabela tbody').append(tr);
        }
    } 
          });
}


    function atualizar(id, ent) {
        $.ajax({
            url: 'http://localhost:8080/destino/atualizar/' + id,
            method: 'PUT',
            contentType: 'application/json',
        
            data: JSON.stringify({
                id: ent.id,
                nome: ent.nome,
                endereco: ent.endereco,
                data: ent.data,
                unidades: ent.unidades
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
            url: 'http://localhost:8080/destino/deletar/' + id,
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
