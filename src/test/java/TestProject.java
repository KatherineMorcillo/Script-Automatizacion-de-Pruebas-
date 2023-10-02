import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;


public class TestProject {
    WebDriver driver;
    private SeleniumUtils util;
    @Test
    public void testFirefox(){
        System.setProperty("webdriver.gecko.driver","C:\\utils\\geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setCapability("marionette", false);
        options.setLogLevel(FirefoxDriverLogLevel.DEBUG);
        driver = new FirefoxDriver(options);
        util = new SeleniumUtils(driver);
        driver.get("https://sistematicutex.shop"); // Número op link de el proyecto público
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        try {
            //Inicio de Sesión
            //Caso de prueba 1
            WebElement linkIniciar = driver.findElement(By.xpath("/html/body/header/nav/a[3]"));
            SeleniumUtils.highlightElement(linkIniciar, driver);
            linkIniciar.click();

            //login
            WebElement cajaCorreo = driver.findElement(By.xpath("//*[@id=\"email\"]"));
            cajaCorreo.sendKeys("ko@gmail.com");
            WebElement cajaClave = driver.findElement(By.xpath("//*[@id=\"password\"]"));
            cajaClave.sendKeys("prueba123");
            WebElement btnIniciar = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[4]/button"));
            SeleniumUtils.highlightElement(btnIniciar, driver);
            btnIniciar.click();
            //Finalización de caso de prueba 1

            // Iniciada la sesión
            //Modulo1
            // Proveedores
            WebElement linkProv = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/ul/li[2]/a/span[2]"));
            SeleniumUtils.highlightElement(linkProv, driver);
            linkProv.click();
            Thread.sleep(2000); // Pausa de 2 segundos

            //CrearProveedor
                 //Botón Crear proveedor
            WebElement btnCrearprov = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div[2]/div/div/div[1]/div[2]/button"));
            SeleniumUtils.highlightElement(btnCrearprov, driver);
            btnCrearprov.click();
            Thread.sleep(2000); // Pausa de 2 segundos

                 //Nombre proveedor
            WebElement cajaNomprov = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[1]/input"));
            cajaNomprov.sendKeys("proveedor prueba");
            Thread.sleep(2000); // Pausa de 2 segundos

                //Nombre administrador
            WebElement cajaNomaprov = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[2]/input"));
            cajaNomaprov.sendKeys("administrador prueba");
            Thread.sleep(2000); // Pausa de 2 segundos

                //Telefono proveedor
            WebElement cajaTelprov = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[3]/input"));
            cajaTelprov.sendKeys("1234526");
            Thread.sleep(2000); // Pausa de 2 segundos

                 //Correo del proveedor
            WebElement correoEprov = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[4]/input"));
            correoEprov.sendKeys("pruebaprov@ejemplo.com");
            Thread.sleep(2000); // Pausa de 2 segundos

                //Dirección de proveedor
            WebElement direcprov = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[5]/input"));
            direcprov.sendKeys("calle falsa con carrera falsa");
            Thread.sleep(2000); // Pausa de 2 segundos

                //Botón Guardar proveedor
            WebElement btnGuardarprov = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[6]/button[1]"));
            SeleniumUtils.highlightElement(btnGuardarprov, driver);
            btnGuardarprov.click();
            Thread.sleep(5000); // Pausa de 2 segundos

            //EditarProoveedor
                 //Botón editar proveedor
            WebElement btnEditarprov = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[3]/td[6]/a"));
            SeleniumUtils.highlightElement(btnEditarprov, driver);
            btnEditarprov.click();

                 // Caja Telefono proveedor
            WebElement cajaTelprovEditar = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/form/table/thead/tr[3]/td/input"));
            cajaTelprovEditar.clear();  // Borra el contenido actual
            Thread.sleep(5000); // Pausa de 2 segundos
            cajaTelprovEditar.sendKeys("3124314529");  // Escribe el nuevo contenido
            Thread.sleep(2000); // Pausa de 2 segundos
                //Botón Actualizar Proveedor
            WebElement btnEditaractprov = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/form/table/thead/tr[6]/th/div/button/span"));
            SeleniumUtils.highlightElement(btnEditaractprov, driver);
            btnEditaractprov.click();
            Thread.sleep(5000); // Pausa de 2 segundos

            //DetallesProveedor

                    //Click Nombre del proveedor para el detalle proveedor
            WebElement ClickDetalleprov = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[3]/td[2]/a"));
            SeleniumUtils.highlightElement(ClickDetalleprov, driver);
            ClickDetalleprov.click();
            Thread.sleep(2000); // Pausa de 2 segundos
                    //Botón cancelar detalle
            WebElement btnCancelarDetprov = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div/a"));
            SeleniumUtils.highlightElement(btnCancelarDetprov, driver);
            btnCancelarDetprov.click();
            Thread.sleep(3000); // Pausa de 2 segundos

            //EliminarProveedor
                 //Botón Eliminar proveedor
            WebElement btnEliminarprov = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[3]/td[6]/button"));
            SeleniumUtils.highlightElement(btnEliminarprov, driver);
            btnEliminarprov.click();
            Thread.sleep(2000); // Pausa de 2 segundos
                //Botón para aceptar la eliminación
            WebElement btnEliminarprovsi = driver.findElement(By.xpath("/html/body/div[5]/div/div[6]/button[1]"));
            SeleniumUtils.highlightElement(btnEliminarprovsi, driver);
            btnEliminarprovsi.click();

            //Modulo 3
            //Usuarios
            WebElement linkUsuario = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[4]/a/span[2]"));
            SeleniumUtils.highlightElement(linkUsuario, driver);
            linkUsuario.click();
            Thread.sleep(2000); // Pausa de 2 segundos

            //CrearUsuarios
            WebElement btnCrearus = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div[1]/div[2]/button/i"));
            SeleniumUtils.highlightElement(btnCrearus, driver);
            btnCrearus.click();
            Thread.sleep(1000);
                    //Nombre usuario
            WebElement cajaNomus = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[1]/input"));
            cajaNomus.sendKeys("usuario prueba");
            Thread.sleep(1000);
                    //Apellidos
            WebElement cajaApellus = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[2]/input"));
            cajaApellus.sendKeys("Apellido");
            Thread.sleep(1000);
                    //Tipo Documento
            // Realiza la siguiente selección
            WebElement selecTipoDoc = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[3]/select/option[2]"));
            selecTipoDoc.click();
            Thread.sleep(5000); // Pausa de 5 segundos
                   //Número Documento
            WebElement cajaNumus = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[4]/input"));
            cajaNumus.sendKeys("108381402500");
            Thread.sleep(1000);
                   //Dirección
            WebElement cajaDirecus = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[5]/input"));
            cajaDirecus.sendKeys("Calle falsa con carrera falsa" );
            Thread.sleep(1000);
                  //Número de celular
            WebElement cajaCelularus = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[6]/input"));
            cajaCelularus.sendKeys("3124310000");
            Thread.sleep(1000);
                //Correo electrónico
            WebElement cajaCorreous = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[7]/input"));
            cajaCorreous.sendKeys("jd@ejemplo.com");
            Thread.sleep(1000);

                //Genero
                // Realiza la siguiente selección
            WebElement selecGenus = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[8]/div[1]/select/option[2]"));
            SeleniumUtils.highlightElement(selecGenus, driver);
            selecGenus.click();
            Thread.sleep(5000); // Pausa de 5 segundos
                //Rol
                // Realiza la siguiente selección
            WebElement selecRolus = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[8]/div[2]/select/option[3]"));
            SeleniumUtils.highlightElement(selecRolus, driver);
            selecRolus.click();
            Thread.sleep(5000); // Pausa de 5 segundos
                //Compañia
                // Realiza la siguiente selección
            WebElement selecCompus = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[8]/div[3]/select/option[2]"));
            SeleniumUtils.highlightElement(selecCompus, driver);
            selecCompus.click();
            Thread.sleep(5000); // Pausa de 5 segundos
              //Contraseña
            WebElement cajaContraus = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[8]/div[4]/input"));
            cajaContraus.sendKeys("prueba123");
            Thread.sleep(5000); // Pausa de 2 segundos
              //Btn Guardar
            WebElement btnGuardarus = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[8]/div[5]/button[1]"));
            SeleniumUtils.highlightElement(btnGuardarus, driver);
            btnGuardarus.click();
            Thread.sleep(2000); // Pausa de 2 segundos

            //EditarUsuario
                 //Botón Editar usuario
            WebElement btnEditarus = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[6]/td[6]/a"));
            SeleniumUtils.highlightElement(btnEditarus, driver);
            btnEditarus.click();
                //Caja Apellido Usuario
            WebElement cajaApellusEditar = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/form/table/thead/tr[3]/td/input"));
            cajaApellusEditar.clear();  // Borra el contenido actual
            Thread.sleep(5000); // Pausa de 2 segundos
            cajaApellusEditar.sendKeys("Alarcon");  // Escribe el nuevo contenido
            Thread.sleep(2000); // Pausa de 2 segundos
                //Botón actualizar
            WebElement btnEditaractus = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/form/table/thead/tr[12]/th/div/button"));
            SeleniumUtils.highlightElement(btnEditaractus, driver);
            btnEditaractus.click();
            Thread.sleep(5000); // Pausa de 2 segundos

            //DetallesUsuario
                //Click en el nombre Usuario para ver el detalle
            WebElement ClickDetalleus = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[6]/td[2]/a"));
            SeleniumUtils.highlightElement(ClickDetalleus, driver);
            ClickDetalleus.click();
            Thread.sleep(2000); // Pausa de 2 segundos
                //Cancelar Detalle
            WebElement btnCancelarDetus = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div/a"));
            SeleniumUtils.highlightElement(btnCancelarDetus, driver);
            btnCancelarDetus.click();

            //EliminarUsuario
                //Botón Eliminar
            WebElement btnEliminarus = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[6]/td[6]/button"));
            SeleniumUtils.highlightElement(btnEliminarus, driver);
            btnEliminarus.click();
            Thread.sleep(2000); // Pausa de 2 segundos
            //Botón confirmar eliminación
            WebElement btnEliminarussi = driver.findElement(By.xpath("/html/body/div[5]/div/div[6]/button[1]"));
            SeleniumUtils.highlightElement(btnEliminarussi, driver);
            btnEliminarussi.click();


            //Modulo 4
            //Clientes
            WebElement linkCliente = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[5]/a/span[2]"));
            SeleniumUtils.highlightElement(linkCliente, driver);
            linkCliente.click();
            Thread.sleep(2000); // Pausa de 2 segundos

            //CrearClientes y Crear Facturas ( Este módulo sirve para crear cliente y crear Factura)
            WebElement btnCrearcli = driver.findElement(By.xpath(" /html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div[1]/div[2]/a"));
            SeleniumUtils.highlightElement(btnCrearcli, driver);
            btnCrearcli.click();
            Thread.sleep(2000); // Pausa de 2 segundos

            //Otro Camino Seleccionando Cliente Existente
            // Realiza la siguiente selección
            //WebElement ClienteExistente = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/form/div/div[1]/div/div/div[1]/div/div[1]/select/option[2]"));
            //SeleniumUtils.highlightElement(ClienteExistente, driver);
            //ClienteExistente.click();
            //Thread.sleep(5000); // Pausa de 5 segundos

                //Bóton Crear

            WebElement btnCrear = driver.findElement(By.xpath("//*[@id=\"createClient\"]"));
            SeleniumUtils.highlightElement(btnCrear, driver);
            btnCrear.click();
            Thread.sleep(2000); // Pausa de 2 segundos

            //Nombre Cliente
            WebElement cajaNomcli = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/form/div/div[1]/div/div/div[2]/div[1]/input"));
            cajaNomcli.sendKeys("cliente prueba");
            Thread.sleep(2000); // Pausa de 2 segundos

            //Apellidos Cliente
            WebElement cajaApellcli = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/form/div/div[1]/div/div/div[2]/div[2]/input"));
            cajaApellcli.sendKeys("Apellido");
            Thread.sleep(2000); // Pausa de 2 segundos

            //Número Documento Cliente
            WebElement cajaNumcli = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/form/div/div[1]/div/div/div[2]/div[3]/input"));
            cajaNumcli.sendKeys("10838140");
            Thread.sleep(2000); // Pausa de 2 segundos

            //Dirección Cliente
            WebElement cajaDirecli = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/form/div/div[1]/div/div/div[2]/div[4]/input"));
            cajaDirecli.sendKeys("Calle falsa con carrera falsa" );
            Thread.sleep(2000); // Pausa de 2 segundos

            //Número de celular Cliente
            WebElement cajaCelularcli = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/form/div/div[1]/div/div/div[2]/div[5]/input"));
            cajaCelularcli.sendKeys("3124310000");
            Thread.sleep(2000); // Pausa de 2 segundos

            //Correo electrónico
            WebElement cajaCorreocli = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/form/div/div[1]/div/div/div[2]/div[6]/input"));
            cajaCorreocli.sendKeys("cliente@ejemplo.com");
            Thread.sleep(2000); // Pausa de 2 segundos

            //Tipo de documento
            // Realiza la siguiente selección
            WebElement TipodocCli = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/form/div/div[1]/div/div/div[2]/div[7]/select/option[2]"));
            SeleniumUtils.highlightElement(TipodocCli, driver);
            TipodocCli.click();
            Thread.sleep(5000); // Pausa de 5 segundos

            //Area de Selección de producto
                 //Primero Seleccionar producto o Ref
                    // Realiza la siguiente selección
            WebElement ProductoCli = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/form/div/div[2]/div/div/div/div[2]/select/option[2]"));
            SeleniumUtils.highlightElement(ProductoCli, driver);
            ProductoCli.click();
            Thread.sleep(5000); // Pausa de 5 segundos

                    //Realiza Selección de Cantidad
            WebElement Cantidadprodcli = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/form/div/div[2]/div/div/div/div[1]/select/option[3]"));
            SeleniumUtils.highlightElement(Cantidadprodcli, driver);
            Cantidadprodcli.click();
            Thread.sleep(5000); // Pausa de 5 segundos

                    //Bóton Agregar
            WebElement btnAgregar = driver.findElement(By.xpath(" /html/body/div[1]/div[2]/div[2]/div/div/div/form/div/div[2]/div/div/div/div[4]/button"));
            SeleniumUtils.highlightElement(btnAgregar, driver);
            btnAgregar.click();
            Thread.sleep(2000); // Pausa de 2 segundos

                //Bóton Guardar Cli Factura
            WebElement btnGuardar = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/form/div/div[4]/button"));
            SeleniumUtils.highlightElement(btnGuardar, driver);
            btnAgregar.click();
            Thread.sleep(2000); // Pausa de 2 segundos


            //EditarCliente
            //Botón Editar usuario
            WebElement btnEditarcli = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[6]/form/a"));
            SeleniumUtils.highlightElement(btnEditarcli, driver);
            btnEditarcli.click();
            //Caja Apellido Cliente
            WebElement cajaApellCli = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/form/table/thead/tr[2]/td/input"));
            cajaApellCli.clear();  // Borra el contenido actual
            Thread.sleep(5000); // Pausa de 2 segundos
            cajaApellCli.sendKeys("Gaviria");  // Escribe el nuevo contenido
            Thread.sleep(2000); // Pausa de 2 segundos

            //Botón actualizar Cliente
            WebElement btnEditaractcli = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/form/table/thead/tr[7]/th/div/button"));
            SeleniumUtils.highlightElement(btnEditaractcli, driver);
            btnEditaractcli.click();
            Thread.sleep(5000); // Pausa de 2 segundos

            //DetallesCliente
            //Click en el nombre Cliente para ver el detalle
            WebElement ClickDetallecli = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[2]/a"));
            SeleniumUtils.highlightElement(ClickDetallecli, driver);
            ClickDetallecli.click();
            Thread.sleep(2000); // Pausa de 2 segundos
            //Cancelar Detalle
            WebElement btnCancelarDetcli = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div/a"));
            SeleniumUtils.highlightElement(btnCancelarDetcli, driver);
            btnCancelarDetcli.click();

            //EliminarCliente (Probar despúes)
            //Botón Eliminar
            WebElement btnEliminarcli = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[6]/form/button"));
            SeleniumUtils.highlightElement(btnEliminarcli, driver);
            btnEliminarcli.click();
            Thread.sleep(2000); // Pausa de 2 segundos

            //Botón confirmar eliminación (Falta validar ese si porque se está borrando sin confirmación )
            WebElement btnEliminaruscli = driver.findElement(By.xpath("/html/body/div[5]/div/div[6]/button[1]"));
            SeleniumUtils.highlightElement(btnEliminaruscli, driver);
            btnEliminaruscli.click();


               //Módulo 5
              // Facturas
            WebElement linkFacturas = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[6]/a"));
            SeleniumUtils.highlightElement(linkFacturas, driver);
            linkFacturas.click();
            Thread.sleep(2000); // Pausa de 2 segundos

              //Crear Factura --> Se hace con la misma de crear Cliente pero en
              // este casso seleccionando Cliente existente
              // Realiza la siguiente selección
            WebElement ClienteExistente = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/form/div/div[1]/div/div/div[1]/div/div[1]/select/option[2]"));
            SeleniumUtils.highlightElement(ClienteExistente, driver);
            ClienteExistente.click();
            Thread.sleep(5000); // Pausa de 5 segundos

              //Area de Selección de producto
               //Primero Seleccionar producto o Ref
               // Realiza la siguiente selección
            WebElement ProductoFac = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/form/div/div[2]/div/div/div/div[2]/select/option[2]"));
            SeleniumUtils.highlightElement(ProductoFac, driver);
            ProductoFac.click();
            Thread.sleep(5000); // Pausa de 5 segundos

              //Realiza Selección de Cantidad
            WebElement Cantidadprodfact = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/form/div/div[2]/div/div/div/div[1]/select/option[3]"));
            SeleniumUtils.highlightElement(Cantidadprodfact, driver);
            Cantidadprodfact.click();
            Thread.sleep(5000); // Pausa de 5 segundos

              //Bóton Agregar
            WebElement btnAgregarfact = driver.findElement(By.xpath(" /html/body/div[1]/div[2]/div[2]/div/div/div/form/div/div[2]/div/div/div/div[4]/button"));
            SeleniumUtils.highlightElement(btnAgregarfact, driver);
            btnAgregarfact.click();
            Thread.sleep(2000); // Pausa de 2 segundos

               //Bóton Guardar Cli Factura
            WebElement btnGuardarfact = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/form/div/div[4]/button"));
            SeleniumUtils.highlightElement(btnGuardarfact, driver);
            btnGuardarfact.click();
            Thread.sleep(2000); // Pausa de 2 segundos

              //DetallesFactura (Aún no probar hay errores de código)
              //Click en el nombre Cliente para ver el detalle
            WebElement ClickDetallefact = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[2]/td[2]/a"));
            SeleniumUtils.highlightElement(ClickDetallefact, driver);
            ClickDetallefact.click();
            Thread.sleep(2000); // Pausa de 2 segundos

              //Cancelar Detalle Factura
            WebElement btnCancelarDetfact = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div/a"));
            SeleniumUtils.highlightElement(btnCancelarDetfact, driver);
            btnCancelarDetfact.click();

           // Cancelar una factura
            WebElement btnCancelarfact = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[6]/button"));
            SeleniumUtils.highlightElement(btnCancelarfact, driver);
            btnCancelarfact.click();

              //Modul6 6
               //Reportes
                // Realiza la siguiente selección
            WebElement SeleccionarFechas = driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[4]"));
            SeleccionarFechas.click();
            Thread.sleep(5000); // Pausa de 5 segundos

            //Cuando Selecciona la fecha o rango de fechas Da el reporte , termina prueba

            //Modulo2
            //Productos
            WebElement linkProd = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/ul/li[3]/a/span[2]"));
            SeleniumUtils.highlightElement(linkProd, driver);
            linkProd.click();
            Thread.sleep(2000); // Pausa de 2 segundos
            //CrearProducto
                    //Botón crear producto
            WebElement btnCrearprod = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div[1]/div[2]/button"));
            SeleniumUtils.highlightElement(btnCrearprod, driver);
            btnCrearprod.click();
            Thread.sleep(2000); // Pausa de 2 segundos
                     //Nombre producto
            WebElement cajaNomprod = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[1]/div[1]/input"));
            cajaNomprod.sendKeys("producto prueba");
            Thread.sleep(2000); // Pausa de 2 segundos
                    //Referencia Producto
            WebElement cajaRefprod = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[1]/div[2]/input"));
            cajaRefprod.sendKeys("AA003");
            Thread.sleep(2000); // Pausa de 2 segundos
                    //Descripción Producto
            WebElement cajaDesprod = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[1]/div[3]/textarea"));
            cajaDesprod.sendKeys("Descripción producto prueba");
            Thread.sleep(2000); // Pausa de 2 segundos
                     //Cantidad Producto
            WebElement Cantidadprod = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[1]/div[4]/input"));
            Cantidadprod.sendKeys("2" );
            Thread.sleep(2000); // Pausa de 2 segundos
                      //Precio Producto
            WebElement Precioprod = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[1]/div[5]/input"));
            Precioprod.sendKeys("15000");
            Thread.sleep(2000); // Pausa de 2 segundos
                     //Medida Producto , en este caso en 0 a menos que sea una piel que posee medidas en pies
            WebElement Medidaprod = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[1]/div[6]/input"));
            Medidaprod.clear();  // Borra el contenido actual
            Thread.sleep(5000); // Pausa de 2 segundos
            cajaTelprovEditar.sendKeys("0");  // Escribe el nuevo contenido
            Thread.sleep(2000); // Pausa de 2 segundos

                //Seleccionar compañia
            WebElement Companiaprod = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[1]/div[7]/select"));
                    Companiaprod.click();
                    //pausa
                    Thread.sleep(2000);
                    // Realiza la siguiente selección
                    WebElement Seleccompania = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[1]/div[7]/select/option[2]"));
                    Seleccompania.click();
            Thread.sleep(5000); // Pausa de 5 segundos

                //Seleccionar proveedor
            WebElement Proveedorprod = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[1]/div[8]/select"));
                    Proveedorprod.click();
                    //pausa
                    Thread.sleep(2000);
                    // Realiza la siguiente selección
                    WebElement Seleccionprov = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[1]/div[8]/select/option[2]"));
                    Seleccionprov.click();
            Thread.sleep(5000); // Pausa de 5 segundos

                 //Seleccionar Color
            WebElement Colorprod = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[1]/div[9]/select"));
                    Colorprod.click();
                    //pausa
                    Thread.sleep(2000);
                    // Realiza la siguiente selección
                    WebElement Seleccioncolor = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[1]/div[9]/select/option[1]"));
                    Seleccioncolor.click();
            Thread.sleep(5000); // Pausa de 2 segundos

            //No se puede para seleccionar una imagen del computador, asi que se validará para que se pueda subir sin imagen

                //Botón guardar producto
            WebElement btnGuardarprod = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/form/div[2]/button[1]"));
            btnGuardarprod.click();
            Thread.sleep(2000); // Pausa de 2 segundos

            //EditarProducto
            //Botón Editar
            WebElement btnEditarprod = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[3]/td[8]/a"));
            SeleniumUtils.highlightElement(btnEditarprod, driver);
            btnEditarprod.click();
            //Editar Ref producto
            WebElement cajaRefprodEditar = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/form/table/thead/tr[2]/td/input"));
            cajaRefprodEditar.clear();  // Borra el contenido actual
            Thread.sleep(5000); // Pausa de 2 segundos
            cajaTelprovEditar.sendKeys("AA006");  // Escribe el nuevo contenido
            Thread.sleep(2000); // Pausa de 2 segundos
            //Botón actualizar producto
            WebElement btnEditaractprod = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/form/table/thead/tr[7]/th/div/button"));
            SeleniumUtils.highlightElement(btnEditaractprod, driver);
            btnEditaractprod.click();
            Thread.sleep(5000); // Pausa de 2 segundos


            //EliminarProducto
                //Botón Eliminar producto
            WebElement btnEliminarprod = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[3]/td[8]/button"));
            SeleniumUtils.highlightElement(btnEditaractprod, driver);
            btnEliminarprod.click();
            Thread.sleep(2000); // Pausa de 2 segundos
                //Botón de confirmación Eliminar producto
            WebElement btnEliminarprodsi = driver.findElement(By.xpath("/html/body/div[5]/div/div[6]/button[1]"));
            btnEliminarprodsi.click();

            //DetallesProducto

            //Click en el nombre del producto
            WebElement ClickDetalleprod = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[3]/a"));
            SeleniumUtils.highlightElement(ClickDetalleprod, driver);
            ClickDetalleprod.click();
            Thread.sleep(2000); // Pausa de 2 segundos
            //Botón Cancelar detalle
            WebElement btnCancelarDetprod = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div/a"));
            SeleniumUtils.highlightElement(btnCancelarDetprod, driver);
            btnCancelarDetprod.click();

        } catch (NoSuchElementException e) {
            System.out.println("Elemento no encontrado: " + e.getMessage());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
