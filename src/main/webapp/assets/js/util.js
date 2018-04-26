$(document).ready(function() {
    $('#searchByFilter').click(function () {
        searchByFilterBtn();
        //restSearchByFilterBtn();
    });
    $('#maxDiagonal').click(function () {

    });

});


function filterLink(manufacturer, os, minDiagonal, maxDiagonal){
    var url = '';
    if(minDiagonal==='' && maxDiagonal === ''){
        url = '/products/byOsName?manufacturer='+manufacturer+'&osName='+os;
    }
    else{
        url = '/products/byFilter?manufacturer='+manufacturer+'&osName='+os+'&minD='+minDiagonal+'&maxD='+maxDiagonal;
    }

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
        headers:"Accept: application/html",
        type:'get',
        dataType: "html",
        url: url
    }).done(function(data) {
        $("section").html(data);
    })
    //$("#searchByFilter").attr("href", url);

}


function restFilterLink(manufacturer, os, minDiagonal, maxDiagonal){
    var url = 'http://localhost:8080/productsRest?manufacturer='+manufacturer+'&osName='+os+'&minD='+minDiagonal+'&maxD='+maxDiagonal;
    return url;
    //http://localhost:8080/productsRest?manufacturer=Samsung&osName=IOS&minD=3&maxD=7
}

function restSearchByFilterBtn() {
    var manufacturer = $( "#manufacturer option:selected" ).text();
    var os = $( "#os option:selected" ).text();
    var minDiagonal =$('#minDiagonal').val();
    var maxDiagonal =$('#maxDiagonal').val();

    var idProduct='';
    var count= '';
    var price ='';
    var manu='';
    var date='';
    var product = {
        idProduct: idProduct,
        count: count,
        price: price,
        manu: manu
    };

    var restUrl = restFilterLink(manufacturer, os, minDiagonal, maxDiagonal);
    $.ajax({
        headers:"Accept: application/json",
        type:'get',
        dataType: "json",
        url: 'http://localhost:8080/productsRest?manufacturer=Samsung&osName=IOS&minD=3&maxD=7'
    }).done(function(data) {
        s=data[0].idProduct;
        alert(s);
        var el = ' <p> ' + s + ' </p>  ';
        $(".productBlock").append(el);
    })

}

function changeLink(man) {
    var url = '/products/filter?manufacturer='+man;
    $.ajax({
        headers:"Accept: application/json",
        type:'get',
        url: url
    }).done(function(data) {
        $("#searchByFilter").attr("href", url);
    }).fail(function(data){
        if ( console && console.log ) {
            console.log( "Error data:", data);
        }
    });
}

