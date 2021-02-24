package com.sujeet.microservices.currencyexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  CurrencyExchangeRepository  extends JpaRepository<CurrencyExchange,Long> {

   CurrencyExchange findByFromAndTo(String from, String to);

}
