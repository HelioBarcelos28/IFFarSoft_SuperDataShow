
package Model;

/**
 *
 * @author LucasMarcon
 *
 * DESCRIÇÃO: 
 */

public class Locacao {

	private String idLocacao;
	private String valorLocacao;
	private String dataLocacao;
	private String dataDevolucaoPrevista;
	private String dataDevolucao;
	private String horasUsadas;
	private String idProjetor;
	private String idCliente;
	private String valorMulta;

	public String getIdLocacao() {
		return idLocacao;
	}

	public void setIdLocacao(String idLocacao) {
		this.idLocacao = idLocacao;
	}

	public String getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(String valorLocacao) {
		this.valorLocacao = valorLocacao;
	}

	public String getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(String dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

	public String getDataDevolucaoPrevista() {
		return dataDevolucaoPrevista;
	}

	public void setDataDevolucaoPrevista(String dataDevolucaoPrevista) {
		this.dataDevolucaoPrevista = dataDevolucaoPrevista;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public String getHorasUsadas() {
		return horasUsadas;
	}

	public void setHorasUsadas(String horasUsadas) {
		this.horasUsadas = horasUsadas;
	}

	public String getIdProjetor() {
		return idProjetor;
	}

	public void setIdProjetor(String idProjetor) {
		this.idProjetor = idProjetor;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getValorMulta() {
		return valorMulta;
	}

	public void setValorMulta(String valorMulta) {
		this.valorMulta = valorMulta;
	}
	
	
}
