package com.example.demo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.example.demo.order.Order;
import com.example.demo.order.OrderBo;
import com.example.demo.order.OrderNotFoundException;
import com.example.demo.order.OrderSaveException;
import com.example.demo.order.OrderUpdateException;

public class TestCheckedException {

  OrderBo orderBo;
  Order data;

  @BeforeTest
  void setup() {
	orderBo = new OrderBo();

	data = new Order();
	data.setId(1);
	data.setCreatedBy("mkyong");
  }

  @Test(expectedExceptions = OrderSaveException.class)
  public void throwIfOrderIsNull() throws OrderSaveException {
	orderBo.save(null);
  }

  /*
   * Example : Multiple expected exceptions
   * Test is success if either of the exception is thrown
   */
  @Test(expectedExceptions = { OrderUpdateException.class, OrderNotFoundException.class })
  public void throwIfOrderIsNotExists() throws OrderUpdateException, OrderNotFoundException {
	orderBo.update(data);
  }
	
}


