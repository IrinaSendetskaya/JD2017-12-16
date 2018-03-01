<%@ page language="java" pageEncoding="UTF-8" %>
<%@ include file="include/begin-html.jsp" %>
<form class="form-horizontal" action="do?command=Catalog" method="post">
    <fieldset>

        <table class="table">
          <thead>
            <tr>
              <th scope="col">№</th>
              <th scope="col">Категории</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>1</td>
              <td><a  href="do?command=categorycs">Цифровые технологии</a></td>
            </tr>
            <tr>
              <td>2</td>
              <td><a  href="do?command=categoryfiction">Художественная литература</a></td>
            </tr>
          </tbody>
        </table>

    </fieldset>
</form>



<p>Cmd ERROR: ${error}</p>
<p>Cmd Message: ${message}</p>
<br><br><br><br><br><br><br><br><br>
<%@ include file="include/end-html.jsp" %>


