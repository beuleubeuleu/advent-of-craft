package food;

import java.time.LocalDate;
import java.util.UUID;
import java.util.function.Supplier;

public record Food(LocalDate expirationDate,
                   Boolean approvedForConsumption,
                   UUID inspectorId) {
    public boolean isEdible(Supplier<LocalDate> now) {

        //condition variables
        LocalDate today = now.get();
        boolean isFresh = this.expirationDate.isAfter(today);
        boolean isApprovedForConsumption = this.approvedForConsumption;
        boolean hasInspectorId = this.inspectorId != null;


        return (isFresh && isApprovedForConsumption && hasInspectorId);
    }
}