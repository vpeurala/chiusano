import com.example.Fibonacci.fib
import org.scalatest._

class FibonacciSpec extends FlatSpec with Matchers {
  "Fibonacci numbers" should
    "work in basic case" in {
    fib(1) should ===(0)
    fib(2) should ===(1)
    fib(3) should ===(1)
    fib(4) should ===(2)
    fib(5) should ===(3)
    fib(6) should ===(5)
    fib(7) should ===(8)
    fib(8) should ===(13)
  }
}
