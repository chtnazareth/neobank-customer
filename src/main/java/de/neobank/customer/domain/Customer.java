package de.neobank.customer.domain;

import de.neobank.customer.domain.support.Name;
import lombok.Value;

import java.time.LocalDate;

@Value
public class Customer {
  Identification identification;
  Name name;
  ContactData contactData;
  LocalDate birthdate;
}
