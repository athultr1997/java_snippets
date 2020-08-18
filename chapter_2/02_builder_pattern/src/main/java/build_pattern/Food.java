package build_pattern;

public abstract class Food {
	private final Double fat;
	private final Double sugar;
	private final Double acid;
	private final Double calories;
	private final Boolean preservativesPresent;
	private final Boolean isOrganic;

	abstract static class Builder<T extends Builder<T>> {
		private Double fat;
		private Double sugar;
		private Double acid;
		private Double calories;
		private Boolean preservativesPresent;
		private Boolean isOrganic;

		// public Builder(Double v) {
		// 	this.calories = v;			
		// }

		public T calories(Double v) {
			this.calories = v;
			return self();
		}

		public T fat(Double v) {
			this.fat = v;
			return self();
		}		

		public T sugar(Double v) {
			this.sugar = v;
			return self();
		}

		public Builder acid(Double v) {
			this.acid = v;
			return self();
		}

		public Builder preservativesPresent(Boolean v) {
			this.preservativesPresent = v;
			return self();
		}

		public Builder isOrganic(Boolean v) {
			this.isOrganic = v;
			return self();
		}

		abstract Food build();

		protected abstract T self();
	}

	Food(Builder<?> builder) {
		fat = builder.fat;
		sugar = builder.sugar;
		acid = builder.acid;
		calories = builder.calories;
		preservativesPresent = builder.preservativesPresent;
		isOrganic = builder.isOrganic;
	}

	public Double getCalories() {
		return calories;
	}

	public Double getFat() {
		return fat;
	}

	public Double getAcid() {
		return acid;
	}

	public Double getSugar() {
		return sugar;
	}

	public Boolean arePreservativesPresent() {
		return preservativesPresent;
	}

	public Boolean isOrganic() {
		return isOrganic;
	}
}