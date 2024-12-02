package com.ledger.core.LedgerManagement;

import com.ledger.core.AmountManagement.Amount;
import com.ledger.core.AssetManagement.Asset;

public class Ledger {

private final Asset  m_income_;
private final Asset  m_expenses_;
private final Amount m_amount_;


public Ledger(Asset income, Asset expenses, Amount amount) {
  m_income_   = income;
  m_expenses_ = expenses;
  m_amount_   = amount;

}
}
