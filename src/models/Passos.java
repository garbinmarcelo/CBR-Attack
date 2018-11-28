package models;

import java.util.HashMap;

public class Passos {

	private Integer id;
	private String titulo;

	public Passos() {
	}

	public Passos(Integer id, String titulo) {
		this.id = id;
		this.titulo = titulo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		//return this.id + " - " + this.titulo;
		return this.titulo;
	}

	private HashMap<Integer, String> passos(){
		HashMap<Integer, String> registros = new HashMap<>();
		//ArrayList<Passos> registros = new ArrayList<>();
		registros.put(1, "Bloquear o acesso com a Internet do host contaminado no firewall de borda");
		registros.put(2, "Atualizar o Sistema Operacional");
		registros.put(3, "Ativar firewall no host/equipamento");
		registros.put(4, "Desinstalar programa de BitTorrent");
		registros.put(5, "Reinstalar Sistema Operacional");
		registros.put(6, "Usar ferramenta de remo��o espec�fica do bot/malware/worm");
		registros.put(7, "Desativar a execu��o autom�tica do Windows");
		registros.put(8, "Usar a conta de Administrador efetuar a opera��o");
		registros.put(9, "Instalar/Atualizar o antivirus com as �ltimas defini��es de v�rus");
		registros.put(10, "Atualizar o navegador web");
		registros.put(11, "Notificar o respons�vel pelo equipamento/host/server/rede/p�gina web sobre o Incidente de Seguran�a recebido");
		registros.put(12, "Solicitar ao respons�vel do equipamento/host/server para corrigir o problema");
		registros.put(13, "Solicitar ao dono do equipamento/host/server para aplicar atualiza��es de seguran�a");
		registros.put(14, "Informa��es adicionais que podem auxiliar na resolu��o do incidente");
		registros.put(15, "Abrir chamada com o Centro de Apoio ao Usu�rio para mandar t�cnico ao local");
		registros.put(16, "Coleta de evid�ncias para comprovar o problema");
		registros.put(17, "Analizar evid�ncias para comprovar o problema");
		registros.put(18, "Atualizar servi�o/aplicativo com as �ltimas corre��es dispon�veis");
		registros.put(19, "Efetuar uma nova instala��o do servi�o/aplicativo");
		registros.put(20, "Efetuar varedura completa do host com o antivirus");
		registros.put(21, "Ap�s as corre��es/atualiza��es/resolu��o do incidente de seguran�a, solicitar o desbloqueio no firewall de borda");
		registros.put(22, "Ap�s as corre�oes/atualiza��es/resolu��o do incidente de seguran�a, desbloquear no firewall de borda");
		registros.put(23, "Responder sobre a resolu��o do incidente ao CAIS");
		registros.put(24, "Identificar o host/server/equipamento respons�vel pelo incidente");
		registros.put(25, "Investigar o Incidente, coletar e examinar evid�ncias digitais");
		registros.put(26, "Informa��es insuficientes recebidas, solicitar maiores detalhes CAIS");
		registros.put(27, "Host n�o pertence a Institui��o, notificar o CAIS");
		registros.put(28, "Efetuar bloqueio do host contaminado nos servidores proxy ou Nat");
		registros.put(29, "Emitir aviso notificando do Incidente cada vez que o host solicitar a uma p�gina web, informando do problema e solicitando a abrir chamada imediatamente.");
		registros.put(30, "Solicitar ao usu�io do host contaminado a abrir chamada com o Centro de Apoio ao Usu�rio para mandar t�cnico ao local ");
		registros.put(31, "Orientar o usu�rio a seguir os orienta��es da Livro da Cartilha de Seguran�a para Internet https://cartilha.cert.br/ ");
		registros.put(32, "Ap�s corre��es do host contaminado, solicitar desbloqueio do host contaminado nos servidores proxy ou Nat ");
		registros.put(33, "Desinstalar o programa cliente do protocolo BotTorrent");
		registros.put(34, "Desisntalar servi�o de DNS (porta 53 udp)");
		registros.put(35, "Solicitar ao respons�vel do equipamento/host/server para imediatamente interromper a comunica��o com a rede de dados.");
		registros.put(36, "Recuperar arquivos do backup");
		registros.put(37, "Reinstalar aplicativos/servi�os");
		registros.put(38, "Desbloquear host nos servidores proxy ou Nat");
		registros.put(39, "Bloquear o acesso ao site nos servidores do CPD");
		registros.put(40, "Bloquear o acesso do host no servidor smtp da UFSM.");
		registros.put(41, "Desbloquear o acesso do host no servidor smtp da UFSM.");
		registros.put(42, "Comunicar o CPD/UFSM sobre a resolu��o do incidente de seguran�a");
		registros.put(43, "Bloquear conta do usu�rio");
		registros.put(44, "Comunicar usu�rio sobre sua conta comprometida");

		return registros;
	}

	public String getPasso(int chave) {
		return  passos().get(chave);
	}
}
