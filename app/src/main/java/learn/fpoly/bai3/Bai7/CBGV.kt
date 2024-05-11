package learn.fpoly.bai3.Bai7

class CBGV(
    val luongCung: Double,
    val luongThuong: Double,
    val tienPhat: Double,
    val nguoi: Nguoi
) {
    // Yêu cầu 4: Tính lương thực lĩnh cho giáo viên.
    fun tinhLuongThucLinh(): Double {
        return luongCung + luongThuong - tienPhat
    }
}
