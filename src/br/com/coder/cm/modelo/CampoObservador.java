package br.com.coder.cm.modelo;

@FunctionalInterface
public interface CampoObservador {
	
	public void eventoOcorreu(Campo campo, CampoEvento evento);
}
