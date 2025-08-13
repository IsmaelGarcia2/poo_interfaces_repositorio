package org.ismaelg.poointerfaces;

import org.ismaelg.poointerfaces.modelo.Cliente;
import org.ismaelg.poointerfaces.repositorio.*;
import org.ismaelg.poointerfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        OrdenablePaginableCrud<Cliente> repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano","Perez"));
        repo.crear(new Cliente("Mendio","Guzman"));
        repo.crear(new Cliente("Nen","Mand"));
        repo.crear(new Cliente("Pin","Temps"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("====== Paginable =====");
        List<Cliente> paginable = repo.listar(1,4);
        paginable.forEach(System.out::println);

        System.out.println("====== Ordenar =====");
        List<Cliente> clientesOrdenAsc = repo.listar("nombre", Direccion.ASC);
        for (Cliente c: clientesOrdenAsc){
            System.out.println(c);
        }

        System.out.println("====== Editar =====");
        Cliente beaActualizar = new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Cliente bea = repo.porId(2);
        repo.listar("nombre", Direccion.ASC).forEach(System.out::println);
        System.out.println("====== Eliminar =====");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);

        System.out.println("====== Total =====");
        System.out.println("Totsl = " + repo.total());
    }
}
