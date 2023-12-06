
$(function(){
    $("#apply").on("click", sizeApply);
});

function sizeApply(){
    var wd = $("#wd").val();
    var hg = $("#hg").val();

    opener.$("#draw>table>tr>td").css("width", wd+"px");
    opener.$("#draw>table>tr>td").css("height", wd+"px");

    window.close();
}