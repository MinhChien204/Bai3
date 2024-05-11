package learn.fpoly.bai3.Bai8

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val ql = QLPM()
    var check: Int

    do {
        println("----Quản lí phiếu mượn----")
        println("1.Thêm phiếu mượn")
        println("2.Xóa phiếu mượn")
        println("3.Xem thông tin phiếu mượn")
        println("4.Thoát")
        println("Nhập lựa chọn: ")

        try {
            check = readLine()?.toInt() ?: -1
        } catch (e: NumberFormatException) {
            check = -1
        }

        when (check) {
            1 -> {
                println("Nhập thông tin phiếu mượn mới:")
                print("Mã phiếu: ")
                val maPhieu = readLine() ?: ""
                print("Ngày mượn: ")
                val ngayMuon = readLine()?.toIntOrNull()?:0
                print("Hạn trả: ")
                val hanTra = readLine()?.toIntOrNull() ?: 0
                print("Số hiệu sách: ")
                val soHieuSach = readLine()?.toIntOrNull() ?: 0
                print("Họ tên: ")
                val hoTen = readLine() ?: ""
                print("Tuổi: ")
                val tuoi = readLine()?.toIntOrNull() ?: 0
                print("Lớp: ")
                val lop = readLine() ?: ""

                val sv = SinhVien(hoTen, tuoi, lop)
                val pm = TheMuon(maPhieu, ngayMuon, hanTra, soHieuSach, sv)

                ql.addPM(pm)
            }
            2 -> {
                print("Nhập mã phiếu mượn cần xóa: ")
                val maPhieuXoa = readLine() ?: ""
                ql.removePM(maPhieuXoa)
            }
            3 -> {
                ql.xemDanhSachPM()
            }
            4 -> {
                println("Chương trình đã thoát.")
            }
            else -> {
                println("Lựa chọn không hợp lệ. Vui lòng chọn lại.")
            }
        }
    } while (check != 4)
}

