package orm;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tarefa")
public class Tarefa {
	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	private boolean finalidade;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataDaFinalizacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isFinalidade() {
		return finalidade;
	}
	public void setFinalidade(boolean finalidade) {
		this.finalidade = finalidade;
	}
	public Calendar getDataDaFinalizacao() {
		return dataDaFinalizacao;
	}
	public void setDataDaFinalizacao(Calendar dataDaFinalizacao) {
		this.dataDaFinalizacao = dataDaFinalizacao;
	}
}
