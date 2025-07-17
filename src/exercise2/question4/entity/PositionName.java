package exercise2.question4.entity;

public enum PositionName {
	DEV("Dev"), TEST("Test"), SCRUM_MASTER("Scrum Master"), PM("PM");

	private String value;

	PositionName(String value) {
		this.value = value;
	}

	// lấy giá trị theo enum
	public String getValue() {
		return value;
	}

	// Hàm lấy enum theo value
	public static PositionName fromValue(String value) {
		for (PositionName positionName : PositionName.values()) {
			if (positionName.getValue().equals(value)) {
				return positionName;
			}
		}
		return null;
	}

	
}
