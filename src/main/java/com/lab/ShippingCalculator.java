package com.lab;

/**
 * Tinh phi van chuyen theo khoi luong va loai dich vu.
 */
public class ShippingCalculator {

  /**
   * Tinh phi van chuyen.
   *
   * @param weight khoi luong goi hang, phai lon hon 0
   * @param type loai dich vu: STANDARD hoac EXPRESS
   * @return phi van chuyen
   */
  public double calculate(double weight, String type) {
    if (weight <= 0) {
      throw new IllegalArgumentException("Weight must be positive");
    }
    if (type.equals("EXPRESS")) {
      return weight * 5000 + 20000;
    }
    if (type.equals("STANDARD")) {
      return weight * 3000;
    }
    throw new IllegalArgumentException("Unknown type: " + type);
  }
}
