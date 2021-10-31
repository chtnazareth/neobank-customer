package de.neobank.customer.domain;

import de.neobank.customer.domain.support.Phone;
import lombok.Value;

import java.util.List;

@Value
public class ContactData {
  String email;
  List<Phone> phones;
}
