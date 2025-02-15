<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:forEach var="bil" items="${biler}">
    <div class="col">


        <div class="card shadow-sm">

<!-- Legge til bilbilder -->

            <img src="${bil.bildeURL}" class="card-img-top" alt="${bil.merke} ${bil.modell}" style="height: 225px; object-fit: cover;">
            <div class="card-body">
                <p class="card-text">



<!-- Bootstrap kort template -->
            <div class="card-body">
                <p class="card-text">
                    <strong>Regnr:</strong> ${bil.regnr}<br>
                    <strong>Farge:</strong> ${bil.farge}<br>
                    <strong>Utleiegruppe:</strong> ${bil.utleiegruppe}<br>
                    <strong>Tilgjengelig:</strong> ${bil.tilgjengelig ? 'Ja' : 'Nei'}
                </p>
                <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                        <c:if test="${bil.tilgjengelig}">
                            <a href="/reserver?bilId=${bil.regnr}" class="btn btn-sm btn-outline-secondary">Reserver</a>
                        </c:if>
                    </div>
                    <small class="text-body-secondary">${bil.km} km</small>
                </div>
            </div>
        </div>
    </div>
</c:forEach>