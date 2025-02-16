<%@ page import="com.example.dat109oblig2.Objekter.Utleiegruppe" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String bilId = request.getParameter("bilId");
    String kontorId = request.getParameter("kontorId");
%>





<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <meta charset="UTF-8"/>
    <!--   <script src="js/myscript.js" defer></script> -->
    <title>Sequence</title>
    <link rel="icon" type="image/x-icon" href="${pageContext.request.contextPath}/images/sekvensLogo.png">
</head>

<body>

<nav class="navbar navbar-expand-md navbar-dark bg-dark mb-4">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">
            <img src="${pageContext.request.contextPath}/images/sekvensLogo.png" alt="sekvensLogo" height="15x"> Sequence
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="navbar-nav me-auto mb-2 mb-md-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/">Hjem</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="skjema">Bestill</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-disabled="true">Om Sequence</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container">
    <main>
        <div class="py-5 text-center">
            <img class="d-block mx-auto mb-4" src="${pageContext.request.contextPath}/images/sekvensLogo.png" alt="" width="72" height="57">
            <h1>Din bestilling</h1>
            <p class="lead">Vennligst fullfør bestillingen din nedenfor</p>
        </div>

        <div class="row g-5">
            <div class="col-md-5 col-lg-4 order-md-last">
                <h4 class="d-flex justify-content-between align-items-center mb-3">
                    <span class="text-primary">Din bestilling</span>
                </h4>
                <ul class="list-group mb-3">
                    <li class="list-group-item d-flex justify-content-between lh-sm">
                        <div>
                            <h6 class="my-0">Merke: ${bil.merke}</h6>
                            <h6 class="my-0">Modell: ${bil.modell}</h6>
                            <h6 class="my-0">Farge: ${bil.farge}</h6>
                            <h6 class="my-0">Registreringsnummer: ${bil.regnr}</h6>
                            <h6 class="my-0">Utleiegruppe: ${bil.utleiegruppe}</h6>
                            <img src="${bil.bildeURL}" class="card-img-top" alt="${bil.merke} ${bil.modell}" style="height: 150px; object-fit: scale-down;">
                            <small class="text-body-secondary">Antall km: ${bil.km}</small>
                        </div>
                        <span class="text-body-secondary">Dagspris: 399kr</span>
                    </li>
                    <li class="list-group-item d-flex justify-content-between lh-sm">
                        <div>
                            <h6 class="my-0">Returgebyr</h6>
                            <small class="text-body-secondary"></small>
                        </div>
                        <span class="text-body-secondary">80kr</span>
                    </li>
                    <li class="list-group-item d-flex justify-content-between lh-sm">
                        <div>
                            <h6 class="my-0">Forsikring</h6>
                            <small class="text-body-secondary">*Kollisjonsbeskyttelse og tyveribeskyttelse</small>
                        </div>
                        <span class="text-body-secondary">120kr</span>
                    </li>
                    <li class="list-group-item d-flex justify-content-between">
                        <span>Totalt: </span>
                        <strong>22</strong>
                    </li>
                </ul>
            </div>
            <div class="col-md-7 col-lg-8">
                <form class="needs-validation" novalidate="">
                    <div class="row g-3">
                        <div class="col-sm-6">
                            <label for="firstName" class="form-label">Fornavn</label>
                            <input type="text" class="form-control" id="firstName" placeholder="" value="" required="">
                            <div class="invalid-feedback">
                                Valid first name is required.
                            </div>
                        </div>

                        <div class="col-sm-6">
                            <label for="lastName" class="form-label">Etternavn</label>
                            <input type="text" class="form-control" id="lastName" placeholder="" value="" required="">
                            <div class="invalid-feedback">
                                Valid last name is required.
                            </div>
                        </div>

                        <div class="col-12">
                            <label for="email" class="form-label">Telefonnummer <span class="text-body-secondary"></span></label>
                            <input type="email" class="form-control" id="email" placeholder="">
                            <div class="invalid-feedback">
                                Please enter a valid email address for shipping updates.
                            </div>
                        </div>

                        <div class="col-12">
                            <label for="address" class="form-label">Adresse</label>
                            <input type="text" class="form-control" id="address" placeholder="" required="">
                            <div class="invalid-feedback">
                                Please enter your shipping address.
                            </div>
                        </div>

                        <div class="col-md-4">
                            <label for="poststed" class="form-label">Poststed</label>
                            <input type="text" class="form-control" id="poststed" placeholder="" required="">
                            <div class="invalid-feedback">
                                Please provide a valid state.
                            </div>
                        </div>

                        <div class="col-md-3">
                            <label for="postnummer" class="form-label">Postnummer</label>
                            <input type="text" class="form-control" id="postnummer" placeholder="" required="">
                            <div class="invalid-feedback">
                                Zip code required.
                            </div>
                        </div>
                    </div>

                    <hr class="my-4">

                    <select class="form-select" aria-label="Default select example">
                        <option selected>Vennligst velg hvor du skal hente leiebilen din</option>
                        <option value="1">Oslo</option>
                        <option value="2">Bergen</option>
                        <option value="3">Stavanger</option>
                        <option value="4">Kristiansand</option>
                        <option value="5">Haugesund</option>
                    </select>

                    <br>

                    <select class="form-select" aria-label="Default select example">
                        <option selected>Vennligst velg hvor du skal levere av leiebilen din</option>
                        <option value="1">Oslo</option>
                        <option value="2">Bergen</option>
                        <option value="3">Stavanger</option>
                        <option value="4">Kristiansand</option>
                        <option value="5">Haugesund</option>
                    </select>

                    <p>Leiedato</p>
                    <input type="date" />
                    <p>Returdato</p>
                    <input type="date"  />



                    <hr class="my-4">

                    <h4 class="mb-3">Betalingsform</h4>

                    <div class="my-3">
                        <div class="form-check">
                            <input id="credit" name="paymentMethod" type="radio" class="form-check-input" checked="" required="">
                            <label class="form-check-label" for="credit">Kredittkort</label>
                        </div>
                        <div class="form-check">
                            <input id="debit" name="paymentMethod" type="radio" class="form-check-input" required="">
                            <label class="form-check-label" for="debit">Debetkort</label>
                        </div>
                    </div>

                    <div class="row gy-3">
                        <div class="col-md-6">
                            <label for="cc-name" class="form-label">Name on card</label>
                            <input type="text" class="form-control" id="cc-name" placeholder="" required="">
                            <small class="text-body-secondary">Full name as displayed on card</small>
                            <div class="invalid-feedback">
                                Name on card is required
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="cc-number" class="form-label">Credit card number</label>
                            <input type="text" class="form-control" id="cc-number" placeholder="" required="">
                            <div class="invalid-feedback">
                                Credit card number is required
                            </div>
                        </div>

                        <div class="col-md-3">
                            <label for="cc-expiration" class="form-label">Expiration</label>
                            <input type="text" class="form-control" id="cc-expiration" placeholder="" required="">
                            <div class="invalid-feedback">
                                Expiration date required
                            </div>
                        </div>

                        <div class="col-md-3">
                            <label for="cc-cvv" class="form-label">CVV</label>
                            <input type="text" class="form-control" id="cc-cvv" placeholder="" required="">
                            <div class="invalid-feedback">
                                Security code required
                            </div>
                        </div>
                    </div>

                    <hr class="my-4">

                    <button class="w-100 btn btn-primary btn-lg" type="submit">Fullfør bestilling</button>
                </form>
            </div>
        </div>
    </main>


</div>

<div class="container">
    <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
        <p class="col-md-4 mb-0 text-body-secondary">© 2025 Sequence, AS</p>
        <a class="col-md-4 d-flex align-items-center justify-content-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none">
            <img src="${pageContext.request.contextPath}/images/sekvensLogo.png" alt="" height="50px">
        </a>
    </footer>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>

</html>