package com.pa.tdd;


public class Matherator implements Adder, Subtractor {

  @Override
  public long add(long... operands) {
    long ret = 0;
    for (long operand : operands) {
      ret += operand;
    }
    return ret;
  }

  @Override
  public long subtract(long... operands) {
    long ret = operands[0];
    for (int aa = 1; aa < operands.length; aa++) {
      ret -= operands[aa];
    }
    return ret;
  }

 
}
