Título do projeto 
Descarte Adequado Urbano

Status do projeto 
Em desenvolvimento

Tecnologias que serão aplicadas
Banco de dados MySQL
Bootstrap para responsividade da tela
RESTful api
Spring boot

Time de desenvolvedores 
No momento apenas eu, mas seria ideal ampliar e separar o desenvolvimento do software em diversas pessoas em uma metodologia sprint.

Objetivo do software
O sistema tem como objetivo administrar o descarte e o envio do lixo em uma cidade aplicável, separando tudo em diferentes categorias, como orgânico e não orgânico. 
No final, o lixo vai ter como destino um local apropriado para o seu descarte, seja para um aterro sanitário ou para um sistema de reciclagem, dependendo da unidade. 
Contudo, a ideia do sistema vem de uma necessidade de auxiliar a luta contra o lixo nas ruas, um problema muito presente, especialmente após a enchente.

Funcionalidades do sistema
Deverá ter uma tabela para os descartes, com a possibilidade de registro, que inclui os seus tipos e opcionalmente o destino, para os usuários e outra tabela para os destinos. 
A tabela de descarte deve conter nome e tipo como informações, com aquelas do tipo “Separar” necessitando de um destino.
A tabela de destino deve conter o nome, o endereço, a data de entrega e as unidades pedidas.
A tabela de empregados deve conter os dados pessoais de cada um (nome,cpf,endereço,etc), o salário e a função de cada, que é separado em Administrador, Coleção e Transporte.
Deverá ter telas de cadastro e administração para: Usuários, destinos e descartes
Os dados devem ser validados antes de serem cadastrados no sistema
Dependendo do tipo do usuário presente no login, ele deve ter acesso á apenas páginas específicas:
-Coletores podem apenas cadastrar descartes
-Transportes podem apenas visualizar e excluir destinos
-Separadores podem atualizar os descartes para incluir um destino ou tipo.
-Administradores podem usar todas as páginas, mas as de cadastro e administração de usuários são exclusivas para ele.
"# PI" 
