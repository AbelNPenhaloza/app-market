package ar.edu.unju.fi.practica.market.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name= "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_producto")
    private Integer idProducto;
    private String nombre;
    @Column(name ="id_categoria")
    private String descripcion;
    @Column(name = "codigo_barras")
    private String codigoBarras;
    @Column(name="precio_venta")
    private Double precio;
    @Column(name ="cantidad_stock")
    private Integer cantidadStock;
    private Boolean estado;
    @ManyToOne
    @JoinColumn(name ="id_categoria", insertable=false, updatable=false)
    private Categoria categoria;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
