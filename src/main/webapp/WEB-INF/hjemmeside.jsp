<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <meta charset="UTF-8"/>
    <!--   <script src="js/myscript.js" defer></script> -->
    <title>Sequence</title>
</head>

<body>

<nav class="navbar navbar-expand-md navbar-dark bg-dark mb-4">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">
            <img src="${pageContext.request.contextPath}/images/sekvensLogo.png" alt="Logo">
            Sequence
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="navbar-nav me-auto mb-2 mb-md-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Hjem</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="#">Priser</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-disabled="true">Om Sequence</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container col-xxl-8 px-4 py-5">
    <div class="row flex-lg-row-reverse align-items-center g-5 py-5">
        <div class="col-10 col-sm-8 col-lg-6">
            <img src="${pageContext.request.contextPath}/images/idBuzz.png" class="d-block mx-lg-auto img-fluid" alt="Bootstrap Themes" width="700" height="500" loading="lazy">
        </div>
        <div class="col-lg-6">
            <h1 class="display-5 fw-bold text-body-emphasis lh-1 mb-3"><span class="first-word">Sequence</span> – Din pålitelige partner for rimelige bilopplevelser i Norge</h1>
            <br>
            <p class="lead">
                Sequence er et ledende bilutleieselskap i Norge som har satt nye standarder for rimelighet, kvalitet og kundeservice. Med et bredt utvalg av biler tilpasset alle behov og budsjett, har Sequence som mål å gjøre billeie enkelt, billig og tilgjengelig for alle. Enten du trenger en kompakt bil til en kortere tur, en familievennlig SUV eller en luksuriøs sedan til en spesiel anledning, har Sequence det perfekte kjøretøyet for deg.
            </p>

            <br>

            <div class="d-grid gap-2 d-md-flex justify-content-md-start">
               <a href="skjema"> <button type="button" class="btn btn-primary btn-lg px-4 me-md-2">Bestill en bil nå!</button></a>
                <button type="button" class="btn btn-outline-secondary btn-lg px-4">Se utvalget</button>
            </div>


        </div>
    </div>
</div>


<div class="container">
    <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
        <p class="col-md-4 mb-0 text-body-secondary">© 2025 Sequence, AS</p>

        <a  class="col-md-4 d-flex align-items-center justify-content-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none">
            <img src="${pageContext.request.contextPath}/images/sekvensLogo.png" alt="" height="50px">
        </a>


    </footer>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</body>

</html>