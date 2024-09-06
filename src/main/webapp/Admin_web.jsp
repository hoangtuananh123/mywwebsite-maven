<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin page</title>
    <link rel="stylesheet" href="Adminpage.css">
    <!-- <link rel="stylesheet" href="/css/base.css"> -->
</head>
<body>
    <div class="grid">
        <div class="banner">
            <h1 class="title_adminpage">
                Admin Website sellPhone
            </h1>
    
    
        </div>
        <div class="container">
            <ul class="menu">
                <li class="menu-list"> Trang đích
                    <ul class="menu-list_item">
                        <li class="item item_link_page" onclick="suathongtin()">Sửa thông tin</li>
                    </ul>
                </li>
              
                <li class="menu-list" style="cursor: pointer;" onclick="editdanhmuc()" >Danh mục 
                </li>
             
    
                <li class="menu-list"> Sản phẩm
                    <ul class="menu-list_item">
                        <li class="item item_link_page" onclick="addsp()"  >Thêm Sản phẩm</li>
                        <li class="item item_link_page" onclick="editsp()" >Sửa Sản phẩm</li>
                        <li class="item item_link_page" onclick="deletesp()" >Xoá Sản phẩm</li>
                    </ul>

                </li>
                <li class="menu-list"> Phân tích</li>
               

            </ul>
                <div class="diagram">
                  <!-- phan gioi thieu sp -->
                     <div class="add_landingpage suathongtin">
                       <form action="">
                        <div class="landing-list">
                            <span class="name-item"> Tên sản phẩm</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Giá</span>
                            <input type="text" class="inp-item">
                        </div>
                       
                        <div class="landing-list">
                            <span class="name-item"> Thiết kế</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Chất liệu</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Kích thước</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> khối lượng</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Thời gian ra mắt</span>
                            <input type="date" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Số Camera</span>
                            <input type="number" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Số Sim</span>
                            <input type="number" class="inp-item">
                        </div>
                          <div class="landing-list">
                            <span class="name-item"> Dung lượng pin</span>
                            <input type="number" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Kích thước MH</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Chip</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Chân sạc</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Hỗ trợ sạc</span>
                            <input type="text" class="inp-item">
                        </div>
                          <div class="landing-list">
                            <span class="name-item"> Ảnh 01</span>
                            <input type="file" class="inp-item">
                        </div>
                         <div class="landing-list">
                            <span class="name-item"> Ảnh 01</span>
                            <input type="file" class="inp-item">
                        </div>
                         <div class="landing-list">
                            <span class="name-item"> Ảnh 02</span>
                            <input type="file" class="inp-item">
                        </div>
                         <div class="landing-list">
                            <span class="name-item"> Ảnh 03</span>
                            <input type="file" class="inp-item">
                        </div>
                         <div class="landing-list">
                            <span class="name-item">Banner 01</span>
                            <input type="file" class="inp-item">
                        </div>
                         <div class="landing-list">
                            <span class="name-item"> Banner 02</span>
                            <input type="file" class="inp-item">
                        </div>
                         <div class="landing-list">
                            <span class="name-item"> Banner 03</span>
                            <input type="file" class="inp-item">
                        </div>
                         <div class="landing-list">
                            <span class="name-item"> Banner 04</span>
                            <input type="file" class="inp-item">
                        </div>
                        
                          
                        <div class="landing-list">
                            <span class="name-item"> Giảm giá</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Hãng SX</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item">Thời gian kết thúc</span>
                            <input type="file" class="inp-item inp-file">
                        </div>
                          <div class="landing-list">
                            <span class="name-item">Bộ nhớ</span>
                            <input type="number" class="inp-item inp-file">
                        </div>
                         <div class="landing-list">
                            <span class="name-item">Ram</span>
                            <input type="number" class="inp-item inp-file">
                        </div>
                         <div class="landing-list">
                            <span class="name-item">Bảo hành</span>
                            <input type="text" class="inp-item inp-file">
                        </div>
                         <div class="landing-list">
                            <span class="name-item">Độ phân giải</span>
                            <input type="number" class="inp-item inp-file">
                        </div>
                         <div class="landing-list">
                            <span class="name-item">Số lượng</span>
                            <input type="number" class="inp-item inp-file">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Thuộc danh mục</span>
                           <select name="" id="" class="category_list">
                            <option value="">Iphone</option>
                            <option value="">Samsung</option>

                           </select>
                          
                        </div>
                        <input type="submit" value="Xác nhận thêm" class="add_landing_btn">
                       </form> 
                       
                     <div class="danhsachssp">
                          <H3>Danh Danh sách sản phẩm</H3>
                            <table border="1" class="produc-list-items">
    <tr>
       
        <th>Tên sản phẩm</th>
        <th>Giá bán</th>
        <th>Thiết kế</th>
        <th>Chất liệu</th>
        <th>Kích thước</th>
        <th>Khối lượng</th>
        <th>Thời gian ra mắt</th>
        
        <th>Dung lượng pin</th>
        <th>Kích thước màn hình</th>
        <th>Chip</th>
        <th>Chân sạc</th>
        <th>Hỗ trợ sạc</th>
        <th>Giảm giá (%)</th>
        <th>Hãng sản xuất</th>
        <th>Thời gian kết thúc</th>
        <th>ID danh mục</th>
        <th>Bộ nhớ</th>
        <th>RAM</th>
        <th>Bảo hành</th>
        <th>Độ phân giải Camera</th>
        <th>Số lượng</th>
    </tr>
    <tr>
 
        <td>Điện thoại A</td>
        <td>10,000,000 VND</td>
        <td>Hiện đại</td>
        <td>Kim loại</td>
        <td>150 x 70 x 7 mm</td>
        <td>170 g</td>
        <td>01/2024</td>
       
        <td>4000 mAh</td>
        <td>6.5 inch</td>
        <td>Snapdragon 888</td>
        <td>USB-C</td>
        <td>Sạc nhanh 25W</td>
        <td>10%</td>
        <td>Samsung</td>
        <td>12/2024</td>
        <td>SP001</td>
        <td>128 GB</td>
        <td>8 GB</td>
        <td>12 tháng</td>
        <td>108 MP</td>
        <td>50</td>
    </tr>
  
</table>

                        </div>
                       
                       
                       
                       
                       
                       
                    </div> 

                    <img src="" alt="">
                 <!-- phan danh muc  -->
                    <div class="item_category editdanhmuc">
					    <form action="danhmuc_new" method="post" class="danhmuc">
					        <div>
					            <div class="landing-list">
					                <span class="name-item">ID danh mục</span>
					                <input type="text" name="id" id="id" class="inp-item" placeholder="Bỏ qua nếu trường này nếu bạn sửa thông tin ">
					            </div>
					            <div class="landing-list">
					                <span class="name-item">Tên Danh mục</span>
					                <input type="text" name="ten" id="ten" class="inp-item">
					            </div>
					            <div class="landing-list">
					                <span class="name-item">Xuất xứ</span>
					                <input type="text" name="xx" id="xx" class="inp-item">
					            </div>
					        </div>
					        <div class="btn_category">
					            <input type="submit" value="Lưu danh mục" class="btn_category_item">
					        </div>
					    </form>
					
					<div class="container-categorys-item">
					    <table border="1px" class="list_category-item">
					        <tr>
					            <th>STT</th>
					            <th>ID danh mục</th>
					            <th>Tên danh mục</th>
					            <th>Xuất xứ</th>
					            <th>Hành động</th>
					        </tr>
					        <c:forEach items="${applicationScope.danhmuc}" var="dm" varStatus="status">
					            <tr onclick="editDanhMuc('${dm.iddanhmuc}', '${dm.tendanhmuc}', '${dm.mota}')">
					                <td>${status.index + 1}</td>
					                <td>${dm.iddanhmuc}</td>
					                <td>${dm.tendanhmuc}</td>
					                <td>${dm.mota}</td>
					                <td>
					                    <a href="DMdelete?id=${dm.iddanhmuc}">Delete</a>
					                </td>
					            </tr>
					        </c:forEach>
					    </table>
					</div>
					
					<script>
					function editDanhMuc(id, ten, xuatxu) {
					    document.getElementById('id').value = id;
					    document.getElementById('ten').value = ten;
					    document.getElementById('xx').value = xuatxu;
					}
					</script>

                          

                        </div>



                    </div> 
                 <!-- phan them sp -->
                   <div class="add_product addsp">
                        <form action="" class="product-form">
                        <div class="container-item">
                            <div class="landing-list">
                                <span class="name-item"> Tên sản phẩm</span>
                                <input type="text" class="inp-item">
                            </div>
                            <div class="landing-list">
                                <span class="name-item"> Giá</span>
                                <input type="text" class="inp-item">
                            </div>
                            <div class="landing-list">
                                <span class="name-item"> Màu </span>
                                <input type="text" class="inp-item">
                            </div>
                            <div class="landing-list">
                                <span class="name-item"> Thiết kế</span>
                                <input type="text" class="inp-item">
                            </div>
                            <div class="landing-list">
                                <span class="name-item"> Chất liệu</span>
                                <input type="text" class="inp-item">
                            </div>
                            <div class="landing-list">
                                <span class="name-item"> Kích thước</span>
                                <input type="text" class="inp-item">
                            </div>
                      
                        </div>
                        <div class="container-item">
                         
                            <div class="landing-list">
                                <span class="name-item"> khối lượng</span>
                                <input type="text" class="inp-item">
                            </div>
                            <div class="landing-list">
                                <span class="name-item"> Thời gian ra mắt</span>
                                <input type="date" class="inp-item">
                            </div>
                            <div class="landing-list">
                                <span class="name-item"> Số Camera</span>
                                <input type="text" class="inp-item">
                            </div>
                            <div class="landing-list">
                                <span class="name-item"> Số Sim</span>
                                <input type="number" class="inp-item">
                            </div>
                            <div class="landing-list">
                                <span class="name-item"> Kích thước MH</span>
                                <input type="text" class="inp-item">
                            </div>
                            <div class="landing-list">
                                <span class="name-item"> Chip</span>
                                <input type="text" class="inp-item">
                            </div>

                        </div>
                        <div class="container-item">
                          
                           
                            <div class="landing-list">
                                <span class="name-item"> Chân sạc</span>
                                <input type="text" class="inp-item">
                            </div>
                            <div class="landing-list">
                                <span class="name-item"> Hỗ trợ sạc</span>
                                <input type="text" class="inp-item">
                            </div>
                            <div class="landing-list">
                                <span class="name-item"> Số lượng</span>
                                <input type="text" class="inp-item">
                            </div>
                            <div class="landing-list">
                                <span class="name-item"> Dung lượng pin</span>
                                <input type="text" class="inp-item">
                            </div>
                            <div class="landing-list">
                                <span class="name-item"> Thuộc danh mục</span>
                            <select name="" id="" class="category_list">
                                <option value="">Iphone</option>
                                <option value="">Samsung</option>

                            </select>
                            </div>
                            <div>
                                <input type="submit" value="Xác nhận thêm" class="add_landing_btn">
                            </div>
                      </div>
                        
                        
                        </form> 
                        <div class="danhsachssp">
                          <H3>Danh Danh sách sản phẩm</H3>
                            <table border="1" class="produc-list-items">
                                <tr>
                                    <th>STT</th>
                                    <th>Tên sản phẩm</th>
                                    <th>Giá bán</th>
                                    <th>Thiết kế</th>
                                    <th>Chất liệu</th>
                                    <th>Kích thước</th>
                                    <th>Khối lượng</th>
                                    <th>Thời gian ra mắt</th>
                                    <th>Số Camera</th>
                                    <th>Số sim</th>
                                    <th>Dung lượng pin</th>
                                    <th>Kích thước màn hình</th>
                                    <th>Chip</th>
                                    <th>Chân sạc</th>
                                    <th>Hỗ trợ sạc</th>
                                    <th>Số lượng</th>
                                </tr>
                                <tr>
                                    <td>1</td>
                                    <td>Điện thoại A</td>
                                    <td>10,000,000 VND</td>
                                    <td>Hiện đại</td>
                                    <td>Kim loại</td>
                                    <td>150 x 70 x 7 mm</td>
                                    <td>170 g</td>
                                    <td>01/2024</td>
                                    <td>3</td>
                                    <td>2</td>
                                    <td>4000 mAh</td>
                                    <td>6.5 inch</td>
                                    <td>Snapdragon 888</td>
                                    <td>USB-C</td>
                                    <td>Sạc nhanh 25W</td>
                                    <td>100</td>
                                </tr>
                                <tr>
                                    <td>2</td>
                                    <td>Điện thoại B</td>
                                    <td>8,000,000 VND</td>
                                    <td>Thanh lịch</td>
                                    <td>Kính</td>
                                    <td>145 x 68 x 8 mm</td>
                                    <td>160 g</td>
                                    <td>12/2023</td>
                                    <td>2</td>
                                    <td>2</td>
                                    <td>3500 mAh</td>
                                    <td>6.1 inch</td>
                                    <td>Exynos 2100</td>
                                    <td>Micro-USB</td>
                                    <td>Sạc nhanh 18W</td>
                                    <td>200</td>
                                </tr>
                            </table>
                        </div>

                     </div> 
                <!-- phan sua sp  -->
                      <div class="add_product editsp">
                    <form action="" class="product-form">
                    <div class="container-item">
                        <div class="landing-list">
                            <span class="name-item"> Tên sản phẩm</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Giá</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Màu </span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Thiết kế</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Chất liệu</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Kích thước</span>
                            <input type="text" class="inp-item">
                        </div>
                  
                    </div>
                    <div class="container-item">
                     
                        <div class="landing-list">
                            <span class="name-item"> khối lượng</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Thời gian ra mắt</span>
                            <input type="date" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Số Camera</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Số Sim</span>
                            <input type="number" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Kích thước MH</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Chip</span>
                            <input type="text" class="inp-item">
                        </div>

                    </div>
                    <div class="container-item">
                      
                       
                        <div class="landing-list">
                            <span class="name-item"> Chân sạc</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Hỗ trợ sạc</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Số lượng</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Dung lượng pin</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Thuộc danh mục</span>
                        <select name="" id="" class="category_list">
                            <option value="">Iphone</option>
                            <option value="">Samsung</option>

                        </select>
                        </div>
                        <div>
                            <input type="submit" value="Xác nhận sửa" class="add_landing_btn">
                        </div>
                  </div>
                    
                    
                    </form> 
                    <div class="danhsachssp">
                      <H3>Danh Danh sách sản phẩm</H3>
                        <table border="1" class="produc-list-items">
                            <tr>
                                <th>STT</th>
                                <th>Tên sản phẩm</th>
                                <th>Giá bán</th>
                                <th>Thiết kế</th>
                                <th>Chất liệu</th>
                                <th>Kích thước</th>
                                <th>Khối lượng</th>
                                <th>Thời gian ra mắt</th>
                                <th>Số Camera</th>
                                <th>Số sim</th>
                                <th>Dung lượng pin</th>
                                <th>Kích thước màn hình</th>
                                <th>Chip</th>
                                <th>Chân sạc</th>
                                <th>Hỗ trợ sạc</th>
                                <th>Số lượng</th>
                            </tr>
                            <tr>
                                <td>1</td>
                                <td>Điện thoại A</td>
                                <td>10,000,000 VND</td>
                                <td>Hiện đại</td>
                                <td>Kim loại</td>
                                <td>150 x 70 x 7 mm</td>
                                <td>170 g</td>
                                <td>01/2024</td>
                                <td>3</td>
                                <td>2</td>
                                <td>4000 mAh</td>
                                <td>6.5 inch</td>
                                <td>Snapdragon 888</td>
                                <td>USB-C</td>
                                <td>Sạc nhanh 25W</td>
                                <td>100</td>
                            </tr>
                            <tr>
                                <td>2</td>
                                <td>Điện thoại B</td>
                                <td>8,000,000 VND</td>
                                <td>Thanh lịch</td>
                                <td>Kính</td>
                                <td>145 x 68 x 8 mm</td>
                                <td>160 g</td>
                                <td>12/2023</td>
                                <td>2</td>
                                <td>2</td>
                                <td>3500 mAh</td>
                                <td>6.1 inch</td>
                                <td>Exynos 2100</td>
                                <td>Micro-USB</td>
                                <td>Sạc nhanh 18W</td>
                                <td>200</td>
                            </tr>
                        </table>
                    </div>

                 </div>
                 <!-- phan xoa sp -->
                <div class="add_product deletesp">
                    <form action="" class="product-form">
                    <div class="container-item">
                        <div class="landing-list">
                            <span class="name-item"> Tên sản phẩm</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Giá</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Màu </span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Thiết kế</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Chất liệu</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Kích thước</span>
                            <input type="text" class="inp-item">
                        </div>
                  
                    </div>
                    <div class="container-item">
                     
                        <div class="landing-list">
                            <span class="name-item"> khối lượng</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Thời gian ra mắt</span>
                            <input type="date" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Số Camera</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Số Sim</span>
                            <input type="number" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Kích thước MH</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Chip</span>
                            <input type="text" class="inp-item">
                        </div>

                    </div>
                    <div class="container-item">
                      
                       
                        <div class="landing-list">
                            <span class="name-item"> Chân sạc</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Hỗ trợ sạc</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Số lượng</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Dung lượng pin</span>
                            <input type="text" class="inp-item">
                        </div>
                        <div class="landing-list">
                            <span class="name-item"> Thuộc danh mục</span>
                        <select name="" id="" class="category_list">
                            <option value="">Iphone</option>
                            <option value="">Samsung</option>

                        </select>
                        </div>
                        <div>
                            <input type="submit" value="Xác nhận xoá sản phẩm" class="add_landing_btn">
                        </div>
                  </div>
                  
                   
                    </form> 
                    <div class="danhsachssp">
                      <H3>Danh Danh sách sản phẩm</H3>
                        <table border="1" class="produc-list-items">
                            <tr>
                                <th>STT</th>
                                <th>Tên sản phẩm</th>
                                <th>Giá bán</th>
                                <th>Thiết kế</th>
                                <th>Chất liệu</th>
                                <th>Kích thước</th>
                                <th>Khối lượng</th>
                                <th>Thời gian ra mắt</th>
                                <th>Số Camera</th>
                                <th>Số sim</th>
                                <th>Dung lượng pin</th>
                                <th>Kích thước màn hình</th>
                                <th>Chip</th>
                                <th>Chân sạc</th>
                                <th>Hỗ trợ sạc</th>
                                <th>Số lượng</th>
                            </tr>
                            <tr>
                                <td>1</td>
                                <td>Điện thoại A</td>
                                <td>10,000,000 VND</td>
                                <td>Hiện đại</td>
                                <td>Kim loại</td>
                                <td>150 x 70 x 7 mm</td>
                                <td>170 g</td>
                                <td>01/2024</td>
                                <td>3</td>
                                <td>2</td>
                                <td>4000 mAh</td>
                                <td>6.5 inch</td>
                                <td>Snapdragon 888</td>
                                <td>USB-C</td>
                                <td>Sạc nhanh 25W</td>
                                <td>100</td>
                            </tr>
                            <tr>
                                <td>2</td>
                                <td>Điện thoại B</td>
                                <td>8,000,000 VND</td>
                                <td>Thanh lịch</td>
                                <td>Kính</td>
                                <td>145 x 68 x 8 mm</td>
                                <td>160 g</td>
                                <td>12/2023</td>
                                <td>2</td>
                                <td>2</td>
                                <td>3500 mAh</td>
                                <td>6.1 inch</td>
                                <td>Exynos 2100</td>
                                <td>Micro-USB</td>
                                <td>Sạc nhanh 18W</td>
                                <td>200</td>
                            </tr>
                        </table>
                    </div>

                 </div> 
           
                    </div>

        </div>

    </div>

    <script src="adminpage.js"></script>
</body>
</html>