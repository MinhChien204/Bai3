package learn.fpoly.bai3.Bai8

class QLPM {
    private val danhSachPM = mutableListOf<TheMuon>()

    fun addPM(pm: TheMuon) {
        danhSachPM.add(pm)
    }

    fun removePM(maPhieu: String) {
        val pmToRemove = danhSachPM.find { it.maphieu == maPhieu }
        if (pmToRemove != null) {
            danhSachPM.remove(pmToRemove)
            println("Đã xóa phiếu mượn có mã $maPhieu.")
        } else {
            println("Không tìm thấy phiếu mượn có mã $maPhieu để xóa.")
        }
    }

    fun xemDanhSachPM() {
        if (danhSachPM.isEmpty()) {
            println("Danh sách phiếu mượn hiện đang trống.")
        } else {
            println("Danh sách phiếu mượn:")
            for ((index, pm) in danhSachPM.withIndex()) {
                println("${index + 1}. Mã phiếu: ${pm.maphieu}, Ngày mượn: ${pm.ngaymuon}, Hạn trả: ${pm.hantra}, Số hiệu sách: ${pm.sohieu}, Họ tên: ${pm.sinhvien.hoten}, Tuổi: ${pm.sinhvien.tuoi}, Lớp: ${pm.sinhvien.lop}")
            }
        }
    }
}