$(function () {
  console.log("Loading main...");
  fetch("http://localhost:8080/greeting").then(function(response) {
    var resBody = response.json();

    $('.greeting-id').append(resBody.id);
    $('.greeting-content').append(resBody.content);

    console.log(resBody);
  });
});
