<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://fonts.cdnfonts.com/css/children-should-not-play-with-dead-things" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>JSP - Hello World</title>
    <style>
        @import url('https://fonts.cdnfonts.com/css/children-should-not-play-with-dead-things');
        .layer1 {
            position: relative;
            left: 100px;
        }
    </style>
</head>
<body>
<div class="container">
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item activate">
                    <form action ="lab">
                        <button value="1" name="button" class="btn btn-success">Услуги(Главная)</button>
                    </form>
                </li>
                <li class="nav-item">
                    <form action ="lab">
                        <button value="2" name="button" class="btn btn-success">Контакты</button>
                    </form>
                </li>
                <li class="nav-item">
                    <form action ="lab">
                        <button value="3" name="button" class="btn btn-success">О нас</button>
                    </form>
                </li>
                <li class="nav-item">
                    <form action ="lab">
                        <button value="4" name="button" class="btn btn-success">Обратная связь</button>
                    </form>
                </li>
            </ul>
        </div>
    </nav>
</div>

<div class='layer1' >
    <h1>
        Приготовься. <br>
        <span>Реальность вокруг изменится на<br> ближайшие 60 минут</span>
    </h1>
    <p>
        Если вы не влюбились в квесты после первой игры — вы не были в <span style="font-size: large ; color: black; font-family: 'CSNPWDT NFI', sans-serif; ">P.A.R.T.Y.</span><br>
        Мы создаем командные интеллектуальные развлечения с WOW-эффектом в Москве и мире.<br>
        Эти игры восхищают, заставляют мозг работать на сверхоборотах, а эмоции— литься через край.<br>
        Все, чтобы вы подумали: «Как вообще это устроено?!» и «Хочу еще!»
    </p>
</div>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>