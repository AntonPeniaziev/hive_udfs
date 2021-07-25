package ai.explorium.dbtUdfs

import com.uber.h3core.H3Core
import org.apache.hadoop.hive.ql.exec.UDF

class func2 extends UDF with Serializable {
  def evaluate(lat: Double, lon: Double, res: Int): String = {
    H3Core.newInstance().geoToH3Address(lat, lon, res)
  }
}
