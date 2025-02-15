<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:forEach var="bil" items="${biler}">
    <div class="col">
        <div class="card shadow-sm">
            <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false">
                <title>Placeholder</title>
                <rect width="100%" height="100%" fill="#55595c"></rect>
                <text x="50%" y="50%" fill="#eceeef" dy=".3em">${bil.merke} ${bil.modell}</text>
            </svg>
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