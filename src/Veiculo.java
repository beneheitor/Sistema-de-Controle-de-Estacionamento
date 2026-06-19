public abstract class Veiculo {
    private String placa;
    private String modelo;
    private String nomeDono;

    public Veiculo(String placa, String modelo, String nomeDono) {
        this.placa = placa;
        this.modelo = modelo;
        this.nomeDono = nomeDono;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    @Override
    public String toString() {
        return "Proprietário:  '" + getNomeDono() + "' \t" + "Modelo: '" + getModelo() + "' \t" + "Placa: '" + getPlaca() + "' \n" ;
    }

    public abstract void tipoDoVeiculo();

}
