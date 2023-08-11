public class Main {
    public static void main(String[] args) {
        Transportadora Transportadora = new Transportadora() {


            @Override
            public double calculaFrete(int altura, int largura) {
                return 0;
            }
        };
        Transportadora transportadoraTerrestre = new TransporteTerrestre();

        int altura = 10;
        int largura = 5;

        double freteNautico = Transportadora.calculaFrete(altura, largura);
        double freteTerrestre = transportadoraTerrestre.calculaFrete(altura, largura);

        System.out.println("Frete Náutico: " + freteNautico);
        System.out.println("Frete Terrestre: " + freteTerrestre);
    }
}
