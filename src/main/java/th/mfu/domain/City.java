package th.mfu.domain;

public enum City {
    CHIANG_RAI("Chiang Rai"),
    CHIANG_MAI("Chiang Mai"),
    BANGKOK("Bangkok"),
    PHUKET("Phuket"),
    SALAYA("Salaya"),
    PATTAYA("Pattaya"),
    HAT_YAI("Hat Yai");

    private final String city;

    City(String locationName) {
        this.city = locationName;
    }

    public String getCity() {
        return city;
    }
}
