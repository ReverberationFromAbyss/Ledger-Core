package com.ledger.core.AmountManagement;

import com.ledger.core.CurrencyManagement.Currency;

import java.math.BigInteger;

public class Amount {
private final Currency   m_currency_;
private final BigInteger m_value_;

// TODO: Assign default currency to AU, amount of currency per Ounce of Au
public Amount(Currency currency, BigInteger value) {
  m_currency_ = currency;
  m_value_    = new BigInteger(value.toString());
}

public Amount(Currency currency, String value) {
  m_currency_ = currency;
  m_value_    = new BigInteger(value);
}

public Amount(Currency currency, Amount value) {
  m_currency_ = currency;
  m_value_    = new BigInteger("0"); // TODO: Adopt convert method.
}
}
