package BehavioralVisitorPattern;

import BehavioralVisitorPattern.models.Bank;
import BehavioralVisitorPattern.models.Company;
import BehavioralVisitorPattern.models.Resident;
import BehavioralVisitorPattern.models.Restaurant;

public interface Visitor {
    void visit(Bank bank);
    void visit(Company company);
    void visit(Resident resident);
    void visit(Restaurant restaurant);
}
