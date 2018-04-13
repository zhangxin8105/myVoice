// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package dev.gwj.myvoice.bean;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class Perseon_Factory implements Factory<Perseon> {
  private final Provider<Food> foodProvider;

  public Perseon_Factory(Provider<Food> foodProvider) {
    assert foodProvider != null;
    this.foodProvider = foodProvider;
  }

  @Override
  public Perseon get() {
    return new Perseon(foodProvider.get());
  }

  public static Factory<Perseon> create(Provider<Food> foodProvider) {
    return new Perseon_Factory(foodProvider);
  }
}
