package com.promineotech.jeep.service;

import java.util.List;
import com.promineotech.jeep.entity.Color;
import com.promineotech.jeep.entity.Customer;
import com.promineotech.jeep.entity.Engine;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.Option;
import com.promineotech.jeep.entity.Order;
import com.promineotech.jeep.entity.OrderRequest;
import com.promineotech.jeep.entity.Tire;

public interface JeepOrderService {
  List<Option> getOption(OrderRequest orderRequest);
  Tire getTire(OrderRequest orderRequest);
  Engine getEngine(OrderRequest orderRequest);
  Color getColor(OrderRequest orderRequest);
  Jeep getModel(OrderRequest orderRequest);
  Order createOrder(OrderRequest orderRequest);
  Customer getCustomer(OrderRequest orderRequest);
}
