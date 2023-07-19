$(window).on('scroll', function() {
    if ($(window).scrollTop() > 44) {
        $('#topNaV').addClass("fixed");
        $('#topBar').css("top","0");
        $('#topBar2').css("top","0").addClass("shadow");
        $('#GNB').css("top","0");
        $('.btn-top-toggle').hide();
    } else {
        $('#topNaV').removeClass("fixed");
        $('#topBar').css("top","44px");
        $('#topBar2').css("top","44px").removeClass("shadow");;
        $('#GNB').css("top","44px");
        $('.btn-top-toggle').show();
    }
});
$(document).on('show.bs.modal', '.modal', function (event) {
    var zIndex = 1040 + (10 * $('.modal:visible').length);
    $(this).css('z-index', zIndex);
    setTimeout(function() {
        $('.modal-backdrop').not('.modal-stack').css('z-index', zIndex - 1).addClass('modal-stack');
    }, 0);
});
$(document).ready(function () {
    $(".btn-toggle").on('click', function () {
        $(".offcanvas-collapse").toggleClass("open");
        $("body").toggleClass("active");
        $(".offcanvas-collapse .dropdown-menu").toggleClass("hide");
    });
    $(".offcanvas_dim").on('click', function () {
        $(".offcanvas-collapse").toggleClass("open");
        $("body").toggleClass("active");
        $(".offcanvas-collapse .dropdown-menu").toggleClass("hide");
    });

    $(".table tr.click").on('click', function () {
        $("#toggleTop").removeClass("show");
        $('[href="#toggleTop"]').addClass("collapsed");
    });
});

$(document).ready(function () {
    $('.navbar .dropdown-item').on('click', function (e) {
        var $el = $(this).children('.dropdown-toggle');
        var $parent = $el.offsetParent(".dropdown-menu");
        $(this).parent("li").toggleClass('open');

        if (!$parent.parent().hasClass('navbar-nav')) {
            if ($parent.hasClass('show')) {
                $parent.removeClass('show');
                $el.next().removeClass('show');
                $el.next().css({"top": -999, "left": -999});
            } else {
                $parent.parent().find('.show').removeClass('show');
                $parent.addClass('show');
                $el.next().addClass('show');
                //$el.next().css({"top": $el[0].offsetTop, "left": $parent.outerWidth() - 4});
            }
            e.stopPropagation();
        }
    });

    $('.navbar .dropdown').on('hidden.bs.dropdown', function () {
        $(this).find('li.dropdown').removeClass('show open');
        $(this).find('ul.dropdown-menu').removeClass('show open');
    });
});