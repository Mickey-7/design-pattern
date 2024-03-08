package BehavioralVisitorPattern.models;

import BehavioralVisitorPattern.Visitor;

public class Resident extends Client{
    private String insuranceClass;

    public Resident(String name, String address, String number, String insuranceClass){
        super(name, address, number);
        this.insuranceClass = insuranceClass;
    }

    public String getInsuranceClass() {
        return insuranceClass;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
