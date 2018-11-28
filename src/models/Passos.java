package models;

import java.util.ArrayList;

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

	private ArrayList<Passos> passos(){
		ArrayList<Passos> registros = new ArrayList<>();

		registros.add(new Passos(1, "Bloquear o acesso com a Internet do host contaminado no firewall de borda"));
		registros.add(new Passos(2, "Atualizar o Sistema Operacional"));
		registros.add(new Passos(3, "Ativar firewall no host/equipamento"));
		registros.add(new Passos(4, "Desinstalar programa de BitTorrent"));
		registros.add(new Passos(5, "Reinstalar Sistema Operacional"));
		registros.add(new Passos(6, "Usar ferramenta de remoção específica do bot/malware/worm"));
		registros.add(new Passos(7, "Desativar a execução automática do Windows"));
		registros.add(new Passos(8, "Usar a conta de Administrador efetuar a operação"));
		registros.add(new Passos(9, "Instalar/Atualizar o antivirus com as últimas definições de vírus"));
		registros.add(new Passos(10, "Atualizar o navegador web"));
		registros.add(new Passos(11, "Notificar o responsável pelo equipamento/host/server/rede/página web sobre o Incidente de Segurança recebido"));
		registros.add(new Passos(12, "Solicitar ao responsável do equipamento/host/server para corrigir o problema"));
		registros.add(new Passos(13, "Solicitar ao dono do equipamento/host/server para aplicar atualizações de segurança"));
		registros.add(new Passos(14, "Informações adicionais que podem auxiliar na resolução do incidente"));
		registros.add(new Passos(15, "Abrir chamada com o Centro de Apoio ao Usuário para mandar técnico ao local"));
		registros.add(new Passos(16, "Coleta de evidências para comprovar o problema"));
		registros.add(new Passos(17, "Analizar evidências para comprovar o problema"));
		registros.add(new Passos(18, "Atualizar serviço/aplicativo com as últimas correções disponíveis"));
		registros.add(new Passos(19, "Efetuar uma nova instalação do serviço/aplicativo"));
		registros.add(new Passos(20, "Efetuar varedura completa do host com o antivirus"));
		registros.add(new Passos(21, "Após as correções/atualizações/resolução do incidente de segurança, solicitar o desbloqueio no firewall de borda"));
		registros.add(new Passos(22, "Após as correçoes/atualizações/resolução do incidente de segurança, desbloquear no firewall de borda"));
		registros.add(new Passos(23, "Responder sobre a resolução do incidente ao CAIS"));
		registros.add(new Passos(24, "Identificar o host/server/equipamento responsável pelo incidente"));
		registros.add(new Passos(25, "Investigar o Incidente, coletar e examinar evidências digitais"));
		registros.add(new Passos(26, "Informações insuficientes recebidas, solicitar maiores detalhes CAIS"));
		registros.add(new Passos(27, "Host não pertence a Instituição, notificar o CAIS"));
		registros.add(new Passos(28, "Efetuar bloqueio do host contaminado nos servidores proxy ou Nat"));
		registros.add(new Passos(29, "Emitir aviso notificando do Incidente cada vez que o host solicitar a uma página web, informando do problema e solicitando a abrir chamada imediatamente."));
		registros.add(new Passos(30, "Solicitar ao usuáio do host contaminado a abrir chamada com o Centro de Apoio ao Usuário para mandar técnico ao local "));
		registros.add(new Passos(31, "Orientar o usuário a seguir os orientações da Livro da Cartilha de Segurança para Internet https://cartilha.cert.br/ "));
		registros.add(new Passos(32, "Após correções do host contaminado, solicitar desbloqueio do host contaminado nos servidores proxy ou Nat "));
		registros.add(new Passos(33, "Desinstalar o programa cliente do protocolo BotTorrent"));
		registros.add(new Passos(34, "Desisntalar serviço de DNS (porta 53 udp)"));
		registros.add(new Passos(35, "Solicitar ao responsável do equipamento/host/server para imediatamente interromper a comunicação com a rede de dados."));
		registros.add(new Passos(36, "Recuperar arquivos do backup"));
		registros.add(new Passos(37, "Reinstalar aplicativos/serviços"));
		registros.add(new Passos(38, "Desbloquear host nos servidores proxy ou Nat"));
		registros.add(new Passos(39, "Bloquear o acesso ao site nos servidores do CPD"));
		registros.add(new Passos(40, "Bloquear o acesso do host no servidor smtp da UFSM."));
		registros.add(new Passos(41, "Desbloquear o acesso do host no servidor smtp da UFSM."));
		registros.add(new Passos(42, "Comunicar o CPD/UFSM sobre a resolução do incidente de segurança"));
		registros.add(new Passos(43, "Bloquear conta do usuário"));
		registros.add(new Passos(44, "Comunicar usuário sobre sua conta comprometida"));

		return registros;
	}

	public Passos getPasso(int chave) {
		return  passos().get(chave);
	}
}
