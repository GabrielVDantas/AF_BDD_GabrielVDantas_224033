package org.example;

/**
 * @author Gabriel Viegas Dantas
 * @version 1.0
 * @since Release 1.0 da aplicacao
 */
public class RentCar {
    private static final double LUXURY_CAR_COST = 2000.0;
    private static final double ADVANCE_BOOKING_DISCOUNT = 0.1;

    private static final double EXTRA_LUXURY_CAR_COST = 500;

    /**
     *
     * @return o valor de desconto pelo fato do usuario ter alugado o carro com antecedencia
     */
    public double getDiscountForAdvanceBooking() {
        return ADVANCE_BOOKING_DISCOUNT;
    }

    /**
     *
     * @param advancedBooking Valor para analisar se o usuario fez o aluguel com antecedencia ou nao
     * @param discount Valor do desconto que o usuario ira receber caso alugue o carro com antecedencia
     * @return Custo final para o usuario
     */
    public double calculateRentalCost(boolean advancedBooking, double discount) {
        double finalCost;
        if (advancedBooking) {
            finalCost = LUXURY_CAR_COST * discount;
        } else {
            finalCost = LUXURY_CAR_COST + EXTRA_LUXURY_CAR_COST;
        }
        return finalCost;
    }
}
