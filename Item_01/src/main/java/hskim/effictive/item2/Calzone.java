package hskim.effictive.item2;

public class Calzone extends Pizza {

    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false; // 기본값을 builder에 설정

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }
        @Override
        Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Calzone.Builder self() {
            return this;
        }
    }

    private Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }
}
