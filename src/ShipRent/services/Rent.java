package ShipRent.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public abstract class Rent {
    private String name;
    private int id;
    private String rentStart;
    private String rentEnd;

    protected Rent() {};
    protected Rent(String name, int id, String rentStart, String rentEnd) {
        this.name = name;
        this.id = id;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
    }

    protected int calculateDays(String rentStart, String rentEnd) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        int days = 0;
        try {
            long date1 = formatter.parse(rentStart).getTime();
            long date2= formatter.parse(rentEnd).getTime();
            days = (int) Math.ceil((date2 - date1) / 1000 / 60 / 60 / 24);
            return days;
        } catch (ParseException error) {
            error.printStackTrace();
        }
        return days;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
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
}
