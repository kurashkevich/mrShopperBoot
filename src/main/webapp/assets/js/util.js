/*
$(document).ready(function(){
    $('#addPerson').click(function () {
        addPerson();
    });
    $('#deletePerson').click(function () {
        deletePerson();
    });
    $('#productAdd').click(function () {
        addProduct();
    });
    $('#productUpdate').click(function () {
        updateProduct();
    });
    $('#productDelete').click(function () {
        deleteProduct();
    });

    $("#refreshProducts").click()(function() {
        refreshProducts();
    })
});
​
function refreshProducts() {

    $.ajax({
        dataType: "json",
        type:'get',
        url: "/products"
    }).done(function(data) {
        $.each(data, function (index, value) {
            var el = '<tr> <td th:text="'+value.idProduct}+'"></td>'
            '<tr> <td th:text="'+value.manufacturer}+'"></td>'
            '<tr> <td th:text="'+value.detail.model}+'"></td>'
            '<tr> <td th:text="'+value.detail.rom}+'"></td>'
            '<tr> <td th:text="'+value.detail.ram}+'"></td>'

            '<tr> <td th:text="'+value.detail.screenSize+'"></td>'
            '<tr> <td th:text="'+value.price}+'"></td>'
            '<tr> <td th:text="'+value.count}+'"></td>';

            $(".productTable").append(el);
        });

    }).fail(function(data){
        if ( console && console.log ) {
            console.log( "Error data:", data);
        }
    });
}

function addPerson() {
    $('#personForm').prop('action', 'add.form');
    $('#personButton').prop('value', 'Add person');
    $('#personForm').show();
}
​
function deletePerson() {
    $('#personForm').prop('action', 'delete.form');
    $('#personButton').prop('value', 'Delete person');
    $('#personForm').show();
}
​
function addProduct() {
    $('#personForm').prop('action', 'addProduct.form');
    var name = $("#name").val();
    var model = $("#model").val();
    var price = $("#price").val();
​
  var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    if (name && model && price) {
        var product = {
            name: name,
            model: model,
            price: price
        };
        $.ajax({
            data:product,
            dataType: "json",
            type:'post',
            beforeSend: function(xhr){xhr.setRequestHeader(header, token);},
            url: restUrl
        }).done(function(data) {
            var el = '<div id="' + data.id + '">'+ data.name +'  '+data.model+'  '+data.price+'</div>';
            $(".productTable").append(el);
        }).fail(function(data){
            if ( console && console.log ) {
                console.log( "Error data:", data);
            }
        });
    }
}
​
function deleteProduct() {
    var id = $("#id").val();
    var url = restUrl+ "/" + id;
​
  $.ajax({
      headers:"Accept: application/json",
      type:'delete',
      url: url
  }).done(function(data) {
      $("#"+id).remove();
  }).fail(function(data){
      if ( console && console.log ) {
          console.log( "Error data:", data);
      }
  });
}
*/
