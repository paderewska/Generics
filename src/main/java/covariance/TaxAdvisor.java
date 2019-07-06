package covariance;

import java.util.ArrayList;
import java.util.List;

public class TaxAdvisor {

    public static void calculateTax(Taxable t) {
    }

    public static void calculateTaxes(Taxable[] at) {
        for (Taxable t : at) {
            calculateTax(t);
        }
//        at[0] = new Taxable();
    }

    //co-variance
    public static void calculateTaxes(List<? extends Taxable> lt) {
        for (Taxable t : lt) {
            calculateTax(t);
        }
//        lt.add(new Taxable());
//        lt.add(new Corporation());
    }

    public static void main(String[] args) {
        List<Taxable> lt = new ArrayList<>();
        lt.add(new Taxable());
        lt.add(new Corporation());
        lt.add(new Individual());

        calculateTaxes(lt);

        List<Individual> li = new ArrayList<>();
        calculateTaxes(li);

        Individual[] ia = new Individual[]{new Individual()};
        calculateTaxes(ia);
        System.out.println("All taxes calculated");
    }
}
