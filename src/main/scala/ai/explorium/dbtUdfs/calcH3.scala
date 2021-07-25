package ai.explorium.dbtUdfs

import org.apache.hadoop.hive.ql.exec.UDF
import com.uber.h3core.H3Core

object H3_OBJ extends Serializable {
  val instance = H3Core.newInstance()
}

class calcH3 extends UDF  {
  def evaluate(lat: Double, lon: Double, res: Int): Long = {
    H3_OBJ.instance.geoToH3(lat, lon, res)
  }
}
