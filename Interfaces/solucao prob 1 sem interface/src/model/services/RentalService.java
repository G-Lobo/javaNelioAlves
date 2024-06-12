package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerDay;
    private Double pricePerHour;

    private BrazilTaxService brazilTaxService;

    public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService brazilTaxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.brazilTaxService = brazilTaxService;
    }

    public void processInvoice(CarRental carRental) {

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60;

        double basicPayment;
        if (hours <= 12) {
            //calcula em horas
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            //calcula em dias
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        }

        double tax = brazilTaxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment,tax));
    }
}
