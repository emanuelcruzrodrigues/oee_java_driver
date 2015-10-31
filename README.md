# oee_java_driver
Implementação do consumo de todos os webservices do sistema gerador do índice OEE. 
Desenvolvido com o objetivo de ser utilizado como um driver, visando facilitar o desenvolvimento de novos clientes que utilizem a plataforma Java.

## Utilização do driver de comunicação com o sistema OEE
O driver disponibiliza alguns componentes que simplificam o consumos dos web services disponibilizados pelo sistema OEE. Todos estes componentes possuem um único construtor, onde deve ser passada a URL onde o sistema OEE é disponibilizado. 

### EquipamentoWSClient

A partir deste componente é possível inserir / alterar e excluir equipamentos a partir dos seguintes métodos:

//Permite realizar a inclusão ou a alteração de equipamentos em que o índice OEE deve ser calculado.
public InserirOuAlterarEquipamentoResponse inserirOuAlterar(int codigo, String nome , AtivoInativo situacao){

//Permite realizar a exclusão de um equipamento pelo seu código.
public ExcluirEquipamentoResponse excluir(int codigo){

### MotivoParadaWSClient

A partir deste componente é possível inserir / alterar e excluir motivos de parada a partir dos seguintes métodos:

//Permite realizar a inclusão ou alteração de motivos de parada.
public InserirOuAlterarMotivoParadaResponse inserirOuAlterar(int codigo, String descricao, AtivoInativo situacao, TipoParada tipoParada){

//Permite realizar a exclusão de um motivo de parada pelo seu código no sistema origem.
public ExcluirMotivoParadaResponse excluir(int codigo){

### OrdemProducaoWSCLient

A partir deste componente é possível inserir / alterar e excluir ordens de produção a partir dos seguintes métodos:

//Permite realizar a inclusão ou alteração de ordens de produção.
public InserirOuAlterarOrdemProducaoResponse inserirOuAlterar(int codigo, String descricao, double unidadesPorMinuto, SituacaoOrdemProducao situacao, int codigoEquipamento) {

//Permite realizar a exclusão de uma ordem de produção pelo seu código no sistema origem.
public ExcluirOrdemProducaoResponse excluir(int codigo){

### ProgramacaoProducaoWSClient

A partir deste componente é possível inserir / alterar e excluir programação da produção de equipamentos a partir dos seguintes métodos:

//Permite realizar a inclusão ou a alteração da programação de produção de um equipamento.
public InserirOuAlterarProgramacaoProducaoEquipamentoResponse inserirOuAlterar(Integer codigo, int codigoEquipamento, LocalDateTime dtHrInicial, LocalDateTime dtHrFinal) {

//Permite realizar a exclusão da programação de produção de um equipamento pelo seu código no sistema origem.
public ExcluirProgramacaoProducaoEquipamentoResponse excluir(Integer codigo){

### ApontamentoWSClient

A partir deste componente é possível realizar diversas operações relacionadas com apontamentos, sejam eles de tempo ou quantidade. São eles:

// Inicia um apontamento de produção para uma ordem de produção específica.
public IniciarApontamentoProducaoResponse iniciarApontamentoProducao(int codigoOrdemProducao) {

// Inicia um apontamento de parada para um equipamento e motivo específicos.
public IniciarApontamentoParadaResponse iniciarApontamentoParada(int codigoEquipamento, int codigoMotivoParada) {

// Realiza o encerramento do apontamento que estiver aberto para um equipamento específico, seja um apontamento de parada ou produção.
public EncerrarApontamentoEquipamentoResponse encerrarApontamentos(int codigoEquipamento) {

// Realiza a inclusão de um apontamento de quantidade produzida dentro das especificações do produto.
public InserirApontamentoQuantidadeResponse inserirApontamentoQuantidade(int codigoOrdemProducao, double quantidade){

// Realiza a inclusão de um apontamento de quantidade produzida fora das especificações do produto.
public InserirApontamentoQuantidadeRefugoResponse inserirApontamentoQuantidadeRefugo(int codigoOrdemProducao, double quantidade){

// Permite inserir ou alterar um apontamento de parada. Para que seja possível identificar o registro a ser alterado é necessário informar o código do apontamento. Registros sem código são sempre incluídos.
public InserirOuAlterarApontamentoParadaResponse inserirOuAlterarApontamentoParada(Integer codigo, Integer codigoEquipamento, Integer codigoMotivoParada, LocalDateTime dtHrInicial, LocalDateTime dtHrFinal){

// Permite inserir ou alterar um apontamento de produção. Para que seja possível identificar o registro a ser alterado é necessário informar o código do apontamento. Registros sem código são sempre incluídos.
public InserirOuAlterarApontamentoProducaoResponse inserirOuAlterarApontamentoProducao(Integer codigo, int codigoOrdemProducao, LocalDateTime dtHrInicial, LocalDateTime dtHrFinal){

// Permite inserir ou alterar um apontamento de quantidade de qualquer qualidade (informação deve ser enviada na requisição). Para que seja possível identificar o registro a ser alterado é necessário informar o código do apontamento. Registros sem código são sempre incluídos.
public InserirOuAlterarApontamentoQuantidadeResponse inserirOuAlterarApontamentoQuantidade(Integer codigo, int codigoOrdemProducao, LocalDateTime dtHr, QualidadeProducao qualidadeProducao, double quantidade){

// Permite realizar a exclusão de um apontamento de parada pelo seu código.
public ExcluirApontamentoParadaResponse excluirApontamentoParada(Integer codigo){
		
// Permite realizar a exclusão de um apontamento de produção pelo seu código no sistema origem.
public ExcluirApontamentoProducaoResponse excluirApontamentoProducao(Integer codigo){
		
//Permite realizar a exclusão de um apontamento de quantidade pelo seu código.
public ExcluirApontamentoQuantidadeResponse excluirApontamentoQuantidade(Integer codigo){
		
### EstatisticasWSClient

A partir deste componente é possível recuperar os indicadores resultantes a partir dos seguintes métodos:

// Retorna o índice atual de um equipamento específico, retroativo a uma quantidade de minutos informada.
public GetIndiceOEETempoRealResponse getIndiceTempoReal(int codigoEquipamento){
