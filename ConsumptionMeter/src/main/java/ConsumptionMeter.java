import java.time.LocalDateTime;

public class ConsumptionMeter {

    private String serialNumber;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private long consumption;

    /**
     * Consumption measuring object
     *
     * @param serialNumber of the consumption meter
     * @param startDate    of the measure
     * @param endDate      of the measure
     * @param consumption  amount of consumption
     */
    public ConsumptionMeter(String serialNumber, LocalDateTime startDate, LocalDateTime endDate, long consumption) {
        this.serialNumber = serialNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.consumption = consumption;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public long getConsumption() {
        return consumption;
    }

}
