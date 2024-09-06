<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page with Spider Web Background</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <link rel="stylesheet" href="base.css">
    <link rel="stylesheet" href="main.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="/font/fontawesome-free-6.5.2/css/all.css">
</head>
<body>
    <canvas id="canvas"></canvas>
 <div class="modal">
       

        <div class="modal__body">
            <div class="modal_liner">
                
               <div class="auth-from"> 
                <form action="dangky" method="get">
                    <div class="auth-from-header">
                        <h3 class="auth-from-heading">Đăng ký </h3>
                        <span class="auth-from__width-btn"> <a href="dangnhap.html">Đăng nhập</a></span>
                    </div>
                    <div class="auth-from__from">
                        <div class="auth-from__group">
                            <input type="text" class="auth-from__input" name="email" placeholder="Nhập email">
                        </div>
                         <div class="auth-from__group">
                            <input type="text" class="auth-from__input" name="hoten" placeholder="Nhập tên tài khoản">
                        </div>
                        <div class="auth-from__group">
                            <input type="password" class="auth-from__input" name="pass" placeholder="Nhập mật khẩu">
                        </div>
                        <div class="auth-from__group">
                            <input type="password" class="auth-from__input" name="againpass" placeholder="Nhập lại mật khẩu">
                        </div>

                    </div>
                    <div class="auth-from__text">
                        <p for="" class="auth-form__textone">
                            Bằng việc đăng ký, bạn đã đồng ý với chúng tôi về
                           <a href="" class="auth-form__link">Điều khoản dịch vụ </a>  &
                           <a href="" class="auth-form__link">Chính sách bảo mật </a>
                        </p>

                    </div>
                    <div class="auth-from-controls">
                        <button class="btn"> TRỞ LẠI </button>  
                        <input type="submit" value="ĐĂNG KÝ " class="btn btn--primary"> 
    
                    </div>
                    <div class="auth-from-socials">
                        <a href="" class="btn btn--with-facebook">
                            <i class="header-navbar-icons fa-brands fa-square-facebook"></i>
                           <label class="btn--with-mxh-text" > Kết nối với Facebook</label>

                        </a>
                        <a href="" class="btn btn--with-gg">
                            <i class="header-navbar-icons fa-brands fa-google header-navbar-icons"></i>
                      
                            <label class="btn--with-mxh-text" > Kết nối với Google</label>

                        </a>



                    </div>
                </form>

                </div> 

             
            
              
              
            </div>  

             </div>

        </div>

    </div>
    <script src="dangky.js"></script>
</body>
</html>
