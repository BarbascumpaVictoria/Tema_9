public class Elefant extends Erbivor implements Animal{
    int greutateKG = 4000;
    String mincare = "Iarba, frunze, fructe, radacini, crengi si coaja";
    @Override
    public void Clasificare(){System.out.println("Clasificare:Chordata->Vertebrata->Mammalia->Afrotheria->Proboscidea->Elephantidae");}
    public int ParametriFizici(){ System.out.println(greutateKG); return greutateKG;}
    public String CeManinca() {System.out.println(mincare); return mincare;}
}
