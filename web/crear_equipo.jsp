<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="base_bar.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/solid.css">
        <title>Crear Equipo</title>
    </head>
    <div class="home_content">
        <div class="modal-dialog text-center " style="z-index: 1;">
            <div class="col-xs-12 col-md-14 main-section">
                <div class="modal-content">
                    <div class="col-12 user-img mt-4">
                        <h2>Registrate</h2>
                    </div>
                    <form class="col-12" action="ControladorUsuario" method="POST">
                        <div class="form-group" id="equipo-group">
                            <input class="form-control" type="text" name="txtNombre" id="txtNombre" placeholder="Ingrese el nombre del equipo" value="" required>
                        </div> 
                        <div class="form-group" id="number-group">
                            <input class="form-control" type="number" name="txtCantidad" id="correo" placeholder="Ingrese de jugadores max" value="">
                        </div>   
                        <div class="form-group">
                            <select name="cboLiga" class="form-control">
                                <option value="1">Fortnite</option>
                                <option value="2">CSGO</option>
                                <option value="3">Battlefield 4</option>
                                <option value="4">Call Of Duty Warzone</option>
                                <option value="5">League Of Legends</option>
                            </select>    
                        </div> 
                        <button type="submit" class="btn btn-primary" value="RegistrarUsuario" name="btnAccion" id="btnAccion"><i class="fas fa-sign-in-alt"></i>  Crea Equipo </button>
                    </form>
                    <div>
                        ${msOK}${msNO}
                    </div>
                </div>
            </div>
        </div>
        <%@include file="base_footer.jsp" %>
    </div>
    <link rel="stylesheet" href="static/css/crear_equipo.css">
</html>