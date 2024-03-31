document.addEventListener('DOMContentLoaded', function () {
    var navToggle = document.getElementById('main-nav-toggle');
    var navMenu = document.getElementById('main-nav-menu');

    navToggle.addEventListener('click', function() {
        navMenu.classList.toggle('active');
    });
});