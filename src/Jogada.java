public enum Jogada {

    PEDRA,PAPEL,TESOURA;

    public boolean venceDe(Jogada outra){
        return (this == PEDRA && outra == TESOURA)
                || (this == PAPEL && outra == PEDRA)
                || (this == TESOURA && outra == PAPEL);
    }

}
