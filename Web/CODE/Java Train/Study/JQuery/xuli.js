$(document).ready(function () {
    /*cú pháp gọi nút trong jquery 
    $ = document.getElementById('btnClick')*/
    
    /*cách gọi sự kiện 1*/
   /* $('#btnClick').on('click',function () {
        /!*attr() chuyên dùng xử lí css*!/
        $('#div1>p').attr('style','color:red');
        $('#div2>h3').attr('style','color:blue');
        $('#div1').append('<p>Lê Văn Thịnh</p>');
    })*/
    
    /*/!*cách gọi sự kiện 2*!/
    $('btnClick').click(function () {
        
    })*/
    (()=> console.log(5))();


var a = function(){
    console.log(5);
}

    $('#form').on('submit', ()=> {
        if($('#username').val()===''){
            $('#1').html('Vui lòng nhập dữ liệu');
            $('#username').css('border','solid 1px red');
            return false;
        }
        if($('#pass').val()===''){
            $('#2').html('Vui lòng nhập dữ liệu');
            $('#pass').css('border','solid 1px red');
            return false;
        }
        if($('#re_pass').val()===''){
            $('#3').html('Vui lòng nhập dữ liệu');
            $('#re_pass').css('border','solid 1px red');
            return false;
        }
        if($('#email').val()===''){
            $('#4').html('Vui lòng nhập dữ liệu');
            $('#email').css('border','solid 1px red');
            return false;
        }
        return true;
    })


    $('#form').on('keyup',() =>{
        if($('#username').val()!==''){
            $('#1').html('');
            $('#username').css('border','solid 2px green');
        }
        if($('#pass').val()!==''){
            $('#2').html('');
            $('#pass').css('border','solid 2px green');
        }
        if($('#re_pass').val()!==''){
            $('#3').html('');
            $('#re_pass').css('border','solid 2px green');
        }
        if($('#email').val()!==''){
            $('#4').html('');
            $('#email').css('border','solid 2px green');
        }
    })
});