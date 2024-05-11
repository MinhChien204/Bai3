package learn.fpoly.bai3.Bai7

class QuanLyCBGV {
    val danhSachCBGV = mutableListOf<CBGV>()

    fun themCBGV(cbgv: CBGV) {
        danhSachCBGV.add(cbgv)
    }

    fun xoaCBGV(maSoGV: String): Boolean {
        val iterator = danhSachCBGV.iterator()
        while (iterator.hasNext()) {
            if (iterator.next().nguoi.maSoGV == maSoGV) {
                iterator.remove()
                return true
            }
        }
        return false
    }

    fun tinhLuong(maSoGV: String): Double? {
        for (cbgv in danhSachCBGV) {
            if (cbgv.nguoi.maSoGV == maSoGV) {
                return cbgv.tinhLuongThucLinh()
            }
        }
        return null
    }
    fun xemDanhSachGiaoVien() {
        println("----- DANH SÁCH GIÁO VIÊN -----")
        for ((index, cbgv) in danhSachCBGV.withIndex()) {
            println("STT: ${index + 1}")
            println("Tên GV: ${cbgv.nguoi.hoTen}")
            println("Tuổi: ${cbgv.nguoi.tuoi}")
            println("Quê quán: ${cbgv.nguoi.queQuan}")
            println("Mã số giáo viên: ${cbgv.nguoi.maSoGV}")
            println("Lương cứng: ${cbgv.luongCung}")
            println("Lương thưởng: ${cbgv.luongThuong}")
            println("Tiền phạt: ${cbgv.tienPhat}")
            println()
        }
    }

}