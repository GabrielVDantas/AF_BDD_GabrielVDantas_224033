import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.RentCar;

import static org.junit.Assert.*;

public class RentSteps {
    private RentCar rentCar;
    private boolean luxuryCar;
    private boolean advanceBooking;
    private double rentalCost;
    private double discount;

    public RentSteps() {
        rentCar = new RentCar();
        luxuryCar = false;
        advanceBooking = false;
        rentalCost = 0.0;
        discount = 0.0;
    }

    @Given("o cliente quer alugar um carro de luxo")
    public boolean tiresLuxuryCarRent() {
        luxuryCar = true;
        return true;
    }

    @And("o cliente realiza a reserva com pelo menos uma semana de antecedência")
    public boolean rentWithAdvancedBooking() {
        advanceBooking = true;
        return true;
    }

    @Then("o sistema oferece um desconto especial em relação ao valor total da locação")
    public void userReceivesDiscount() {
        double discount = rentCar.getDiscountForAdvanceBooking();
        double finalRentPrice = rentCar.calculateRentalCost(rentWithAdvancedBooking(), discount);
        assertTrue(finalRentPrice < 2000.0);
    }

    @And("o cliente não realiza reserva prévia")
    public boolean rentWithoutAdvancedBooking() {
        advanceBooking = false;
        return false;
    }

    @And("o sistema não deve oferecer desconto e o custo será mais elevado devido à demanda urgente")
    public void userDoesntReceivesDiscount() {
        double finalRentPrice = rentCar.calculateRentalCost(rentWithoutAdvancedBooking(), 0);
        assertTrue(finalRentPrice > 2000.0);
    }
}


