$(document).ready(function () {
function carregar() {
$.ajax({
url: 'http://localhost:8080/descarte/listar', 
method: 'GET', 
success: function (data) { 
$('#tabela tbody').empty();
        for (let i = 0; i < data.length; i++) {
let descarte = data[i];


        let id = $('<td>')
        .text(descarte.id);


                    let nome = $('<input>')
                            .attr('type', 'text')
                            .val(descarte.nome)
                            .blur(function () {
                                atualizar($(this).closest('tr').attr('data-id'), {
                                    nome: $(this).val(),
                                    tipo: descarte.tipo,
                                    destino: descarte.destino
                                });
                            });


                    let tipo = $('<input>')
                            .attr('type', 'text')
                            .val(descarte.tipo)
                            .blur(function () {
                                if ($(this).val().toLowerCase() !== "separar" | $(this).val().toLowerCase() == "separar" & descarte.destino !== null) {
                                    atualizar($(this).closest('tr').attr('data-id'), {
                                        nome: descarte.nome,
                                        tipo: $(this).val(),
                                        destino: descarte.destino
                                    });
                                } else {
                                    alert('Descartes do tipo separar necessitam de destino.');
                                }
                            });


                    let destino = $('<input>')
                            .attr('type', 'text')
                            .val(descarte.destino)
                            .blur(function () {
                                atualizar($(this).closest('tr').attr('data-id'), {
                                    nome: descarte.nome,
                                    tipo: descarte.tipo,
                                    destino: $(this).val()

                                });
                            });


                    let botaoDeletar = $('<button>')
                            .text('Excluir')
                            .click(function () {
                                deletar($(this).closest('tr').attr('data-id'));
                            });
        
        let tdNome = $('<td>').append(nome);
        let tdDeletar = $('<td>').append(botaoDeletar);
        let tdTipo = $('<td>').append(tipo);
        let tdDestino = $('<td>').append(destino);
        
        let tr = $('<tr>')
        .attr('data-id', descarte.id)
        .append(id)
        .append(tdNome)
        .append(tdTipo)
        .append(tdDestino)
        .append(tdDeletar);
        $('#tabela tbody').append(tr);
        }
    } 
          });
}


    function atualizar(id, ent) {
        $.ajax({
            url: 'http://localhost:8080/descarte/atualizar/' + id,
            method: 'PUT',
            contentType: 'application/json',
        
            data: JSON.stringify({
                id: ent.id,
                nome: ent.nome,
                tipo: ent.tipo,
                destino: ent.destino
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
            url: 'http://localhost:8080/descarte/deletar/' + id,
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
