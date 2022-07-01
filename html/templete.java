<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Div Tag</title>
    <link rel="stylesheet" href="../CSS/templete.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css"
        integrity="sha512-5A8nwdMOWrSz20fDsjczgUidUBR8liPYU+WymTZP1lmY9G6Oc7HlZv156XqnsgNUzTyMefFTcsFH/tnJE/+xBg=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />

</head>

<body>
    <!-- 2 property of CSS text align and line height are not usedbecause they are said to be old fashioned.
         Instead of these 2 propertiesflex properties used now a days-->
    <!-- div is a block of element -->
    <header id="header">
        <div id="logo">
            <!-- <img src="" alt=""> --> LOGO
        </div>
        <nav>
            <ul>
                <li><a href="./firstProgram.html">Home</a></li>
                <li><a href="./secondPage.html">About</a></li>
                <li><a href="./page4.html">Services</a></li>
                <li><a href="./Form.html">Contact</a></li>
            </ul>
        </nav>
    </header>
    <div class="banner">
        <h1>Banner</h1>
    </div>
    <h2>Section-1</h2>
    <section id="sec-1">

        <div class="circles">circle-1</div>
        <div class="circles">circle-2</div>
        <div class="circles">circle-3</div>
        <div class="circles">circle- 4</div>
    </section>
    <h2>Section-2</h2>
    <section id="sec-2">
        <main>
            Main Content
        </main>
        <aside>
            <article id="art-1" class="art">Article-1</article>
            <article id="art-2" class="art">Article-2</article>
            <article id="art-3" class="art">Article-3</article>

        </aside>
    </section>
    <h2>Section-3</h2>
    <section id="sec-3">
        <div class="box">Box-1</div>
        <div class="box">Box-2</div>
        <div class="box">Box-3</div>
        <div class="box">Box-4</div>
    </section>

    <footer>
        Footer
    </footer>
    <a href="https://www.gla.ac.in/" target="_blank">
        <i class="fa fa-info-circle" aria-hidden="true"></i>
    </a>


</body>

</html>
<!-- flex box - set of properties which styling flexible for block level element -->
