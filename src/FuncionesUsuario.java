public class FuncionesUsuario {

    public double calcularImpuestos(Usuario usuario) {

        if (usuario.getEdad() < 18) return 0;

        double impuesto = 0;

        if (usuario.getEdad() <= 30)

            impuesto = 2000;

        else if (usuario.getEdad() <= 65)

            impuesto = 7000;

        else impuesto = 2000;

        int descuentoImp = usuario.getCantidadHijos() * 3;

        if (descuentoImp >= 50) descuentoImp = 50;

        return impuesto * (1 - (descuentoImp / 100));
    }

    public void cobroSueldo(Usuario usuario, double sueldo) {
        usuario.setSaldo(usuario.getSaldo() + sueldo);
    }

}