package com.ledger.core.CurrencyManagement;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Currency {

public static final List<Currency> s_Currencies_       = new ArrayList<>();
public static final Currency       s_StandardCurrency_ = new Currency("AU", 0,
                                                                      "1");

// Code Defined by ISO-4127:2015
private final String     m_code_;
// ID Defined by ISO-4127:2015
private final Integer    m_id_;
// Exchange rate to Au
private final BigDecimal m_exchangeRate_;
// Display name in the local
private final String     m_displayName_      = "";
// currency symbol
private final String     m_symbol_           = "";
// symbol appear position
private final Boolean    m_symbolAppearLeft_ = false;

private Currency(String code, Integer id, BigDecimal exchangeRate) {
  m_code_         = code;
  m_id_           = id;
  m_exchangeRate_ = exchangeRate;
}

private Currency(String code, Integer id, String exchangeRate) {
  m_code_ = code;
  m_id_   = id;
  BigDecimal exchangeRateInstance = new BigDecimal("1");
  try {
    exchangeRateInstance = new BigDecimal(exchangeRate);
  } catch (NumberFormatException e) {
    // TODO: Logger
  } finally {
    m_exchangeRate_ = exchangeRateInstance;
  }
}

public static Currency GetInstance(String code) {
  return null;
}

@Override
public String toString() {
  return m_code_ + " " + m_id_;
}
}
