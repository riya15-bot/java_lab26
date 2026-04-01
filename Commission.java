public class Commission {
    double sales;
    Commission(double sales){
        this.sales = sales;
    }
    double commission (){
        if (sales < 100000){
            return sales * 0.10;
        }
        else if (sales >= 100000 && sales < 200000){
            return sales * 0.05;
        }
        else {
            return sales * 0.02;
        }

    }
}
