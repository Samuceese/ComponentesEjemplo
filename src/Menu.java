import java.util.Scanner;

public class Menu {

    private OperacionesCRUD crud;

    public Menu(OperacionesCRUD crud) {
        this.crud = crud;
    }

    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n========= MENÚ PRINCIPAL =========");
            System.out.println("1. Listar oficinas");
            System.out.println("2. Insertar oficina");
            System.out.println("3. Borrar oficina");
            System.out.println("4. Buscar oficina");

            System.out.println("5. Listar vendedores");
            System.out.println("6. Insertar vendedor");
            System.out.println("7. Borrar vendedor");
            System.out.println("8. Buscar vendedor");

            System.out.println("9. Listar clientes");
            System.out.println("10. Insertar cliente");
            System.out.println("11. Borrar cliente");
            System.out.println("12. Buscar cliente");

            System.out.println("13. Listar productos");
            System.out.println("14. Insertar producto");
            System.out.println("15. Borrar producto");
            System.out.println("16. Buscar producto");

            System.out.println("17. Listar pedidos");
            System.out.println("18. Insertar pedido");
            System.out.println("19. Borrar pedido");
            System.out.println("20. Buscar pedido");

            System.out.println("21. Mostrar todas las oficinas juntos con sus vendedores y clientes");
            System.out.println("22. Mostrar el Vendedor que tiene MÁS ventas");
            System.out.println("23. Mostrar el Cliente que tenga MAYOR crédito");
            System.out.println("24. Mostrar el Producto que tenga el MENOR stock");

            System.out.println("25. Salir");

            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1 -> listarOficinas();
                case 2 -> insertarOficina(sc);
                case 3 -> borrarOficina(sc);
                case 4 -> buscarOficina(sc);

                case 5 -> listarVendedores();
                case 6 -> insertarVendedor(sc);
                case 7 -> borrarVendedor(sc);
                case 8 -> buscarVendedor(sc);

                case 9 -> listarClientes();
                case 10 -> insertarCliente(sc);
                case 11 -> borrarCliente(sc);
                case 12 -> buscarCliente(sc);

                case 13 -> listarProductos();
                case 14 -> insertarProducto(sc);
                case 15 -> borrarProducto(sc);
                case 16 -> buscarProducto(sc);

                case 17 -> listarPedidos();
                case 18 -> insertarPedido(sc);
                case 19 -> borrarPedido(sc);
                case 20 -> buscarPedido(sc);

                case 21 -> relacionOficinaVendedorCliente();
                case 22 -> vendedorMasVentas();
                case 23 -> clienteMayorCredito();
                case 24 -> productoMenorStock();

                case 25 -> System.out.println("FIN DEL PROGRAMA");
                default -> System.out.println("Opción incorrecta.");
            }

        } while (opcion != 25);
    }

    private void listarOficinas() {
        var lista = crud.listarOficinas();
        if (lista.isEmpty()) System.out.println("NO HAY OFICINAS");
        else lista.forEach(o -> System.out.println(
                o.getNumeroOficina()+" "+o.getCiudad()+" "+o.getRegion()+
                        " "+o.getNumeroDirector()+" "+o.getObjetivo()+" "+o.getVentas()));
    }

    private void insertarOficina(Scanner sc) {
        System.out.print("Número oficina: ");
        int n = sc.nextInt(); sc.nextLine();
        System.out.print("Ciudad: ");
        String c = sc.nextLine();
        System.out.print("Región: ");
        String r = sc.nextLine();
        System.out.print("Número director: ");
        int d = sc.nextInt();
        System.out.print("Objetivo: ");
        double o = sc.nextDouble();
        System.out.print("Ventas: ");
        double v = sc.nextDouble();

        if (crud.insertarOficina(new Oficina(n,c,r,d,o,v)))
            System.out.println("INSERTADO");
        else System.out.println("NO SE PUEDE INSERTAR (YA EXISTE)");
    }

    private void borrarOficina(Scanner sc) {
        System.out.println("Introduce una oficina para borrar");

        while (!sc.hasNextInt()) {
            System.out.println("Introduce un número entero correcto:");
            sc.next();
        }

        int ofiIntro = sc.nextInt();
        boolean borrada = crud.borrarOficina(ofiIntro);

        if (borrada) {
            System.out.println("Oficina borrada con éxito.");
        } else {
            System.out.println("Error: No existe ninguna oficina " + ofiIntro);
        }
    }

    private void buscarOficina(Scanner sc) {
        System.out.println("Introduce una oficina para buscar");
        while (!sc.hasNextInt()){
            System.out.println("Introduce una oficina correcta");
            sc.next();
        }
        int ofiIntro = sc.nextInt();
        Oficina oficina = crud.buscarOficina(ofiIntro);
        if (oficina == null){
            System.out.println("La oficina introducida no existe");
        }else {
            System.out.println(oficina.getNumeroOficina() + " " + oficina.getCiudad() + " " + oficina.getRegion() + " " + oficina.getNumeroDirector() + " " + oficina.getObjetivo() + " " + oficina.getVentas());
        }

    }

    private void listarVendedores() {
        var lista = crud.listarVendedores();
        if (lista.isEmpty()) System.out.println("NO HAY VENDEDORES");
        else lista.forEach(v -> System.out.println(
                v.getNumeroEmpleado()+" "+v.getNombre()+" "+v.getVentas()));
    }

    private void insertarVendedor(Scanner sc) {
        System.out.print("Número empleado: ");
        int n = sc.nextInt(); sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Número oficina: ");
        int no = sc.nextInt(); sc.nextLine();
        System.out.print("Oficio: ");
        String oficio = sc.nextLine();
        System.out.print("Fecha contrato: ");
        String fecha = sc.nextLine();
        System.out.print("Número director: ");
        int nd = sc.nextInt();
        System.out.print("Cuota: ");
        double cuota = sc.nextDouble();
        System.out.print("Ventas: ");
        double ventas = sc.nextDouble();

        if (crud.insertarVendedor(new Vendedor(n,nombre,edad,no,oficio,fecha,nd,cuota,ventas)))
            System.out.println("INSERTADO");
        else System.out.println("NO SE PUEDE INSERTAR");
    }

    private void borrarVendedor(Scanner sc) {
        System.out.println("Introduce un vendedor a borrar");
        while (!sc.hasNextInt()){
            System.out.println("Introduce un vendedor correcto");
            sc.next();
        }
        int vendedorIntro = sc.nextInt();
        boolean existeVendedor = crud.borrarVendedor(vendedorIntro);

        if (!existeVendedor) {
            System.out.println("No existe un vendedor con " + vendedorIntro);
        }else {
            System.out.println("Vendedor borrado con éxito " + vendedorIntro);
        }

    }

    private void buscarVendedor(Scanner sc) {
        System.out.println("Introduce el vendedor a buscar");
        while (!sc.hasNextInt()){
            System.out.println("Introduce un vendedor correcto");
            sc.next();
        }
        int vendedorIntro = sc.nextInt();
        Vendedor vendedor = crud.buscarVendedor(vendedorIntro);

        if (vendedor == null){
            System.out.println("No existe un vendedor con ese id");
        } else {
            System.out.println(vendedor.getNumeroEmpleado() + " " + vendedor.getNombre() + " " + vendedor.getEdad() + " " + vendedor.getNumeroOficina() + " " + vendedor.getOficio() + " " + vendedor.getFechaContrato() + " " + vendedor.getNumeroDirector() + " " + vendedor.getCuota() + " " + vendedor.getVentas());
        }
    }

    private void listarClientes() {
        var lista = crud.listarClientes();
        if (lista.isEmpty()) System.out.println("NO HAY CLIENTES");
        else lista.forEach(c -> System.out.println(
                c.getNumeroCliente()+" "+c.getEmpresa()+" "+c.getLimiteCredito()));
    }

    private void insertarCliente(Scanner sc) {
        System.out.print("Número cliente: ");
        int nc = sc.nextInt(); sc.nextLine();
        System.out.print("Empresa: ");
        String emp = sc.nextLine();
        System.out.print("Número empleado: ");
        int ne = sc.nextInt();
        System.out.print("Límite crédito: ");
        double lim = sc.nextDouble();

        if (crud.insertarCliente(new Cliente(nc,emp,ne,lim)))
            System.out.println("INSERTADO");
        else System.out.println("NO SE PUEDE INSERTAR");
    }

    private void borrarCliente(Scanner sc) {
        System.out.println("Introduce el cliente a borrar");
        while (!sc.hasNextInt()) {
            System.out.println("Introduce un cliente correcto");
            sc.next();
        }
        int clienteIntro = sc.nextInt();
        boolean borrado = crud.borrarCliente(clienteIntro);

        if (borrado) {
            System.out.println("Cliente borrado con éxito " + clienteIntro);
        } else {
            System.out.println("No existe un cliente con " + clienteIntro);
        }
    }

    private void buscarCliente(Scanner sc) {
        System.out.println("Introduce el cliente a buscar");
        while (!sc.hasNextInt()) {
            System.out.println("Introduce un cliente correcto");
            sc.next();
        }
        int clienteIntro = sc.nextInt();
        Cliente cliente = crud.buscarCliente(clienteIntro);

        if (cliente == null) {
            System.out.println("No existe un cliente con ese id");
        } else {
            System.out.println(cliente.getNumeroCliente() + " " + cliente.getEmpresa() + " "
                    + cliente.getNumeroEmpleado() + " " + cliente.getLimiteCredito());
        }
    }

    private void listarProductos() {
        var lista = crud.listarProductos();
        if (lista.isEmpty()) System.out.println("NO HAY PRODUCTOS");
        else lista.forEach(p -> System.out.println(
                p.getCodigoProducto()+" "+p.getDescripcion()+" "+p.getExistencias()));
    }

    private void insertarProducto(Scanner sc) {
        sc.nextLine();
        System.out.print("Código fábrica: ");
        String cf = sc.nextLine();
        System.out.print("Código producto: ");
        String cp = sc.nextLine();
        System.out.print("Descripción: ");
        String des = sc.nextLine();
        System.out.print("Precio: ");
        double pr = sc.nextDouble();
        System.out.print("Existencias: ");
        int ex = sc.nextInt();

        if (crud.insertarProducto(new Producto(cf,cp,des,pr,ex)))
            System.out.println("INSERTADO");
        else System.out.println("NO SE PUEDE INSERTAR");
    }

    private void borrarProducto(Scanner sc) {
        sc.nextLine();
        System.out.println("Introduce el código del producto a borrar");
        String codigo = sc.nextLine();
        boolean borrado = crud.borrarProducto(codigo);

        if (borrado) {
            System.out.println("Producto borrado con éxito " + codigo);
        } else {
            System.out.println("No existe un producto con el código " + codigo);
        }
    }

    private void buscarProducto(Scanner sc) {
        sc.nextLine();
        System.out.println("Introduce el código del producto a buscar");
        String codigo = sc.nextLine();
        Producto producto = crud.buscarProducto(codigo);

        if (producto == null) {
            System.out.println("No existe un producto con ese código");
        } else {
            System.out.println(producto.getCodigoFabrica() + " "
                    + producto.getCodigoProducto() + " "
                    + producto.getDescripcion() + " "
                    + producto.getPrecio() + " "
                    + producto.getExistencias());
        }
    }

    private void listarPedidos() {
        var lista = crud.listarPedidos();
        if (lista.isEmpty()) System.out.println("NO HAY PEDIDOS");
        else lista.forEach(p -> System.out.println(
                p.getNumeroPedido()+" "+p.getFechaPedido()+" "+p.getImporte()));
    }

    private void insertarPedido(Scanner sc) {
        System.out.print("Número pedido: ");
        int np = sc.nextInt(); sc.nextLine();

        System.out.print("Fecha pedido: ");
        String fp = sc.nextLine();

        System.out.print("Número cliente: ");
        int nc = sc.nextInt();

        System.out.print("Número empleado: ");
        int ne = sc.nextInt(); sc.nextLine();

        System.out.print("Código fábrica: ");
        String cf = sc.nextLine();

        System.out.print("Código producto: ");
        String cp = sc.nextLine();

        System.out.print("Cantidad: ");
        int cant = sc.nextInt();

        System.out.print("Importe: ");
        double imp = sc.nextDouble();

        if (crud.insertarPedido(new Pedido(np,fp,nc,ne,cf,cp,cant,imp)))
            System.out.println("INSERTADO");
        else System.out.println("NO SE PUEDE INSERTAR");
    }

    private void borrarPedido(Scanner sc) {
        System.out.println("Introduce el número del pedido a borrar");
        while (!sc.hasNextInt()) {
            System.out.println("Introduce un número de pedido correcto");
            sc.next();
        }
        int pedidoIntro = sc.nextInt();
        boolean borrado = crud.borrarPedido(pedidoIntro);

        if (borrado) {
            System.out.println("Pedido borrado con éxito " + pedidoIntro);
        } else {
            System.out.println("No existe un pedido con el número " + pedidoIntro);
        }
    }

    private void buscarPedido(Scanner sc) {
        System.out.println("Introduce el número del pedido a buscar");
        while (!sc.hasNextInt()) {
            System.out.println("Introduce un número de pedido correcto");
            sc.next();
        }
        int pedidoIntro = sc.nextInt();
        Pedido pedido = crud.buscarPedido(pedidoIntro);

        if (pedido == null) {
            System.out.println("No existe un pedido con ese número");
        } else {
            System.out.println(pedido.getNumeroPedido() + " "
                    + pedido.getFechaPedido() + " "
                    + pedido.getNumeroCliente() + " "
                    + pedido.getNumeroEmpleado() + " "
                    + pedido.getCodigoFabrica() + " "
                    + pedido.getCodigoProducto() + " "
                    + pedido.getCantidad() + " "
                    + pedido.getImporte());
        }
    }

    private void relacionOficinaVendedorCliente() {
        String relacion = crud.MostrarOficinasVendedoresClientes();
        if (relacion.isEmpty()) {
            System.out.println("No hay oficinas, vendedores ni clientes.");
        } else {
            System.out.print(relacion);
        }
    }

    private void vendedorMasVentas() {
        Vendedor vendedor = crud.MostrarVendedorConMasVentas();
        if (vendedor == null) {
            System.out.println("NO HAY VENDEDORES");
        } else {
            System.out.println("El vendedor que ha vendido mas es : "
                    + vendedor.getNombre() + " con " + vendedor.getVentas());
        }
    }

    private void clienteMayorCredito() {
        Cliente cliente = crud.MostrarClienteconMayorCredito();
        if (cliente == null) {
            System.out.println("NO HAY CLIENTES");
        } else {
            System.out.println("EL CLIENTE CON MAYOR CRÉDITO ES: "
                    + cliente.getEmpresa() + " con " + cliente.getLimiteCredito());
        }
    }

    private void productoMenorStock() {
        Producto producto = crud.MostrarProductoconMenorStock();
        if (producto == null) {
            System.out.println("NO HAY PRODUCTOS");
        } else {
            System.out.println("EL PRODUCTO CON MENOR STOCK ES: "
                    + producto.getDescripcion() + " con " + producto.getExistencias());
        }
    }
}