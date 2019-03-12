$(document).ready(function () {
    $.get("/test", (payload) => {
        $('#container').html(payload)
    })  
})
