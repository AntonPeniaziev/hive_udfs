package ai.explorium.dbtUdfs

/**
 * @author ${user.name}
 */
import org.apache.hadoop.hive.ql.exec.UDF
import com.uber.h3core.H3Core

object App {

  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  def f1(lat: Double, lon: Double, res: Int) = {
    val h3Core = H3Core.newInstance()
    h3Core.geoToH3Address(lat, lon, res)
  }
  def main(args : Array[String]) {

    val h3test =  f1(43.3, 38, 10)
    println( s"Hello $h3test" )
    println("concat arguments = " + foo(args))
  }

}
