import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.chobo.selectimage.R
import com.chobo.selectimage.RepairData

class RepairAdapter(private val repairData: ArrayList<RepairData>): RecyclerView.Adapter<RepairAdapter.ViewHolder>() {
    // (1) 아이템 레이아웃과 결합
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.repair_recycler_list, parent, false)
        return ViewHolder(view)
    }
    // (2) 리스트 내 아이템 개수
    override fun getItemCount(): Int {
        return repairData.size
    }
    // (3) View에 내용 입력
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = repairData[position].name
        holder.price.text = repairData[position].price
        holder.distance.text = repairData[position].distance


    }

    // (4) 레이아웃 내 View 연결
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val distance: TextView = itemView.findViewById(R.id.tv_distance)
        val name: TextView = itemView.findViewById(R.id.tv_name)
        val price: TextView = itemView.findViewById(R.id.tv_price)
    }
}
