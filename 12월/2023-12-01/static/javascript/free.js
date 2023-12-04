$(function(){
    $("#search").on("keyup",function(){
        
        var word = $(this).val();

        $(".detail>tr").filter(
            function(){
                $(this).toggle( $(this).text().includes(word) );
                   // console.log($(this).text().include(word));
                }
        );
       
        // $(".detail>tr").eq(1).toggle(true);
    });
});