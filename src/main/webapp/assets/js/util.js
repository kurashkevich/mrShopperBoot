$(document).ready(function() {
    $('#searchByFilter').click(function () {
        searchByFilterBtn();
    });
    $('#maxDiagonal').click(function () {
       // var manufacturer = $( "#manufacturer option:selected" ).text();
       // changeLink(manufacturer);
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

function filterLink(manufacturer, os, minDiagonal, maxDiagonal){
    var url = '/products/byFilter?manufacturer='+manufacturer+'&osName='+os+'&minD='+minDiagonal+'&maxD='+maxDiagonal;
    return url;
}

function searchByFilterBtn() {
    var manufacturer = $( "#manufacturer option:selected" ).text();
    var os = $( "#os option:selected" ).text();
    var minDiagonal =$('#minDiagonal').val();
    var maxDiagonal =$('#maxDiagonal').val();
    var minRam =$('#minRam').val();
    var maxRam =$('#maxRam').val();

    var url = filterLink(manufacturer, os, minDiagonal, maxDiagonal);
    alert(url);
    $.ajax({
        headers:"Accept: application/json",
        type:'get',
        url: url
    }).done(function() {
        alert('done');
        $("#searchByFilter").attr("href", url);
    })
    $("#searchByFilter").attr("href", url);

}