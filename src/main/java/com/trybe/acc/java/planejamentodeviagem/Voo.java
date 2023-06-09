package com.trybe.acc.java.planejamentodeviagem;

public class Voo {
  private int tempoVoo;

  /**
   * Método para retornar tempo de Voo.
   * 
   */
  public int retornarTempoVoo(double distanciaKm) {

    Double duracaoDouble = distanciaKm / 700.0;

    return (int) Math.round(duracaoDouble);
  }

  /**
   * Método para retornar informaçao do Voo.
   * 
   */
  public String retornarInformacaoVoo(String embarque, String origem, String desembarque,
      String destino) {
    return String.format(
        "Atenção: o desembarque em %s será: %s no horário de %s e %s no horário de %s", destino,
        desembarque, destino, embarque, origem);
  }
}
