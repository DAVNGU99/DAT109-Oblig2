<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <meta charset="UTF-8"/>
    <!--   <script src="js/myscript.js" defer></script> -->
    <title>Bestill bil</title>




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


<main>

    <div class="full-width">
        <section class="py-5 text-center full-width-section">
            <div class="row py-lg-5">
                <div class="col-lg-6 col-md-8 mx-auto">
                    <h1 class="fw-light">Velg lokasjon</h1>
                    <p class="lead text-body-secondary">Sequence har et bredt tilbud av biler til leie, og vi er stolte av å ha kontorer på strategiske steder over hele landet. Våre kontorer finnes i Oslo, Bergen, Haugesund, Kristiansand og Stavanger, noe som gjør det enkelt for deg å hente og levere bilen din uansett hvor du befinner deg.</p>
                    <p>

                    <div id="kontorLokasjonKnapper" class="btn-group" role="group" aria-label="Basic example">
                        <c:forEach var="kontor" items="${kontorliste}">
                            <button type="button" class="btn btn-primary" data-kontor-id="${kontor.kontornr}">
                                    ${kontor.poststed}
                            </button>
                        </c:forEach>
                    </div>








                    </p>
                </div>
            </div>
        </section>
    </div>


    <div id="biler-container" class="mt-4">
        <!-- Biler vil vises her dynamisk -->
    </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
        $(document).ready(function() {
            // Lytter etter klikk på knapper i #kontorLokasjonKnapper
            $('#kontorLokasjonKnapper .btn').click(function() {
                // Hent kontor-ID fra data-attributtet
                const kontorID = $(this).data('kontor-id');

                // Send AJAX-forespørsel til serveren
                $.ajax({
                    url: '/skjema', // Endepunkt for å hente biler
                    method: 'GET',
                    data: { kontorID: kontorID },
                    success: function(response) {
                        // Oppdater #biler-container med responsen
                        $('#biler-container').html(response);
                    },
                    error: function() {
                        $('#biler-container').html('<p>En feil oppsto ved henting av biler.</p>');
                    }
                });
            });
        });
    </script>


</main>


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