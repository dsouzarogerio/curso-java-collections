package curso.java.collections.list.aula2.lab.exerc04;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
	
	private String nome;
	private Integer anoDeCriacao;
	private String ide;
	
	
	public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
		this.nome = nome;
		this.anoDeCriacao = anoDeCriacao;
		this.ide = ide;
	}
	public String getNome() {
		return nome;
	}
	public Integer getAnoDeCriacao() {
		return anoDeCriacao;
	}
	public String getIde() {
		return ide;
	}
	@Override
	public String toString() {
		return "{" + "nome=" + nome + ", anoDeCriacao=" + anoDeCriacao + ", ide=" + ide + "}";
	}
	@Override
	public int compareTo(LinguagemFavorita programacao) {

			return this.getNome().compareTo(programacao.getNome());
		}
	}