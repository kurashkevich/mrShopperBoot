$(document).ready(function() {
    $('#searchByFilter').click(function () {
        searchByFilterBtn();
    });
    $('#manufacturer').click(function () {
        var manufacturer = $( "#manufacturer option:selected" ).text();
        changeLink(manufacturer);
    });

});

function changeLink(man) {
    var url = '/products/filter?manufacturer='+man;
    $.ajax({
        headers:"Accept: application/json",
        type:'get',
        url: url
    }).done(function() {
        $("#searchByFilter").attr("href", url);
    }).fail(function(data){
        if ( console && console.log ) {
            console.log( "Error data:", data);
        }
    });
}

function searchByFilterBtn() {
    var manufacturer = $( "#manufacturer option:selected" ).text();
    var os = $( "#os option:selected" ).text();
    var minDiagonal =$('#minDiagonal').val();
    var maxDiagonal =$('#maxDiagonal').val();
    var minRam =$('#minRam').val();
    var maxRam =$('#maxRam').val();

  /*  alert(manufacturer);
    alert(os);
    alert(minDiagonal);
    alert(maxDiagonal);
    alert(minRam);
    alert(maxRam);*/

    var url = '/products/filterBoth?manufacturer='+man;
    $.ajax({
        headers:"Accept: application/json",
        type:'get',
        url: url
    }).done(function() {
        $("#searchByFilter").attr("href", url);
    })
}