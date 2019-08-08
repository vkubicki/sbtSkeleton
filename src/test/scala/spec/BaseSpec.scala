package spec

import org.scalactic._
import org.scalatest._

import base.Base

class BaseSpec extends FlatSpec with Matchers {
  "add" should "add two integers and return their sum" in {
    Base.add(2, 2) should ===(4)
  }
}
