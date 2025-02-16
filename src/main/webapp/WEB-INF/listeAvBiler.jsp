<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:forEach var="bil" items="${biler}">
    <div class="col">
        <div class="card shadow-sm bilKort">
            <!-- Legge til bilder -->
            <img src="${bil.bildeURL}" class="card-img-top" alt="${bil.merke} ${bil.modell}" style="height: 350px; object-fit: cover;">
            <div class="card-body">
                <p class="card-text">
                    <strong>Merke:</strong> ${bil.merke}<br>
                    <strong>Modell:</strong> ${bil.modell}<br>
                    <strong>Utleiegruppe:</strong> ${bil.utleiegruppe}<br>
                    <strong>Tilgjengelig:</strong> ${bil.tilgjengelig ? 'Ja' : 'Nei'}
                </p>
                <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                        <c:choose>
                            <c:when test="${bil.tilgjengelig}">

                                <a href="${pageContext.request.contextPath}/bestilling?bilId=${bil.regnr}"
                                   class="btn btn-sm btn-primary">Reserver</a>
                            </c:when>
                            <c:otherwise>

                                <button class="btn btn-sm btn-secondary" disabled>Utilgjengelig</button>
                            </c:otherwise>
                        </c:choose>
                    </div>
                    <small class="text-body-secondary">${bil.km} km</small>
                </div>
            </div>
        </div>
    </div>
</c:forEach>