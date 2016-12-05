package com.hiklas.mucking.around

import org.scalatest.{BeforeAndAfter, FunSuite}

/**
  */
class CheckoutSuite extends FunSuite with BeforeAndAfter {

  var checkoutInstance:Checkout = null

  before {
    checkoutInstance = new Checkout
  }

  test("Make sure that the instance is not null") {
    assert(checkoutInstance!=null)
  }


}
