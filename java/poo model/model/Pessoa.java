package model;

public class Pessoa {

    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;

    public enum Tipopessoa {FISICA, JURIDICA}

    public Integer codigo;
    public String nome;
    private String documento;
    public Tipopessoa tipo;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if(documento == null || documento.isEmpty()) {
            throw new RuntimeException("Documento nao pode ser nulo ou vazio");
        }

        if(documento.length() == TAMANHO_CPF) {
            setDocumento(documento, tipo = Tipopessoa.FISICA);

        } else if (documento.length() == TAMANHO_CNPJ) {
            setDocumento(documento, tipo = Tipopessoa.JURIDICA);
        } else {
            throw new RuntimeException("Documento invalido para pessoa fisica ou juridica");
        }

        this.documento = documento;
    }

    private void setDocumento(String documento, Tipopessoa tipo) {
        this.documento = documento;
        this.tipo = tipo;
    }

    public Tipopessoa getTipo() {
        return tipo;
    }
}
