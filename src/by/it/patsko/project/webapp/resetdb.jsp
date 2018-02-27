<%@ page language="java" pageEncoding="UTF-8" %>
<%@ include file="include/begin-html.jsp" %>

<form class="form-horizontal"  action="do?command=ResetDB" method="post">
    <fieldset>

        <!-- Form Name -->
        <legend>Reset DB</legend>

        <div class="alert alert-success" role="alert">
                  <h4 class="alert-heading">База данных удалена</h4>
        </div>

    </fieldset>
</form>

<p>Cmd Reset DB: <b>${message}</b></p>

<%@ include file="include/end-html.jsp" %>