package Entities;

public class Veiculo {

	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private Float km;
	private Boolean isLigado;
	private Integer litrosCombustivel;
	private Integer velocidade;
	private Double preco;

	public Veiculo(Boolean isLigado, Integer litrosCombustivel, Integer velocidade) {
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
	}

	public Veiculo(String marca, String modelo, String placa, String cor, Boolean isLigado, Integer litrosCombustivel,
			Integer velocidade) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
	}

	public Veiculo(String marca, String modelo, String placa, String cor, Float km, Boolean isLigado,
			Integer litrosCombustivel, Integer velocidade, Double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Float getKm() {
		return km;
	}

	public void setKm(Float km) {
		this.km = km;
	}

	public Boolean getIsLigado() {
		return isLigado;
	}

	public void setIsLigado(Boolean isLigado) {
		this.isLigado = isLigado;
	}

	public Integer getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public Integer getVelocidade() {
		return velocidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String acelerar() {
		if (this.isLigado == false) {
			return "Por favor, ligue o Ve�culo!";
		} else if (this.litrosCombustivel == 0) {
			return "� necess�rio abastecer o Ve�culo!";
		} else {
			this.velocidade += 20;
			return "Velocidade atual: " + this.velocidade + " km/h";
		}
	}

	public String abastecer(int combustivel) {
		if (this.isLigado == true) {
			return "� preciso desligar o Ve�culo para abastecer";
		} else {
			this.litrosCombustivel += combustivel;
			if (this.litrosCombustivel == 60)
				return "Seu tanque est� completo!";
			else if (this.litrosCombustivel > 60) {
				int excesso = this.litrosCombustivel - 60;
				return "N�o � poss�vel abastecer. Litros al�m da capacidade: " + excesso;
			} else {
				return "Ve�culo abastecido! Total: " + this.litrosCombustivel + "L";
			}
		}
	}

	public String frear() {
		if (this.isLigado == false) {
			return "O Ve�culo est� desligado!";
		} else if (this.velocidade <= 0) {
			return "O Ve�culo est� parado!";
		} else {
			this.velocidade -= 20;
			return "Velocidade atual: " + this.velocidade + " km/h";
		}
	}

	public String pintar(String cor) {
		this.cor = cor;
		return "O Ve�culo foi pintado na cor " + cor;
	}

	public String ligar() {
		if (this.isLigado == false) {
			this.velocidade = 0;
			this.isLigado = true;
		}
		return "O Ve�culo est� ligado";
	}

	public String desligar() {
		if (this.isLigado && this.velocidade > 0) {
			return "� preciso parar o Ve�culo!";
		} else {
			this.isLigado = false;
			return "Desligando o Ve�culo";
		}
	}
}
