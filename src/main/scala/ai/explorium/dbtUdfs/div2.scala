package ai.explorium.dbtUdfs
import com.uber.h3core.H3Core
import org.apache.hadoop.hive.ql.exec.UDF

class div2  extends UDF {
  def evaluate(lat: Double):String = {
//    val h3Core = H3Core.newInstance()
//    h3Core.geoToH3Address(lat, 38, 10)
    lat.toString
  }
}
