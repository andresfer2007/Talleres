

final class funciones$_ {
def args = funciones_sc.args$
def scriptPath = """funciones.sc"""
/*<script>*/
def suma(a:Int, b:Int)=a+b
suma(3,4)
def resta(a:Int,b:Int)=a-b
resta(7,3)
def multiplicar(a:Int,b:Int)=a*b
multiplicar(20,4)
List(1,2,3).map(x=> x*x)

//funciones matematicas

def f(x:Int)=2*x+3
f(2)
def g(x:Int)=x*x
def h(x:Int)=math.sqrt(x)
h(9)
g(f(2))

(1 to 10).sum
(1 to 3).product

def factorial(n:Int): Int = (1 to n).product
factorial(4)
def f1(n:Int)= (1 to n).map(k=>k*k).sum
f1(4)
(1 to 10).filter(k=>k%2==0).map(k=>k*k).sum
def fn1(n:Int):Double=(1 to n).map(i=>i.toDouble/(i+1)).sum

/*</script>*/ /*<generated>*//*</generated>*/
}

object funciones_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new funciones$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export funciones_sc.script as `funciones`

