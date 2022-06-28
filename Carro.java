package oo.composicao;

public class Carro {
	Motor motor;
	
	Carro(){
		this.motor = new Motor(this);
	}
	
	void acelerar() {
		motor.fatorInjecao += 0.4;
	}
	void frear() {
		if(motor.fatorInjecao < 2.6)
		motor.fatorInjecao  -= 0.4;
	}
	void ligar() {
		motor.ligado = true;
		if(motor.fatorInjecao > 0.5);
	}
	void desligar() {
		motor.ligado = false;
	}
		boolean estaLigado() {
		return motor.ligado;
		}
	
	}
