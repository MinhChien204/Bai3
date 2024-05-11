package learn.fpoly.bai3.Bai7

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val quanLy = QuanLyCBGV()

    var luaChon: Int
    do {
        println("----- MENU -----")
        println("1. Thêm giáo viên")
        println("2. Xóa giáo viên")
        println("3. Tính lương")
        println("4. Xem danh sách giáo viên")
        println("5. Thoát")
        print("Chọn chức năng (1-5): ")
        luaChon = scanner.nextInt()

        when (luaChon) {
            1 -> themGiaoVien(scanner, quanLy)
            2 -> xoaGiaoVien(scanner, quanLy)
            3 -> tinhLuong(scanner, quanLy)
            4 -> quanLy.xemDanhSachGiaoVien()
            5 -> println("Đã thoát chương trình.")
            else -> println("Vui lòng chọn từ 1 đến 4.")
        }
    } while (luaChon != 5)
}

fun themGiaoVien(scanner: Scanner, quanLy: QuanLyCBGV) {
    println("----- THÊM GIÁO VIÊN -----")
    print("Nhập họ tên giáo viên: ")
    val hoTen = readLine() ?: ""
    print("Nhập tuổi: ")
    val tuoi = scanner.nextInt()
    print("Nhập quê quán: ")
    val queQuan = readLine() ?: ""
    print("Nhập mã số giáo viên: ")
    val maSoGV = readLine() ?: ""
    print("Nhập lương cứng: ")
    val luongCung = scanner.nextDouble()
    print("Nhập lương thưởng: ")
    val luongThuong = scanner.nextDouble()
    print("Nhập tiền phạt: ")
    val tienPhat = scanner.nextDouble()

    val nguoi = Nguoi(hoTen, tuoi, queQuan, maSoGV)
    val cbgv = CBGV(luongCung, luongThuong, tienPhat, nguoi)
    quanLy.themCBGV(cbgv)

    println("Thêm giáo viên thành công.")
}

fun xoaGiaoVien(scanner: Scanner, quanLy: QuanLyCBGV) {
    println("----- XÓA GIÁO VIÊN -----")
    print("Nhập mã số giáo viên cần xóa: ")
    val maSoGVXoa = readLine() ?: ""
    if (quanLy.xoaCBGV(maSoGVXoa)) {
        println("Xóa giáo viên thành công.")
    } else {
        println("Không tìm thấy giáo viên có mã số $maSoGVXoa.")
    }
}

fun tinhLuong(scanner: Scanner, quanLy: QuanLyCBGV) {
    println("----- TÍNH LƯƠNG -----")
    print("Nhập mã số giáo viên cần tính lương: ")
    val maSoGVTinhLuong = readLine() ?: ""
    val luong = quanLy.tinhLuong(maSoGVTinhLuong)
    if (luong != null) {
        println("Lương của giáo viên có mã $maSoGVTinhLuong là: $luong")
    } else {
        println("Không tìm thấy giáo viên có mã số $maSoGVTinhLuong.")
    }
}




