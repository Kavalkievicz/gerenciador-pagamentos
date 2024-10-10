# gerenciador-pagamentos

Nome-Joao Pedro Kavalkievicz RA-21011423
Nome-Wesley Vinicius Godk RA-20021723

A API apresenta endpoint para listar todos os pagamentos e jogadores cadastrados (/pagamentos, /jogadores), utilizando como método padrão o GET. Quando se faz uma requisição GET para os endpoint, o método referente é chamado (getAllPagamentos() e getAllJogadores()). Ele utiliza dos arquivos na pasta repository (PagamentoRepository e JogadorRepository) para buscar todos os registros de pagamentos e jogadores no banco de dados e retorna esses dados em formato JSON.
Além disso é possível criar um novo pagamento ou jogador através do endpoint e do método POST, o método createPagamento() e createJogador() são acionados. Eles recebem esses dados, os transformam em um objeto Pagamento ou Jogador, e em seguida utiliza o repository para salvar esse objeto no banco de dados. Após salvar, a API retorna o pagamento ou o jogador recém-criado.