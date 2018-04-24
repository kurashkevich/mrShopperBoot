$(document).ready(function() {
    $('#searchByFilter').click(function () {
        searchByFilterBtn();
    });
    $('#manufacturer').click(function () {
        var manufacturer = $( "#manufacturer option:selected" ).text();
        //alert(manufacturer);
        changeLink(manufacturer);
    });

});

function changeLink(man) {

    //var manufacturer = $( "#manufacturer option:selected" ).text();
    var url = '/products/filter?manufacturer='+man;
    //alert(url);
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

}