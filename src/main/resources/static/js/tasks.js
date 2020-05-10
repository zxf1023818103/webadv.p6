$(document).ready(function() {
    $('.btn').click(function() {
        $.ajax({
            url: "http://localhost:8080/task/" + $('input').val()
    }).then(function(data) {
            $('#title').text(data.title);
            $('#content').text(data.content);
        });
    });
});
