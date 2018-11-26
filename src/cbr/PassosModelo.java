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
		passos.put(6, "Usar ferramenta de remo��o espec�fica do bot/malware/worm");
		passos.put(7, "Desativar a execu��o autom�tica do Windows");
		passos.put(8, "Usar a conta de Administrador efetuar a opera��o");
		passos.put(9, "Instalar/Atualizar o antivirus com as �ltimas defini��es de v�rus");
		passos.put(10, "Atualizar o navegador web");
		passos.put(11, "Notificar o respons�vel pelo equipamento/host/server/rede/p�gina web sobre o Incidente de Seguran�a recebido");
		passos.put(12, "Solicitar ao respons�vel do equipamento/host/server para corrigir o problema");
		passos.put(13, "Solicitar ao dono do equipamento/host/server para aplicar atualiza��es de seguran�a");
		passos.put(14, "Informa��es adicionais que podem auxiliar na resolu��o do incidente");
		passos.put(15, "Abrir chamada com o Centro de Apoio ao Usu�rio para mandar t�cnico ao local");
		passos.put(16, "Coleta de evid�ncias para comprovar o problema");
		passos.put(17, "Analizar evid�ncias para comprovar o problema");
		passos.put(18, "Atualizar servi�o/aplicativo com as �ltimas corre��es dispon�veis");
		passos.put(19, "Efetuar uma nova instala��o do servi�o/aplicativo");
		passos.put(20, "Efetuar varedura completa do host com o antivirus");
		passos.put(21, "Ap�s as corre��es/atualiza��es/resolu��o do incidente de seguran�a, solicitar o desbloqueio no firewall de borda");
		passos.put(22, "Ap�s as corre�oes/atualiza��es/resolu��o do incidente de seguran�a, desbloquear no firewall de borda");
		passos.put(23, "Responder sobre a resolu��o do incidente ao CAIS");
		passos.put(24, "Identificar o host/server/equipamento respons�vel pelo incidente");
		passos.put(25, "Investigar o Incidente, coletar e examinar evid�ncias digitais");
		passos.put(26, "Informa��es insuficientes recebidas, solicitar maiores detalhes CAIS");
		passos.put(27, "Host n�o pertence a Institui��o, notificar o CAIS");
		passos.put(28, "Efetuar bloqueio do host contaminado nos servidores proxy ou Nat");
		passos.put(29, "Emitir aviso notificando do Incidente cada vez que o host solicitar a uma p�gina web, informando do problema e solicitando a abrir chamada imediatamente.");
		passos.put(30, "Solicitar ao usu�io do host contaminado a abrir chamada com o Centro de Apoio ao Usu�rio para mandar t�cnico ao local ");
		passos.put(31, "Orientar o usu�rio a seguir os orienta��es da Livro da Cartilha de Seguran�a para Internet https://cartilha.cert.br/ ");
		passos.put(32, "Ap�s corre��es do host contaminado, solicitar desbloqueio do host contaminado nos servidores proxy ou Nat ");
		passos.put(33, "Desinstalar o programa cliente do protocolo BotTorrent");
		passos.put(34, "Desisntalar servi�o de DNS (porta 53 udp)");
		passos.put(35, "Solicitar ao respons�vel do equipamento/host/server para imediatamente interromper a comunica��o com a rede de dados.");
		passos.put(36, "Recuperar arquivos do backup");
		passos.put(37, "Reinstalar aplicativos/servi�os");
		passos.put(38, "Desbloquear host nos servidores proxy ou Nat");
		passos.put(39, "Bloquear o acesso ao site nos servidores do CPD");
		passos.put(40, "Bloquear o acesso do host no servidor smtp da UFSM.");
		passos.put(41, "Desbloquear o acesso do host no servidor smtp da UFSM.");
		passos.put(42, "Comunicar o CPD/UFSM sobre a resolu��o do incidente de seguran�a");
		passos.put(43, "Bloquear conta do usu�rio");
		passos.put(44, "Comunicar usu�rio sobre sua conta comprometida");

		return passos;
	}

	public String consultarPasso(int chave) {
		return  popularHash().get(chave);
	}

}
