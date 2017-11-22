import java.util.*;

public class FindError {

    private List<ConsumptionMeter> consumptionMeterList = new ArrayList<>();

    /**
     * Uploads the consumptionMeterList with the meters
     *
     * @param consumptionMeters array of consumption meters
     */
    public void loadData(ConsumptionMeter... consumptionMeters) {
        for (ConsumptionMeter consumptionMeter : consumptionMeters) {
            consumptionMeterList.add(consumptionMeter);
        }
    }

    /**
     * Data organizer
     *
     * @return a map with organized data based on the start date of the measure
     */
    public Map<String, List<ConsumptionMeter>> organizer() {
        Map<String, List<ConsumptionMeter>> organizedData = new HashMap<>();
        List<ConsumptionMeter> sortedConsumptionMeterList = new ArrayList<>(consumptionMeterList);
        sortedConsumptionMeterList.sort(new Comparator<ConsumptionMeter>() {
            @Override
            public int compare(ConsumptionMeter o1, ConsumptionMeter o2) {
                return o1.getStartDate().compareTo(o2.getStartDate());
            }
        });
        for (ConsumptionMeter consumptionMeter : sortedConsumptionMeterList) {
            String key = consumptionMeter.getSerialNumber();
            if (!organizedData.containsKey(key)) {
                organizedData.put(key, new ArrayList<>());
            }
            organizedData.get(key).add(consumptionMeter);
        }
        return organizedData;
    }

    /**
     * Looking for gaps between the measures
     *
     * @return a list of the consumption meter's serial numbers where there was a gap between two measurements
     */
    public List<String> findGap() {
        List<String> result = new ArrayList<>();
        Map<String, List<ConsumptionMeter>> filteredData = organizer();
        for (Map.Entry<String, List<ConsumptionMeter>> entry : filteredData.entrySet()) {
            for (int i = 1; i < entry.getValue().size(); i++) {
                if (entry.getValue().get(i).getStartDate().isAfter(entry.getValue().get(i - 1).getEndDate())) {
                    result.add(entry.getKey());
                    break;
                }
            }
        }
        return result;
    }

}
