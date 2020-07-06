package build_pattern;

public class Ketchup extends Food {
	public enum Flavours {TOMATOE, CHILLY, MINT};

	private Double price;
	private Flavours flavour;	

	public static class Builder extends Food.Builder<Builder> {
		private Double price;
		private Flavours flavour;

		public Builder(Flavours v) {
			this.flavour = v;
		}

		public Builder price(Double v) {
			this.price = v;
			return this;
		}		

		@Override
		public Ketchup build() {
			return new Ketchup(this);
		}

		@Override
		protected Builder self() {
			return this;
		}
	}

	private Ketchup(Builder builder) {
		super(builder);
		flavour = builder.flavour;
		price = builder.price;
	}	

	public Double getPrice() {
		return price;
	}

	public Flavours getFlavour() {
		return flavour;
	}
}