package com.example

import scala.annotation.tailrec

object Fibonacci {
  def fib(n: Int): Int = {
    @tailrec
    def go(x: Int, a: Int, b: Int): Int = {
      if (x == n) a + b else go(x + 1, a + b, a)
    }
    n match {
      case 1 => 0
      case 2 => 1
      case _ => go(3, 1, 0)
    }
  }
}
