$(document).ready(function() {
    $('#searchByFilter').click(function () {
        searchByFilterBtn();
        //restSearchByFilterBtn();
    });
    $('#maxDiagonal').click(function () {

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
    $.ajax({
        headers:"Accept: application/json",
        type:'get',
        url: url
    }).done(function() {
        //alert('done');
    })
    $("#searchByFilter").attr("href", url);
    $("#manufacturer option:selected").attr("text", manufacturer);
}


function restFilterLink(manufacturer, os, minDiagonal, maxDiagonal){
    var url = '/productsRest?manufacturer='+manufacturer+'&osName='+os+'&minD='+minDiagonal+'&maxD='+maxDiagonal;
    return url;
    //http://localhost:8080/productsRest?manufacturer=Samsung&osName=IOS&minD=3&maxD=7
}

function restSearchByFilterBtn() {
    var manufacturer = $( "#manufacturer option:selected" ).text();
    var os = $( "#os option:selected" ).text();
    var minDiagonal =$('#minDiagonal').val();
    var maxDiagonal =$('#maxDiagonal').val();


    var product = {
        manufacturer: manufacturer,
        os: os,
    };

    var restUrl = filterLink(manufacturer, os, minDiagonal, maxDiagonal);
    alert(restUrl);
    $.ajax({
        headers:"Accept: application/json",
        type:'get',
        dataType: "json",
        url: restUrl
    }).done(function(data) {
        var el = ' <div id="2"> ' + data.manufacturer + '</div>  ';
        $(".test").append(el);
    })


}

/*
<div class="test">
    <div id="1">привет1  привет2  привет3</div>
</div>*/
