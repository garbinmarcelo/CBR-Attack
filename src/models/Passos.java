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
		registros.put(6, "Usar ferramenta de remoção específica do bot/malware/worm");
		registros.put(7, "Desativar a execução automática do Windows");
		registros.put(8, "Usar a conta de Administrador efetuar a operação");
		registros.put(9, "Instalar/Atualizar o antivirus com as últimas definições de vírus");
		registros.put(10, "Atualizar o navegador web");
		registros.put(11, "Notificar o responsável pelo equipamento/host/server/rede/página web sobre o Incidente de Segurança recebido");
		registros.put(12, "Solicitar ao responsável do equipamento/host/server para corrigir o problema");
		registros.put(13, "Solicitar ao dono do equipamento/host/server para aplicar atualizações de segurança");
		registros.put(14, "Informações adicionais que podem auxiliar na resolução do incidente");
		registros.put(15, "Abrir chamada com o Centro de Apoio ao Usuário para mandar técnico ao local");
		registros.put(16, "Coleta de evidências para comprovar o problema");
		registros.put(17, "Analizar evidências para comprovar o problema");
		registros.put(18, "Atualizar serviço/aplicativo com as últimas correções disponíveis");
		registros.put(19, "Efetuar uma nova instalação do serviço/aplicativo");
		registros.put(20, "Efetuar varedura completa do host com o antivirus");
		registros.put(21, "Após as correções/atualizações/resolução do incidente de segurança, solicitar o desbloqueio no firewall de borda");
		registros.put(22, "Após as correçoes/atualizações/resolução do incidente de segurança, desbloquear no firewall de borda");
		registros.put(23, "Responder sobre a resolução do incidente ao CAIS");
		registros.put(24, "Identificar o host/server/equipamento responsável pelo incidente");
		registros.put(25, "Investigar o Incidente, coletar e examinar evidências digitais");
		registros.put(26, "Informações insuficientes recebidas, solicitar maiores detalhes CAIS");
		registros.put(27, "Host não pertence a Instituição, notificar o CAIS");
		registros.put(28, "Efetuar bloqueio do host contaminado nos servidores proxy ou Nat");
		registros.put(29, "Emitir aviso notificando do Incidente cada vez que o host solicitar a uma página web, informando do problema e solicitando a abrir chamada imediatamente.");
		registros.put(30, "Solicitar ao usuáio do host contaminado a abrir chamada com o Centro de Apoio ao Usuário para mandar técnico ao local ");
		registros.put(31, "Orientar o usuário a seguir os orientações da Livro da Cartilha de Segurança para Internet https://cartilha.cert.br/ ");
		registros.put(32, "Após correções do host contaminado, solicitar desbloqueio do host contaminado nos servidores proxy ou Nat ");
		registros.put(33, "Desinstalar o programa cliente do protocolo BotTorrent");
		registros.put(34, "Desisntalar serviço de DNS (porta 53 udp)");
		registros.put(35, "Solicitar ao responsável do equipamento/host/server para imediatamente interromper a comunicação com a rede de dados.");
		registros.put(36, "Recuperar arquivos do backup");
		registros.put(37, "Reinstalar aplicativos/serviços");
		registros.put(38, "Desbloquear host nos servidores proxy ou Nat");
		registros.put(39, "Bloquear o acesso ao site nos servidores do CPD");
		registros.put(40, "Bloquear o acesso do host no servidor smtp da UFSM.");
		registros.put(41, "Desbloquear o acesso do host no servidor smtp da UFSM.");
		registros.put(42, "Comunicar o CPD/UFSM sobre a resolução do incidente de segurança");
		registros.put(43, "Bloquear conta do usuário");
		registros.put(44, "Comunicar usuário sobre sua conta comprometida");

		return registros;
	}

	public String getPasso(int chave) {
		return  passos().get(chave);
	}
}
