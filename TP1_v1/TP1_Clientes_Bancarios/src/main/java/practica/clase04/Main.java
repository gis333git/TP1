package practica.clase04;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ClientePersonaFisica personaFisica = new ClientePersonaFisica(
                1,
                "Gabriel",
                "Lima",
                "30123456",
                "Arturo M. Bas 123",
                "351-555-5555",
                "gabriel.lima@gmail.com",
                LocalDate.of(2025, 3, 10),
                "30123456",
                LocalDate.of(1986, 9, 12),
                "Psicólogo",
                1500000.00
        );

        ClienteEmpresa empresa = new ClienteEmpresa(
                2,
                "Empresa",
                "Servicios Andrómeda",
                "30-12345679-9",
                "Bv. San Juan 500",
                "351-222-2222",
                "contacto@serviciosandromeda.com",
                LocalDate.of(2025, 4, 5),
                "Servicios Andrómeda S.A.",
                "30-12345678-9",
                "Servicios de Salud",
                "Martin Rodriguez"
        );

        ClientePremium premium = new ClientePremium(
                3,
                "Ariel",
                "Robledo",
                "27111222",
                "Obispo Trejo 800",
                "351-444-4444",
                "ariel.robledo@gmail.com",
                LocalDate.of(2025, 5, 20),
                5000000.00,
                "Laura Fernández",
                List.of("Atención prioritaria", "Sala VIP", "Tasa preferencial")
        );

        ClienteMoroso moroso = new ClienteMoroso(
                4,
                "Soledad",
                "Arcos",
                "30123456",
                "Duarte Quiros 2020",
                "351-333-3333",
                "soledad.arcos@gmail.com",
                LocalDate.of(2020, 10, 3),
                LocalDate.of(2025, 11, 8),
                LocalDate.of(2025, 12, 11)
        );

        System.out.println("==============================================");
        System.out.println("       CLIENTES BANCARIOS - TP1");
        System.out.println("==============================================");

        System.out.println("\n--- CLIENTE PERSONA FÍSICA ---");
        System.out.println(personaFisica);

        System.out.println("\n--- CLIENTE EMPRESA ---");
        System.out.println(empresa);

        System.out.println("\n--- CLIENTE PREMIUM ---");
        System.out.println(premium);

        System.out.println("\n--- CLIENTE MOROSO ---");
        System.out.println(moroso);
    }
}
