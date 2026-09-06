package practica.clase04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClienteTest {

    @Test
    void debeCrearClienteConDatosCorrectos() {
        Cliente cliente = new Cliente(
                1,
                "Juan",
                "Pérez",
                "30123456",
                "Calle 123",
                "3511234567",
                "juan@email.com",
                LocalDate.of(2025, 1, 10)
        );

        assertEquals(1, cliente.getId());
        assertEquals("Juan", cliente.getNombre());
        assertEquals("Pérez", cliente.getApellidoORazonSocial());
        assertEquals("30123456", cliente.getDocumentoOCuit());
    }
}
