package org.ismaelg.poointerfaces.repositorio;

import org.ismaelg.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio implements OrdenablePaginableCrud<Cliente>{
    private List<Cliente> datasource;

    public ClienteListRepositorio() {
        this.datasource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return datasource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente resultado = null;
        for (Cliente cli: datasource){
            if (cli.getId()!= null && cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(Cliente cliente) {
        this.datasource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        Cliente c = this.porId(id);
        this.datasource.remove(c);
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.datasource);
        listaOrdenada.sort(( a,  b) -> {
                int resultado = 0;
                if (dir == Direccion.ASC){
                   resultado = ordenar(campo,a,b);
                } else if (dir == Direccion.DESC){
                   resultado = ordenar(campo, b, a);

                }
                return resultado;
        });
        return listaOrdenada;
    }

    @Override
    public int ordenar(String campo, Cliente a, Cliente b) {
        return OrdenablePaginableCrud.super.ordenar(campo, a, b);
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return datasource.subList(desde, hasta);
    }


    @Override
    public int total() {
        return this.datasource.size();
    }
}
