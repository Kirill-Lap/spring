/**
 * Created by EVDOKIMOVAL on 30.08.2018.
 */
$(document).ready(function() {
    $('#btnHello').click(function (e) {
        console.log('Hello');
    });
    $('#btnHello').toggleClass( "btn btn-primary" )


    $('#btnHello').click(function (e) {
        $.post("/about/test_param", {
            name_param: $('#newTestParam').val()
        }).done(function (result) {
            location.reload();
        });
        // console.log($('#newCustomerName').val());
    });

    $('#login_btn').click(function (e) {
        $.post("/login/usr_name", {
            user_login: $('#userName').val(),
            user_pass: $('#password').val()
        }).done(function (result) {
            location.reload();
        });
        // console.log($('#newCustomerName').val());
    });


});