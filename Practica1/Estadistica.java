






public class Estadistica {

    private double[] n;


    public Estadistica(double[] n){
        this.n = n;
    }


    public double Promedio(){
        double acum1 = 0;
        
        for(int i=0; i < n.length; i++){
            acum1 = acum1 + n[i];
        }

        return acum1 / n.length;
    }


    public double Desviacion(){
        double acumm2 = 0;

        for(int j=0; j < n.length; j++){
            acumm2 = acumm2 + Math.pow(n[j] - Promedio(), 2);
        }

        if (acumm2 == 0) {
            return 0;
        }

        return Math.sqrt(acumm2 / (n.length - 1));
    }
}
