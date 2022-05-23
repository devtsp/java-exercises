package ShipRent.services;

import ShipRent.entities.Customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public abstract class Rent {
    private Customer customer;
    private String rentStart;
    private String rentEnd;
    private int days;

    protected Rent(Customer customer, String rentStart, String rentEnd) {
        this.customer = customer;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
        this.days = calculateDays(rentStart, rentEnd);
    }
    protected Rent() {}

    private int calculateDays(String rentStart, String rentEnd) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        int days = 0;
        try {
            long date1 = formatter.parse(rentStart).getTime();
            long date2= formatter.parse(rentEnd).getTime();
            days = (int) Math.ceil((date2 - date1) / 1000 / 60 / 60 / 24);
            this.days = days;
        } catch (ParseException error) {
            error.printStackTrace();
        }
        return days;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    protected String getRentStart() {
        return rentStart;
    }

    protected void setRentStart(String rentStart) {
        this.rentStart = rentStart;
    }

    protected String getRentEnd() {
        return rentEnd;
    }

    protected void setRentEnd(String rentEnd) {
        this.rentEnd = rentEnd;
    }

    public int getDays() {
        return days;
    }

}
