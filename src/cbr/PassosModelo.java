package cbr;

import java.util.HashMap;

public class PassosModelo {

	private HashMap<Integer, String> popularHash(){
		HashMap<Integer, String>  passos = new HashMap<>();
		
		passos.put(1, "Bloquear o acesso com a Internet do host contaminado no firewall de borda");
		passos.put(2, "Atualizar o Sistema Operacional");
		passos.put(3, "Ativar firewall no host/equipamento");
		passos.put(4, "Desinstalar programa de BitTorrent");
		passos.put(5, "Reinstalar Sistema Operacional");
		passos.put(6, "Usar ferramenta de remoção específica do bot/malware/worm");
		passos.put(7, "Desativar a execução automática do Windows");
		passos.put(8, "Usar a conta de Administrador efetuar a operação");
		passos.put(9, "Instalar/Atualizar o antivirus com as últimas definições de vírus");
		passos.put(10, "Atualizar o navegador web");
		passos.put(11, "Notificar o responsável pelo equipamento/host/server/rede/página web sobre o Incidente de Segurança recebido");
		passos.put(12, "Solicitar ao responsável do equipamento/host/server para corrigir o problema");
		passos.put(13, "Solicitar ao dono do equipamento/host/server para aplicar atualizações de segurança");
		passos.put(14, "Informações adicionais que podem auxiliar na resolução do incidente");
		passos.put(15, "Abrir chamada com o Centro de Apoio ao Usuário para mandar técnico ao local");
		passos.put(16, "Coleta de evidências para comprovar o problema");
		passos.put(17, "Analizar evidências para comprovar o problema");
		passos.put(18, "Atualizar serviço/aplicativo com as últimas correções disponíveis");
		passos.put(19, "Efetuar uma nova instalação do serviço/aplicativo");
		passos.put(20, "Efetuar varedura completa do host com o antivirus");
		passos.put(21, "Após as correções/atualizações/resolução do incidente de segurança, solicitar o desbloqueio no firewall de borda");
		passos.put(22, "Após as correçoes/atualizações/resolução do incidente de segurança, desbloquear no firewall de borda");
		passos.put(23, "Responder sobre a resolução do incidente ao CAIS");
		passos.put(24, "Identificar o host/server/equipamento responsável pelo incidente");
		passos.put(25, "Investigar o Incidente, coletar e examinar evidências digitais");
		passos.put(26, "Informações insuficientes recebidas, solicitar maiores detalhes CAIS");
		passos.put(27, "Host não pertence a Instituição, notificar o CAIS");
		passos.put(28, "Efetuar bloqueio do host contaminado nos servidores proxy ou Nat");
		passos.put(29, "Emitir aviso notificando do Incidente cada vez que o host solicitar a uma página web, informando do problema e solicitando a abrir chamada imediatamente.");
		passos.put(30, "Solicitar ao usuáio do host contaminado a abrir chamada com o Centro de Apoio ao Usuário para mandar técnico ao local ");
		passos.put(31, "Orientar o usuário a seguir os orientações da Livro da Cartilha de Segurança para Internet https://cartilha.cert.br/ ");
		passos.put(32, "Após correções do host contaminado, solicitar desbloqueio do host contaminado nos servidores proxy ou Nat ");
		passos.put(33, "Desinstalar o programa cliente do protocolo BotTorrent");
		passos.put(34, "Desisntalar serviço de DNS (porta 53 udp)");
		passos.put(35, "Solicitar ao responsável do equipamento/host/server para imediatamente interromper a comunicação com a rede de dados.");
		passos.put(36, "Recuperar arquivos do backup");
		passos.put(37, "Reinstalar aplicativos/serviços");
		passos.put(38, "Desbloquear host nos servidores proxy ou Nat");
		passos.put(39, "Bloquear o acesso ao site nos servidores do CPD");
		passos.put(40, "Bloquear o acesso do host no servidor smtp da UFSM.");
		passos.put(41, "Desbloquear o acesso do host no servidor smtp da UFSM.");
		passos.put(42, "Comunicar o CPD/UFSM sobre a resolução do incidente de segurança");
		passos.put(43, "Bloquear conta do usuário");
		passos.put(44, "Comunicar usuário sobre sua conta comprometida");

		return passos;
	}

	public String consultarPasso(int chave) {
		return  popularHash().get(chave);
	}

}
