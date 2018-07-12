<%@ page import="com.model.Hinhanh" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html class="no-js">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Văn Thịnh &mdash; Mai Thanh</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Free HTML5 Template by FREEHTML5.CO"/>
    <meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive"/>
    <meta name="author" content="FREEHTML5.CO"/>


    <meta property="og:title" content=""/>
    <meta property="og:image" content=""/>
    <meta property="og:url" content=""/>
    <meta property="og:site_name" content=""/>
    <meta property="og:description" content=""/>
    <meta name="twitter:title" content=""/>
    <meta name="twitter:image" content=""/>
    <meta name="twitter:url" content=""/>
    <meta name="twitter:card" content=""/>

    <link href='https://fonts.googleapis.com/css?family=Work+Sans:400,300,600,400italic,700' rel='stylesheet'
          type='text/css'>
    <link href="https://fonts.googleapis.com/css?family=Sacramento" rel="stylesheet">

    <!-- Animate.css -->
    <link rel="stylesheet" href="/resources/css/animate.css">
    <!-- Icomoon Icon Fonts-->
    <link rel="stylesheet" href="/resources/css/icomoon.css">
    <!-- Bootstrap  -->
    <link rel="stylesheet" href="/resources/css/bootstrap.css">

    <!-- Magnific Popup -->
    <link rel="stylesheet" href="/resources/css/magnific-popup.css">

    <!-- Owl Carousel  -->
    <link rel="stylesheet" href="/resources/css/owl.carousel.min.css">
    <link rel="stylesheet" href="/resources/css/owl.theme.default.min.css">

    <!-- Theme style  -->
    <link rel="stylesheet" href="/resources/css/style.css">

    <!-- Modernizr JS -->
    <script src="/resources/js/modernizr-2.6.2.min.js"></script>
    <!-- FOR IE9 below -->
    <!--[if lt IE 9]>
    <script src="/resources/js/respond.min.js"></script>
    <![endif]-->
    <%List<Hinhanh> dshinhanh = (List<Hinhanh>) session.getAttribute("dshinhanh");%>

</head>
<body>

<div class="fh5co-loader"></div>

<div id="page">
    <nav class="fh5co-nav" role="navigation">
        <div class="container">
            <div class="row">
                <div class="col-xs-2">
                    <div id="fh5co-logo"><a href="/">vt-mt<strong></strong></a></div>
                </div>
                <div class="col-xs-10 text-right menu-1">
                    <ul>
                        <li class="active"><a href="/">Home</a></li>
                        <li><a href="#memory">Memory</a></li>
                        <li><a href="/Contact">Contact</a></li>
                    </ul>
                </div>
            </div>

        </div>
    </nav>

    <header id="fh5co-header" class="fh5co-cover" role="banner"
            style="background-image:url(/resources/images/IMG20180304134338.jpg); width: 100%"
            data-stellar-background-ratio="0.5">
        <div class="overlay"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-8 col-md-offset-2 text-center">
                    <div class="display-t">
                        <div class="display-tc animate-box" data-animate-effect="fadeIn">
                            <h1>Thinh &amp; Thanh</h1>
                            <h2>Chúng ta đã có</h2>

                            <div class="simply-countdown">
                                <div class="simply-section simply-days-section">
                                    <div><span class="simply-amount" id="years">...</span><span
                                            class="simply-word">year</span>
                                    </div>
                                </div>
                                <div class="simply-section simply-days-section">
                                    <div><span class="simply-amount" id="month">...</span><span
                                            class="simply-word">month</span>
                                    </div>
                                </div>
                                <div class="simply-section simply-days-section">
                                    <div><span class="simply-amount" id="days">...</span><span
                                            class="simply-word">days</span>
                                    </div>
                                </div>
                                <div class="simply-section simply-hours-section">
                                    <div><span class="simply-amount" id="hours">...</span><span
                                            class="simply-word">hours</span>
                                    </div>
                                </div>
                                <div class="simply-section simply-minutes-section">
                                    <div><span class="simply-amount" id="minutes">...</span><span class="simply-word">minutes</span>
                                    </div>
                                </div>
                                <div class="simply-section simply-seconds-section">
                                    <div><span class="simply-amount" id="seconds">...</span><span class="simply-word">seconds</span>
                                    </div>
                                </div>
                            </div>


                            <p><a href="#" class="btn btn-default btn-sm">hạnh phúc</a></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </header>

    <div id="fh5co-couple-story">
        <div class="container">
            <div class="row">
                <div class="col-md-8 col-md-offset-2 text-center fh5co-heading animate-box">
                    <span>Tôi đã tin là duyên số có thật</span>
                    <h2>Our Story</h2>
                    <p>Từ hai người không xa lạ lắm. Tưởng chừng người này sẽ không bao giờ là nửa kia của người kia ấy
                        vậy mà giờ chúng tôi lại bên cạnh nhau
                        một cách đầy bất ngờ trước cái nhìn ngỡ ngàng của mọi người. Trong đó có cả chính chúng tôi.</p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12 col-md-offset-0">
                    <ul class="timeline animate-box">
                        <li class="animate-box">
                            <div class="timeline-badge"
                                 style="background-image:url(/resources/images/1.jpg);"></div>
                            <div class="timeline-panel">
                                <div class="timeline-heading">
                                    <h3 class="timeline-title">Bắt đầu một mối quan hệ</h3>
                                    <span class="date">Ngày 10 tháng 10 năm 2016</span>
                                </div>
                                <div class="timeline-body">
                                    <p>Khi mà biết ai đó đồng ý. Cảm giác lúc đó vui thì khỏi bàn luôn</p>
                                </div>
                            </div>
                        </li>
                        <li class="timeline-inverted animate-box">
                            <div class="timeline-badge"
                                 style="background-image:url(/resources/images/2.jpg);"></div>
                            <div class="timeline-panel">
                                <div class="timeline-heading">
                                    <h3 class="timeline-title">Ngày này chắc không bao giờ quên luôn</h3>
                                    <span class="date">Ngày 30 tháng 7 năm  2017</span>
                                </div>
                                <div class="timeline-body">
                                    <p>Từ sau 30/7/2017 mỗi lần hẹn hò của chúng tôi đều trở nên vui hơn! Haha</p>
                                </div>
                            </div>
                        </li>
                        <li class="animate-box">
                            <div class="timeline-badge"
                                 style="background-image:url(/resources/images/3.jpg);"></div>
                            <div class="timeline-panel">
                                <div class="timeline-heading">
                                    <h3 class="timeline-title">Sinh nhật cô ấy</h3>
                                    <span class="date">Ngày 4 tháng 10 năm 1997</span>
                                </div>
                                <div class="timeline-body">
                                    <p>Ngày mà trên đời xuất hiện một người dễ thương, hiền lành - Người yêu tui đó.</p>
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>

    <div id="fh5co-gallery" class="fh5co-section-gray">
        <div class="container">
            <div class="row">
                <div class="col-md-8 col-md-offset-2 text-center fh5co-heading animate-box">
                    <span>Our Memories</span>
                    <h2>Our Gallery</h2>
                    <p>Những điều mình đã trải qua - Cùng xây dựng nó nhiều thật nhiều hơn nữa em nhé!</p>
                </div>
            </div>
            <div class="row row-bottom-padded-md">
                <div class="col-md-12">
                    <div id="memory">
                        <ul id="fh5co-gallery-list">
                            <%for (Hinhanh dsha : dshinhanh){%>
                            <li class="one-third animate-box" data-animate-effect="fadeIn"
                                style="background-image: url(<%=dsha.getPicture()%>); ">
                            </li>
                            <%}%>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <footer id="fh5co-footer" role="contentinfo">
        <div class="container">

            <div class="row copyright">
                <div class="col-md-12 text-center">
                    <p>
                    <ul class="fh5co-social-icons">
                        <li><a href="https://www.facebook.com/vanthinh.le.50364"><i class="icon-facebook"></i></a></li>
                        <li><a href="https://www.facebook.com/vuthanh.vu.509"><i class="icon-facebook"></i></a></li>

                    </ul>
                    </p>
                </div>
            </div>

        </div>
    </footer>
</div>

<div class="gototop js-top">
    <a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
</div>

<!-- jQuery -->
<script src="/resources/js/jquery.min.js"></script>
<!-- jQuery Easing -->
<script src="/resources/js/jquery.easing.1.3.js"></script>
<!-- Bootstrap -->
<script src="/resources/js/bootstrap.min.js"></script>
<!-- Waypoints -->
<script src="/resources/js/jquery.waypoints.min.js"></script>
<!-- Carousel -->
<script src="/resources/js/owl.carousel.min.js"></script>
<!-- countTo -->
<script src="/resources/js/jquery.countTo.js"></script>

<!-- Stellar -->
<script src="/resources/js/jquery.stellar.min.js"></script>
<!-- Magnific Popup -->
<script src="/resources/js/jquery.magnific-popup.min.js"></script>
<script src="/resources/js/magnific-popup-options.js"></script>

<!-- // <script src="https://cdnjs.cloudflare.com/ajax/libs/prism/0.0.1/prism.min.js"></script> -->

<!-- Main -->
<script src="/resources/js/main.js"></script>

<script>

    window.onload = function (ev) {
        var diff = parseInt('<%=(long)session.getAttribute("diff")%>');
        var diffYears = parseInt(diff / (24 * 60 * 60 * 1000 * 365))
        var diffMonths = parseInt(diff / (24 * 60 * 60 * 1000 * 30) % 12);
        var diffDays = parseInt(diff / (24 * 60 * 60 * 1000) % 30);
        var diffHours = parseInt(diff / (60 * 60 * 1000) % 24);
        var diffMinutes = parseInt(diff / (60 * 1000) % 60);
        var diffSeconds = parseInt(diff / 1000 % 60);

        $('#days').html(diffDays);
        $('#hours').html(diffHours);
        $('#minutes').html(diffMinutes);
        $('#seconds').html(diffSeconds);
        $('#month').html(diffMonths);
        $('#years').html(diffYears);

        var x = setInterval(function () {
            diffSeconds++;
            if (diffSeconds === 60) {
                diffSeconds = 0;
                diffMinutes++;
            }

            if (diffMinutes === 60) {
                diffMinutes = 0;
                diffHours++;
            }

            if (diffHours === 24) {
                diffHours = 0;
                diffDays++;
            }

            if (diffDays === 30) {
                diffDays = 0;
                diffMonths++;
            }
            if (diffMonths === 12) {
                diffMonths = 0;
                diffYears++;
            }
            $('#days').html(diffDays);
            $('#hours').html(diffHours);
            $('#minutes').html(diffMinutes);
            $('#seconds').html(diffSeconds);
        }, 1000);

    }

</script>

</body>
</html>

