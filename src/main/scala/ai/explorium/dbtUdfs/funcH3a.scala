package ai.explorium.dbtUdfs

import org.apache.hadoop.hive.ql.exec.UDF
import com.uber.h3core.H3Core

class funcH3a extends UDF {
  def evaluate(lat: Double, lon: Double, res: Int): String = {
    H3Core.newInstance().geoToH3Address(lat, lon, res)
  }
}
