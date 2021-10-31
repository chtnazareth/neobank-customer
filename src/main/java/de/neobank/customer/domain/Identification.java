package de.neobank.customer.domain;

import de.neobank.customer.domain.types.DocumentType;
import lombok.Value;

import java.time.LocalDate;


@Value
public class Identification {
  DocumentType documentType;
  String number;
  LocalDate issueDate;
  LocalDate expirationDate;
}
