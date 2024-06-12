package services;

import services.Contract;
import services.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {

        double basicQuota = contract.getTotalValue() / months;

        for (int i=1; i<=months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interests = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interests);
            double quota = basicQuota + interests + fee;

            contract.getInstallments().add(new Installment(dueDate, quota));
        }

    }
}
