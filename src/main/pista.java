package main;

class pista {
    private int Comprimento_pista;

    public int getComprimento_pista() {
        return this.Comprimento_pista;
    }

    public void setComprimento_pista(int comprimento_pista) {
        if (comprimento_pista > 99) {
            this.Comprimento_pista = comprimento_pista;
        }
    }

    public void pista(int Comprimento_pista, int candidatos) {
        this.Comprimento_pista = Comprimento_pista;
        int ranque[] = new int[candidatos];
    }


}
